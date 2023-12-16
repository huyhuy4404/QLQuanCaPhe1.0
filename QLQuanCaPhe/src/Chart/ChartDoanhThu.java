/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chart;

import java.awt.Color;
import java.util.List;
import java.util.Objects;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.CategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import qlquancaphe.DAO.DoanhThuDAO;

/**
 *
 * @author ADMIN
 */
public class ChartDoanhThu extends JFrame {

    private final DoanhThuDAO thongKeDao;

    public ChartDoanhThu(String title, int nam, int thang) {
        super(title);
        thongKeDao = new DoanhThuDAO();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        List<Object[]> SanPhamBC = thongKeDao.doanhThuNamVaThang(nam, thang);
        for (Object[] row : SanPhamBC) {
            String TenNuoc = Objects.toString(row[0], ""); // lấy cái Tên
            dataset.addValue((int) row[1], "Sản Phẩm Bán Chạy", TenNuoc);
        }

        JFreeChart chart = ChartFactory.createBarChart3D(
                "Biểu đồ cột thống kê số lượng Sản Phẩm Bán Chạy", // Tiêu đề biểu đồ
                "Thống kê", // Tên trục x
                "Giá trị", // Tên trục y
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false
        );
        BarRenderer renderer = (BarRenderer) chart.getCategoryPlot().getRenderer();
        renderer.setMaximumBarWidth(0.05);
        renderer.setMinimumBarLength(0.1);
        renderer.setSeriesPaint(0, Color.PINK);
//Hiển thị giá trị bên trên cột
        CategoryItemLabelGenerator generator = new StandardCategoryItemLabelGenerator();
        renderer.setBaseItemLabelGenerator(generator);
        renderer.setBaseItemLabelsVisible(true);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1000, 1000));
        setContentPane(chartPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        });
    }
}
