package com.mycompany.posmini;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class MainController {

    @FXML private TextField productCodeField;

    @FXML
    private void addItem(ActionEvent event) {
        System.out.println("Thêm sản phẩm!");
    }

    @FXML
    private void editItem(ActionEvent event) {
        System.out.println("Sửa sản phẩm!");
    }

    @FXML
    private void deleteItem(ActionEvent event) {
        System.out.println("Xóa sản phẩm!");
    }

    @FXML
    private void handlePayment(ActionEvent event) {
        System.out.println("Thanh toán sản phẩm!");
    }

    @FXML
    private void showProducts(ActionEvent event) throws Exception {
        System.out.println("Hiển thị sản phẩm");
        App.setRoot("Invoice");
    }

    @FXML
    private void showStatistics(ActionEvent event) throws Exception {
        System.out.println("Hiển thị thống kê");
        App.setRoot("Statistics");
    }

    @FXML
    private void showEmployees(ActionEvent event) throws Exception {
        System.out.println("Hien thi nhan ");
        App.setRoot("Employees");
    }

    @FXML
    private void showInvoices(ActionEvent event) throws Exception {
        System.out.println("Hiển thị hóa đơn");
        App.setRoot("Invoice");
    }

    @FXML
    private void searchProduct() {
        String code = productCodeField.getText();
        System.out.println("Tìm sản phẩm có mã: " + code);
    }
}
