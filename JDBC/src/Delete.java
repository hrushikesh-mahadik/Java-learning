import java.sql.*;

public class Delete {

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
            Statement statement = connection.createStatement();
            String query = "Delete from student where id = 2 ";
            int rowAffected = statement.executeUpdate(query);
            if(rowAffected>0) {
                System.out.println("data was delete");
            }
            else {
                System.out.println("data not delete");
            }




        }catch(SQLException e){
            System.out.println(e.getMessage());
        }}}