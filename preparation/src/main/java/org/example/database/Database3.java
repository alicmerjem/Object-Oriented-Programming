package org.example.database;
import java.sql.*;

public class Database3 {
    private static final String CONNECTION_STRING = "jdbc:mysql://db1.ibu.edu.ba:3306/shopdb";
    private static final String USERNAME = "shop_user";
    private static final String PASSWORD = "ibuSHOP2505";
    private Connection connection = null;

    public Database3() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getRichUsers(double balance) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM users WHERE balance > ?");

        statement.setDouble(1, balance);

        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println("Balance " + rs.getDouble("balance"));
        }
    }
}
