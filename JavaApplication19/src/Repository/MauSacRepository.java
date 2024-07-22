/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.KichThuoc;
import Model.MauSac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author FPTSHOP
 */
public class MauSacRepository {
   public Integer add(MauSac v) {
 Integer row = null;
        
        Connection cn = DBcontext.getConnection();
        String sql = "INSERT INTO MauSac(Ten) VALUES(?)";
        try {
            PreparedStatement pre = cn.prepareStatement(sql);
       
          pre.setString(1, v.getTen());
   
            row = pre.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }
     public Integer delete(Integer id) {
         Integer row = null;
        String sql = "DELETE FROM MauSac WHERE Id LIKE ?";
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
     public Integer update(MauSac kichThuoc) {
    Integer rowsAffected = null;
    String sql = "UPDATE MauSac SET  Ten=? WHERE Id=?";
    
    try (Connection conn = DBcontext.getConnection();
         PreparedStatement pstm = conn.prepareStatement(sql)) {

         pstm.setString(1, kichThuoc.getTen()); // MaVoucher
      
            pstm.setInt(2, kichThuoc.getID()); // Id
        
        // Thực thi câu lệnh SQL và lấy số dòng bị ảnh hưởng
        rowsAffected = pstm.executeUpdate();
   

    } catch (SQLException e) {
        e.printStackTrace();
        // Xử lý ngoại lệ nếu có lỗi
    }

    return rowsAffected;
}  
}
