/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.entity;

/**
 *
 * @author huydz
 */
public class SanPham {
    int maSP;
    String tenSP;
    float donGia;
    String moTa,hinh;
    int maLSP;

    public SanPham() {
    }

    public SanPham(int maSP, String tenSP, float donGia, String moTa, String hinh, int maLSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.moTa = moTa;
        this.hinh = hinh;
        this.maLSP = maLSP;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getMaLSP() {
        return maLSP;
    }

    public void setMaLSP(int maLSP) {
        this.maLSP = maLSP;
    }
    
}
