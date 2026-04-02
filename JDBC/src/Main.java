import java.sql.*;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {

        // SQL query
        String query = "SELECT * FROM student";

        try {
            // Load driver (optional in new versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 1: Create connection
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Step 2: Create statement
            Statement statement = connection.createStatement();

            // Step 3: Execute query
            ResultSet resultSet = statement.executeQuery(query);

            // Step 4: Process result
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Marks: " + marks);
                System.out.println("----------------------");
            }

            // Step 5: Close resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error!");
            e.printStackTrace();
        }
    }
}