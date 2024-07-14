/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Model.Khuyenmai;
import entity.KhuyenmaiViewmodel;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public interface ImplKhuyenmaiService {
    public List<KhuyenmaiViewmodel> getall();
    public List<Khuyenmai> GetALL();
    
    public Integer add(KhuyenmaiViewmodel km);
    
    public boolean update(KhuyenmaiViewmodel km,String id);
    
    public boolean delete(String id);
    
    public List<Khuyenmai> getlist();
    public String checktrung(String ten);
    
    public boolean updateTT();
    public boolean updateTT2();
}
