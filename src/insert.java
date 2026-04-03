import java.sql.*;

public class insert {

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
            String query = String.format("INSERT INTO student(name,age,marks) VALUES ('%s',%o,%f)","rahul",23,34.4);
            int rowAffected = statement.executeUpdate(query);
            if(rowAffected>0) {
                System.out.println("data was insert");
            }
            else {
                System.out.println("data not insert");
            }




        }catch(SQLException e){
            System.out.println(e.getMessage());
        }}}