package com.mycompany.posmini;

/**
 *
 * @author admin
 */
import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection conn = DBConnection.getConnection();
        if (conn != null) {
            System.out.println("Kết nối thành công!");
        } else {
            System.out.println("Không kết nối được tới SQL Server!");
        }
    }
}
