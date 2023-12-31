/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlquancaphe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import qlquancaphe.utils.Auth;
import qlquancaphe.utils.MsgBox;

/**
 *
 * @author huydz
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        btnSanPham = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnLoaiSanPham = new javax.swing.JButton();
        btnDonHang = new javax.swing.JButton();
        btnDoanhThu = new javax.swing.JButton();
        lblTenNV = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlMenu2 = new javax.swing.JPanel();
        btnDoiMatKhau = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENU");

        pnlMenu.setBackground(new java.awt.Color(255, 204, 102));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSanPham.setText("Quản Lý Sản Phẩm");
        btnSanPham.setPreferredSize(new java.awt.Dimension(145, 35));
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });
        pnlMenu.add(btnSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, 50));

        btnNhanVien.setText("Quản Lý Nhân Viên");
        btnNhanVien.setPreferredSize(new java.awt.Dimension(145, 35));
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        pnlMenu.add(btnNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, 50));

        btnLoaiSanPham.setText("Quản Lý Loại Sản Phẩm");
        btnLoaiSanPham.setPreferredSize(new java.awt.Dimension(145, 35));
        btnLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoaiSanPhamActionPerformed(evt);
            }
        });
        pnlMenu.add(btnLoaiSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, 50));

        btnDonHang.setText("Đơn Hàng");
        btnDonHang.setMaximumSize(new java.awt.Dimension(100, 200));
        btnDonHang.setPreferredSize(new java.awt.Dimension(145, 35));
        btnDonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonHangActionPerformed(evt);
            }
        });
        pnlMenu.add(btnDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 50));

        btnDoanhThu.setText("Quản Lý Doanh Thu");
        btnDoanhThu.setPreferredSize(new java.awt.Dimension(145, 35));
        btnDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanhThuActionPerformed(evt);
            }
        });
        pnlMenu.add(btnDoanhThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 160, 50));

        lblTenNV.setText("Nguyễn Nhật Phát");
        pnlMenu.add(lblTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 110, -1));

        lblTime.setText("Time");
        pnlMenu.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 73, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("PHỐ 24H");
        pnlMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnDoiMatKhau.setBackground(new java.awt.Color(0, 204, 255));
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(255, 102, 102));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setPreferredSize(new java.awt.Dimension(101, 23));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenu2Layout = new javax.swing.GroupLayout(pnlMenu2);
        pnlMenu2.setLayout(pnlMenu2Layout);
        pnlMenu2Layout.setHorizontalGroup(
            pnlMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDoiMatKhau)
                .addGap(9, 9, 9)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlMenu2Layout.setVerticalGroup(
            pnlMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenu2Layout.createSequentialGroup()
                .addGroup(pnlMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/caphe1.jpg"))); // NOI18N
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                    .addComponent(pnlMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonHangActionPerformed
        this.openHoaDon();
    }//GEN-LAST:event_btnDonHangActionPerformed

    private void btnDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanhThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDoanhThuActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        this.openNhanVien();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        // TODO add your handling code here:
        this.openDoiMatKhau();
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất ?",
                "THÔNG BÁO !", JOptionPane.YES_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (i == 0) {
            this.dispose();
            dangxuat();
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoaiSanPhamActionPerformed
        // TODO add your handling code here:
        this.openLSP();
    }//GEN-LAST:event_btnLoaiSanPhamActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        // TODO add your handling code here:
        this.openQLSanPham();
    }//GEN-LAST:event_btnSanPhamActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoanhThu;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnDonHang;
    private javax.swing.JButton btnLoaiSanPham;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMenu2;
    // End of variables declaration//GEN-END:variables

    private void openHoaDon() {
        new HoaDon(this, true).setVisible(true);
    }
  void openNhanVien() {
        if (Auth.isLogin()) {
            new QLNhanVien(this, true).setVisible(true);
        } else {
            MsgBox.alert(this, "Vui lòng đăng nhập");
        }
    }

    private void init() {
        String user = Auth.user.getHoTen();
        lblTenNV.setText(user);
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
                String text = formater.format(now);
                lblTime.setText(text);
            }
        }).start();
        if (!Auth.isManager()) {
            btnNhanVien.setEnabled(false);
            btnDoanhThu.setEnabled(false);
            btnSanPham.setEnabled(false);
            btnLoaiSanPham.setEnabled(false);
        } else {
            btnNhanVien.setEnabled(true);
            btnDoanhThu.setEnabled(true);
            btnSanPham.setEnabled(true);
            btnLoaiSanPham.setEnabled(true);
        }
    }

    void dangxuat() {
        Auth.clear();
        Login login_Dialog = new Login(this, rootPaneCheckingEnabled);
        login_Dialog.show();
        this.dispose();
    }

    private void openDoiMatKhau() {
        new DoiMatKhau(this, true).setVisible(true);
    }

    private void openLSP() {
        new LoaiSanPham(this, true).setVisible(true);
    }

    private void openQLSanPham() {
        new SanPhamJDialog(this, true).setVisible(true);
    }
}
