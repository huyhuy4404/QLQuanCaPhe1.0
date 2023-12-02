/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.DAO;

import java.util.ArrayList;
import java.util.List;
import qlquancaphe.entity.ThongTinNH;
import qlquancaphe.utils.JDBCHelper;
import java.sql.ResultSet;

/**
 *
 * @author huydz
 */
public class ThongTinNHDAO extends QLQuanCaPhe<ThongTinNH, String>{
    final String SELECT_ALL_SQL = "SELECT * FROM ThongTinNH";
    final String SELECT_BY_ID_SQL = "SELECT * FROM ThongTinNH WHERE MaTTNH=?";
    @Override
    public void insert(ThongTinNH entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(ThongTinNH entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ThongTinNH> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ThongTinNH selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<ThongTinNH> selectBySql(String sql, Object... args) {
        List<ThongTinNH> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                ThongTinNH entity = new ThongTinNH();
               entity.setMaTTNH(rs.getInt("MaTTNH"));
               entity.setStk(rs.getString("STK"));
               entity.setTenNH(rs.getString("TenNH"));
               entity.setChuTK(rs.getString("NguoiThuHuong"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }
    
}
