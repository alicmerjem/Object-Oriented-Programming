package org.example;
import java.sql.*;

public class DBConnect {
    private static final String CONNECTION_STRING = "conection_string";
    private static final String USER = "root";
    public static final String PASSWORD = "admin";

    private Connection connection = null;

    public DBConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllCustomers() throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM customers LIMIT 5");
        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println("customerNumber");
            System.out.println("customerName");
        }
    }

    public void getCustomerById(int customerId) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM customers WHERE customerNumber = ?");
        statement.setInt(1, customerId);

        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println("customerNumber");
            System.out.println("customerName");
        }
    }

    public void deleteCustomerById(int customerId) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("DELETE FROM customers WHERE customerNumber = ?");
        statement.setInt(1, customerId);

        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println("customerNumber");
            System.out.println("customerName");
        }
    }

    public void updateCustomerById(int customerId, String customerName) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("UPDATE customers SET customerName = ? WHERE customerNumber = ?");
        statement.setString(1, customerName);
        statement.setInt(2, customerId);

        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println("customerNumber");
            System.out.println("customerName");
        }
    }
}
