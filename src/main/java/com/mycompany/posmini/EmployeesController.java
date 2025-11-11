package com.mycompany.posmini;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;

public class EmployeesController {

    @FXML
    private TableView<Employee> tableEmployee;
    @FXML
    private TableColumn<Employee, String> colMaNV;
    @FXML
    private TableColumn<Employee, String> colTenNV;
    @FXML
    private TableColumn<Employee, String> colChucVu;
    @FXML
    private TableColumn<Employee, String> colSoDT;

    private ObservableList<Employee> employeeList = FXCollections.observableArrayList();

    public void initialize() {
        colMaNV.setCellValueFactory(new PropertyValueFactory<>("maNhanVien"));
        colTenNV.setCellValueFactory(new PropertyValueFactory<>("tenNhanVien"));
        colChucVu.setCellValueFactory(new PropertyValueFactory<>("chucVu"));
        colSoDT.setCellValueFactory(new PropertyValueFactory<>("soDienThoai"));

        loadDataFromDatabase();
        tableEmployee.setItems(employeeList);
    }

    private void loadDataFromDatabase() {
        String url = "jdbc:mysql://localhost:3306/posmini";
        String user = "root";
        String pass = "";

        String query = "SELECT * FROM Employee";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                employeeList.add(new Employee(
                        rs.getString("ma_nhan_vien"),
                        rs.getString("ten_nhan_vien"),
                        rs.getString("chuc_vu"),
                        rs.getString("so_dien_thoai")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
