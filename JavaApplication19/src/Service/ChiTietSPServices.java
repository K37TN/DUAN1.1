/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.ChiTietSP;
import Model.sanPham;
import Repository.ChiTietSPRepository;
import Repository.SanPhamRepository;

import Repositorys.ImplChiTietSPRepository;
import Repositorys.ImplKhuyenmaiRepository;
import Repositorys.ImplSanPham;
import Services.ImplChiTietSPService;
import entity.ChiTietSPViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public class ChiTietSPServices implements ImplChiTietSPService{
    private ImplChiTietSPRepository chiTietSPRepository = new ChiTietSPRepository();
    private ImplSanPham SanPhamRepository = new SanPhamRepository();
    @Override
    public List<ChiTietSPViewModel> GetAll() {
 List<ChiTietSP> list = chiTietSPRepository.getAll();
        List<ChiTietSPViewModel> lst = new ArrayList<>();
        for (ChiTietSP x : list) {
            lst.add(new ChiTietSPViewModel(
                    x.getMa(),
                    x.getTen()
                    ));       
    }
    return lst;
    }

    @Override
    public boolean updateSoLuongSP(String Masp, int SoLuong) {
       return SanPhamRepository.updateSoLuongSP(Masp, SoLuong);
    }

    @Override
    public List<sanPham> getList() {
    return SanPhamRepository.getAll();
    }

    @Override
    public Integer getIdSanPham(String MaSP) {
    return SanPhamRepository.getIdSanPham(MaSP);
    }
}
