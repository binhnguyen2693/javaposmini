package com.mycompany.posmini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    private static final String URL = "jdbc:mysql://localhost:3306/posmini";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password"; // <-- sửa theo mật khẩu MySQL của bạn

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Kết nối MySQL thành công!");
        } catch (SQLException e) {
            System.out.println("❌ Kết nối MySQL thất bại: " + e.getMessage());
        }
        return conn;
    }
}
