/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.entity;

/**
 *
 * @author huydz
 */
public class ChiTietDonHang {
    int maCT,maSP,maDH,sl;
    float donGia,tongGia;

    public ChiTietDonHang() {
    }

    public ChiTietDonHang(int maCT, int maSP, int maDH, int sl, float donGia, float tongGia) {
        this.maCT = maCT;
        this.maSP = maSP;
        this.maDH = maDH;
        this.sl = sl;
        this.donGia = donGia;
        this.tongGia = tongGia;
    }

    public int getMaCT() {
        return maCT;
    }

    public void setMaCT(int maCT) {
        this.maCT = maCT;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getMaDH() {
        return maDH;
    }

    public void setMaDH(int maDH) {
        this.maDH = maDH;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getTongGia() {
        return tongGia;
    }

    public void setTongGia(float tongGia) {
        this.tongGia = tongGia;
    }
    
}
