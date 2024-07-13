/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.KhuyenMai;
import entity.KhuyenmaiViewmodel;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public interface ImplKhuyenmaiService {
    public List<KhuyenmaiViewmodel> getall();
    public List<KhuyenMai> GetALL();
    
    public boolean add(KhuyenmaiViewmodel km);
    
    public boolean update(KhuyenmaiViewmodel km,String id);
    
    public boolean delete(String id);
    
    public List<KhuyenMai> getlist();
    public String checktrung(String ten);
}
