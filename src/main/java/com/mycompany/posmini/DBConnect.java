package com.mycompany.posmini;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnect {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn != null) return conn;

        try (InputStream input = DBConnect.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (input == null) {
                System.out.println("❌ Không tìm thấy file db.properties!");
                return null;
            }

            Properties props = new Properties();
            props.load(input);

            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String password = props.getProperty("db.password");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Kết nối MySQL thành công!");
        } catch (IOException | SQLException e) {
            System.out.println("❌ Lỗi khi kết nối MySQL: " + e.getMessage());
        }

        return conn;
    }
}
