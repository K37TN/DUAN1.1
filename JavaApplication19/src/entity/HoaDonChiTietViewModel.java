/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import Model.HoaDon;
import Model.sanPham;

/**
 *
 * @author FPTSHOP
 */
public class HoaDonChiTietViewModel {
        private int Soluong;
    private Double DonGia;

    private HoaDon haDon;
    private sanPham sanPham;

    public HoaDonChiTietViewModel() {
    }

    public HoaDonChiTietViewModel(int Soluong, Double DonGia, HoaDon haDon, sanPham sanPham) {
        this.Soluong = Soluong;
        this.DonGia = DonGia;
        this.haDon = haDon;
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

    public HoaDon getHaDon() {
        return haDon;
    }

    public void setHaDon(HoaDon haDon) {
        this.haDon = haDon;
    }

    public sanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(sanPham sanPham) {
        this.sanPham = sanPham;
    }
     public double getThanhTien(){
        return DonGia*Soluong;
    }
    
}
