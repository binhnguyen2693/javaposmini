/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posmini;
import javafx.beans.property.SimpleStringProperty;
/**
 *
 * @author Thinkpad T14 G2
 */

public class Employee {
    private final SimpleStringProperty maNhanVien;
    private final SimpleStringProperty tenNhanVien;
    private final SimpleStringProperty chucVu;
    private final SimpleStringProperty soDienThoai;

    public Employee(String ma, String ten, String chucVu, String sdt) {
        this.maNhanVien = new SimpleStringProperty(ma);
        this.tenNhanVien = new SimpleStringProperty(ten);
        this.chucVu = new SimpleStringProperty(chucVu);
        this.soDienThoai = new SimpleStringProperty(sdt);
    }

    public String getMaNhanVien() { return maNhanVien.get(); }
    public String getTenNhanVien() { return tenNhanVien.get(); }
    public String getChucVu() { return chucVu.get(); }
    public String getSoDienThoai() { return soDienThoai.get(); }
}

    

