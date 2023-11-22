/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.DAO;

import java.util.List;
import qlquancaphe.entity.DonHang;

/**
 *
 * @author huydz
 */
public class DonHangDAO extends QLQuanCaPhe<DonHang, String> {

    final String INSERT_SQL = "INSERT INTO DonHang(MaLSP,TenLoaiSP)VALUES(?,?)";
    final String UPDATE_SQL = "UPDATE LoaiSP SET TenLoaiSP=? WHERE MaLSP=?";
    final String DELETE_SQL = "DELETE FROM LoaiSP WHERE MaLSP=?";
    final String SELECT_ALL_SQL = "SELECT * FROM LoaiSP";
    final String SELECT_BY_ID_SQL = "SELECT * FROM LoaiSP WHERE MaLSP=?";

    @Override
    public void insert(DonHang entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(DonHang entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DonHang> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DonHang selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<DonHang> selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
