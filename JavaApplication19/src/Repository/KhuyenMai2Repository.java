/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.Users2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author FPTSHOP
 */
public class KhuyenMai2Repository {
   private Connection conn;
    
    public KhuyenMai2Repository(){
        conn = DBcontext.getConnection();
    }
    public ArrayList<Users2> getAll() throws SQLException{
        ArrayList<Users2> kmrepo = new ArrayList<>();
        String query = "SELECT * FROM KhuyenMai";
    
    try (Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery(query)) {
            while (rs.next()) {
                Users2 km = new Users2();
                km.setID(rs.getInt("Id"));
                km.setTenKM(rs.getString("Ten"));
                km.setNgayBatDau(rs.getDate("Ngaybatdau"));
                km.setNgayKetThuc(rs.getDate("Ngayketthuc"));
                km.setHinhThucKM(rs.getString("HinhthucKM"));
                km.setGiaTriGiam(rs.getDouble("Giatrigiam"));
                km.setTrangthai(rs.getInt("Trangthai"));
                kmrepo.add(km);
                
            }
        }
        return kmrepo;
    }
    
     public void addKM(Users2 km) throws SQLException {
        String sql = "INSERT INTO KhuyenMai (Ten, Ngaybatdau, Ngayketthuc, HinhthucKM, Giatrigiam, Trangthai) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, km.getTenKM());
            pstmt.setDate(2, new java.sql.Date(km.getNgayBatDau().getTime()));
            pstmt.setDate(3, new java.sql.Date(km.getNgayKetThuc().getTime()));
            pstmt.setString(4, km.getHinhThucKM());
            pstmt.setDouble(5, km.getGiaTriGiam());
            pstmt.setInt(6, km.getTrangthai());
            pstmt.executeUpdate();
        }
    }
     
     
     public void update(Users2 km) throws SQLException {
        String query = "UPDATE KhuyenMai SET Ten = ?, Ngaybatdau = ?, Ngayketthuc = ?, HinhthucKM = ?, Giatrigiam = ?, Trangthai = ? WHERE Id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, km.getTenKM());
            ps.setDate(2, km.getNgayBatDau() != null ? new java.sql.Date(km.getNgayBatDau().getTime()) : null);
            ps.setDate(3, km.getNgayKetThuc() != null ? new java.sql.Date(km.getNgayKetThuc().getTime()) : null);
            ps.setString(4, km.getHinhThucKM());
            ps.setDouble(5, km.getGiaTriGiam());
            ps.setInt(6, km.getTrangthai());
            ps.setInt(7, km.getID());
            ps.executeUpdate();
        }
    }
     
     public Users2 getKhuyenMaiById(int id) throws SQLException {
    // Thực hiện truy vấn cơ sở dữ liệu để tìm khuyến mãi theo ID
    String query = "SELECT * FROM KhuyenMai WHERE Id = ?";
    try (PreparedStatement ps = conn.prepareStatement(query)) {
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            Users2 km = new Users2();
            km.setID(rs.getInt("Id"));
            km.setTenKM(rs.getString("Ten"));
            km.setNgayBatDau(rs.getDate("Ngaybatdau"));
            km.setNgayKetThuc(rs.getDate("Ngayketthuc"));
            km.setGiaTriGiam(rs.getDouble("Giatrigiam"));
            km.setHinhThucKM(rs.getString("HinhthucKM"));
            km.setTrangthai(rs.getInt("Trangthai"));
            return km;
        }
    }
    return null; // Nếu không tìm thấy
} 
}
