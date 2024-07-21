/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author FPTSHOP
 */
public class ComboSanPham {
        private int ID;
    private String ma;
    private String ten;
    private String moTa;
    private int soLuongTon;
    private BigDecimal giaBan;
private int chatLieu;
private int nsx;
private int kichCo;
   private int mauSac;
   private int thuongHieu;

    public ComboSanPham() {
    }

    public ComboSanPham(int ID, String ma, String ten, String moTa, int soLuongTon, BigDecimal giaBan, int chatLieu, int nsx, int kichCo, int mauSac, int thuongHieu) {
        this.ID = ID;
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaBan = giaBan;
        this.chatLieu = chatLieu;
        this.nsx = nsx;
        this.kichCo = kichCo;
        this.mauSac = mauSac;
        this.thuongHieu = thuongHieu;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public int getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(int chatLieu) {
        this.chatLieu = chatLieu;
    }

    public int getNsx() {
        return nsx;
    }

    public void setNsx(int nsx) {
        this.nsx = nsx;
    }

    public int getKichCo() {
        return kichCo;
    }

    public void setKichCo(int kichCo) {
        this.kichCo = kichCo;
    }

    public int getMauSac() {
        return mauSac;
    }

    public void setMauSac(int mauSac) {
        this.mauSac = mauSac;
    }

    public int getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(int thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    @Override
    public String toString() {
        return "ComboIteam{" + "ID=" + ID + ", ma=" + ma + ", ten=" + ten + ", moTa=" + moTa + ", soLuongTon=" + soLuongTon + ", giaBan=" + giaBan + ", chatLieu=" + chatLieu + ", nsx=" + nsx + ", kichCo=" + kichCo + ", mauSac=" + mauSac + ", thuongHieu=" + thuongHieu + '}';
    }
   
}
