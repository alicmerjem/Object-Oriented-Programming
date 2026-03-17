package org.example;
import java.sql.*;

public class Task2 {
    private static final String CONNECTION_STRING = "jdbc:mysql://oop.ibu.edu.ba:3306/mtest_db?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USER = "mtestdb_usr";
    private static final String PASSWORD = "mtest97dbUSR";

    private Connection connection = null;

    public Task2() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getTicketsByStatus(String status) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT id, seat_label, price_paid, payment_method FROM tickets WHERE status = ?");
        statement.setString(1, status);

        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getInt("id") + " -> " + rs.getString("seat_label") + " -> " + rs.getDouble("price_paid") + " -> " + rs.getString("payment_method"));
        }
    }

}
