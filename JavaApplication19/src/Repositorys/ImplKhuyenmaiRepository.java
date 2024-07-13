/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorys;

import Model.KhuyenMai;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public interface ImplKhuyenmaiRepository {
    public List<KhuyenMai> getAll();
    
    public boolean add(KhuyenMai km);
    
    public boolean update(KhuyenMai km,String id);
    
    public boolean delete(String id);
    public String checktrung(String ten);   
    public boolean UpdateTT();

    public boolean UpdateTT2();
}
