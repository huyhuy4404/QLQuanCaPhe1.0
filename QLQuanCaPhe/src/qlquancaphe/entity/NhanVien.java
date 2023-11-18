/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.entity;

/**
 *
 * @author huydz
 */
public class NhanVien {
    String maNV,hoTen,matkhau;
    boolean vaiTro;
    String ngaySinh,dienThoai;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, String matkhau, boolean vaiTro, String ngaySinh, String dienThoai) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.matkhau = matkhau;
        this.vaiTro = vaiTro;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }
    
}
