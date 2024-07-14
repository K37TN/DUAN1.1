/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.KhachHang;
import Repositorys.ImplKhachHangRepository;
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
}

