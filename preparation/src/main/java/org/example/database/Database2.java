package org.example.database;
import java.sql.*;

public class Database2 {
    private static final String CONNECTION_STRING = "jdbc:mysql://db1.ibu.edu.ba:3306/shopdb";
    private static final String USERNAME = "shop_user";
    private static final String PASSWORD = "ibuSHOP2505";
    private Connection connection = null;

    public Database2() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAdultUsers(int age) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM users WHERE age > ?");
        statement.setInt(1, age);

        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println("Age: " + rs.getInt("age"));
        }
    }
}
