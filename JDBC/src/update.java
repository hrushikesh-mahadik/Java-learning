import java.sql.*;

public class update {

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
            String query = String.format("UPDATE student set marks = %f where id = %d",99.9,3);
            int rowAffected = statement.executeUpdate(query);
            if(rowAffected>0) {
                System.out.println("data was update");
            }
            else {
                System.out.println("data not update");
            }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }}}