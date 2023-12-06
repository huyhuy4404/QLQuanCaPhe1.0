/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlquancaphe.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import qlquancaphe.DAO.ChiTietDonHangDAO;
import qlquancaphe.DAO.DonHangDAO;
import qlquancaphe.DAO.LoaiSanPhamDAO;
import qlquancaphe.DAO.SanPhamDAO;
import qlquancaphe.DAO.ThanhToanDAO;
import qlquancaphe.DAO.ThongTinNHDAO;
import qlquancaphe.TinhTien;
import qlquancaphe.entity.ChiTietDonHang;
import qlquancaphe.entity.LoaiSanPham;
import qlquancaphe.entity.SanPham;
import qlquancaphe.entity.ThanhToan;
import qlquancaphe.entity.ThongTinNH;
import qlquancaphe.utils.Auth;
import qlquancaphe.utils.MsgBox;
import qlquancaphe.utils.XImage;

/**
 *
 * @author huydz
 */
public class DonHang extends javax.swing.JPanel {

    List<LoaiSanPham> list = new ArrayList<>();
    LoaiSanPhamDAO lspDAO = new LoaiSanPhamDAO();
    SanPhamDAO spDAO = new SanPhamDAO();
    DonHangDAO dhDAO = new DonHangDAO();
    ChiTietDonHangDAO CTDHDAO = new ChiTietDonHangDAO();
    int row = 0;
    ThanhToanDAO ttDAO = new ThanhToanDAO();
    ThongTinNHDAO TTNHDAO = new ThongTinNHDAO();

