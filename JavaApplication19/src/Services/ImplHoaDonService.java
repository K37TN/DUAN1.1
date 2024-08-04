/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.GioHang;
import Model.HoaDon;
import Model.HoaDonChiTiet;
import entity.HoaDonChiTietViewModel;
import entity.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public interface ImplHoaDonService {
  public List<HoaDonViewModel> getListHD(int TrangThai);  

    public Integer saveHD(HoaDonViewModel hoaDon);
     public List<GioHang> getListHoaDonChiTietByMaHd(String MaHD);
     public List<HoaDon> getKhachHang(String MaHD);

 public Integer updateHoaDonKhachHang(int Ma, String MaHD);
 public Integer getIdHD(String MaHD);
 public HoaDonChiTiet getHdctOne(int idHd, int idSp);
 public Integer updateSOLUONGTrenGioHang(int idHD, int idSP, int SoLuong, Double dongia);

  public Integer saveHDCT(HoaDonChiTietViewModel hoaDonChiTiet, String MaSP, String MaHD);
  
   public Integer deleteSanPham(int idHD, int idSP);
    Integer updateTrangThaiHoaDon(HoaDonViewModel hd);
  public Integer deleteHoaDon(String maHoaDon);
  Integer updateSoLuongGioHang(int SoLuong, String MaSP, String MaHD);
}
