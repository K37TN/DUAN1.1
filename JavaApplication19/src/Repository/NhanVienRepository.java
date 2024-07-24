/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.User;
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
public class NhanVienRepository {
     private Connection conn;

    public NhanVienRepository() {
        conn = DBcontext.getConnection();
    }

    public ArrayList<User> getAll() throws SQLException {
        ArrayList<User> nvrepo = new ArrayList<>();
        String query = "SELECT * FROM Users";
        try (Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery(query)) {
            while (rs.next()) {
                User nv = new User();
                nv.setId(rs.getInt("Id"));
                nv.setTen(rs.getString("Ten"));
                nv.setTenDem(rs.getString("TenDem"));
                nv.setHo(rs.getString("Ho"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setGioiTinh(rs.getBoolean("GioiTinh"));
                nv.setIdCV(rs.getInt("IdCV"));
                nv.setTaiKhoan(rs.getString("TaiKhoan"));
                nv.setSdt(rs.getString("Sdt"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setEmail(rs.getString("Email"));
                nv.setTrangThai(rs.getBoolean("TrangThai"));
                nvrepo.add(nv);
            }
        }
        return nvrepo;
    }

    public void addUser(User nv) throws SQLException {
        String sql = "INSERT INTO Users (Ten, TenDem, Ho, NgaySinh, GioiTinh, Sdt, IdCV, TaiKhoan, MatKhau, Email, TrangThai) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nv.getTen());
            pstmt.setString(2, nv.getTenDem());
            pstmt.setString(3, nv.getHo());
            pstmt.setDate(4, new java.sql.Date(nv.getNgaySinh().getTime()));
            pstmt.setBoolean(5, nv.isGioiTinh());
            pstmt.setString(6, nv.getSdt());
            pstmt.setInt(7, nv.getIdCV());
            pstmt.setString(8, nv.getTaiKhoan());
            pstmt.setString(9, nv.getMatKhau());
            pstmt.setString(10, nv.getEmail());
            pstmt.setBoolean(11, nv.isTrangThai());
            pstmt.executeUpdate();
        }
    }

    public void update(User nv) throws SQLException {
        String query = "UPDATE Users SET Ten = ?, TenDem = ?, Ho = ?, NgaySinh = ?, GioiTinh = ?, Sdt = ?, IdCV = ?, TaiKhoan = ?, MatKhau = ?, Email = ?, TrangThai = ? WHERE Id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, nv.getTen());
            ps.setString(2, nv.getTenDem());
            ps.setString(3, nv.getHo());
            ps.setDate(4, nv.getNgaySinh() != null ? new java.sql.Date(nv.getNgaySinh().getTime()) : null);
            ps.setBoolean(5, nv.isGioiTinh());
            ps.setString(6, nv.getSdt());
            ps.setInt(7, nv.getIdCV());
            ps.setString(8, nv.getTaiKhoan());
            ps.setString(9, nv.getMatKhau());
            ps.setString(10, nv.getEmail());
            ps.setBoolean(11, nv.isTrangThai());
            ps.setInt(12, nv.getId());
            ps.executeUpdate();
        }
    }
}
