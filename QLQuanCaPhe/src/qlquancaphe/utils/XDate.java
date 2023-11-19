/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author huydz
 */
public class XDate {

    static SimpleDateFormat formater = new SimpleDateFormat();

//    chuyển đổi String sang Date
//    @param date là String cần chuyển
//    @param pattern là định dạng thời gian
//    @return Date kết quả
    public static Date toDate(String date, String pattern) {
        try {
            formater.applyPattern(pattern);
            return formater.parse(date);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
//    chuyển đổi Date sang String
//    @param date là Date cần chuyển
//    @param pattern là định dạng thời gian
//    @return String kết quả

    public static String toString(Date date, String pattern) {
        formater.applyPattern(pattern);
        return formater.format(date);
    }

    public static Date now() {
        return new Date();
    }
//    bổ sung số ngày vào thời gian
//    @param date thời gian hiện có
//    @param days số ngày cần bổ sung
//    @return date kết quả

    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }
}
