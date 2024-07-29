/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.GioHang;
import Model.HoaDon;
import Model.HoaDonChiTiet;
import Model.KhachHang;
import Model.KhachHang2;
import Model.User;
import Repositorys.ImplHoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public class HoaDonRepository implements ImplHoaDon{

    @Override
    public List<HoaDon> getListHD(int TrangThai) {
          List<HoaDon> getListGD = new ArrayList<>();
        try {
//            String sql = "SELECT HD.Ma , HD.NgayTao , NV.Ten , HD.TinhTrang , NV.TenDem ,"
//                    + " NV.Ho FROM HoaDon HD JOIN Users NV ON HD.IdNV = NV.Id WHERE HD.TinhTrang = ?";
String sql = "SELECT HD.Ma, HD.NgayTao, HD.TinhTrang \n" +
"FROM HoaDon HD \n" +
"WHERE HD.TinhTrang = ?";
            
            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, TrangThai);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();

                hd.setMa(rs.getString(1));
                hd.setNgayTao(rs.getDate(2));
//                User uesr = new User();
//                uesr.setTen(rs.getString(6) + " " + rs.getString(5) + " " + rs.getString(3));
//                hd.setUser(uesr);
                hd.setTinhTrang(rs.getInt(3));
                getListGD.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return getListGD;
    }

    @Override
    public Integer insertHoaDon(HoaDon hd) {
         int result = 0;
        try {
            String sql = "insert into HoaDon (Ma , NgayTao , NgayThanhToan , TinhTrang) values( ? ,? ,? ,?)";
            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, hd.getMa());
    
            pr.setDate(2, hd.getNgayTao());
            pr.setDate(3, hd.getNgayThanhToan());
            pr.setInt(4, hd.getTinhTrang());
            result = pr.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return result;
    }

    @Override
    public List<GioHang> getListHoaDonChiTietByMaHd(String MaHD) {
     List<GioHang> getList = new ArrayList<>();
        try {
            String sql = "SELECT ctsp.Ma, ctsp.Ten, hdct.Soluong, hdct.Dongia, ms.Ten, cl.Ten, kc.Ten FROM HoaDonChiTiet hdct JOIN HoaDon hd ON hd.Id = hdct.IdHD\n"
                    + "								 JOIN ChitietSP ctsp ON hdct.IdCTSP = ctsp.Id\n"
                    + "								 JOIN MauSac ms ON ctsp.IdMauSac = ms.Id\n"
                    + "								 JOIN ChatLieu cl ON ctsp.IdCL = cl.Id\n"
                    + "								 JOIN KichCo kc ON ctsp.IdKC = kc.Id\n"							
                    + "		WHERE hd.Ma = ?;";
            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, MaHD);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                GioHang ghdto = new GioHang();
                ghdto.setMa(rs.getString(1));
                ghdto.setTen(rs.getString(2));
                ghdto.setSoLuong(rs.getInt(3));
                ghdto.setDonGia(rs.getDouble(4));
                ghdto.setMauSac(rs.getString(5));
                ghdto.setChatLieu(rs.getString(6));
                ghdto.setKichThuoc(rs.getString(7));
      
                getList.add(ghdto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getList;
        
    }

    @Override
    public List<HoaDon> getKhachHang(String MaHD) {
     List<HoaDon> getList = new ArrayList<>();
        try {
            String sql = "SELECT kh.Ho , kh.TenDem , kh.Ten , kh.sdt FROM HoaDon hd join KhachHang kh on hd.idKH = kh.id where hd.Ma =?";

            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, MaHD);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {

                KhachHang2 kh = new KhachHang2();
                kh.setTen(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
                kh.setSdt(rs.getString(4));

                HoaDon hd = new HoaDon();
                hd.setKhachHang(kh);

                getList.add(hd);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getList;    
    }

    @Override
   public Integer updateHoaDonKhachHang(int Ma, String MaHD) {
  int rs = 0;
        try {
            String sql = "UPDATE HoaDon SET idKH = ? WHERE Ma = ?";
            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, Ma);
            pr.setString(2, MaHD);

            rs = pr.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return rs;        
    }

    @Override
    public Integer getIdHD(String MaHD) {
    Integer idHD = 0;
        try {
            String sql = "select id from HoaDon where Ma = ?";
            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1, MaHD);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                idHD = rs.getInt(1);
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return idHD;   
    }

    @Override
    public HoaDonChiTiet getHdctOne(int idHd, int idSp) {
 HoaDonChiTiet getList = new HoaDonChiTiet();
        try {
            String sql = "SELECT * FROM HoaDonChiTiet WHERE IdHD = ? AND IdCTSP = ?";

            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, idHd);
            pr.setInt(2, idSp);
            ResultSet rs = pr.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getList;        
    }

    @Override
    public Integer updateSOLUONGTrenGioHang(int idHD, int idSP, int SoLuong, Double dongia) {
 int rs = 0;
        try {
            String sql = "UPDATE HoaDonChiTiet set Soluong=?,Dongia=?,Dongiakhigiam=0 Where IdHD=? AND IdCTSP=?";
            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, SoLuong);
            pr.setDouble(2, dongia);
            pr.setInt(3, idHD);
            pr.setInt(4, idSP);
            rs = pr.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return rs;      
    }

    @Override
    public Integer insertHoaDonChiTiet(HoaDonChiTiet hdct) {
    int result = 0;
        try {
            String sql = "insert into HoaDonChiTiet (IdHD ,idCTSP, Soluong , Dongia, Dongiakhigiam ) values(? , ? ,? ,?, 0)";
            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(2, hdct.getSanPham().getID());
            pr.setInt(1, hdct.getHoaDon().getId());
            pr.setInt(3, hdct.getSoluong());
            pr.setDouble(4, hdct.getDonGia());

            result = pr.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return result;   
    }

    @Override
    public Integer deleteSanPham(int idHD, int idSP) {
       int rs = 0;
        try {
            String sql = "DELETE FROM HoaDonChiTiet WHERE IdHD = ? AND IdCTSP = ?";
            Connection conn = DBcontext.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setInt(1, idHD);
            pr.setInt(2, idSP);
            rs = pr.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return rs;
    }
    
}
