package com.mycompany.posmini;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
         
            String url = "jdbc:sqlserver://ANHTOET:1433;databaseName=Posmini;encrypt=false;trustServerCertificate=true";
            String user = "sa";
            String password = "12345";
            
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
