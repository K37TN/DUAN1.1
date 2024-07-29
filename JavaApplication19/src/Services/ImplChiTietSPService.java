/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.sanPham;
import entity.ChiTietSPViewModel;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public interface ImplChiTietSPService {
     public List<ChiTietSPViewModel> GetAll();
     boolean updateSoLuongSP(String Masp, int SoLuong ) ;
      public List<sanPham> getList();
      public Integer getIdSanPham(String MaSP);
}
