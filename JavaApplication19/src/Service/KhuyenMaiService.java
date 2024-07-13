/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.KhuyenMai;
import Repository.KhuyenmaiRepository;
import Repositorys.ImplKhuyenmaiRepository;
import Services.ImplKhuyenmaiService;
import entity.KhuyenmaiViewmodel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public class KhuyenMaiService implements ImplKhuyenmaiService{
    private ImplKhuyenmaiRepository repository;
    public List<KhuyenmaiViewmodel> listKM;

    public KhuyenMaiService() {
        repository = new KhuyenmaiRepository();
    }

    @Override
    public List<KhuyenmaiViewmodel> getall() {
        List<KhuyenMai> lst = repository.getAll();
        listKM = new ArrayList<>();
        for (KhuyenMai x : lst) {
            listKM.add(new KhuyenmaiViewmodel(x.getTenKM(), x.getHinhThucKM(), x.getNgayBatDau(), x.getNgayKetThuc(), x.getGiaTriGiam(), x.getTrangthai()));
        }
        return listKM;
    }

    @Override
    public List<KhuyenMai> GetALL() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(KhuyenmaiViewmodel km) {
    boolean isadd = repository.add(new KhuyenMai(km.getTenKM(), km.getHinhThucKM(), km.getNgayBatDau(), km.getNgayKetThuc(), km.getGiaTriGiam(), km.getTrangthai()));
   return isadd;
    }

    @Override
    public boolean update(KhuyenmaiViewmodel km, String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<KhuyenMai> getlist() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String checktrung(String ten) {
    return repository.checktrung(ten);    
    }

    @Override
    public boolean updateTT() {
    boolean iscapnhat = repository.UpdateTT();
    return iscapnhat;
    }

    @Override
    public boolean updateTT2() {
    boolean iscapnhat = repository.UpdateTT2();
    return iscapnhat;    
    }
    
}
