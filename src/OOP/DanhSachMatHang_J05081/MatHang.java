/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.DanhSachMatHang_J05081;

/**
 *
 * @author nhokt
 */
public class MatHang {
    private String maHang,tenHang,donVi;
    private double giaMua,giaBan;

    public MatHang(String maHang, String tenHang, String donVi, double giaMua, double giaBan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public double getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(double giaMua) {
        this.giaMua = giaMua;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    
    @Override
    public String toString() {
        return "MatHang{" + "maHang=" + maHang + ", tenHang=" + tenHang + ", donVi=" + donVi + ", giaMua=" + giaMua + ", giaBan=" + giaBan + '}';
    }
    
    
}
