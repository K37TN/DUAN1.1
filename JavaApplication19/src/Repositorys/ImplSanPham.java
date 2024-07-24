/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorys;

import Model.ChatLieu;
import Model.ComboSanPham;
import Model.Hang;
import Model.KichThuoc;
import Model.MauSac;
import Model.sanPham;
import java.util.List;

/**
 *
 * @author FPTSHOP
 */
public interface ImplSanPham {
      public List<sanPham> getAll();
       public List<MauSac> getMausac();
        public List<Hang> getHang();
         public List<ChatLieu> getChatLieu();
         public List<KichThuoc> getKichThuoc();
             public Integer add(ComboSanPham p);
             public Integer delete(Integer id);
    public boolean UPDATE(int id,ComboSanPham p);
    public List<sanPham> getHetHang();
    public List<sanPham> getConHang();
    public List<sanPham> search(String ma, String ten);
   
}
