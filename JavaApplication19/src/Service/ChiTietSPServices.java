/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.ChiTietSP;
import Repository.ChiTietSPRepository;

import Repositorys.ImplChiTietSPRepository;
import Repositorys.ImplKhuyenmaiRepository;
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
}
