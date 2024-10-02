package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class H2ConnectionFactory implements ConnectionFactory {

    private Properties properties = new Properties();

    public H2ConnectionFactory() {
        // Load properties from file
        try (FileInputStream fis = new FileInputStream("path/to/db.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection createConnection() {
        Connection connection = null;
        try {
            // Load driver class
            Class.forName(properties.getProperty("jdbc_driver"));

            // Create a connection
            connection = DriverManager.getConnection(
                    properties.getProperty("db_url"),
                    properties.getProperty("user"),
                    properties.getProperty("password")
            );
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

