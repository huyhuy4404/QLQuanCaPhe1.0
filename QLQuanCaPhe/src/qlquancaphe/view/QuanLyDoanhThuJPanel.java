/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlquancaphe.view;

import java.awt.Dialog;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Chart.ChartDoanhThu;
import Chart.ChartDoanhThu;
import qlquancaphe.DAO.DoanhThuDAO;
import qlquancaphe.DAO.DonHangDAO;
import qlquancaphe.utils.MsgBox;

/**
 *
 * @author ADMIN
 */
public class QuanLyDoanhThuJPanel extends javax.swing.JPanel {

    DonHangDAO dhDAO = new DonHangDAO();
    DoanhThuDAO tkDAO = new DoanhThuDAO();
    public QuanLyDoanhThuJPanel() {
        initComponents();
        fillToComboBoxNam();
        fillToComboBoxThang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cboThang = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        panel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quản Lý Doanh Thu");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        cboThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThangActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tháng:");

        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Năm:");

        jTabbedPane1.setBackground(new java.awt.Color(102, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 204, 0));

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên Sản Phẩm", "Số lương ", "Đơn giá", "Tổng tiền"
            }
        ));
        jScrollPane1.setViewportView(tblDoanhThu);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/Statistics.png"))); // NOI18N
        jButton1.setText("Thống Kê Doanh Thu Tháng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlquancaphe/icons/Excel-icon.png"))); // NOI18N
        jButton2.setText("Xuất File Execl");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Doanh thu", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        // TODO add your handling code here:
        fillTableDoanhThu();
    }//GEN-LAST:event_cboNamActionPerformed

    private void cboThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangActionPerformed
        // TODO add your handling code here:
        fillTableDoanhThu();
    }//GEN-LAST:event_cboThangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        openChartDoanhThu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        printExce3();
    }//GEN-LAST:event_jButton2ActionPerformed
     public void openChartDoanhThu() {
        JDialog dialog = new JDialog();
        dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        Chart.ChartDoanhThu chart = new ChartDoanhThu("Biểu Đồ Doanh Thu");
        dialog.add(chart.getContentPane()); //tndc
        dialog.pack(); //kích thước
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        // setIconImage(XImage.getAppIcon());
    }
      public void printExce3() {

        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            CellStyle number = workbook.createCellStyle();// định dạng
            DataFormat numberFormat = workbook.createDataFormat();
            number.setDataFormat(numberFormat.getFormat("#,##0.00 VND"));

            XSSFSheet sheet = workbook.createSheet("Doanh Thu"); //sheep
            XSSFRow row = null;
            Cell cell = null;
            // Tạo tiêu đề cho bảng
            row = sheet.createRow(0);

            sheet.addMergedRegion(new CellRangeAddress(0, 2, 0, 3));
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Doanh Thu Sản Phẩm");
//            cell.setCellStyle(getCenterAlignedStyle(workbook));
            row = sheet.createRow(4);
            
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Tên sản phẩm ");
               
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Số Lượng ");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Đơn Giá Giá");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Tổng Tiền");


            
            
            List<Object[]> list = tkDAO.doanhThuThang(WIDTH);
            // Điền dữ liệu vào bảng
            for (int i = 0; i < list.size(); i++) {
                Object[] rowOb = list.get(i);
                row = sheet.createRow(5 + i);
                for (int j = 0; j < rowOb.length; j++) {
                    cell = row.createCell(j, CellType.NUMERIC);
                    cell.setCellValue(rowOb[j].toString());
                }
            }

//            }
            // Lưu file Excel
            try {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Chọn vị trí và tên file");
                fileChooser.setFileFilter(new FileNameExtensionFilter("Excel Files", "xlsx")); 

                int userSelection = fileChooser.showSaveDialog(this);

                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    String filePath = fileChooser.getSelectedFile().getAbsolutePath();

                    if (!filePath.toLowerCase().endsWith(".xlsx")) {
                        filePath += ".xlsx";
                    }

                    FileOutputStream fileOut = new FileOutputStream(filePath);
                    workbook.write(fileOut);
                    fileOut.close();

                    MsgBox.alert(this, "Xuất file Excel thành công");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void fillToComboBoxNam() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNam.getModel();
        model.removeAllElements();
        List<Integer> list = dhDAO.selectYears();
        for (Integer year : list) {
            model.addElement(year);
        }
    }
    public void fillToComboBoxThang() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboThang.getModel();
        model.removeAllElements();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2,3,4,5,6,7,8,9,10,11,12));
        for (int month : list) {
            model.addElement(month);
        }
    }
    public void fillDoanhThuNam() {
        DefaultTableModel model = (DefaultTableModel) tblDoanhThu.getModel();
        model.setRowCount(0);
        int nam = (Integer) cboNam.getSelectedItem();
        List<Object[]> list = tkDAO.doanhThuNam(nam);
        for (Object[] row : list) {
            model.addRow(row);
        }
    }
    public void fillTableDoanhThu() {
    DefaultTableModel model = (DefaultTableModel) tblDoanhThu.getModel();
    model.setRowCount(0);

    // Kiểm tra xem đã chọn một mục trong cboNam và cboThang chưa
    if (cboNam.getSelectedItem() != null && cboThang.getSelectedItem() != null) {
        int nam = (Integer) cboNam.getSelectedItem();
        int thang = (Integer) cboThang.getSelectedItem();

        List<Object[]> list = tkDAO.doanhThuNamVaThang(nam, thang);
        for (Object[] row : list) {
            model.addRow(row);
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Panel panel1;
    private javax.swing.JTable tblDoanhThu;
    // End of variables declaration//GEN-END:variables

   
}
