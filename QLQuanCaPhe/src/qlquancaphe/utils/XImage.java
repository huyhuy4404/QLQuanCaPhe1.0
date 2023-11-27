/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlquancaphe.utils;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author huydz
 */
public class XImage {

    public static Image getAppIcon() {
        URL url = XImage.class.getResource("qlquancaphe/icons");
        if (url != null) {
            // Tạo ImageIcon chỉ khi URL không phải là null
            ImageIcon icon = new ImageIcon(url);
            // Tiếp tục xử lý khác (nếu cần)
            return icon.getImage();
        } else {
            // Xử lý trường hợp khi URL là null
            // Ví dụ: trả về một hình ảnh mặc định hoặc thông báo lỗi
            return getDefaultImage();
        }
    }
    private static Image getDefaultImage() {
        // Xử lý trả về hình ảnh mặc định hoặc thông báo lỗi
        // Ví dụ: return new ImageIcon(XImage.class.getResource("path_to_default_image")).getImage();
        return null;
    }

    public static void save(File src) {
        File dst = new File("src\\qlquancaphe\\icons\\logos", src.getName());
        if (!dst.exists()) {
            dst.mkdirs();
            // tạo thư mục logo nếu chưa tồn tại
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
            // Copy file vào thư mục logo
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ImageIcon read(String fileName) {
        File path = new File("src\\qlquancaphe\\icons\\logos", fileName);
        return new ImageIcon(new ImageIcon(path.getAbsolutePath()).getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT));
    }
}
