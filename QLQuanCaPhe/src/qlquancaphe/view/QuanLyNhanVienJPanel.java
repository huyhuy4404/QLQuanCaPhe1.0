/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlquancaphe.view;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import org.mindrot.jbcrypt.BCrypt;
import qlquancaphe.DAO.NhanVienDAO;
import qlquancaphe.entity.NhanVien;
import qlquancaphe.utils.Auth;
import qlquancaphe.utils.MsgBox;
import qlquancaphe.utils.XDate;

/**
 *
 * @author ADMIN
 */
public class QuanLyNhanVienJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyNhanVienJPanel
     */
    public QuanLyNhanVienJPanel() {
        initComponents();
        init();
    }

    public void setColor(JButton p) {
        p.setBackground(new Color(204, 255, 204));
        p.setForeground(new Color(0, 0, 0));
    }

    public void resetColor(JButton p) {
        p.setBackground(new Color(0, 102, 51));
        p.setForeground(new Color(255, 255, 255));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel3 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        txtHoTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        rdoQuanLy = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        btnFirst1 = new javax.swing.JButton();
        btnPrev1 = new javax.swing.JButton();
        btnNext1 = new javax.swing.JButton();
        btnLast1 = new javax.swing.JButton();

        panel3.setBackground(new java.awt.Color(204, 204, 204));
        panel3.setForeground(new java.awt.Color(255, 204, 102));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Nhân Viên");

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ Tên", "Vai Trò", "Ngày Sinh", "SĐT", "Email"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblNhanVienMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        tabs.addTab("Danh Sách", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        jLabel2.setText("Họ Tên:");

        jLabel3.setText("Vai Trò:");

        jLabel4.setText("Ngày Sinh:");

        jLabel5.setText("Số Điện Thoại:");

        jLabel6.setText("Mật Khấu:");

        lblNhanVien.setText("Mã Nhân Viên:");

        txtMaNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMaNVMouseEntered(evt);
            }
        });

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/Add.png"))); // NOI18N
        btnThem.setText("Thêm ");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemMouseExited(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa ");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/Refresh.png"))); // NOI18N
        btnLamMoi.setText("Làm Mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        rdoQuanLy.setText("Quản Lý ");

        rdoNhanVien.setText("Nhân Viên");

        jLabel8.setText("Email:");

        btnFirst1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/first.png"))); // NOI18N
        btnFirst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirst1ActionPerformed(evt);
            }
        });

        btnPrev1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/prev.png"))); // NOI18N
        btnPrev1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrev1ActionPerformed(evt);
            }
        });

        btnNext1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/next.png"))); // NOI18N
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        btnLast1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/last.png"))); // NOI18N
        btnLast1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLast1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLamMoi)
                        .addGap(12, 12, 12)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addComponent(btnFirst1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnPrev1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnLast1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdoQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(txtHoTen))
                                .addGap(78, 78, 78)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblNhanVien)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoQuanLy)
                    .addComponent(rdoNhanVien)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPrev1)
                    .addComponent(btnNext1)
                    .addComponent(btnLast1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem)
                        .addComponent(btnSua)
                        .addComponent(btnLamMoi)
                        .addComponent(btnXoa)))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        tabs.addTab("Cập Nhật", jPanel2);

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked

    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void tblNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMousePressed
        if (evt.getClickCount() == 2) {
            this.row = tblNhanVien.getSelectedRow();
            if (this.row >= 0) {
                this.edit();
            }
        }
    }//GEN-LAST:event_tblNhanVienMousePressed

    private void txtMaNVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaNVMouseEntered
        setColor(btnSua);
    }//GEN-LAST:event_txtMaNVMouseEntered

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void btnThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseEntered
        setColor(btnThem);
    }//GEN-LAST:event_btnThemMouseEntered

    private void btnThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseExited
        resetColor(btnThem);
    }//GEN-LAST:event_btnThemMouseExited

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnFirst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirst1ActionPerformed
        first();
    }//GEN-LAST:event_btnFirst1ActionPerformed

    private void btnPrev1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrev1ActionPerformed
        prev();
    }//GEN-LAST:event_btnPrev1ActionPerformed

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        next();
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void btnLast1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLast1ActionPerformed
        last();
    }//GEN-LAST:event_btnLast1ActionPerformed

