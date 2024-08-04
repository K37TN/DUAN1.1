/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.ChatLieu;
import Model.ComboSanPham;
import Model.Hang;
import Model.KichThuoc;
import Model.MauSac;
import Model.sanPham;
import Repositorys.ImplSanPham;
import entity.DanhSachKHViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author FPTSHOP
 */
public class SanPhamRepository implements ImplSanPham{

    @Override
    public List<sanPham> getAll() {
 String sql = "SELECT \n" +
"    ctsp.Id,\n" +
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
"    ChitietSP ctsp\n" +
"INNER JOIN \n" +
"    ChatLieu cl ON ctsp.IdCL = cl.Id\n" +
"INNER JOIN \n" +
"    KichCo kc ON ctsp.IdKC = kc.Id\n" +
"INNER JOIN \n" +
"    MauSac ms ON ctsp.IdMauSac = ms.Id\n" +
"INNER JOIN \n" +
"    ThuongHieu th ON ctsp.IdTH = th.Id";
          try ( Connection con = DBcontext.getConnection();  PreparedStatement ps = con.prepareStatement(sql);) {
         ResultSet rs = ps.executeQuery();
            List<sanPham> listSP = new ArrayList<>();
            while (rs.next()) {
                sanPham p = new sanPham();
          p.setID(rs.getInt("Id")); // Chỉnh sửa chỉ số cột
        p.setMa(rs.getString("Ma")); // Chỉnh sửa chỉ số cột
        p.setTen(rs.getString("Ten")); // Chỉnh sửa chỉ số cột
        p.setGiaBan(rs.getBigDecimal("GiaBan")); // Chỉnh sửa chỉ số cột
        p.setMoTa(rs.getString("MoTa")); // Chỉnh sửa chỉ số cột
        p.setSoLuongTon(rs.getInt("SoLuongTon")); // Chỉnh sửa chỉ số cột
        p.setChatLieu(rs.getString("TenChatLieu")); // Chỉnh sửa chỉ số cột
        p.setKichCo(rs.getString("TenKichCo")); // Chỉnh sửa chỉ số cột
        p.setThuongHieu(rs.getString("TenThuongHieu")); // Chỉnh sửa chỉ số cột
        p.setMauSac(rs.getString("TenMauSac")); // Chỉnh sửa chỉ số cột

                listSP.add(p);
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;        
    }

    @Override
    public List<MauSac> getMausac() {
   String sql = "SELECT * FROM MauSac";
          try ( Connection con = DBcontext.getConnection();  PreparedStatement ps = con.prepareStatement(sql);) {
         ResultSet rs = ps.executeQuery();
            List<MauSac> listh = new ArrayList<>();
            while (rs.next()) {
                MauSac p = new MauSac();
               p.setID(rs.getInt(1));
        p.setTen(rs.getString(2));
                listh.add(p);
            }
            return listh;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;                  
    }

    @Override
    public List<Hang> getHang() {
     String sql = "SELECT * FROM ThuongHieu";
          try ( Connection con = DBcontext.getConnection();  PreparedStatement ps = con.prepareStatement(sql);) {
         ResultSet rs = ps.executeQuery();
            List<Hang> listh = new ArrayList<>();
            while (rs.next()) {
                Hang p = new Hang();
               p.setID(rs.getInt(1));
        p.setTen(rs.getString(2));
                listh.add(p);
            }
            return listh;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;           
    }

    @Override
    public List<ChatLieu> getChatLieu() {
     String sql = "SELECT * FROM ChatLieu";
          try ( Connection con = DBcontext.getConnection();  PreparedStatement ps = con.prepareStatement(sql);) {
         ResultSet rs = ps.executeQuery();
            List<ChatLieu> listh = new ArrayList<>();
            while (rs.next()) {
                ChatLieu p = new ChatLieu();
               p.setID(rs.getInt(1));
        p.setTen(rs.getString(2));
                listh.add(p);
            }
            return listh;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;        
    }

    @Override
    public List<KichThuoc> getKichThuoc() {
    String sql = "SELECT * FROM KichCo";
          try ( Connection con = DBcontext.getConnection();  PreparedStatement ps = con.prepareStatement(sql);) {
         ResultSet rs = ps.executeQuery();
            List<KichThuoc> listh = new ArrayList<>();
            while (rs.next()) {
                KichThuoc p = new KichThuoc();
               p.setID(rs.getInt(1));
        p.setTen(rs.getString(2));
                listh.add(p);
            }
            return listh;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;         
    }

    @Override
    public Integer add(ComboSanPham p) {
    Integer row = null;
    String sql = "INSERT INTO ChitietSP (Ma, Ten, IdMauSac, IdKC, IdCL, IdTH, MoTa, SoLuongTon, GiaBan) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection cn = DBcontext.getConnection(); 
         PreparedStatement ps = cn.prepareStatement(sql)) {

        // Set giá trị cho các tham số của câu lệnh SQL
        ps.setString(1, p.getMa()); // Ma phải là nvarchar
        ps.setString(2, p.getTen()); // Ten phải là nvarchar

        // Kiểm tra và set giá trị cho các tham số int với null
        if (p.getMauSac() > 0) {
            ps.setInt(3, p.getMauSac()); // IdMauSac phải là int
        } else {
            ps.setNull(3, java.sql.Types.INTEGER);
        }

        if (p.getKichCo() > 0) {
            ps.setInt(4, p.getKichCo()); // IdKC phải là int
        } else {
            ps.setNull(4, java.sql.Types.INTEGER);
        }

        if (p.getChatLieu() > 0) {
            ps.setInt(5, p.getChatLieu()); // IdCL phải là int
        } else {
            ps.setNull(5, java.sql.Types.INTEGER);
        }

        if (p.getThuongHieu() > 0) {
            ps.setInt(6, p.getThuongHieu()); // IdTH phải là int
        } else {
            ps.setNull(6, java.sql.Types.INTEGER);
        }

        ps.setString(7, p.getMoTa()); // MoTa phải là nvarchar
        ps.setInt(8, p.getSoLuongTon()); // SoLuongTon phải là int
        ps.setBigDecimal(9, p.getGiaBan()); // GiaBan phải là decimal

        // Thực thi câu lệnh SQL và nhận số lượng dòng ảnh hưởng
        row = ps.executeUpdate();
    } catch (SQLException e) {
        // In lỗi để kiểm tra
        e.printStackTrace();
    }
    return row;
    }     
    
public Integer getIdByName(String tableName, String columnName, String name) {
    Integer id = null;
    String sql = "SELECT Id FROM " + tableName + " WHERE " + columnName + " = ?";
    try (Connection cn = DBcontext.getConnection(); 
         PreparedStatement ps = cn.prepareStatement(sql)) {
        ps.setString(1, name);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                id = rs.getInt("Id");
            } else {
                System.out.println("Không tìm thấy ID cho " + name + " trong bảng " + tableName);
            }
        }
    } catch (SQLException e) {
        System.out.println("SQL Lỗi: " + e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
    }
    return id;
}
    @Override
    public boolean UPDATE(int id, ComboSanPham p) {
String sql = "UPDATE ChitietSP SET Ma = ?, Ten = ?, IdMauSac = ?, IdKC = ?, IdCL = ?, IdTH = ?, MoTa = ?, SoLuongTon = ?, GiaBan = ? WHERE Id = ?";

    try (Connection cn = DBcontext.getConnection(); 
         PreparedStatement ps = cn.prepareStatement(sql)) {

        // Set giá trị cho các tham số của câu lệnh SQL
        ps.setString(1, p.getMa()); // Ma phải là nvarchar
        ps.setString(2, p.getTen()); // Ten phải là nvarchar

        // Kiểm tra và set giá trị cho các tham số int với null
        if (p.getMauSac() > 0) {
            ps.setInt(3, p.getMauSac()); // IdMauSac phải là int
        } else {
            ps.setNull(3, java.sql.Types.INTEGER);
        }

        if (p.getKichCo() > 0) {
            ps.setInt(4, p.getKichCo()); // IdKC phải là int
        } else {
            ps.setNull(4, java.sql.Types.INTEGER);
        }

        if (p.getChatLieu() > 0) {
            ps.setInt(5, p.getChatLieu()); // IdCL phải là int
        } else {
            ps.setNull(5, java.sql.Types.INTEGER);
        }

        if (p.getThuongHieu() > 0) {
            ps.setInt(6, p.getThuongHieu()); // IdTH phải là int
        } else {
            ps.setNull(6, java.sql.Types.INTEGER);
        }

        ps.setString(7, p.getMoTa()); // MoTa phải là nvarchar
        ps.setInt(8, p.getSoLuongTon()); // SoLuongTon phải là int
        ps.setBigDecimal(9, p.getGiaBan()); // GiaBan phải là decimal

        // Set giá trị cho Id của sản phẩm cần update
        ps.setInt(10, id);

        // Thực thi câu lệnh SQL và nhận số lượng dòng ảnh hưởng
        int rowsAffected = ps.executeUpdate();
        
        // Kiểm tra nếu có ít nhất một dòng bị ảnh hưởng
        return rowsAffected > 0;
    } catch (SQLException e) {
        // In lỗi để kiểm tra
        e.printStackTrace();
        return false;
    }       
    }

    @Override
    public Integer delete(Integer id) {
         Integer row = null;
        String sql = "DELETE FROM ChitietSP WHERE Id LIKE ?";
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

    @Override
    public List<sanPham> getHetHang() {
    String sql = "SELECT \n" +
"    ctsp.Id,\n" +
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
"    ChitietSP ctsp\n" +
"INNER JOIN \n" +
"    ChatLieu cl ON ctsp.IdCL = cl.Id\n" +
"INNER JOIN \n" +
"    KichCo kc ON ctsp.IdKC = kc.Id\n" +
"INNER JOIN \n" +
"    MauSac ms ON ctsp.IdMauSac = ms.Id\n" +
"INNER JOIN \n" +
"    ThuongHieu th ON ctsp.IdTH = th.Id\n" +
"WHERE \n" +
"    ctsp.SoLuongTon <= 0 ";
          try ( Connection con = DBcontext.getConnection();  PreparedStatement ps = con.prepareStatement(sql);) {
         ResultSet rs = ps.executeQuery();
            List<sanPham> listSP = new ArrayList<>();
            while (rs.next()) {
                sanPham p = new sanPham();
          p.setID(rs.getInt("Id")); // Chỉnh sửa chỉ số cột
        p.setMa(rs.getString("Ma")); // Chỉnh sửa chỉ số cột
        p.setTen(rs.getString("Ten")); // Chỉnh sửa chỉ số cột
        p.setGiaBan(rs.getBigDecimal("GiaBan")); // Chỉnh sửa chỉ số cột
        p.setMoTa(rs.getString("MoTa")); // Chỉnh sửa chỉ số cột
        p.setSoLuongTon(rs.getInt("SoLuongTon")); // Chỉnh sửa chỉ số cột
        p.setChatLieu(rs.getString("TenChatLieu")); // Chỉnh sửa chỉ số cột
        p.setKichCo(rs.getString("TenKichCo")); // Chỉnh sửa chỉ số cột
        p.setThuongHieu(rs.getString("TenThuongHieu")); // Chỉnh sửa chỉ số cột
        p.setMauSac(rs.getString("TenMauSac")); // Chỉnh sửa chỉ số cột

                listSP.add(p);
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;            
    }

    @Override
    public List<sanPham> getConHang() {
        String sql = "SELECT \n" +
"    ctsp.Id,\n" +
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
"    ChitietSP ctsp\n" +
"INNER JOIN \n" +
"    ChatLieu cl ON ctsp.IdCL = cl.Id\n" +
"INNER JOIN \n" +
"    KichCo kc ON ctsp.IdKC = kc.Id\n" +
"INNER JOIN \n" +
"    MauSac ms ON ctsp.IdMauSac = ms.Id\n" +
"INNER JOIN \n" +
"    ThuongHieu th ON ctsp.IdTH = th.Id\n" +
"WHERE \n" +
"    ctsp.SoLuongTon > 0 ";
          try ( Connection con = DBcontext.getConnection();  PreparedStatement ps = con.prepareStatement(sql);) {
         ResultSet rs = ps.executeQuery();
            List<sanPham> listSP = new ArrayList<>();
            while (rs.next()) {
                sanPham p = new sanPham();
          p.setID(rs.getInt("Id")); // Chỉnh sửa chỉ số cột
        p.setMa(rs.getString("Ma")); // Chỉnh sửa chỉ số cột
        p.setTen(rs.getString("Ten")); // Chỉnh sửa chỉ số cột
        p.setGiaBan(rs.getBigDecimal("GiaBan")); // Chỉnh sửa chỉ số cột
        p.setMoTa(rs.getString("MoTa")); // Chỉnh sửa chỉ số cột
        p.setSoLuongTon(rs.getInt("SoLuongTon")); // Chỉnh sửa chỉ số cột
        p.setChatLieu(rs.getString("TenChatLieu")); // Chỉnh sửa chỉ số cột
        p.setKichCo(rs.getString("TenKichCo")); // Chỉnh sửa chỉ số cột
        p.setThuongHieu(rs.getString("TenThuongHieu")); // Chỉnh sửa chỉ số cột
        p.setMauSac(rs.getString("TenMauSac")); // Chỉnh sửa chỉ số cột

                listSP.add(p);
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;            
         }
    @Override
    public List<sanPham> search(String ma, String ten) {
    List<sanPham> resultList = new ArrayList<>();
    String sql = "SELECT " +
            "ctsp.Id, " +
            "ctsp.Ma, " +
            "ctsp.Ten, " +
            "ctsp.GiaBan, " +
            "ctsp.MoTa, " +
            "ctsp.SoLuongTon, " +
            "cl.Ten AS TenChatLieu, " +
            "kc.Ten AS TenKichCo, " +
            "ms.Ten AS TenMauSac, " +
            "th.Ten AS TenThuongHieu " +
            "FROM ChitietSP ctsp " +
            "INNER JOIN ChatLieu cl ON ctsp.IdCL = cl.Id " +
            "INNER JOIN KichCo kc ON ctsp.IdKC = kc.Id " +
            "INNER JOIN MauSac ms ON ctsp.IdMauSac = ms.Id " +
            "INNER JOIN ThuongHieu th ON ctsp.IdTH = th.Id " +
            "WHERE 1=1"; // Khởi tạo điều kiện WHERE cơ bản

    if (ma != null && !ma.trim().isEmpty()) {
        sql += " AND ctsp.Ma LIKE ?";
    }
    if (ten != null && !ten.trim().isEmpty()) {
        sql += " AND ctsp.Ten LIKE ?";
    }

    try (Connection con = DBcontext.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {

        int paramIndex = 1;

        if (ma != null && !ma.trim().isEmpty()) {
            ps.setString(paramIndex++, "%" + ma + "%");
        }
        if (ten != null && !ten.trim().isEmpty()) {
            ps.setString(paramIndex++, "%" + ten + "%");
        }

        System.out.println("Executing query: " + ps.toString()); // In câu lệnh SQL để kiểm tra

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            sanPham p = new sanPham();
            p.setID(rs.getInt("Id"));
            p.setMa(rs.getString("Ma"));
            p.setTen(rs.getString("Ten"));
            p.setGiaBan(rs.getBigDecimal("GiaBan"));
            p.setMoTa(rs.getString("MoTa"));
            p.setSoLuongTon(rs.getInt("SoLuongTon"));
            p.setChatLieu(rs.getString("TenChatLieu"));
            p.setKichCo(rs.getString("TenKichCo"));
            p.setThuongHieu(rs.getString("TenThuongHieu"));
            p.setMauSac(rs.getString("TenMauSac"));

            resultList.add(p);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Lỗi truy vấn cơ sở dữ liệu: " + e.getMessage());
    }

    return resultList;
    }

    @Override
    public Integer getIdSanPham(String MaSP) {
 Integer idSP = 0;
        try {
            String sql = "select id from ChitietSP where Ma = ?";
            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, MaSP);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                idSP = rs.getInt(1);

            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return idSP;        
    }

    @Override
    public boolean updateSoLuongSP(String Masp, int SoLuong) {
  try {
            String sql = "UPDATE ChitietSP SET SoLuongTon = ? WHERE MA = ?";
            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, SoLuong);
            pr.setString(2, Masp);
            pr.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }       
    }
    
}
