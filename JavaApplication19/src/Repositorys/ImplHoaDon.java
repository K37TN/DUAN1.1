/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorys;

import Model.GioHang;
import Model.HoaDon;
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
}
