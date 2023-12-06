/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlquancaphe;

import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import qlquancaphe.DAO.ChiTietDonHangDAO;
import qlquancaphe.DAO.DonHangDAO;
import qlquancaphe.entity.ChiTietDonHang;
import qlquancaphe.entity.DonHang;
import qlquancaphe.utils.MsgBox;

/**
 *
 * @author huydz
 */
public class TinhTien extends javax.swing.JFrame {

    ChiTietDonHangDAO CTDHDAO = new ChiTietDonHangDAO();
    DonHangDAO dhDAO = new DonHangDAO();
    public static int soTien;

    /**
     * Creates new form TinhTien
     */
    public TinhTien() {
        initComponents();
        loadTien();
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
        jLabel1 = new javax.swing.JLabel();
        lblTienCanThanhToan = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTienKhachTra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTienTraLai = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtSoTien = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn500 = new javax.swing.JButton();
        btn300 = new javax.swing.JButton();
        btn200 = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnTienMat = new javax.swing.JButton();
        btnChuyenKhoan = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnTroVe = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tính tiền");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Số tiền cần thanh toán:");

        lblTienCanThanhToan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTienCanThanhToan.setText("0");

        jLabel2.setText("Số tiền khách trả:");

        lblTienKhachTra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTienKhachTra.setText("0");

        jLabel3.setText("Số tiền thừa trả lại:");

