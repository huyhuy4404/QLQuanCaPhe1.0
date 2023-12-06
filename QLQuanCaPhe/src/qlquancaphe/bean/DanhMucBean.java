/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.bean;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author huydz
 */
public class DanhMucBean {

    private String kind;
    private JPanel pn;
    private JLabel lbl;

    public DanhMucBean() {
    }

    public DanhMucBean(String kind, JPanel pn, JLabel lbl) {
        this.kind = kind;
        this.pn = pn;
        this.lbl = lbl;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JPanel getPn() {
        return pn;
    }

    public void setPn(JPanel pn) {
        this.pn = pn;
    }

    public JLabel getLbl() {
        return lbl;
    }

    public void setLbl(JLabel lbl) {
        this.lbl = lbl;
    }

    
}
