/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author FPTSHOP
 */
public class HoaDonChiTiet {
       private int Soluong;
    private Double DonGia;
    private Double DonKhiGiam;
    private HoaDon hoaDon;
    private sanPham sanPham; 

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int Soluong, Double DonGia, Double DonKhiGiam, HoaDon hoaDon, sanPham sanPham) {
        this.Soluong = Soluong;
        this.DonGia = DonGia;
        this.DonKhiGiam = DonKhiGiam;
        this.hoaDon = hoaDon;
        this.sanPham = sanPham;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    public Double getDonKhiGiam() {
        return DonKhiGiam;
    }

    public void setDonKhiGiam(Double DonKhiGiam) {
        this.DonKhiGiam = DonKhiGiam;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public sanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(sanPham sanPham) {
        this.sanPham = sanPham;
    }
    
}
