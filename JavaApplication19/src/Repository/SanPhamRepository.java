/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.sanPham;
import Repositorys.ImplSanPham;
import entity.DanhSachKHViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public class SanPhamRepository implements ImplSanPham{

    @Override
    public List<sanPham> getAll() {
 String sql = "SELECT \n" +
"    ctsp.Ma,\n" +
"    ctsp.Ten,\n" +
"    ctsp.GiaBan,\n" +
"    ctsp.MoTa,\n" +
"    ctsp.SoLuongTon,\n" +
"    cl.Ten AS TenChatLieu,\n" +
"    kc.Ten AS TenKichCo,\n" +
"    ms.Ten AS TenMauSac,\n" +
"    th.Ten AS TenThuongHieu\n" +
"FROM \n" +
"    ChiTietSP ctsp\n" +
"INNER JOIN \n" +
"    ChatLieu cl ON ctsp.IdCL = cl.Id\n" +
"INNER JOIN \n" +
"    KichCo kc ON ctsp.IdKC = kc.Id\n" +
"INNER JOIN \n" +
"    MauSac ms ON ctsp.IdMauSac = ms.Id\n" +
"INNER JOIN \n" +
"    ThuongHieu th ON ctsp.IdTH = th.Id;";
          try ( Connection con = DBcontext.getConnection();  PreparedStatement ps = con.prepareStatement(sql);) {
         ResultSet rs = ps.executeQuery();
            List<sanPham> listSP = new ArrayList<>();
            while (rs.next()) {
                sanPham p = new sanPham();
                p.setMa(rs.getString(1));
                p.setTen(rs.getString(2));
                p.setMoTa(rs.getString(4));
                p.setGiaBan(rs.getDouble(3));
                p.setSoLuongTon(rs.getInt(5));
                p.setChatLieu(rs.getString(6));
                p.setKichCo(rs.getString(7));
               p.setThuongHieu(rs.getString(9));
            p.setMauSac(rs.getString(8));

                listSP.add(p);
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;        
    }
    
}
