package com.unasat.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfiguration {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "Asrock12345";
    private static final String URL = "jdbc:mysql://localhost/user";


    public static Connection connectToDB() {
        Connection connection =  null;
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Connection is Stable and Active: " + connection.getClientInfo());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }/*finally {
            if(connection != null){
                connection.close();
            }
        }*/

        return connection;
    }
}
