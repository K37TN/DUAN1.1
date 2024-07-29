/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Connection.DBcontext;
import Model.Khuyenmai;
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
public class KhuyenMai2Service {
     Khuyenmai km;
    
    public void insert(Khuyenmai km){
        Connection cn = DBcontext.getConnection();
        String sql = "INSERT INTO KhuyenMai(Ten, Ngaybatdau, Ngayketthuc, HinhthucKM, Giatrigiam, Trangthai)"
                + "VALUES (?,?,?,?,?,?)";
        try{
             PreparedStatement ps = cn.prepareStatement(sql);
         
            ps.setString(1,km.getTenKM());
            ps.setString(2, km.getNgayBatDau());
            ps.setString(3, km.getNgayKetThuc());
            ps.setString(4,km.getHinhThucKM());
            ps.setDouble(5, km.getGiaTriGiam());
            ps.setInt(6, km.getTrangthai());
            
            ps.executeUpdate();
            
        }catch (Exception e){
            
        }
        
    }
    
    public void update(Khuyenmai km){
         Connection cn = DBcontext.getConnection();
        String sql = "UPDATE KhuyenMai SET Ten =?, Ngaybatdau =?, Ngayketthuc =?, HinhthucKM =?, Giatrigiam =?, Trangthai =? "
                + "WHERE (Id = ?)";
        try{
   PreparedStatement ps = cn.prepareStatement(sql);
             
            ps.setString(1,km.getTenKM());
            ps.setString(2, km.getNgayBatDau());
            ps.setString(3, km.getNgayKetThuc());
            ps.setString(4,km.getHinhThucKM());
            ps.setDouble(5, km.getGiaTriGiam());
            ps.setInt(6, km.getTrangthai());
            ps.setInt(7, km.getID());
            
            ps.executeUpdate();
            
        }catch (Exception e){
            
        }
    }
     public List<Khuyenmai> selectAll(){
          Connection cn = DBcontext.getConnection();
        String sql = "select Id, Ten, Ngaybatdau, Ngayketthuc, HinhthucKM, Giatrigiam, Trangthai from KhuyenMai";
        List<Khuyenmai> lists = new ArrayList<>();
        try {
               PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lists.add(new Khuyenmai(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6),
                        rs.getInt(7)
                
                ));
            }
            return lists;
        } catch (SQLException ex) {
        }
        return null;
    }
     public List<Khuyenmai> selectById(String id){
              Connection cn = DBcontext.getConnection();
        String sql = "select * from KhuyenMai  WHERE (Id = ?)";
        List<Khuyenmai> lists = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
              ResultSet rs = ps.executeQuery();
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                lists.add(new Khuyenmai(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6),
                        rs.getInt(7)
                ));
            }
            return lists;
        } catch (SQLException ex) {
             ex.printStackTrace();
        }
        return null;
        
    }
    
}
