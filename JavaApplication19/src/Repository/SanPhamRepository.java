/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.ChatLieu;
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
            List<MauSac> listms = new ArrayList<>();
            while (rs.next()) {
                MauSac p = new MauSac();
               p.setID(rs.getInt(1));
        p.setTen(rs.getString(2));
                listms.add(p);
            }
            return listms;
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
    public Integer add(sanPham p) {
          Integer row = null;
    String sql = "INSERT INTO ChitietSP (Ma, Ten, IdNsx, IdMauSac, IdKC, IdCL, IdTH, MoTa, SoLuongTon, GiaBan) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection cn = DBcontext.getConnection(); 
         PreparedStatement ps = cn.prepareStatement(sql)) {

        // Lấy ID từ tên
        Integer nsxId = getIdByName("NSX", "Ten", p.getNsx());
        Integer mauSacId = getIdByName("MauSac", "Ten", p.getMauSac());
        Integer kichCoId = getIdByName("KichCo", "Ten", p.getKichCo());
        Integer chatLieuId = getIdByName("ChatLieu", "Ten", p.getChatLieu());
        Integer thuongHieuId = getIdByName("ThuongHieu", "Ten", p.getThuongHieu());

        // In giá trị ID để kiểm tra
        System.out.println("NSX ID: " + nsxId);
        System.out.println("Mau Sac ID: " + mauSacId);
        System.out.println("Kich Co ID: " + kichCoId);
        System.out.println("Chat Lieu ID: " + chatLieuId);
        System.out.println("Thuong Hieu ID: " + thuongHieuId);

        // Kiểm tra các ID có phải là null không
        if (nsxId == null || mauSacId == null || kichCoId == null || chatLieuId == null || thuongHieuId == null) {
            throw new IllegalArgumentException("Một hoặc nhiều ID không hợp lệ.");
        }

        ps.setString(1, p.getMa()); // Ma phải là nvarchar
        ps.setString(2, p.getTen()); // Ten phải là nvarchar
        ps.setInt(3, nsxId); // IdNsx phải là int
        ps.setInt(4, mauSacId); // IdMauSac phải là int
        ps.setInt(5, kichCoId); // IdKC phải là int
        ps.setInt(6, chatLieuId); // IdCL phải là int
        ps.setInt(7, thuongHieuId); // IdTH phải là int
        ps.setString(8, p.getMoTa()); // MoTa phải là nvarchar
        ps.setInt(9, p.getSoLuongTon()); // SoLuongTon phải là int
        ps.setBigDecimal(10, p.getGiaBan()); // GiaBan phải là decimal

        row = ps.executeUpdate();
    } catch (IllegalArgumentException e) {
        System.out.println("Lỗi: " + e.getMessage());
    } catch (SQLException e) {
        System.out.println("SQL Lỗi: " + e.getMessage());
    } catch (Exception e) {
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
    public boolean UPDATE(int id, sanPham kh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

}
