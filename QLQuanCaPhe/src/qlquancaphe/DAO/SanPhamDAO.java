
package qlquancaphe.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import qlquancaphe.entity.SanPham;
import qlquancaphe.utils.JDBCHelper;

/**
 *
 * @author huydz
 */
public class SanPhamDAO extends QLQuanCaPhe<SanPham, String> {

    String INSERT_SQL = "INSERT INTO SanPham ( TenSP, DonGia, MaLSP, Hinh, MoTa) VALUES ( ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE SanPham SET TenSP=?, DonGia=?, MaLSP=?, Hinh=?, MoTa=? WHERE MaSP=?";
    String DELETE_SQL = "DELETE FROM SanPham WHERE MaSP=?";
    String SELECT_ALL_SQL = "SELECT * FROM SanPham";
    String SELECT_BY_ID_SQL = "SELECT * FROM SanPham WHERE MaSP=?";
    String SELECT_BY_LSP_SQL = "SELECT * FROM SanPham WHERE MaLSP = ?";
    String SELECT_BY_TEN_SQL = "SELECT * FROM SanPham WHERE TenSP = ?";

    @Override
    public void insert(SanPham entity) {
        JDBCHelper.update(INSERT_SQL,
                entity.getTenSP(),
                entity.getDonGia(),
                entity.getMaLSP(),
                entity.getHinh(),
                entity.getMoTa());
    }

    @Override
   public void update(SanPham entity) {
              JDBCHelper.update(UPDATE_SQL,
                entity.getTenSP(),
                entity.getDonGia(),
                entity.getMaLSP(),
                entity.getHinh(),
                entity.getMoTa(),
                entity.getMaSP());
    }

    @Override
    public void delete(String id) {
          JDBCHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<SanPham> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public SanPham selectById(String key) {
        List<SanPham> list = selectBySql(SELECT_BY_ID_SQL, key);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                SanPham entity = new SanPham();
                entity.setMaSP(rs.getInt("MaSP"));
                entity.setTenSP(rs.getString("TenSP"));
                entity.setDonGia(rs.getFloat("DonGia"));
                entity.setMaLSP(rs.getInt("MaLSP"));
                entity.setHinh(rs.getString("Hinh"));
                entity.setMoTa(rs.getString("MoTa"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public List<SanPham> selectbyMaLSP(int MaLSP) {
        return selectBySql(SELECT_BY_LSP_SQL,MaLSP);
    }
    public List<SanPham> selectbyTenSP(String tenSP) {
        return selectBySql(SELECT_BY_TEN_SQL,tenSP);
    }
    public List<SanPham> selectbyMaSP(Object MaSP) {
        return selectBySql(SELECT_BY_ID_SQL,MaSP);
    }
    public List<SanPham> selectByKeyword(String keyword) {
        String SQL = "SELECT * FROM SanPham WHERE TenSP LIKE ?";
        return this.selectBySql(SQL, "%" + keyword + "%");
    }
}
