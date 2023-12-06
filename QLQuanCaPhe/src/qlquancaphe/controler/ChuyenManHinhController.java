package qlquancaphe.controler;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import qlquancaphe.bean.DanhMucBean;
import qlquancaphe.view.DonHang;
import qlquancaphe.view.QuanLyDoanhThuJPanel;
import qlquancaphe.view.QuanLyLoaiSanPhamJPanel;
import qlquancaphe.view.QuanLyNhanVienJPanel;
import qlquancaphe.view.QuanLySanPhamJPanel;
import qlquancaphe.view.TrangChuJPanel;

public class ChuyenManHinhController {

    private JPanel root;
    private String kindSelected = "";
    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhController(JPanel pnRoot) {
        this.root = pnRoot;
    }

    public void setView(JPanel pnItem, JLabel lblItem) {
        kindSelected = "TrangChu";
        pnItem.setBackground(new Color(96, 100, 191));
        lblItem.setBackground(new Color(96, 100, 191));
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChuJPanel());
        root.validate();
        root.repaint();
    }

    public void setEvent(List<DanhMucBean> listItem) {
        for (DanhMucBean item : listItem) {
            this.listItem = listItem;
            LabelEvent labelEvent = new LabelEvent(item.getKind(), item.getPn(), item.getLbl());
            item.getLbl().addMouseListener(labelEvent);

        }
    }

    class LabelEvent implements MouseListener {

        private JPanel node;

        private String kind;
        private JPanel pnItem;
        private JLabel lblItem;

        public LabelEvent(String kind, JPanel pnItem, JLabel lblItem) {
            this.kind = kind;
            this.pnItem = pnItem;
            this.lblItem = lblItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new TrangChuJPanel();
                    break;
                case "QuanLyNhanVien":
                    node = new QuanLyNhanVienJPanel();
                    break;    
                case "QuanLySanPham":
                    node = new QuanLySanPhamJPanel();
                    break;
                case "QuanLyLoaiSanPham":
                    node = new QuanLyLoaiSanPhamJPanel();
                    break;
                case "DonHang":
                    node = new DonHang();
                    break;
                case "QuanLyDoanhThu":
                    node = new QuanLyDoanhThuJPanel();
                    break;
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackgroud(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            pnItem.setBackground(new Color(96, 100, 191));
            lblItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            pnItem.setBackground(new Color(96, 100, 191));
            lblItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (kindSelected.equalsIgnoreCase(kind)) {
                pnItem.setBackground(new Color(204, 102, 255));
                lblItem.setBackground(new Color(204, 102, 255));
            }
        }

    }

    private void setChangeBackgroud(String kind) {
        for (DanhMucBean item : listItem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getPn().setBackground(new Color(96, 100, 191));
                item.getLbl().setBackground(new Color(96, 100, 191));
            } else {
                item.getPn().setBackground(new Color(204, 102, 255));
                item.getLbl().setBackground(new Color(204, 102, 255));
            }
        }
    }
}
