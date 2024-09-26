package org.AnkitaK65.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcExample {

    // JDBC URL, username, and password of PostgreSQL server
    private static final String URL = "jdbc:postgresql://localhost:5432/jdbc_java";
    private static final String USER = "postgres"; // Replace with your PostgreSQL username
    private static final String PASSWORD = "2020"; // Replace with your PostgreSQL password

    // JDBC connection variable
    private static Connection connection = null;

    public static void main(String[] args) {
        try {
            // Establish the connection to the database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // 1. Create (Insert) operation
            create("John Doe", 28);

            // 2. Read operation
            read();

            // 3. Update operation
            update(1, "Jane Doe", 30); // Assume ID = 1 exists in the database

            // 4. Delete operation
            delete(2); // Assume ID = 2 exists in the database

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Closing the database connection
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to insert data into the database (Create)
    private static void create(String name, int age) throws SQLException {
        String insertSQL = "INSERT INTO users (name, age) VALUES (?, ?)"; // Prepare SQL query

        // Prepare statement with query and set values dynamically
        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
        preparedStatement.setString(1, name); // 1st '?' is set to 'name'
        preparedStatement.setInt(2, age);    // 2nd '?' is set to 'age'

        int rowsInserted = preparedStatement.executeUpdate(); // Execute the query
        if (rowsInserted > 0) {
            System.out.println("A new user was inserted successfully!");
        }
    }

    // Method to retrieve data from the database (Read)
    private static void read() throws SQLException {
        String selectSQL = "SELECT * FROM users"; // SQL query to fetch all users

        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
        ResultSet resultSet = preparedStatement.executeQuery(); // Execute the query and get the result set

        while (resultSet.next()) {
            int id = resultSet.getInt("id");       // Fetch the 'id' column
            String name = resultSet.getString("name"); // Fetch the 'name' column
            int age = resultSet.getInt("age");     // Fetch the 'age' column

            System.out.println("User ID: " + id + ", Name: " + name + ", Age: " + age);
        }
    }

    // Method to update data in the database (Update)
    private static void update(int id, String name, int age) throws SQLException {
        String updateSQL = "UPDATE users SET name = ?, age = ? WHERE id = ?"; // SQL query for update

        PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
        preparedStatement.setString(1, name);  // Set updated name
        preparedStatement.setInt(2, age);      // Set updated age
        preparedStatement.setInt(3, id);       // Specify the 'id' of the user to update

        int rowsUpdated = preparedStatement.executeUpdate(); // Execute the update query
        if (rowsUpdated > 0) {
            System.out.println("User with ID " + id + " was updated successfully!");
        }
    }

    // Method to delete data from the database (Delete)
    private static void delete(int id) throws SQLException {
        String deleteSQL = "DELETE FROM users WHERE id = ?"; // SQL query for deletion

        PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL);
        preparedStatement.setInt(1, id); // Specify the 'id' of the user to delete

        int rowsDeleted = preparedStatement.executeUpdate(); // Execute the delete query
        if (rowsDeleted > 0) {
            System.out.println("User with ID " + id + " was deleted successfully!");
        }
    }
}
