/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlquancaphe.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import qlquancaphe.DAO.LoaiSanPhamDAO;
import qlquancaphe.DAO.SanPhamDAO;
import qlquancaphe.entity.LoaiSanPham;
import qlquancaphe.entity.SanPham;
import qlquancaphe.utils.MsgBox;
import qlquancaphe.utils.XImage;

/**
 *
 * @author huydz
 */
public class DonHang2JPanel extends javax.swing.JPanel {

    SanPhamDAO spDAO = new SanPhamDAO();
    LoaiSanPhamDAO lspDAO = new LoaiSanPhamDAO();
    private ArrayList<String> productList;

    /**
     * Creates new form DonHang2JPanel
     */
    public DonHang2JPanel() {
        initComponents();
        loadSanPham();
        fillComBoBoxSP();
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
        pnHoaDon = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnInHoaDon = new javax.swing.JButton();
        lblTongTien = new javax.swing.JLabel();
        btnHuyMon = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        srpnSanPham = new javax.swing.JScrollPane();
        pnSanPham = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cboSanPham = new javax.swing.JComboBox<>();
        pnTinhTien = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(900, 566));

        jPanel1.setLayout(new java.awt.CardLayout());

        pnHoaDon.setPreferredSize(new java.awt.Dimension(900, 566));

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

        btnInHoaDon.setBackground(new java.awt.Color(204, 255, 204));
        btnInHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/Print preview.png"))); // NOI18N
        btnInHoaDon.setText("In hóa đơn");
        btnInHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInHoaDonActionPerformed(evt);
            }
        });

        lblTongTien.setText("0");

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

        pnSanPham.setLayout(new java.awt.GridLayout(14, 3, 8, 8));
        srpnSanPham.setViewportView(pnSanPham);

        cboSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSanPhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnHoaDonLayout = new javax.swing.GroupLayout(pnHoaDon);
        pnHoaDon.setLayout(pnHoaDonLayout);
        pnHoaDonLayout.setHorizontalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addGroup(pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnHoaDonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnHoaDonLayout.createSequentialGroup()
                                .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHuyMon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(srpnSanPham)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnHoaDonLayout.setVerticalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTongTien))
                .addGap(12, 12, 12)
                .addGroup(pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuyMon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(srpnSanPham))
        );

        jPanel1.add(pnHoaDon, "card2");

        javax.swing.GroupLayout pnTinhTienLayout = new javax.swing.GroupLayout(pnTinhTien);
        pnTinhTien.setLayout(pnTinhTienLayout);
        pnTinhTienLayout.setHorizontalGroup(
            pnTinhTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        pnTinhTienLayout.setVerticalGroup(
            pnTinhTienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel1.add(pnTinhTien, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInHoaDonActionPerformed
        // TODO add your handling code here:
//        if (tblHoaDon.getRowCount() == 0) {
//            MsgBox.alert(this, "Bạn chưa có sản phẩm nào trong hóa đơn");
//        } else {
//            MsgBox.alert(this, "In hóa đơn thành công");
//        }
    }//GEN-LAST:event_btnInHoaDonActionPerformed

    private void btnHuyMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyMonActionPerformed
        // TODO add your handling code here:
//        deleteMon();
//        tinhTongTien();
//        loadThanhToan();
    }//GEN-LAST:event_btnHuyMonActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:

//        if (check()) {
//            ThanhToan();
//        }
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void cboSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSanPhamActionPerformed
        // TODO add your handling code here:
        loadPanelSanPham();
    }//GEN-LAST:event_cboSanPhamActionPerformed
    void loadSanPham() {

        List<SanPham> list = spDAO.selectAll();
        for (SanPham sp : list) {
            JPanel pnChuaSP = new JPanel();
            pnChuaSP.setPreferredSize(new Dimension(180, 200));
            pnChuaSP.setLayout(new BoxLayout(pnChuaSP, BoxLayout.Y_AXIS));
            pnChuaSP.setBackground(Color.WHITE);
            productList = new ArrayList<>();
            productList.add(sp.getTenSP());
            JLabel lblHinh = new JLabel(sp.getHinh());
            lblHinh.setPreferredSize(new Dimension(180, 180));
            lblHinh.setAlignmentX(Component.CENTER_ALIGNMENT);
            if (lblHinh != null) {
                lblHinh.setToolTipText(sp.getHinh());
                lblHinh.setIcon(XImage.read(sp.getHinh()));
                JLabel lblSanPham = new JLabel(sp.getTenSP());
                lblSanPham.setAlignmentX(Component.CENTER_ALIGNMENT);
                pnChuaSP.add(lblHinh);
                pnChuaSP.add(lblSanPham);
                pnSanPham.add(pnChuaSP);
                pnSanPham.revalidate();
                pnSanPham.repaint();
            }

        }
    }
    public void fillComBoBoxSP(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboSanPham.getModel();
        model.removeAllElements();
        try {
            List<LoaiSanPham> ds = lspDAO.selectAll();
            for (LoaiSanPham cd : ds) {
                model.addElement(cd);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
    }
    public void loadPanelSanPham(){
         
//        String  tenLSP = (String) cboSanPham.getSelectedItem();
//        List<LoaiSanPham> lsp = lspDAO.selectByTenLSP(tenLSP);
//        for(LoaiSanPham lsp1 : lsp){
//            int maLSP = lsp1.getMaLSP();
//            
//        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyMon;
    private javax.swing.JButton btnInHoaDon;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JComboBox<String> cboSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JPanel pnHoaDon;
    private javax.swing.JPanel pnSanPham;
    private javax.swing.JPanel pnTinhTien;
    private javax.swing.JScrollPane srpnSanPham;
    private javax.swing.JTable tblHoaDon;
    // End of variables declaration//GEN-END:variables
}
