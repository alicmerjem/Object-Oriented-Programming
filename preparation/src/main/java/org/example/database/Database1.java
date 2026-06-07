package org.example.database;
import java.sql.*;

public class Database1 {
   private static final String CONNECTION_STRING = "jdbc:mysql://db1.ibu.edu.ba:3306/shopdb";
   private static final String USERNAME = "shop_user";
   private static final String PASSWORD = "ibuSHOP2505";

   private Connection connection = null;

   public Database1() {
       try {
           connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
   }

   public void getUsersByCity(String city) throws SQLException {
       PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM users WHERE city = ?");
       statement.setString(1, city);

       ResultSet rs = statement.executeQuery();

       while(rs.next()) {
           int id = rs.getInt("id");
           String name = rs.getString("name");
           String userCity = rs.getString("city");

           System.out.println("ID: " + id + ", Name: " + name + ", City: " + city);
       }
   }
}
