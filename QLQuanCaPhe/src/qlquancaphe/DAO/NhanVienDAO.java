/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlquancaphe.entity.NhanVien;
import qlquancaphe.utils.JDBCHelper;

/**
 *
 * @author huydz
 */
public class NhanVienDAO extends QLQuanCaPhe<NhanVien, String> {

    final String INSERT_SQL = "INSERT INTO NhanVien(MaNV,HoTen,MatKhau,VaiTro,NgaySinh,DienThoai)VALUES(?,?,?,?,?,?)";
    final String UPDATE_SQL = "UPDATE NhanVien SET HoTen=?,MatKhau=?,VaiTro=?,NgaySinh=?,DienThoai=? WHERE MaNV=?";
    final String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV=?";
    final String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    final String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV=?";

    @Override
    public void insert(NhanVien entity) {
        JDBCHelper.update(INSERT_SQL, entity.getMaNV(), entity.getHoTen(), entity.getMatkhau(), entity.isVaiTro(), entity.getNgaySinh(), entity.getDienThoai());
    }

    @Override
    public void update(NhanVien entity) {
        JDBCHelper.update(INSERT_SQL, entity.getHoTen(), entity.getMatkhau(), entity.isVaiTro(), entity.getNgaySinh(), entity.getDienThoai(), entity.getMaNV());
    }

    @Override
    public void delete(String key) {
        JDBCHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String key) {
        List<NhanVien> list = selectBySql(SELECT_BY_ID_SQL, key);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setMatkhau(rs.getString("MatKhau"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                entity.setNgaySinh(rs.getString("NgaySinh"));
                entity.setDienThoai(rs.getString("DienThoai"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }

}
