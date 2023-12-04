/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.DAO;

import java.util.ArrayList;
import java.util.List;
import qlquancaphe.entity.ThanhToan;
import qlquancaphe.utils.JDBCHelper;
import java.sql.ResultSet;

/**
 *
 * @author huydz
 */
public class ThanhToanDAO extends QLQuanCaPhe<ThanhToan, String> {

    final String INSERT_SQL = "INSERT INTO ThanhToan(SoTien,NDCK,MaDH,MaTTNH)VALUES(?,?,?,?)";
    final String UPDATE_SQL = "UPDATE ThanhToan SET SoTien=?,MaDH=?,MaTTNH=? WHERE MaTT=?";
    final String DELETE_SQL = "DELETE FROM ThanhToan WHERE MaTT=?";
    final String SELECT_ALL_SQL = "SELECT * FROM ThanhToan";
    final String SELECT_BY_ID_SQL = "SELECT * FROM ThanhToan WHERE MaTT=?";
    final String SELECT_BY_MaDH_SQL = "SELECT * FROM ThanhToan WHERE MaDH =?";

    @Override
    public void insert(ThanhToan entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getSoTien(),
                entity.getNdck(),
                entity.getMaDH(),
                entity.getMaTTNH()
        );
    }

    @Override
    public void update(ThanhToan entity) {
        JDBCHelper.update(UPDATE_SQL,
                entity.getSoTien(),
                entity.getMaDH(),
                entity.getMaTTNH(),
                entity.getMaTT()
        );
    }

    @Override
    public void delete(String key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<ThanhToan> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ThanhToan selectById(String key) {
        List<ThanhToan> list = selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ThanhToan> selectBySql(String sql, Object... args) {
        List<ThanhToan> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                ThanhToan entity = new ThanhToan();
                entity.setMaTT(Integer.parseInt("MaTT"));
                entity.setSoTien(Float.parseFloat("SoTien"));
                entity.setNdck("NDCK");
                entity.setMaDH(Integer.parseInt("MaDH"));
                entity.setMaTTNH(Integer.parseInt("MaTTNH"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }

    public List<ThanhToan> selectByMaDH(int maDH) {
        return selectBySql(SELECT_BY_MaDH_SQL,maDH);
    }
}
