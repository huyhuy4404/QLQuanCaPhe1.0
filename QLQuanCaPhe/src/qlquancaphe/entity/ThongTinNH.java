/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.entity;

/**
 *
 * @author huydz
 */
public class ThongTinNH {
    int maTTNH;
    String stk,tenNH,chuTK;

    public ThongTinNH() {
    }

    public ThongTinNH(int maTTNH, String stk, String tenNH, String chuTK) {
        this.maTTNH = maTTNH;
        this.stk = stk;
        this.tenNH = tenNH;
        this.chuTK = chuTK;
    }

    public int getMaTTNH() {
        return maTTNH;
    }

    public void setMaTTNH(int maTTNH) {
        this.maTTNH = maTTNH;
    }

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public String getTenNH() {
        return tenNH;
    }

    public void setTenNH(String tenNH) {
        this.tenNH = tenNH;
    }

    public String getChuTK() {
        return chuTK;
    }

    public void setChuTK(String chuTK) {
        this.chuTK = chuTK;
    }
    
}
