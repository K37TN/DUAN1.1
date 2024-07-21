/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import entity.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public interface ImplHoaDonService {
  public List<HoaDonViewModel> getListHD(int TrangThai);  

    public Integer saveHD(HoaDonViewModel hoaDon);
}
