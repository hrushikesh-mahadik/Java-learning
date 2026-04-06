import java.sql.*;

public class ps {

    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "1234";

    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
          //  Statement statement = connection.createStatement();
            String query = "INSERT INTO student (name,age,marks) VALUE(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,"ankita");
            ps.setInt(2,25);
            ps.setDouble(3,67.5);
            int rowAffected = ps.executeUpdate();

            if(rowAffected>0) {
                System.out.println("data was insert");
            }
            else {
                System.out.println("data not insert");
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }}}