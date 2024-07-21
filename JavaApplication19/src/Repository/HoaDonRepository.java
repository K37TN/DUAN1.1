/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.HoaDon;
import Model.User;
import Repositorys.ImplHoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public class HoaDonRepository implements ImplHoaDon{

    @Override
    public List<HoaDon> getListHD(int TrangThai) {
          List<HoaDon> getListGD = new ArrayList<>();
        try {
//            String sql = "SELECT HD.Ma , HD.NgayTao , NV.Ten , HD.TinhTrang , NV.TenDem ,"
//                    + " NV.Ho FROM HoaDon HD JOIN Users NV ON HD.IdNV = NV.Id WHERE HD.TinhTrang = ?";
String sql = "SELECT HD.Ma, HD.NgayTao, HD.TinhTrang \n" +
"FROM HoaDon HD \n" +
"WHERE HD.TinhTrang = ?";
            
            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, TrangThai);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();

                hd.setMa(rs.getString(1));
                hd.setNgayTao(rs.getDate(2));
//                User uesr = new User();
//                uesr.setTen(rs.getString(6) + " " + rs.getString(5) + " " + rs.getString(3));
//                hd.setUser(uesr);
                hd.setTinhTrang(rs.getInt(3));
                getListGD.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return getListGD;
    }

    @Override
    public Integer insertHoaDon(HoaDon hd) {
         int result = 0;
        try {
            String sql = "insert into HoaDon (Ma , NgayTao , NgayThanhToan , TinhTrang) values( ? ,? ,? ,?)";
            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, hd.getMa());
    
            pr.setDate(2, hd.getNgayTao());
            pr.setDate(3, hd.getNgayThanhToan());
            pr.setInt(4, hd.getTinhTrang());
            result = pr.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return result;
    }
    
}
