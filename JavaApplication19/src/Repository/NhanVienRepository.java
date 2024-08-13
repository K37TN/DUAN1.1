/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.TaiKhoan;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public class NhanVienRepository {
     private Connection conn;

    public NhanVienRepository() {
        conn = DBcontext.getConnection();
    }

   public String getChucVuNameById(int idCV) throws SQLException {
        String sql = "SELECT ten FROM chucvu WHERE id = ?";
        try ( PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCV);
            try ( ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("ten");
                }
            }
        }
        return null;
    }

    public ArrayList<User> getAll() throws SQLException {
        ArrayList<User> nvrepo = new ArrayList<>();
        String query = "SELECT * FROM Users";
        try ( Statement stm = conn.createStatement();  ResultSet rs = stm.executeQuery(query)) {
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

    public int getIdCVByName(String tenCV) throws SQLException {
        String sql = "SELECT id FROM ChucVu WHERE ten = ?";
        try ( PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, tenCV);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            } else {
                throw new SQLException("Chức vụ không tồn tại.");
            }
        }
    }

   public void addUser(User user) throws SQLException {
    String sql = "INSERT INTO Users (ten, tenDem, ho, ngaySinh, gioiTinh, sdt, idCV, taiKhoan, matKhau, email, trangThai) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, user.getTen());
        pstmt.setString(2, user.getTenDem());
        pstmt.setString(3, user.getHo());
        pstmt.setDate(4, new java.sql.Date(user.getNgaySinh().getTime()));
        pstmt.setBoolean(5, user.isGioiTinh());
        pstmt.setString(6, user.getSdt());
        pstmt.setInt(7, user.getIdCV());
        pstmt.setString(8, user.getTaiKhoan());
        pstmt.setString(9, user.getMatKhau());
        pstmt.setString(10, user.getEmail());
        pstmt.setBoolean(11, user.isTrangThai());
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



    public TaiKhoan getbyTaiKhoan(String tk) {
        String sql = "SELECT * FROM dbo.Users WHERE TaiKhoan = '" + tk + "';";
        List<TaiKhoan> list = new ArrayList<>();
        try {
            PreparedStatement ppstm = conn.prepareStatement(sql);
            ResultSet rs = ppstm.executeQuery();
            while (rs.next()) {
                list.add(new TaiKhoan(rs.getInt(1),
                        rs.getString(8),
                        rs.getString(9)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
