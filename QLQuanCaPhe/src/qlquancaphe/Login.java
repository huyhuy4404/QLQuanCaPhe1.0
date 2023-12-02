/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package qlquancaphe;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.TextField;
import javax.swing.JButton;
import org.mindrot.jbcrypt.BCrypt;
import qlquancaphe.DAO.NhanVienDAO;
import qlquancaphe.entity.NhanVien;
import qlquancaphe.utils.Auth;
import qlquancaphe.utils.MsgBox;

/**
 *
 * @author huydz
 */
public class Login extends javax.swing.JDialog {

    NhanVienDAO dao = new NhanVienDAO();

    /**
     * Creates new form Login
     */
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }
//    public void setColor(JButton p) {
//        p.setBackground(new Color(255, 255, 255));
//        p.setForeground(new Color(0, 0, 0));
//    }
//
//    public void resetColor(JButton p) {
//        p.setBackground(new Color(255, 0, 0));
//       p.setForeground(new Color(255, 255, 255));
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        txtTaiKhoan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        txtQuenMK = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/ly-cafe-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 410));

        panel2.setBackground(new java.awt.Color(204, 204, 204));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTaiKhoanMouseEntered(evt);
            }
        });
        txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanActionPerformed(evt);
            }
        });
        panel2.add(txtTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 97, 250, 38));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tài khoản");
        panel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, 140, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Đăng Nhập");
        panel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 19, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Mật khẩu");
        panel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 161, 110, -1));

        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });
        panel2.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 189, 250, 38));

        txtQuenMK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtQuenMK.setForeground(new java.awt.Color(51, 153, 255));
        txtQuenMK.setText("Quên mật khẩu ?");
        txtQuenMK.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtQuenMKMouseMoved(evt);
            }
        });
        txtQuenMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtQuenMKMousePressed(evt);
            }
        });
        panel2.add(txtQuenMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 245, -1, -1));

        btnLogin.setBackground(new java.awt.Color(102, 255, 102));
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        panel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 190, 40));

        btnExit.setBackground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        panel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 190, 40));

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, -3, 290, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if (kiemTra()) {
            dangNhap();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        ketThuc();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtQuenMKMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuenMKMouseMoved
        txtQuenMK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_txtQuenMKMouseMoved

    private void txtQuenMKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuenMKMousePressed
        QuenMatKhau qmk = new QuenMatKhau();
        qmk.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_txtQuenMKMousePressed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
      //  resetColor(btnLogin);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
//        setColor(btnLogin);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
      //  resetColor(btnExit);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
//        setColor(btnExit);
    }//GEN-LAST:event_btnExitMouseExited

    private void txtTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanActionPerformed

    private void txtTaiKhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTaiKhoanMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanMouseEntered

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed

    }//GEN-LAST:event_txtMatKhauActionPerformed
    void dangNhap() {
        String maNV = txtTaiKhoan.getText();
        String pass = new String(txtMatKhau.getPassword());
        NhanVien nv = dao.selectById(maNV);

        if (nv == null) {
            MsgBox.alert(this, "Sai tên đăng nhập");
        } else {
            if (pass.equalsIgnoreCase(nv.getMatKhau())) {
                Auth.user = nv;
                this.dispose();
                Menu mn = new Menu();
                mn.setVisible(true);
            }
            if (!pass.equalsIgnoreCase(nv.getMatKhau())) {
                try {
                    dangNhapMaHoa();
                } catch (Exception e) {
                    MsgBox.alert(this, "Sai mật khẩu");
                }
            }

        }
    }

    void dangNhapMaHoa() {
        String maNV = txtTaiKhoan.getText();
        String pass = new String(txtMatKhau.getPassword());
        NhanVien nv = dao.selectById(maNV);
        String passMaHoa = nv.getMatKhau();
        boolean passwordMatch = BCrypt.checkpw(pass, passMaHoa);
        if (passwordMatch) {
            Auth.user = nv;
            this.dispose();
            Menu mn = new Menu();
            mn.setVisible(true);
        } else {
            MsgBox.alert(this, "Sai mật khẩu");
        }
    }

    public boolean kiemTra() {
        if (txtTaiKhoan.getText().equals("")) {
            MsgBox.alert(this, "Tên đăng nhập không được bỏ trống");
            return false;
        }
        if (txtMatKhau.getText().equals("")) {
            MsgBox.alert(this, "Mật khẩu không được bỏ trống");
            return false;
        }
        return true;
    }

    void ketThuc() {
        if (MsgBox.confirm(this, "Bạn có muốn kết thúc không ?")) {
            System.exit(0);
        }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = new Login(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Panel panel2;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JLabel txtQuenMK;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
