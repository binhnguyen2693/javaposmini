package com.mycompany.posmini;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowProducts {
    public static void main(String[] args) {
        // Kết nối tới SQL Server
        Connection conn = DBConnection.getConnection();

        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                String sql = "SELECT * FROM QuanLySanPham";
                ResultSet rs = stmt.executeQuery(sql);

                System.out.println("Danh sách sản phẩm:");
                System.out.println("MaSP | TenSP | Gia | SoLuong | LoaiSP");
                System.out.println("------------------------------------------");

                // Duyệt kết quả và in ra console
                while (rs.next()) {
                    int maSP = rs.getInt("MaSP");
                    String tenSP = rs.getString("TenSP");
                    double gia = rs.getDouble("Gia");
                    int soLuong = rs.getInt("SoLuong");
                    String loaiSP = rs.getString("LoaiSP");

                    System.out.println(maSP + " | " + tenSP + " | " + gia + " | " + soLuong + " | " + loaiSP);
                }

                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Không kết nối được tới SQL Server!");
        }
    }
}
