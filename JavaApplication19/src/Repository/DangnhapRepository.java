/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.GioHang;
import Model.HoaDon;
import Model.HoaDonChiTiet;
import Model.KhachHang;
import Model.KhachHang2;
import Model.User;
import Repositorys.ImplHoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DangnhapRepository {
     public boolean checkLogin(String username, String password) {
        String query = "SELECT * FROM Users WHERE TaiKhoan = ? AND MatKhau = ?";
        try (Connection conn = DBcontext.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Returns true if a record is found
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
