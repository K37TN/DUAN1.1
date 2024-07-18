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
    
}
