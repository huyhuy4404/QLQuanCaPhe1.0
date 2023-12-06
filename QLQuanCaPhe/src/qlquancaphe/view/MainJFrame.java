/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlquancaphe.view;

import java.util.ArrayList;
import java.util.List;
import qlquancaphe.bean.DanhMucBean;
import qlquancaphe.controler.ChuyenManHinhController;

public class MainJFrame extends javax.swing.JFrame {
    public MainJFrame() {
        initComponents();
        setTitle("QUẢN LÍ QUÁN CÀ PHÊ");
        
        ChuyenManHinhController controller = new ChuyenManHinhController(pnView);
        controller.setView(pnTrangChu, lblTrangChu);
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChu",pnTrangChu,lblTrangChu));
        listItem.add(new DanhMucBean("QuanLiSanPham",pnQuanLiSanPham,lblQuanLiSanPham));
        listItem.add(new DanhMucBean("QuanLiLoaiSanPham",pnQuanLiLoaiSanPham,lblQuanLiLoaiSanPham));
        listItem.add(new DanhMucBean("DonHang",pnDonHang,lblDonHang));
        controller.setEvent(listItem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnRoot = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnQuanLiSanPham = new javax.swing.JPanel();
        lblQuanLiSanPham = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnQuanLiLoaiSanPham = new javax.swing.JPanel();
        lblQuanLiLoaiSanPham = new javax.swing.JLabel();
        pnDonHang = new javax.swing.JPanel();
        lblDonHang = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnTrangChu = new javax.swing.JPanel();
        lblTrangChu = new javax.swing.JLabel();
        pnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnRoot.setBackground(new java.awt.Color(153, 255, 204));

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/coffee.png"))); // NOI18N
        jLabel1.setText("PHỐ 24H");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnQuanLiSanPham.setBackground(new java.awt.Color(204, 102, 255));

        lblQuanLiSanPham.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblQuanLiSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuanLiSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/sanpham.png"))); // NOI18N
        lblQuanLiSanPham.setText("Quản lí sản phẩm");

        javax.swing.GroupLayout pnQuanLiSanPhamLayout = new javax.swing.GroupLayout(pnQuanLiSanPham);
        pnQuanLiSanPham.setLayout(pnQuanLiSanPhamLayout);
        pnQuanLiSanPhamLayout.setHorizontalGroup(
            pnQuanLiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQuanLiSanPhamLayout.createSequentialGroup()
                .addComponent(lblQuanLiSanPham)
                .addGap(0, 79, Short.MAX_VALUE))
        );
        pnQuanLiSanPhamLayout.setVerticalGroup(
            pnQuanLiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQuanLiSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuanLiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 102, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/nhanvien.png"))); // NOI18N
        jLabel6.setText("Quản lí nhân viên");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnQuanLiLoaiSanPham.setBackground(new java.awt.Color(204, 102, 255));

        lblQuanLiLoaiSanPham.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblQuanLiLoaiSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuanLiLoaiSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/loaisp.png"))); // NOI18N
        lblQuanLiLoaiSanPham.setText("Quản lí loại sản phẩm");

        javax.swing.GroupLayout pnQuanLiLoaiSanPhamLayout = new javax.swing.GroupLayout(pnQuanLiLoaiSanPham);
        pnQuanLiLoaiSanPham.setLayout(pnQuanLiLoaiSanPhamLayout);
        pnQuanLiLoaiSanPhamLayout.setHorizontalGroup(
            pnQuanLiLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQuanLiLoaiSanPhamLayout.createSequentialGroup()
                .addComponent(lblQuanLiLoaiSanPham)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        pnQuanLiLoaiSanPhamLayout.setVerticalGroup(
            pnQuanLiLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQuanLiLoaiSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuanLiLoaiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnDonHang.setBackground(new java.awt.Color(204, 102, 255));

        lblDonHang.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblDonHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/donhang.png"))); // NOI18N
        lblDonHang.setText("Đơn hàng");

        javax.swing.GroupLayout pnDonHangLayout = new javax.swing.GroupLayout(pnDonHang);
        pnDonHang.setLayout(pnDonHangLayout);
        pnDonHangLayout.setHorizontalGroup(
            pnDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDonHangLayout.createSequentialGroup()
                .addComponent(lblDonHang)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnDonHangLayout.setVerticalGroup(
            pnDonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDonHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 102, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/doanhthu.png"))); // NOI18N
        jLabel5.setText("Doanh thu");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pnTrangChu.setBackground(new java.awt.Color(204, 102, 255));

        lblTrangChu.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/homecaphe.png"))); // NOI18N
        lblTrangChu.setText("Trang chủ");

        javax.swing.GroupLayout pnTrangChuLayout = new javax.swing.GroupLayout(pnTrangChu);
        pnTrangChu.setLayout(pnTrangChuLayout);
        pnTrangChuLayout.setHorizontalGroup(
            pnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangChuLayout.createSequentialGroup()
                .addComponent(lblTrangChu)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnTrangChuLayout.setVerticalGroup(
            pnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnRootLayout = new javax.swing.GroupLayout(pnRoot);
        pnRoot.setLayout(pnRootLayout);
        pnRootLayout.setHorizontalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnQuanLiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnQuanLiLoaiSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTrangChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnRootLayout.setVerticalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRootLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnQuanLiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnQuanLiLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pnView.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout pnViewLayout = new javax.swing.GroupLayout(pnView);
        pnView.setLayout(pnViewLayout);
        pnViewLayout.setHorizontalGroup(
            pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
        );
        pnViewLayout.setVerticalGroup(
            pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblDonHang;
    private javax.swing.JLabel lblQuanLiLoaiSanPham;
    private javax.swing.JLabel lblQuanLiSanPham;
    private javax.swing.JLabel lblTrangChu;
    private javax.swing.JPanel pnDonHang;
    private javax.swing.JPanel pnQuanLiLoaiSanPham;
    private javax.swing.JPanel pnQuanLiSanPham;
    private javax.swing.JPanel pnRoot;
    private javax.swing.JPanel pnTrangChu;
    private javax.swing.JPanel pnView;
    // End of variables declaration//GEN-END:variables
}
