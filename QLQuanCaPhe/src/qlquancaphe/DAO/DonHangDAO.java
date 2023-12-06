/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.DAO;

import java.util.ArrayList;
import java.util.List;
import qlquancaphe.entity.DonHang;
import qlquancaphe.utils.JDBCHelper;
import java.sql.ResultSet;

/**
 *
 * @author huydz
 */
public class DonHangDAO extends QLQuanCaPhe<DonHang, String> {

    final String INSERT_SQL = "INSERT INTO DonHang(NgayMua,TongTien,MaNV)VALUES(?,?,?)";
    final String UPDATE_SQL = "UPDATE DonHang SET NgayMua=?,TongTien=?,MaNV=? WHERE MaDH=?";
    final String DELETE_SQL = "DELETE FROM DonHang WHERE MaDH=?";
    final String SELECT_ALL_SQL = "SELECT * FROM DonHang";
    final String SELECT_BY_ID_SQL = "SELECT * FROM DonHang WHERE MaDH=?";
    final String SELECT_BY_MaDH_SQL = "SELECT * FROM DonHang WHERE MaDH=?";

    @Override
    public void insert(DonHang entity) {
        JDBCHelper.update(INSERT_SQL,  entity.getNgayMua(), entity.getTongTien(), entity.getMaNV());

    }

    @Override
    public void update(DonHang entity) {
        JDBCHelper.update(INSERT_SQL,  entity.getNgayMua(), entity.getTongTien(), entity.getMaNV(),entity.getMaDH());
    }

    @Override
    public void delete(String key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<DonHang> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public DonHang selectById(String key) {
        List<DonHang> list = selectBySql(SELECT_BY_ID_SQL, key);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<DonHang> selectBySql(String sql, Object... args) {
        List<DonHang> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                DonHang entity = new DonHang();
                entity.setMaDH(rs.getInt("MaDH"));
                entity.setNgayMua(rs.getString("NgayMua"));
                entity.setTongTien(rs.getFloat("TongTien"));
                entity.setMaNV(rs.getString("MaNV"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }
    public List<DonHang> selectByMaDH(int maDH) {
        return selectBySql(SELECT_BY_MaDH_SQL,maDH);
    }
    public List<Integer> selectYears() {
        String sql ="SELECT DISTINCT YEAR (NgayMua) YEAR FROM DonHang ORDER BY YEAR DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql);
            while (rs.next()) {                
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
     public List<Integer> selectMonths() {
        String sql = "SELECT DISTINCT MONTH (NgayMua) MONTH FROM DonHang ORDER BY MONTH ASC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
