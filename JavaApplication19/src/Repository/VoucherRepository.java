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
 public Integer delete(Integer id) {
         Integer row = null;
        String sql = "DELETE FROM Voucher WHERE Id LIKE ?";
        Connection con = DBcontext.getConnection();

        try {
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setInt(1, id);
            row = pr.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }
 public Integer add(Voucher v) {
 Integer row = null;
        
        Connection cn = DBcontext.getConnection();
        String sql = "INSERT INTO Voucher(MaVoucher, soLuongGiam, dieuKienGiam,trangThai,ngayBatDau,ngayKetThuc) VALUES(?, ?, ?, ?, ?,?)";
        try {
            PreparedStatement pre = cn.prepareStatement(sql);
       
          pre.setString(1, v.getMavc());
       pre.setInt(2, v.getSoLuongGiam());
        pre.setInt(3, v.getDkGiam());
        pre.setInt(4, v.getTrangThai());
   pre.setObject(5,v.getNgaybd());
   pre.setObject(6, v.getNgaykt());
            row = pre.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }
public Integer update(Voucher voucher) {
    Integer rowsAffected = null;
    String sql = "UPDATE Voucher SET MaVoucher=?, SoLuongGiam=?, DieuKienGiam=?, TrangThai=?, NgayBatDau=?, NgayKetThuc=? WHERE Id=?";
    
    try (Connection conn = DBcontext.getConnection();
         PreparedStatement pstm = conn.prepareStatement(sql)) {

         pstm.setString(1, voucher.getMavc()); // MaVoucher
            pstm.setInt(2, voucher.getSoLuongGiam()); // SoLuongGiam
            pstm.setInt(3, voucher.getDkGiam()); // DieuKienGiam
            pstm.setInt(4, voucher.getTrangThai()); // TrangThai
            pstm.setDate(5, new java.sql.Date(voucher.getNgaybd().getTime())); // NgayBatDau
            pstm.setDate(6, new java.sql.Date(voucher.getNgaykt().getTime())); // NgayKetThuc
            pstm.setInt(7, voucher.getId()); // Id
        
        // Thực thi câu lệnh SQL và lấy số dòng bị ảnh hưởng
        rowsAffected = pstm.executeUpdate();
   

    } catch (SQLException e) {
        e.printStackTrace();
        // Xử lý ngoại lệ nếu có lỗi
    }

    return rowsAffected;
}
}
