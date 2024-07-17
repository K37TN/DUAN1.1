/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author FPTSHOP
 */
public class sanPham {
    private int ID;
    private String ma;
    private String ten;
    private String moTa;
    private int soLuongTon;
    private double giaBan;
private String chatLieu;
private String nsx;
private String kichCo;
   private String mauSac;
   private String thuongHieu;

    public sanPham() {
    }

    public sanPham(int ID, String ma, String ten, String moTa, int soLuongTon, double giaBan, String chatLieu, String nsx, String kichCo, String mauSac, String thuongHieu) {
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

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public String getKichCo() {
        return kichCo;
    }

    public void setKichCo(String kichCo) {
        this.kichCo = kichCo;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    @Override
    public String toString() {
        return "sanPham{" + "ID=" + ID + ", ma=" + ma + ", ten=" + ten + ", moTa=" + moTa + ", soLuongTon=" + soLuongTon + ", giaBan=" + giaBan + ", chatLieu=" + chatLieu + ", nsx=" + nsx + ", kichCo=" + kichCo + ", mauSac=" + mauSac + ", thuongHieu=" + thuongHieu + '}';
    }
   
}
