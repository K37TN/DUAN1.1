/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.Voucher;
import Model.sanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 *
 * @author Administrator
 */
public class VoucherRepository {

 public List<Voucher> getAll() {
 String sql = "SELECT * FROM Voucher";
          try ( Connection con = DBcontext.getConnection();  PreparedStatement ps = con.prepareStatement(sql);) {
         ResultSet rs = ps.executeQuery();
            List<Voucher> listSP = new ArrayList<>();
            while (rs.next()) {
                Voucher p = new Voucher();
          p.setId(rs.getInt("Id")); // Chỉnh sửa chỉ số cột
        p.setMavc(rs.getString("MaVoucher")); // Chỉnh sửa chỉ số cột
        p.setSoLuongGiam(rs.getInt("soLuongGiam"));
        p.setDkGiam(rs.getInt("dieuKienGiam")); // Chỉnh sửa chỉ số cột
        p.setTrangThai(rs.getInt("trangThai")); // Chỉnh sửa chỉ số cột
p.setNgaybd(rs.getDate("ngayBatDau"));
p.setNgaykt(rs.getDate("ngayKetThuc"));
                listSP.add(p);
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;        
    }

}
