/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorys;

import Model.KhachHang;
import entity.DanhSachKHViewModel;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public interface ImplKhachHangRepository {
    List<DanhSachKHViewModel> getallLS();
}
