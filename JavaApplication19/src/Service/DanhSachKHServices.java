/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.KhachHang;
import Repository.KhachHangRepository;
import Repositorys.ImplKhachHangRepository;
import Services.ImplDSKHService;
import entity.DanhSachKHViewModel;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public class DanhSachKHServices implements ImplDSKHService{
private ImplKhachHangRepository dskh = new KhachHangRepository();
    @Override
    public List<DanhSachKHViewModel> getAllDS() {
        return dskh.getallLS();
          }

    @Override
    public String Update(int id, KhachHang kh) {
  
  boolean updatehoadon = dskh.UPDATE(id, kh);
        if (updatehoadon) {
            return "Sửa thành công id = " + id;
        }
        return "Sửa thất bại";  
    }
}
