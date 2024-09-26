package org.AnkitaK65.jdbc;

// This code is for establishing connection with Postgresql
// database and retrieving data from db

/*
 *1. import --->java.sql
 *2. load and register the driver //not needed after JDBC 4.0
 *3. create connection
 *4. create a statement
 *5. execute the query
 *6. process the results
 *7. close
 */

// Note: Add PostgreSQL dependency in the pom.xml file and reload the project in Maven.


import java.sql.*;

class JdbcPostgresqlConnection {
    public static void main(String[] args) throws Exception {

//        String url = "jdbc:mysql://localhost:3306/jdbc_java"; //3306 is the default port for MySQL; 5432 - Postgresql
        String url = "jdbc:postgresql://localhost:5432/jdbc_java"; // Replace 'jdbc_java' with your DB name

        String username = "postgres"; // DB credentials
        String password = "2020";

//        Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
//        Class.forName("org.postgresql.Driver");
//Since JDBC 4.0 (released with Java 6), the Class.forName() method is no longer needed to explicitly load the driver.

        // Establish the connection
        Connection con = DriverManager.getConnection(url, username, password);

        System.out.println("Connection Established successfully");

        // Insert a row into the table
        String insertQuery = "INSERT INTO users (name, age) VALUES (?, ?)";

        // Note: Using try-with-resources to automatically close resources (Connection, Statement, PreparedStatement).
        try (PreparedStatement insertStmt = con.prepareStatement(insertQuery)) {
            insertStmt.setString(1, "Anna");
            insertStmt.setInt(2, 10);
            int rowsAffected = insertStmt.executeUpdate();
            System.out.println("Row inserted successfully, " + rowsAffected + " row(s) affected.");
        }

        // Retrieve and print all data from the users table
        String query = "SELECT * FROM users";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        System.out.println("Data from the users table:");
        // Loop through the result set and print all rows
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        }

        // Close resources
        rs.close();
        st.close();
        con.close();
        System.out.println("Connection Closed....");
    }
}