NhanVienDAO dao = new NhanVienDAO();
    int row = -1;
    String notice = "";

    private void init() {
//        this.setLocationRelativeTo(null);
//        this.setIconImage(XImage.getAppIcon());
        this.fillTable();
        txtMaNV.requestFocus();
        this.row = -1;
        this.updateStatus();
        tblNhanVien.setDefaultEditor(Object.class, null);
        tabs.setSelectedIndex(1);

    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        try {
            List<NhanVien> list = dao.selectAll();
            for (NhanVien nv : list) {
                Object[] row = {nv.getMaNV(), nv.getHoTen(),
                    nv.isVaiTro() ? "Quản Lý" : "Nhân Viên",
                    XDate.toString(nv.getNgaySinh(), "yyyy/dd/MM"),
                    nv.getDienThoai(),
                    nv.getEmail()};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    void edit() {
        String manv = (String) tblNhanVien.getValueAt(this.row, 0);
        NhanVien nv = dao.selectById(manv);
        this.setForm(nv);
        tabs.setSelectedIndex(1);
        this.updateStatus();
    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < tblNhanVien.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblNhanVien.getRowCount() - 1;
        this.edit();
    }

    void updateStatus() {

        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblNhanVien.getRowCount() - 1);

        txtMaNV.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

        btnFirst1.setEnabled(edit && !first);
        btnPrev1.setEnabled(edit && !first);
        btnNext1.setEnabled(edit && !last);
        btnLast1.setEnabled(edit && !last);
    }

    void setForm(NhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtHoTen.setText(nv.getHoTen());
        txtMatKhau.setText(nv.getMatKhau());
        rdoQuanLy.setSelected(nv.isVaiTro());
        rdoNhanVien.setSelected(!nv.isVaiTro());
        Date day = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String ngaySinh = dateFormat.format(nv.getNgaySinh());
        txtNgaySinh.setText(ngaySinh);
        //  txtNgaySinh.setText(nv.getNgaySinh());
        txtSDT.setText(nv.getDienThoai());
        txtEmail.setText(nv.getEmail());
    }

    NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNV.getText());
        nv.setHoTen(txtHoTen.getText());
        //test mã hóa password
        String passMaHoa = new String(txtMatKhau.getPassword());
        String maHoa = BCrypt.hashpw(passMaHoa, BCrypt.gensalt());
        nv.setMatKhau(maHoa);
//        nv.setMatKhau(new String(txtMatKhau.getPassword());
        nv.setVaiTro(rdoQuanLy.isSelected());
        Date day = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date ngaySinh = dateFormat.parse(txtNgaySinh.getText());
            nv.setNgaySinh(ngaySinh);
        } catch (ParseException e) {
//            MsgBox.alert(this, "Không thể chuyển đổi kiểu dữ liệu!");
        }
//        nv.setNgaySinh(txtNgaySinh.getDate);
        nv.setDienThoai(txtSDT.getText());
        nv.setEmail(txtEmail.getText());
        return nv;
    }

