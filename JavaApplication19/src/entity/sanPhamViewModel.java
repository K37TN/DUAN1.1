/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import Model.ChatLieu;
import Model.MauSac;
import Views.KichCo;

/**
 *
 * @author FPTSHOP
 */
public class sanPhamViewModel {
      private String Ma;
   private String Ten;
   private MauSac mauSac;

   private KichCo kichCo;
   private ChatLieu chatLieu;
  
    private int SoLuongTon;
   private Double GiaBan;

    public sanPhamViewModel() {
    }

    public sanPhamViewModel(String Ma, String Ten, MauSac mauSac, KichCo kichCo, ChatLieu chatLieu, int SoLuongTon, Double GiaBan) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.mauSac = mauSac;
        this.kichCo = kichCo;
        this.chatLieu = chatLieu;
        this.SoLuongTon = SoLuongTon;
        this.GiaBan = GiaBan;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public MauSac getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSac mauSac) {
        this.mauSac = mauSac;
    }

    public KichCo getKichCo() {
        return kichCo;
    }

    public void setKichCo(KichCo kichCo) {
        this.kichCo = kichCo;
    }

    public ChatLieu getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(ChatLieu chatLieu) {
        this.chatLieu = chatLieu;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(int SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }

    public Double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(Double GiaBan) {
        this.GiaBan = GiaBan;
    }
    @Override
    public String toString() {
        return Ten;
    }
}
