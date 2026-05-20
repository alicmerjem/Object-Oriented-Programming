package org.example;

public class DatabaseConfig {
    private String dbUrl = "jdbc:mysql://localhost:3306/my_database";

    private static DatabaseConfig instance;

    private DatabaseConfig() {}

    public static DatabaseConfig getInstance() {
        if (instance == null) {
            instance = new DatabaseConfig();
        }

        return instance;
    }

    public String getDbUrl() {
        return dbUrl;
    }
}

class TestingLogger2 {
    public static void main(String[] args) {
        DatabaseConfig config1 = DatabaseConfig.getInstance();
        DatabaseConfig config2 = DatabaseConfig.getInstance();

        System.out.println("Are config 1 and config 2 identical?");
        System.out.println(config1 == config2);

        System.out.println("Database url: " + config1.getDbUrl());
    }
}