//    boolean validated() {
//        NhanVien nv = new NhanVien();
//        String manv = txtMaNV.getText();
//        String mk = String.valueOf(txtMatKhau.getPassword());
//        String hoten = txtHoTen.getText();
//        String ngaysinh = txtNgaySinh.getText();
//        String sdt = txtSDT.getText();
//        String email = txtEmail.getText();
//        ButtonGroup gioiTinhGroup = new ButtonGroup();
//        gioiTinhGroup.add(rdoQuanLy);
//        gioiTinhGroup.add(rdoNhanVien);
//        boolean gioiTinhSelected = rdoQuanLy.isSelected() || rdoNhanVien.isSelected();
//        String regexPhone = "^0[0-9]{9}$";
//        String regexEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
//
//        if (!isValidated.isBlank(manv)) {
//            notice = "Vui lòng nhập mã nhân viên";
//            txtMaNV.requestFocus();
//            return false;
//        }
//        if (!isValidated.isBlank(hoten)) {
//            notice = "Vui lòng nhập họ và tên";
//            txtHoTen.requestFocus();
//            return false;
//        }
//        if (!isValidated.isBlank(mk)) {
//            notice = "Vui lòng nhập mật khẩu";
//            txtMatKhau.requestFocus();
//            return false;
//        }
//        if (!isValidated.isBlank(ngaysinh)) {
//            notice = "Vui lòng nhập ngày sinh!";
//            txtNgaySinh.requestFocus();
//            return false;
//
//        }
//        try {
//            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//            Date ngaysinhDate = df.parse(txtNgaySinh.getText());
//            nv.setNgaySinh(new java.sql.Date(ngaysinhDate.getTime()));
//        } catch (ParseException e) {
//            // JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng (Ngày - Tháng - Năm)");
//            MsgBox.alert(this, "Vui lòng nhập đúng định dạng (Năm - Tháng - Ngày)");
//            return false;
//        }
//        if (sdt.isEmpty()) {
//            MsgBox.alert(this, "Vui lòng nhập số điện thoại");
//            return false;
//        } else {
//            if (!sdt.matches(regexPhone)) {
//                MsgBox.alert(this, "Số điện thoại không đúng định dạng");
//                return false;
//            }
//        }
//        try {
//            int std = Integer.parseInt(sdt);
//        } catch (Exception e) {
////            JOptionPane.showMessageDialog(null, "Số điện thoại phải là số");
//            MsgBox.alert(this, "Số điện thoại phải là số");
//            return false;
//        }
//        if (!isValidated.isBlank(email)) {
//            notice = "Vui lòng nhập email";
//            txtEmail.requestFocus();
//            return false;
//        }
//        if (txtEmail.getText().matches(regexEmail)) {
//            nv.setEmail(txtEmail.getText());
//        } else {
//            //  JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng email");
//            MsgBox.alert(this, "Vui lòng nhập đúng định dạng email");
//            return false;
//        }
//
//        return true;
//    }
    public boolean validated() {
        String maNV = txtMaNV.getText();
        String hoTen = txtHoTen.getText();
        String matKhau = new String(txtMatKhau.getPassword());
        String ngaySinh = txtNgaySinh.getText();
        String sdt = txtSDT.getText();
        String email = txtEmail.getText();

        if (maNV.isBlank()) {
            MsgBox.alert(this, "Hãy nhập mã nhân viên!");
            return false;
        }

        if (hoTen.isBlank()) {
            MsgBox.alert(this, "Hãy nhập tên nhân viên!");
            return false;
        } else if (!hoTen.matches("^[^!-@]+$")) {
            MsgBox.alert(this, "Tên sai định dạnh!");
            return false;
        }

        if (matKhau.isBlank()) {
            MsgBox.alert(this, "Hãy nhập mật khẩu");
            return false;
        } else if (matKhau.length() < 8 || matKhau.length() > 12) {
            MsgBox.alert(this, "Mật khẩu phải từ 8 - 10 kí tự !");
            return false;
        } else if (!matKhau.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,12}$")) {
            MsgBox.alert(this, "Mật khẩu phải có cả chữ và số!");
            return false;
        }

        if (!rdoQuanLy.isSelected() && !rdoNhanVien.isSelected()) {
            MsgBox.alert(this, "Hãy chọn chức vụ");
            return false;
        }

        if (ngaySinh.isBlank()) {
            MsgBox.alert(this, "Vui lòng nhập ngày sinh");
            return false;
        } else {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                dateFormat.parse(ngaySinh);
            } catch (ParseException e) {
                MsgBox.alert(this, "Vui lòng nhập đúng định dạng (Năm - Tháng - Ngày)");
                return false;
            }
        }

        if (sdt.isBlank()) {
            MsgBox.alert(this, "Vui lòng nhập số điện thoại");
            return false;
        } else if (!sdt.matches("^0[0-9]{9}$")) {
            MsgBox.alert(this, "Số điện thoại không đúng định dạng");
            return false;
        }

        try {
            int std = Integer.parseInt(sdt);
        } catch (NumberFormatException e) {
            MsgBox.alert(this, "Số điện thoại phải là số");
            return false;
        }

        if (email.isBlank()) {
            MsgBox.alert(this, "Hãy nhập email!");
            return false;
        } else if (!email.matches("^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$")) {
            MsgBox.alert(this, "Sai định dạng Email");
            return false;
        }

        return true;
    }

    void clearForm() {
        NhanVien nv = new NhanVien();
        this.setForm(nv);
        txtMaNV.requestFocus();
        this.row = -1;
        this.updateStatus();
    }

    void insert() {
        NhanVien nv = getForm();
        boolean isSuccess = validated();
        if (!isSuccess) {
          //  MsgBox.alert(this, notice);
        } else {
            try {
                dao.insert(nv);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Thêm mới thành công !");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại");
                e.printStackTrace();
            }
        }
    }

    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xoá nhân viên này !");
        } else {
            String manv = txtMaNV.getText();
            if (manv.equals(Auth.user.getMaNV())) {
                MsgBox.alert(this, "Bạn không được xoá chính bạn !");
            } else if (MsgBox.confirm(this, "Bạn có thực sự muốn xoá nhân viên này ?")) {
                try {
                    dao.delete(manv);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xoá thành công !");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xoá thất bại");
                }
            }
        }
    }

    void update() {

        NhanVien nv = getForm();
        boolean isSuccess = validated();
        if (!isSuccess) {
          //  MsgBox.alert(this, notice);
        } else {
            try {
                dao.update(nv);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Cập nhật thành công !");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại");
                e.printStackTrace();
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst1;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLast1;
    private javax.swing.JButton btnNext1;
    private javax.swing.JButton btnPrev1;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNhanVien;
    private java.awt.Panel panel3;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoQuanLy;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
