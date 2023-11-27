/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.DAO;

import java.util.ArrayList;
import java.util.List;
import qlquancaphe.entity.LoaiSanPham;
import qlquancaphe.utils.JDBCHelper;
import java.sql.ResultSet;

/**
 *
 * @author huydz
 */
public class LoaiSanPhamDAO extends QLQuanCaPhe<LoaiSanPham, Object> {

    final String INSERT_SQL = "INSERT INTO LoaiSP(TenLoaiSP)VALUES(?)";
    final String UPDATE_SQL = "UPDATE LoaiSP SET TenLoaiSP=? WHERE MaLSP=?";
    final String DELETE_SQL = "DELETE FROM LoaiSP WHERE MaLSP=?";
    final String SELECT_ALL_SQL = "SELECT * FROM LoaiSP";
    final String SELECT_BY_ID_SQL = "SELECT * FROM LoaiSP WHERE MaLSP=?";

    @Override
    public void insert(LoaiSanPham entity) {
        JDBCHelper.update(INSERT_SQL, entity.getTenLSP());
    }

    @Override
    public void update(LoaiSanPham entity) {
        JDBCHelper.update(UPDATE_SQL,  entity.getTenLSP(),entity.getMaLSP());
    }

    @Override
    public void delete(Object key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<LoaiSanPham> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public  LoaiSanPham selectById(Object key) {
        List<LoaiSanPham> list = selectBySql(SELECT_BY_ID_SQL, key);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected  List<LoaiSanPham> selectBySql(String sql, Object... args) {
        List<LoaiSanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                LoaiSanPham entity = new LoaiSanPham();
                entity.setMaLSP(rs.getInt("MaLSP"));
                entity.setTenLSP(rs.getString("TenLoaiSP"));
                list.add(entity);
            }
              return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
      
    }

}
