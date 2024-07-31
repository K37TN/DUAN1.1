/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import Model.KhachHang;
import Model.User;
import Views.KhachHang2;
import java.sql.Date;

/**
 *
 * @author FPTSHOP
 */
public class HoaDonViewModel {
    private KhachHang kh;
    private User us;
    private String Ma;
    private Date NgayTao;
    private Date NgayThanhToan;
    private int TinhTrang;
    private String GhiChu;
    private Double tongTien;  

    public HoaDonViewModel() {
    }

    public HoaDonViewModel(KhachHang kh, User us, String Ma, Date NgayTao, Date NgayThanhToan, int TinhTrang, String GhiChu, Double tongTien) {
        this.kh = kh;
        this.us = us;
        this.Ma = Ma;
        this.NgayTao = NgayTao;
        this.NgayThanhToan = NgayThanhToan;
        this.TinhTrang = TinhTrang;
        this.GhiChu = GhiChu;
        this.tongTien = tongTien;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public User getUs() {
        return us;
    }

    public void setUs(User us) {
        this.us = us;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }
}