        lblTienTraLai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTienTraLai.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblTienTraLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTienKhachTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 131, Short.MAX_VALUE))
                            .addComponent(lblTienCanThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTienCanThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblTienKhachTra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTienTraLai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        txtSoTien.setEditable(false);
        txtSoTien.setBackground(new java.awt.Color(204, 204, 204));
        txtSoTien.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtSoTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jPanel4.setLayout(new java.awt.GridLayout(4, 3, 5, 5));

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel4.add(btn7);

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel4.add(btn8);

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel4.add(btn9);

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel4.add(btn4);

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel4.add(btn5);

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel4.add(btn6);

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel4.add(btn1);

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel4.add(btn2);

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel4.add(btn3);

        btn0.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel4.add(btn0);

        btn00.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn00.setText("00");
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });
        jPanel4.add(btn00);

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setText("<");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel4.add(btnXoa);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(txtSoTien))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSoTien, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new java.awt.GridLayout(5, 1, 10, 20));

        btn500.setBackground(new java.awt.Color(204, 255, 255));
        btn500.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn500.setText("500000");
        btn500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn500ActionPerformed(evt);
            }
        });
        jPanel5.add(btn500);

        btn300.setBackground(new java.awt.Color(204, 255, 255));
        btn300.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn300.setText("300000");
        btn300.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn300ActionPerformed(evt);
            }
        });
        jPanel5.add(btn300);

        btn200.setBackground(new java.awt.Color(204, 255, 255));
        btn200.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn200.setText("200000");
        btn200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200ActionPerformed(evt);
            }
        });
        jPanel5.add(btn200);

        btn100.setBackground(new java.awt.Color(204, 255, 255));
        btn100.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn100.setText("100000");
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });
        jPanel5.add(btn100);

        btn50.setBackground(new java.awt.Color(204, 255, 255));
        btn50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn50.setText("50000");
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });
        jPanel5.add(btn50);

        jPanel6.setLayout(new java.awt.GridLayout(2, 1, 5, 15));

        btnTienMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/cash.png"))); // NOI18N
        btnTienMat.setText("Tiền mặt");
        btnTienMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTienMatActionPerformed(evt);
            }
        });
        jPanel6.add(btnTienMat);

        btnChuyenKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/chuyenkhoan.png"))); // NOI18N
        btnChuyenKhoan.setText("Chuyển khoản");
        btnChuyenKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenKhoanActionPerformed(evt);
            }
        });
        jPanel6.add(btnChuyenKhoan);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 0, 670, -1));

        jPanel7.setLayout(new java.awt.GridLayout(1, 2, 5, 10));

        btnTroVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/Open door.png"))); // NOI18N
        btnTroVe.setText("Trở về");
        btnTroVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroVeActionPerformed(evt);
            }
        });
        jPanel7.add(btnTroVe);

        btnThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/Price list.png"))); // NOI18N
        btnThanhToan.setText("Thanh toán");
        btnThanhToan.setEnabled(false);
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });
        jPanel7.add(btnThanhToan);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 311, 300, 80));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        txtSoTien.setText(txtSoTien.getText() + 7);
        init();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        txtSoTien.setText(txtSoTien.getText() + 8);
        init();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        txtSoTien.setText(txtSoTien.getText() + 9);
        init();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        txtSoTien.setText(txtSoTien.getText() + 4);
        init();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        txtSoTien.setText(txtSoTien.getText() + 5);
        init();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        txtSoTien.setText(txtSoTien.getText() + 6);
        init();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        txtSoTien.setText(txtSoTien.getText() + 1);
        init();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        txtSoTien.setText(txtSoTien.getText() + 2);
        init();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        txtSoTien.setText(txtSoTien.getText() + 3);
        init();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        txtSoTien.setText(txtSoTien.getText() + 0);
        init();
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        // TODO add your handling code here:
        txtSoTien.setText(txtSoTien.getText() + 00);
        init();
    }//GEN-LAST:event_btn00ActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        txtSoTien.setText(txtSoTien.getText().substring(0, txtSoTien.getText().length() - 1));
        init();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btn500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn500ActionPerformed
        // TODO add your handling code here:
        String so = evt.getActionCommand();
        txtSoTien.setText(so);
        init();
    }//GEN-LAST:event_btn500ActionPerformed

    private void btn300ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn300ActionPerformed
        // TODO add your handling code here:
        String so = evt.getActionCommand();
        txtSoTien.setText(so);
        init();
    }//GEN-LAST:event_btn300ActionPerformed

    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
        // TODO add your handling code here:
        String so = evt.getActionCommand();
        txtSoTien.setText(so);
        init();
    }//GEN-LAST:event_btn200ActionPerformed

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        // TODO add your handling code here:
        String so = evt.getActionCommand();
        txtSoTien.setText(so);
        init();
    }//GEN-LAST:event_btn100ActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
        // TODO add your handling code here:
        String so = evt.getActionCommand();
        txtSoTien.setText(so);
        init();
    }//GEN-LAST:event_btn50ActionPerformed

    private void btnTienMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTienMatActionPerformed
        // TODO add your handling code here:
        btnThanhToan.setText("Thanh toán TM");
        btnThanhToan.setEnabled(true);
    }//GEN-LAST:event_btnTienMatActionPerformed

    private void btnChuyenKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenKhoanActionPerformed
        // TODO add your handling code here:
        btnThanhToan.setText("Thanh toán CK");
        btnThanhToan.setEnabled(true);
        new ChuyenKhoan(this, true).setVisible(true);

    }//GEN-LAST:event_btnChuyenKhoanActionPerformed

    private void btnTroVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroVeActionPerformed
        // TODO add your handling code here:

        this.dispose();
        HoaDon hoaDonDialog = new HoaDon(this, true);
        hoaDonDialog.fillTableHoaDon2();
        List<DonHang> ds = dhDAO.selectAll();
        DonHang lastDonHang = ds.get(ds.size() - 1);
        int maDH = lastDonHang.getMaDH();
        CTDHDAO.deleteByMaDH(maDH);
        dhDAO.delete(maDH + "");
        hoaDonDialog.setVisible(true);


    }//GEN-LAST:event_btnTroVeActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        ThanhToan();
    }//GEN-LAST:event_btnThanhToanActionPerformed

    public TinhTien(JButton btn0, JButton btn00, JButton btn1, JButton btn100, JButton btn2, JButton btn200, JButton btn3, JButton btn300, JButton btn4, JButton btn5, JButton btn50, JButton btn500, JButton btn6, JButton btn7, JButton btn8, JButton btn9, JButton btnChuyenKhoan, JButton btnThanhToan, JButton btnTienMat, JButton btnTroVe, JButton btnXoa, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JPanel jPanel1, JPanel jPanel2, JPanel jPanel3, JPanel jPanel4, JPanel jPanel5, JPanel jPanel6, JPanel jPanel7, JLabel lblTienCanThanhToan, JLabel lblTienKhachTra, JLabel lblTienTraLai, JTextField txtSoTien) throws HeadlessException {
        this.btn0 = btn0;
        this.btn00 = btn00;
        this.btn1 = btn1;
        this.btn100 = btn100;
        this.btn2 = btn2;
        this.btn200 = btn200;
        this.btn3 = btn3;
        this.btn300 = btn300;
        this.btn4 = btn4;
        this.btn5 = btn5;
        this.btn50 = btn50;
        this.btn500 = btn500;
        this.btn6 = btn6;
        this.btn7 = btn7;
        this.btn8 = btn8;
        this.btn9 = btn9;
        this.btnChuyenKhoan = btnChuyenKhoan;
        this.btnThanhToan = btnThanhToan;
        this.btnTienMat = btnTienMat;
        this.btnTroVe = btnTroVe;
        this.btnXoa = btnXoa;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jPanel1 = jPanel1;
        this.jPanel2 = jPanel2;
        this.jPanel3 = jPanel3;
        this.jPanel4 = jPanel4;
        this.jPanel5 = jPanel5;
        this.jPanel6 = jPanel6;
        this.jPanel7 = jPanel7;
        this.lblTienCanThanhToan = lblTienCanThanhToan;
        this.lblTienKhachTra = lblTienKhachTra;
        this.lblTienTraLai = lblTienTraLai;
        this.txtSoTien = txtSoTien;
    }

    void ThanhToan() {
        int soTienKhachTra = Integer.parseInt(lblTienKhachTra.getText());
        int soTienCanThanhToan = Integer.parseInt(lblTienCanThanhToan.getText());
        if (soTienKhachTra < soTienCanThanhToan) {
            MsgBox.alert(this, "Số tiền phải lớn hơn hoặc bằng số tiền cần thanh toán!");
            return;
        } else {
            MsgBox.alert(this, "Thanh toán thành công");
            this.dispose();
            new HoaDon(this, true).setVisible(true);
        }
    }

    void init() {
        lblTienKhachTra.setText(txtSoTien.getText());
        int so1 = Integer.parseInt(lblTienCanThanhToan.getText());
        int so2 = Integer.parseInt(lblTienKhachTra.getText());
        int tong = so2 - so1;
        lblTienTraLai.setText(tong + "");
    }

    public int getSoTien() {
        return Integer.parseInt(lblTienCanThanhToan.getText());
    }

    void loadTien() {
        List<DonHang> ds = dhDAO.selectAll();
        DonHang lastDonHang = ds.get(ds.size() - 1);
        int maDH = lastDonHang.getMaDH();
        int tongTien = (int) lastDonHang.getTongTien();
        lblTienCanThanhToan.setText(tongTien + "");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TinhTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TinhTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TinhTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TinhTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TinhTien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn300;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn500;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnChuyenKhoan;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnTienMat;
    private javax.swing.JButton btnTroVe;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblTienCanThanhToan;
    private javax.swing.JLabel lblTienKhachTra;
    private javax.swing.JLabel lblTienTraLai;
    private javax.swing.JTextField txtSoTien;
    // End of variables declaration//GEN-END:variables
}
