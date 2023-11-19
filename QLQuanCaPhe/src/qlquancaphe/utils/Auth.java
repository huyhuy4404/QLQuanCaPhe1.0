/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.utils;

import qlquancaphe.entity.NhanVien;

/**
 *
 * @author huydz
 */
public class Auth {

    //    đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
    public static NhanVien user = null;
//    xóa thông tin người sử dụng  khi có yêu cầu đăng xuất

    public static void clear() {
        Auth.user = null;
    }
//    kiểm tra xem đăng nhập hay chưa
//    @return  đăng nhập  hay chưa

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isManager() {
        return Auth.isLogin() && user.isVaiTro();
    }
}
