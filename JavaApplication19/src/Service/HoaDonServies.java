/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.GioHang;
import Model.HoaDon;
import Model.HoaDonChiTiet;
import Model.sanPham;
import Repository.HoaDonRepository;
import Repository.SanPhamRepository;
import Repositorys.ImplHoaDon;
import Repositorys.ImplSanPham;
import Services.ImplHoaDonService;
import entity.HoaDonChiTietViewModel;
import entity.HoaDonViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public class HoaDonServies implements ImplHoaDonService{
   private ImplHoaDon hoaDonRepostory;
   private List<HoaDonViewModel> getListHD;
   private ImplSanPham  sanphamRepository;

    public HoaDonServies() {
         hoaDonRepostory = new HoaDonRepository();
         
         sanphamRepository = new SanPhamRepository();
         getListHD = new ArrayList<>(); 
    }
   
    @Override
    public List<HoaDonViewModel> getListHD(int TrangThai) {
List<HoaDon> list = hoaDonRepostory.getListHD(TrangThai);
        for (HoaDon hoaDon : list) {
            HoaDonViewModel hd = new HoaDonViewModel();
            hd.setMa(hoaDon.getMa());
            hd.setNgayTao(hoaDon.getNgayTao());
            hd.setTinhTrang(hoaDon.getTinhTrang());
//            hd.setUs(hoaDon.getUser());
            getListHD.add(hd);
        }
        return getListHD;       
    }

    @Override
    public Integer saveHD(HoaDonViewModel hoaDon) {
      HoaDon hd = new HoaDon();
        hd.setMa(hoaDon.getMa());
        hd.setNgayTao(hoaDon.getNgayTao());
        hd.setTinhTrang(0);

        Integer isInsert = hoaDonRepostory.insertHoaDon(hd);
        return isInsert;    
    }

    @Override
    public List<GioHang> getListHoaDonChiTietByMaHd(String MaHD) {
     return hoaDonRepostory.getListHoaDonChiTietByMaHd(MaHD);   
    }

    @Override
    public List<HoaDon> getKhachHang(String MaHD) {
    return hoaDonRepostory.getKhachHang(MaHD);   
    }

    @Override
    public Integer updateHoaDonKhachHang(int Ma, String MaHD) {
        return hoaDonRepostory.updateHoaDonKhachHang(Ma, MaHD);
    }

    @Override
    public Integer getIdHD(String MaHD) {
return hoaDonRepostory.getIdHD(MaHD);
    }

    @Override
    public HoaDonChiTiet getHdctOne(int idHd, int idSp) {
         return hoaDonRepostory.getHdctOne(idHd, idSp);
    }

    @Override
    public Integer updateSOLUONGTrenGioHang(int idHD, int idSP, int SoLuong, Double dongia) {
 return hoaDonRepostory.updateSOLUONGTrenGioHang(idHD, idSP, SoLuong, dongia);       
    }

    @Override
    public Integer saveHDCT(HoaDonChiTietViewModel hoaDonChiTiet, String MaSP, String MaHD) {
       HoaDonChiTiet hdct = new HoaDonChiTiet();
        hdct.setSoluong(hoaDonChiTiet.getSoluong());
        hdct.setDonGia(hoaDonChiTiet.getDonGia());
        sanPham sp = new sanPham();
        Integer idSP = sanphamRepository.getIdSanPham(MaSP);
        sp.setID(idSP);
        hdct.setSanPham(sp);
        HoaDon hd = new HoaDon();
        Integer idHD = hoaDonRepostory.getIdHD(MaHD);
        System.out.println(idHD);
        hd.setId(idHD);
        hdct.setHoaDon(hd);
        Integer isHDCT = hoaDonRepostory.insertHoaDonChiTiet(hdct);
        return isHDCT;
    
    }

    @Override
    public Integer deleteSanPham(int idHD, int idSP) {
       
    return hoaDonRepostory.deleteSanPham(idHD, idSP);
    }

 
 
  

}
