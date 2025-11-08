package com.mycompany.posmini;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML private TextField productCodeField;

    @FXML
    private void showStatistics() {
        System.out.println("Mở trang Thống kê / Báo cáo");
    }

    @FXML
    private void showProducts() {
        System.out.println("Mở trang Quản lý sản phẩm Pro");
    }

    @FXML
    private void showEmployees() {
        System.out.println("Mở trang Quản lý nhân viên");
    }

    @FXML
    private void showInvoices() {
        System.out.println("Mở trang Quản lý hóa đơn");
    }

    @FXML
    private void searchProduct() {
        String code = productCodeField.getText();
        System.out.println("Tìm sản phẩm có mã: " + code);
    }

    @FXML
    private void addItem() {
        System.out.println("Thêm sản phẩm");
    }

    @FXML
    private void editItem() {
        System.out.println("Sửa sản phẩm");
    }

    @FXML
    private void deleteItem() {
        System.out.println("Xóa sản phẩm");
    }

    @FXML
    private void handlePayment() throws Exception {
        App.setRoot("Invoice");
    }
}
