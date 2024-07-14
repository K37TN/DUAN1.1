/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorys;

import Model.Khuyenmai;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public interface ImplKhuyenmaiRepository {
    public List<Khuyenmai> getAll();
    
    public Integer add(Khuyenmai km);
    
    public boolean update(Khuyenmai km,String id);
    
    public boolean delete(String id);
    public String checktrung(String ten);   
    public boolean UpdateTT();

    public boolean UpdateTT2();

}
