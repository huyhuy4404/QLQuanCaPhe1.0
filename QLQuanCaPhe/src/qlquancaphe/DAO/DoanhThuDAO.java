/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import qlquancaphe.utils.JDBCHelper;

/**
 *
 * @author ADMIN
 */
public class DoanhThuDAO {

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> doanhThuNam(int nam) {
        String sql = "{CALL SP_THONGKEDOANHTHUNAM (?)}";
        String[] cols = {"TenSP", "SoLuong", "DonGia", "TongTien"};
        return getListOfArray(sql, cols, nam);
    }

    public List<Object[]> doanhThuThang(int thang) {
        String sql = "{CALL [SP_THONGKEDOANHTHUTHANG] (?)}";
        String[] cols = {"TenSP", "SoLuong", "DonGia", "TongTien"};
        return getListOfArray(sql, cols, thang);
    }

    public List<Object[]> doanhThuNamVaThang(int nam, int thang) {
        String sql = "{CALL SP_THONGKEDOANHTHUNAMANDTHANG (?, ?)}";
        String[] cols = {"TenSP", "SoLuong", "DonGia", "TongTien"};
        return getListOfArray(sql, cols, nam, thang);
    }
}
