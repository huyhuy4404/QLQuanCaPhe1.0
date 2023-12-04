/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.entity;

/**
 *
 * @author huydz
 */
public class ThanhToan {
    int maTT;
    float soTien;
    String ndck ;
    int maDH,maTTNH;

    public ThanhToan() {
    }

    public ThanhToan(int maTT, float soTien, String ndck, int maDH, int maTTNH) {
        this.maTT = maTT;
        this.soTien = soTien;
        this.ndck = ndck;
        this.maDH = maDH;
        this.maTTNH = maTTNH;
    }

    public int getMaTT() {
        return maTT;
    }

    public void setMaTT(int maTT) {
        this.maTT = maTT;
    }

    public float getSoTien() {
        return soTien;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }

    public String getNdck() {
        return ndck;
    }

    public void setNdck(String ndck) {
        this.ndck = ndck;
    }

    public int getMaDH() {
        return maDH;
    }

    public void setMaDH(int maDH) {
        this.maDH = maDH;
    }

    public int getMaTTNH() {
        return maTTNH;
    }

    public void setMaTTNH(int maTTNH) {
        this.maTTNH = maTTNH;
    }
    
}
