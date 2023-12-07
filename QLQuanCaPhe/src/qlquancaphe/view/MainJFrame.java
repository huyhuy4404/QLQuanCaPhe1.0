/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlquancaphe.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;
import qlquancaphe.bean.DanhMucBean;
import qlquancaphe.controler.ChuyenManHinhController;
import qlquancaphe.utils.Auth;

public class MainJFrame extends javax.swing.JFrame {
    public JPanel getView(){
        return pnView;
    }
    public MainJFrame() {
        initComponents();
        init();
        setTitle("QUẢN LÝ QUÁN CÀ PHÊ");
        
        ChuyenManHinhController controller = new ChuyenManHinhController(pnView);
        controller.setView(pnTrangChu, lblTrangChu);
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChu",pnTrangChu,lblTrangChu));
        listItem.add(new DanhMucBean("QuanLySanPham",pnQuanLySanPham,lblQuanLiSanPham));
        listItem.add(new DanhMucBean("QuanLyNhanVien",pnQuanlynhanvien,lblquanlynhanvien));
        listItem.add(new DanhMucBean("QuanLyLoaiSanPham",pnQuanLyLoaiSanPham,lblQuanLiLoaiSanPham));
        listItem.add(new DanhMucBean("DonHang",pnDonHang,lblDonHang));
        listItem.add(new DanhMucBean("QuanLyDoanhThu",pnquanlydoanhthu,lblquanlydoanhthu));
        controller.setEvent(listItem);
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
            pnQuanLyLoaiSanPham.setEnabled(false);
            pnQuanLySanPham.setEnabled(false);
            pnquanlydoanhthu.setEnabled(false);
            pnQuanlynhanvien.setEnabled(false);
            pnQuanLyLoaiSanPham.setBackground(Color.GRAY);
            pnQuanLySanPham.setBackground(Color.GRAY);
            pnquanlydoanhthu.setBackground(Color.GRAY);
            pnQuanlynhanvien.setBackground(Color.GRAY);
        } else {
            pnQuanLyLoaiSanPham.setEnabled(true);
            pnQuanLySanPham.setEnabled(true);
            pnquanlydoanhthu.setEnabled(true);
            pnQuanlynhanvien.setEnabled(true);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnRoot = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnQuanLySanPham = new javax.swing.JPanel();
        lblQuanLiSanPham = new javax.swing.JLabel();
        pnQuanlynhanvien = new javax.swing.JPanel();
        lblquanlynhanvien = new javax.swing.JLabel();
        pnQuanLyLoaiSanPham = new javax.swing.JPanel();
        lblQuanLiLoaiSanPham = new javax.swing.JLabel();
        pnDonHang = new javax.swing.JPanel();
        lblDonHang = new javax.swing.JLabel();
        pnquanlydoanhthu = new javax.swing.JPanel();
        lblquanlydoanhthu = new javax.swing.JLabel();
        pnTrangChu = new javax.swing.JPanel();
        lblTrangChu = new javax.swing.JLabel();
        pnView = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnRoot.setBackground(new java.awt.Color(153, 255, 204));

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/coffee.png"))); // NOI18N
        jLabel1.setText("PHỐ 24H");

        lblTenNV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTenNV.setForeground(new java.awt.Color(255, 255, 255));
        lblTenNV.setText("Tên nhân viên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hệ thống quản lý quán cà phê");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(lblTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenNV)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnQuanLySanPham.setBackground(new java.awt.Color(204, 102, 255));

        lblQuanLiSanPham.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblQuanLiSanPham.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQuanLiSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/sanpham.png"))); // NOI18N
        lblQuanLiSanPham.setText("Quản lý sản phẩm");

        javax.swing.GroupLayout pnQuanLySanPhamLayout = new javax.swing.GroupLayout(pnQuanLySanPham);
        pnQuanLySanPham.setLayout(pnQuanLySanPhamLayout);
        pnQuanLySanPhamLayout.setHorizontalGroup(
            pnQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQuanLiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnQuanLySanPhamLayout.setVerticalGroup(
            pnQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnQuanLySanPhamLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(lblQuanLiSanPham)
                .addContainerGap())
        );

        pnQuanlynhanvien.setBackground(new java.awt.Color(204, 102, 255));

        lblquanlynhanvien.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblquanlynhanvien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblquanlynhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/nhanvien.png"))); // NOI18N
        lblquanlynhanvien.setText("Quản lý nhân viên");

        javax.swing.GroupLayout pnQuanlynhanvienLayout = new javax.swing.GroupLayout(pnQuanlynhanvien);
        pnQuanlynhanvien.setLayout(pnQuanlynhanvienLayout);
        pnQuanlynhanvienLayout.setHorizontalGroup(
            pnQuanlynhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblquanlynhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnQuanlynhanvienLayout.setVerticalGroup(
            pnQuanlynhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnQuanlynhanvienLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(lblquanlynhanvien)
                .addContainerGap())
        );

        pnQuanLyLoaiSanPham.setBackground(new java.awt.Color(204, 102, 255));

        lblQuanLiLoaiSanPham.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblQuanLiLoaiSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuanLiLoaiSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/loaisp.png"))); // NOI18N
        lblQuanLiLoaiSanPham.setText("Quản lý loại sản phẩm");

        javax.swing.GroupLayout pnQuanLyLoaiSanPhamLayout = new javax.swing.GroupLayout(pnQuanLyLoaiSanPham);
        pnQuanLyLoaiSanPham.setLayout(pnQuanLyLoaiSanPhamLayout);
        pnQuanLyLoaiSanPhamLayout.setHorizontalGroup(
            pnQuanLyLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQuanLiLoaiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnQuanLyLoaiSanPhamLayout.setVerticalGroup(
            pnQuanLyLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQuanLyLoaiSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuanLiLoaiSanPham)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnDonHang.setBackground(new java.awt.Color(204, 102, 255));

        lblDonHang.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblDonHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/donhang.png"))); // NOI18N
        lblDonHang.setText("Đơn hàng");

        javax.swing.GroupLayout pnDonHangLayout = new javax.swing.GroupLayout(pnDonHang);
        pnDonHang.setLayout(pnDonHangLayout);
        pnDonHangLayout.setHorizontalGroup(
            pnDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDonHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnDonHangLayout.setVerticalGroup(
            pnDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDonHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDonHang)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnquanlydoanhthu.setBackground(new java.awt.Color(204, 102, 255));

        lblquanlydoanhthu.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblquanlydoanhthu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblquanlydoanhthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/doanhthu.png"))); // NOI18N
        lblquanlydoanhthu.setText("Doanh thu");

        javax.swing.GroupLayout pnquanlydoanhthuLayout = new javax.swing.GroupLayout(pnquanlydoanhthu);
        pnquanlydoanhthu.setLayout(pnquanlydoanhthuLayout);
        pnquanlydoanhthuLayout.setHorizontalGroup(
            pnquanlydoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblquanlydoanhthu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnquanlydoanhthuLayout.setVerticalGroup(
            pnquanlydoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnquanlydoanhthuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblquanlydoanhthu)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnTrangChu.setBackground(new java.awt.Color(204, 102, 255));

        lblTrangChu.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/homecaphe.png"))); // NOI18N
        lblTrangChu.setText("Trang chủ");
        lblTrangChu.setToolTipText("");

        javax.swing.GroupLayout pnTrangChuLayout = new javax.swing.GroupLayout(pnTrangChu);
        pnTrangChu.setLayout(pnTrangChuLayout);
        pnTrangChuLayout.setHorizontalGroup(
            pnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnTrangChuLayout.setVerticalGroup(
            pnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTrangChu)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnView.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout pnViewLayout = new javax.swing.GroupLayout(pnView);
        pnView.setLayout(pnViewLayout);
        pnViewLayout.setHorizontalGroup(
            pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 954, Short.MAX_VALUE)
        );
        pnViewLayout.setVerticalGroup(
            pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTime.setText("Time");

        javax.swing.GroupLayout pnRootLayout = new javax.swing.GroupLayout(pnRoot);
        pnRoot.setLayout(pnRootLayout);
        pnRootLayout.setHorizontalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnRootLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnQuanLyLoaiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnQuanlynhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnQuanLySanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnquanlydoanhthu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(pnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnRootLayout.setVerticalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRootLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRootLayout.createSequentialGroup()
                        .addComponent(pnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnRootLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(pnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(pnQuanLySanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(pnQuanlynhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(pnQuanLyLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(pnDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(pnquanlydoanhthu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblTime)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRoot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblDonHang;
    private javax.swing.JLabel lblQuanLiLoaiSanPham;
    private javax.swing.JLabel lblQuanLiSanPham;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTrangChu;
    private javax.swing.JLabel lblquanlydoanhthu;
    private javax.swing.JLabel lblquanlynhanvien;
    private javax.swing.JPanel pnDonHang;
    private javax.swing.JPanel pnQuanLyLoaiSanPham;
    private javax.swing.JPanel pnQuanLySanPham;
    private javax.swing.JPanel pnQuanlynhanvien;
    private javax.swing.JPanel pnRoot;
    private javax.swing.JPanel pnTrangChu;
    private javax.swing.JPanel pnView;
    private javax.swing.JPanel pnquanlydoanhthu;
    // End of variables declaration//GEN-END:variables
}