    /**
     * Creates new form DonHang
     */
    public DonHang() {
        initComponents();
        fillComboboxLSP();
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        loadThanhToan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        btnInHoaDon = new javax.swing.JButton();
        btnHuyMon = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cboLoaiSP = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        lblHinh = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên món", "SL", "Giá", "Tổng giá"
            }
        ));
        jScrollPane1.setViewportView(tblHoaDon);

        jLabel1.setText("Tổng tiền:");

        lblTongTien.setText("0");

        btnInHoaDon.setBackground(new java.awt.Color(204, 255, 204));
        btnInHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/Print preview.png"))); // NOI18N
        btnInHoaDon.setText("In hóa đơn");
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        btnHuyMon.setBackground(new java.awt.Color(204, 255, 204));
        btnHuyMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/Trash.png"))); // NOI18N
        btnHuyMon.setText("Hủy món");
        btnHuyMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyMonActionPerformed(evt);
            }
        });

        btnThanhToan.setBackground(new java.awt.Color(204, 255, 204));
        btnThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/Price list.png"))); // NOI18N
        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHuyMon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThanhToan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTongTien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuyMon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cboLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboLoaiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboLoaiSPMouseClicked(evt);
            }
        });
        cboLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiSPActionPerformed(evt);
            }
        });

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Đơn giá"
            }
        ));
        tblSanPham.setColumnSelectionAllowed(true);
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSanPhamMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinh.setText("Hình");
        lblHinh.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 897, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        // TODO add your handling code here:
        if (tblHoaDon.getRowCount() == 0) {
            MsgBox.alert(this, "Bạn chưa có sản phẩm nào trong hóa đơn");
        } else {
            MsgBox.alert(this, "In hóa đơn thành công");
        }
    }//GEN-LAST:event_btnInHoaDonActionPerformed

    private void btnHuyMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyMonActionPerformed
        // TODO add your handling code here:
        deleteMon();
        tinhTongTien();
        loadThanhToan();
    }//GEN-LAST:event_btnHuyMonActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:

        if (check()) {
            ThanhToan();
        }
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void cboLoaiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboLoaiSPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboLoaiSPMouseClicked

    private void cboLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiSPActionPerformed
        // TODO add your handling code here:
        loadTableSanPham();
    }//GEN-LAST:event_cboLoaiSPActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        loadHinh();
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void tblSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSanPhamMouseEntered

    private void tblSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMousePressed
        // TODO add your handling code here:
        try {
            if (evt.getClickCount() == 2) {
                fillTableHoaDon();
                tinhTongTien();
                loadThanhToan();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblSanPhamMousePressed
    void fillTableHoaDon() {
        String input = MsgBox.prompt(this, "Vui lòng nhập số lượng");
        if (input.matches("\\d+")) {
            int sl1 = Integer.parseInt(input);
            if (sl1 <= 0) {
                MsgBox.alert(this, "Số lượng phải lớn hơn 0");
                return;
            }
        } else {
            MsgBox.alert(this, "Số lượng chỉ là số");
            return;
        }

        if (input != null && !input.isEmpty()) {
            try {
                int sl = Integer.parseInt(input);
                DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
                int maSP = tblSanPham.getSelectedRow();
                List<SanPham> list = (List<SanPham>) spDAO.selectbyMaSP(tblSanPham.getValueAt(maSP, 0));
                for (SanPham sp : list) {
                    for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
                        String tenSP = (String) tblHoaDon.getValueAt(i, 0);
                        if (tenSP.equalsIgnoreCase(sp.getTenSP())) {
                            MsgBox.alert(this, "Sản phẩm đã tồn tại");
                            return;
                        }
                    }
                    Object[] row = {sp.getTenSP(),
                        sl,
                        sp.getDonGia(),
                        sp.getDonGia() * sl};
                    model.insertRow(0, row);
                }

            } catch (NumberFormatException e) {
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            return;
        }
    }

    void loadThanhToan() {
        if (tblHoaDon.getRowCount() == 0) {
            btnThanhToan.setEnabled(false);
        } else {
            btnThanhToan.setEnabled(true);
        }
    }

    public boolean check() {
        if (Auth.user == null) {
            MsgBox.alert(this, "Vui lòng đăng nhập để thanh toán");
            return false;
        }
        return true;
    }

    void fillTableHoaDon2() {
        List<qlquancaphe.entity.DonHang> ds = dhDAO.selectAll();
        qlquancaphe.entity.DonHang lastDonHang = ds.get(ds.size() - 1);
        int maDH = lastDonHang.getMaDH();
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        try {
            List<ChiTietDonHang> ctList = CTDHDAO.selectbyMaDH(maDH);
            for (ChiTietDonHang ctdh : ctList) {
                int sl = ctdh.getSl();
                List<SanPham> list1 = (List<SanPham>) spDAO.selectbyMaSP(ctdh.getMaSP());
                for (SanPham sp : list1) {
                    Object[] row = {sp.getTenSP(),
                        sl,
                        sp.getDonGia(),
                        sp.getDonGia() * sl};
                    model.insertRow(0, row);
                }
            }
            tinhTongTien();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void deleteMon() {
        try {
            int hoaDon = tblHoaDon.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
            model.removeRow(hoaDon);
        } catch (Exception e) {
            MsgBox.alert(this, "Vui lòng chọn món cần hủy");
            return;
        }
    }

    void ThanhToan() {
        try {
            Date currentDate = new Date();

            // Định dạng ngày tháng
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            // Hiển thị ngày tháng năm
            String ngayHienTai = dateFormat.format(currentDate);
            qlquancaphe.entity.DonHang dh = new qlquancaphe.entity.DonHang();
            dh.setNgayMua(ngayHienTai);
            float tongTien = Float.parseFloat(lblTongTien.getText());
            dh.setTongTien(tongTien);
            String maNV = Auth.isMaNV();
            dh.setMaNV(maNV);
            dhDAO.insert(dh);
            List<qlquancaphe.entity.DonHang> ds = dhDAO.selectAll();
            qlquancaphe.entity.DonHang lastDonHang = ds.get(ds.size() - 1);
            int maDH = lastDonHang.getMaDH();

            for (int i = 0; i < tblHoaDon.getRowCount(); i++) {
                ChiTietDonHang CTDH = new ChiTietDonHang();
                String ten = (String) tblHoaDon.getValueAt(i, 0);
                int sl = (int) tblHoaDon.getValueAt(i, 1);
                float tongGia = (float) tblHoaDon.getValueAt(i, 3);
                List<SanPham> list = spDAO.selectbyTenSP(ten);
                for (SanPham sp : list) {
                    int masp = sp.getMaSP();
                    CTDH.setMaSP(masp);
                    CTDH.setMaDH(maDH);
                    CTDH.setSl(sl);
                    CTDH.setDonGia(sp.getDonGia());
                    CTDH.setTongGia(tongGia);
                    CTDHDAO.insert(CTDH);
                }
            }
            List<ThanhToan> listTT = ttDAO.selectByMaDH(maDH);
            for (ThanhToan tt : listTT) {
                tt.setSoTien(dh.getTongTien());
                tt.setNdck("THANKS YOU");
                tt.setMaDH(maDH);
                ThongTinNH ttNH = (ThongTinNH) TTNHDAO.selectAll();
                int maTTNH = ttNH.getMaTTNH();
                tt.setMaTTNH(maTTNH);
                ttDAO.insert(tt);
            }
            TinhTien tinhTien = new TinhTien();
            this.setVisible(false);
            tinhTien.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Thanh toán thất bại!");
        }
    }

    void loadHinh() {
        int maSP = tblSanPham.getSelectedRow();
        Object value = tblSanPham.getValueAt(maSP, 0);
        if (value instanceof Integer) {
            int maSPValue = (int) value;
            List<SanPham> list = (List<SanPham>) spDAO.selectbyMaSP(maSPValue);
            for (SanPham sp : list) {
                if (sp.getHinh() != null) {
                    lblHinh.setToolTipText(sp.getHinh());
                    lblHinh.setIcon(XImage.read(sp.getHinh()));
                }
            }
        } else {
            return;
        }
    }

    private void fillComboboxLSP() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboLoaiSP.getModel();
        model.removeAllElements();
        try {
            List<LoaiSanPham> ds = lspDAO.selectAll();
            for (LoaiSanPham cd : ds) {
                model.addElement(cd);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }

    }

    private void loadTableSanPham() {
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        try {
            List<SanPham> list = spDAO.selectbyMaLSP(cboLoaiSP.getSelectedIndex() + 1);
            for (SanPham sp : list) {
                Object[] row = {sp.getMaSP(), sp.getTenSP(), sp.getDonGia()};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    void tinhTongTien() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        if (model.getRowCount() == 0) {
            lblTongTien.setText(0 + "");
        }
        int soHang = model.getRowCount();
        int tongTien = 0;
        for (int i = 0; i < soHang; i++) {
            float soTien = (float) tblHoaDon.getValueAt(i, 3);
            tongTien += soTien;
            lblTongTien.setText(String.valueOf(tongTien));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyMon;
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JComboBox<String> cboLoaiSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblSanPham;
    // End of variables declaration//GEN-END:variables
}
