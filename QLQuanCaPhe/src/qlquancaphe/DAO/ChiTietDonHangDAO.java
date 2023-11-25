/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.DAO;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;
import qlquancaphe.entity.ChiTietDonHang;
import qlquancaphe.utils.JDBCHelper;

/**
 *
 * @author huydz
 */
public class ChiTietDonHangDAO extends QLQuanCaPhe<ChiTietDonHang, String> {

    final String INSERT_SQL = "INSERT INTO ChiTietDonHang(MaSP,MaDH,SoLuong,DonGia,TongGia)VALUES(?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE ChiTietDonHang SET MaSP=?,MaDH=?,SoLuong=?,DonGia=?,TongGia=? WHERE MaCT=?";
    final String DELETE_SQL = "DELETE FROM ChiTietDonHang WHERE MaCT=?";
    final String SELECT_ALL_SQL = "SELECT * FROM ChiTietDonHang";
    final String SELECT_BY_ID_SQL = "SELECT * FROM ChiTietDonHang WHERE MaCT=?";

    @Override
    public void insert(ChiTietDonHang entity) {
        JDBCHelper.update(INSERT_SQL,  entity.getMaSP(), entity.getMaDH(), entity.getSl(), entity.getDonGia(), entity.getTongGia());
    }

    @Override
    public void update(ChiTietDonHang entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaSP(), entity.getMaDH(), entity.getSl(), entity.getDonGia(), entity.getTongGia(), entity.getMaCT());
    }

    @Override
    public void delete(String key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<ChiTietDonHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChiTietDonHang selectById(String key) {
        List<ChiTietDonHang> list = selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ChiTietDonHang> selectBySql(String sql, Object... args) {
        List<ChiTietDonHang> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                ChiTietDonHang entity = new ChiTietDonHang();
                entity.setMaCT(rs.getInt("MaCT"));
                entity.setMaSP(rs.getInt("MaSP"));
                entity.setMaDH(rs.getInt("MaDH"));
                entity.setSl(rs.getInt("SoLuong"));
                entity.setDonGia(rs.getFloat("DonGia"));
                entity.setTongGia(rs.getFloat("TongGia"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }

}
