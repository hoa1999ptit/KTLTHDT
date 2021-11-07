/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.DanhSachMatHang_J05081;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author nhokt
 */
public class MatHang implements Serializable {

    private int id;
    private String maHang, tenHang, donVi;
    private double giaMua, giaBan, loiNhuan;

    public MatHang() {

    }

    public MatHang(int id, String maHang, String tenHang, String donVi, double giaMua, double giaBan, double loiNhuan) {
        super();
        this.id = id;
        this.maHang = "MH" + String.format("%03d", id);
        this.tenHang = tenHang;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = loiNhuan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(double loiNhuan) {
        this.loiNhuan = loiNhuan;
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

    private double tinhloinhuan(double giaMua, double giaBan) {
        loiNhuan = giaBan - giaMua;
        return loiNhuan;
    }

    public void nhapMH(Scanner in) {
        int j = 0;
        id = j++;
        tenHang = in.nextLine();
        donVi = in.nextLine();
        giaMua = Double.parseDouble(in.nextLine());
        giaBan = Double.parseDouble(in.nextLine());
        tinhloinhuan(giaMua, giaBan);
    }

}
