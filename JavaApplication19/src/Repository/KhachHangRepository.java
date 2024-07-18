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
             + "           ,[Ma]\n"
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
                khachhang.setMa(rs.getString(2));
                khachhang.setTen(rs.getString(3));
                khachhang.setTendem(rs.getString(4));
                khachhang.setHo(rs.getString(5));
                khachhang.setGioitinh(rs.getInt(6));
                khachhang.setNgaysinh(rs.getDate(7));
                khachhang.setEmail(rs.getString(8));
                khachhang.setSdt(rs.getString(9));
              

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
        String sql = "INSERT INTO [dbo].[KhachHang] "
           + "([Ma], [Ten], [TenDem], [Ho], [Gioitinh], [NgaySinh], [Email], [Sdt]) "
           + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
       ps.setObject(1, kh.getMa());
          ps.setObject(2, kh.getTen());
            ps.setObject(3, kh.getTendem());
            ps.setObject(4, kh.getHo());
            ps.setObject(5, kh.getGioitinh());
            ps.setObject(6, kh.getNgaysinh());
            ps.setObject(7, kh.getEmail());
            ps.setObject(8, kh.getSdt());

   
            row = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;        
    }

    @Override
    public boolean UPDATE(int id,KhachHang kh) {
       int check = 0;
    String sql = "UPDATE [dbo].[KhachHang]\n"
                + "   SET [Ma] =?\n"
             + " ,[Ten] =?\n"
                + "      ,[TenDem] = ?\n"
                + "      ,[Ho] =?\n"
                + "      ,[Gioitinh] = ?\n"
                + "      ,[NgaySinh] = ?\n"
                + "      ,[Email] = ?\n"
                + "      ,[Sdt] = ?\n"
              
                + " WHERE id = ?";
    
    try (Connection cn = DBcontext.getConnection();
         PreparedStatement ps = cn.prepareStatement(sql)) {
       ps.setObject(1, kh.getMa());
          ps.setObject(2, kh.getTen());
            ps.setObject(3, kh.getTendem());
            ps.setObject(4, kh.getHo());
            ps.setObject(5, kh.getGioitinh());
            ps.setObject(6, kh.getNgaysinh());
            ps.setObject(7, kh.getEmail());
            ps.setObject(8, kh.getSdt());
ps.setObject(9, id);
        check = ps.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Error while executing updateKhachHang: " + e.getMessage());
        e.printStackTrace();
    }

    return check > 0;
    }

    @Override
    public List<KhachHang> getSDT(String sdt) {
      List<KhachHang> listkh = new ArrayList<>();
        try {
            listkh.removeAll(listkh);
            String sql = "SELECT [Id]\n"
                     + "      ,[Ma]\n"
                    + "      ,[Ten]\n"
                    + "      ,[TenDem]\n"
                    + "      ,[Ho]\n"
                    + "      ,[Gioitinh]\n"
                    + "      ,[NgaySinh]\n"
                    + "      ,[Email]\n"
                    + "      ,[Sdt]\n"
                   
                    + "  FROM [dbo].[KhachHang]\n"
                    + "  where sdt like ? ";
            Connection conn = DBcontext.openDbConnection();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + sdt + "%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                KhachHang khachhang = new KhachHang();
                khachhang.setId(rs.getInt(1));
                khachhang.setMa(rs.getString(2));
                khachhang.setTen(rs.getString(3));
                khachhang.setTendem(rs.getString(4));
                khachhang.setHo(rs.getString(5));
                khachhang.setGioitinh(rs.getInt(6));
                khachhang.setNgaysinh(rs.getDate(7));
                khachhang.setEmail(rs.getString(8));
                khachhang.setSdt(rs.getString(9));
                

                listkh.add(khachhang);
            }
        } catch (SQLException ex) {
            System.out.println("Error while executing TimKiem: " + ex.getMessage());
        ex.printStackTrace();
        }
        return listkh;}
}

