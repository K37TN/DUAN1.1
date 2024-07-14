/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.Khuyenmai;
import Repositorys.ImplKhuyenmaiRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FPTSHOP
 */
public class KhuyenmaiRepository implements ImplKhuyenmaiRepository{
List<Khuyenmai> lstKm;

    public KhuyenmaiRepository() {
        lstKm = new ArrayList<>();
    }

    @Override
    public List<Khuyenmai> getAll() {
         try {
            lstKm.removeAll(lstKm);
            String sql = "Select * from khuyenmai";
            Connection conn = DBcontext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lstKm.add(new Khuyenmai(rs.getString(1), rs.getString(2), rs.getString(5), rs.getString(3), rs.getString(4), rs.getDouble(6), rs.getInt(7)));
            }
        } catch (SQLException ex) {
              System.out.println("SQLException: " + ex.getMessage());
        }
        return lstKm;

                }

    @Override
    public Integer add(Khuyenmai km) {
 Integer row = null;
        
        Connection cn = DBcontext.getConnection();
        String sql = "INSERT INTO KhuyenMai(Ten, Ngaybatdau, Ngayketthuc, HinhthucKM, Giatrigiam) VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement pre = cn.prepareStatement(sql);
       
          pre.setString(1, km.getTenKM());
          pre.setString(2, km.getNgayBatDau());
          pre.setString(3, km.getNgayKetThuc());
          pre.setString(4, km.getHinhThucKM());
          pre.setDouble(5, km.getGiaTriGiam());
   
            row = pre.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }

    @Override
    public boolean update(Khuyenmai km, String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String checktrung(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean UpdateTT() {
        
          String sql = "UPDATE KHUYENMAI SET TrangThai = 1,GIATRIGIAM =0 WHERE NGAYKETTHUC < GETDATE()";
        try {
            Connection conn = DBcontext.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }}

    @Override
    public boolean UpdateTT2() {
          String sql = "UPDATE KHUYENMAI SET TrangThai = 0 WHERE NGAYKETTHUC > GETDATE()";
        try {
            Connection conn = DBcontext.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }   
    }

  
}
