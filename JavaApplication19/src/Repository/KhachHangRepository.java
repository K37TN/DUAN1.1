/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.KhachHang;
import Repositorys.ImplKhachHangRepository;
import entity.DanhSachKHViewModel;
import entity.KhachHangViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import junit.runner.Version;

/**
 *
 * @author FPTSHOP
 */
public class KhachHangRepository implements ImplKhachHangRepository{

    @Override
    public List<DanhSachKHViewModel> getallLS() {
        String sql = "SELECT dbo.KhachHang.Id, dbo.KhachHang.Ten, dbo.KhachHang.TenDem, dbo.KhachHang.Ho, dbo.KhachHang.Sdt, dbo.HoaDon.Ma, dbo.HoaDon.NgayTao, dbo.HoaDon.TinhTrang, dbo.HoaDon.TongTien\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.KhachHang ON dbo.HoaDon.IdKH = dbo.KhachHang.Id";
          try ( Connection con = DBcontext.getConnection();  PreparedStatement ps = con.prepareStatement(sql);) {
         ResultSet rs = ps.executeQuery();
            List<DanhSachKHViewModel> listSP = new ArrayList<>();
            while (rs.next()) {
                DanhSachKHViewModel khachhang = new DanhSachKHViewModel();
                khachhang.setId(rs.getInt(1));
                khachhang.setTen(rs.getString(2));
                khachhang.setTendem(rs.getString(3));
                khachhang.setHo(rs.getString(4));
                khachhang.setSDT(rs.getString(5));
                khachhang.setMaHD(rs.getString(6));
                khachhang.setNgayTao(rs.getString(7));
                khachhang.setTrangthai(rs.getInt(8));
                khachhang.setDongia(rs.getDouble(9));

                listSP.add(khachhang);
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public List<KhachHang> getall() {
    String sql = "SELECT [Id]\n"
                + "      ,[Ten]\n"
                + "      ,[TenDem]\n"
                + "      ,[Ho]\n"
                + "      ,[Gioitinh]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[Email]\n"
                + "      ,[Sdt]\n"
               
                + "  FROM [dbo].[KhachHang]";;
          try ( Connection con = DBcontext.getConnection();  PreparedStatement ps = con.prepareStatement(sql);) {
          ResultSet rs = ps.executeQuery();
            List<KhachHang> listSP = new ArrayList<>();
            while (rs.next()) {
                KhachHang khachhang = new KhachHang();
                khachhang.setId(rs.getInt(1));
                khachhang.setTen(rs.getString(2));
                khachhang.setTendem(rs.getString(3));
                khachhang.setHo(rs.getString(4));
                khachhang.setGioitinh(rs.getInt(5));
                khachhang.setNgaysinh(rs.getDate(6));
                khachhang.setEmail(rs.getString(7));
                khachhang.setSdt(rs.getString(8));
              

                listSP.add(khachhang);
     
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;   
    }

    @Override
    public Integer add(KhachHang kh) {
 Integer row = null;
        
        Connection cn = DBcontext.getConnection();
        String sql = "INSERT INTO [dbo].[KhachHang]\n"
                + "           ([Ten]\n"
                + "           ,[TenDem]\n"
                + "           ,[Ho]\n"
                + "           ,[Gioitinh]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[Email]\n"
                + "           ,[Sdt]\n)"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
       
          ps.setObject(1, kh.getTen());
            ps.setObject(2, kh.getTendem());
            ps.setObject(3, kh.getHo());
            ps.setObject(4, kh.getGioitinh());
            ps.setObject(5, kh.getNgaysinh());
            ps.setObject(6, kh.getEmail());
            ps.setObject(7, kh.getSdt());

   
            row = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;        
    }

    @Override
    public Integer UPDATE(KhachHang kh) {
        Integer rowsUpdated = null;
    String sql = "UPDATE [dbo].[KhachHang]\n"
               + "SET [Ten] = ?,\n"
               + "    [TenDem] = ?,\n"
               + "    [Ho] = ?,\n"
               + "    [Gioitinh] = ?,\n"
               + "    [NgaySinh] = ?,\n"
               + "    [Email] = ?,\n"
               + "    [Sdt] = ?\n"
               + "WHERE [Id] = ?";
    
    try (Connection cn = DBcontext.getConnection();
         PreparedStatement ps = cn.prepareStatement(sql)) {
        
        ps.setString(1, kh.getTen());
        ps.setString(2, kh.getTendem());
        ps.setString(3, kh.getHo());
        ps.setInt(4, kh.getGioitinh()); // Assuming gioitinh is a boolean field
       ps.setDate(5, new java.sql.Date(kh.getNgaysinh().getTime()));
        ps.setString(6, kh.getEmail());
        ps.setString(7, kh.getSdt());
        ps.setInt(8,kh.getId());

        rowsUpdated = ps.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Error while executing updateKhachHang: " + e.getMessage());
        e.printStackTrace();
    }

    return rowsUpdated;}
}

