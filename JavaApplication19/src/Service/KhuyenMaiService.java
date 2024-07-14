/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Khuyenmai;
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
        List<Khuyenmai> lst = repository.getAll();
        listKM = new ArrayList<>();
        for (Khuyenmai x : lst) {
            listKM.add(new KhuyenmaiViewmodel(x.getTenKM(), x.getHinhThucKM(), x.getNgayBatDau(), x.getNgayKetThuc(), x.getGiaTriGiam(), x.getTrangthai()));
        }
        return listKM;
    }

    @Override
    public List<Khuyenmai> GetALL() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer add(KhuyenmaiViewmodel km) {
     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
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
    public List<Khuyenmai> getlist() {
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
