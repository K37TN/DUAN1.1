/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorys;

import Model.GioHang;
import Model.HoaDon;
import Model.HoaDonChiTiet;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public interface ImplHoaDon {
    public List<HoaDon> getListHD(int TrangThai);
     Integer insertHoaDon(HoaDon hd);
     public List<GioHang> getListHoaDonChiTietByMaHd(String MaHD);
     public List<HoaDon> getKhachHang(String MaHD); 
    public Integer updateHoaDonKhachHang(int Ma, String MaHD);
public Integer getIdHD(String MaHD);
 public HoaDonChiTiet getHdctOne(int idHd, int idSp);
public Integer updateSOLUONGTrenGioHang(int idHD, int idSP, int SoLuong, Double dongia);
public Integer insertHoaDonChiTiet(HoaDonChiTiet hdct);
public Integer deleteSanPham(int idHD, int idSP);
public Integer updateTrangThaiHoaDon(HoaDon hd);
public List<HoaDon> GetAllHD();
public Integer deleteHoaDon(String maHoaDon);
}
