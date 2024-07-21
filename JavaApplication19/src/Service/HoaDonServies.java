/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.HoaDon;
import Repository.HoaDonRepository;
import Repositorys.ImplHoaDon;
import Services.ImplHoaDonService;
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

    public HoaDonServies() {
         hoaDonRepostory = new HoaDonRepository();
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

}
