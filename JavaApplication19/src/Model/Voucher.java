/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Voucher {
    private Integer id;
    private String mavc;
    private Integer soLuongGiam;
    private Integer dkGiam;
    private int trangThai;
    private Date ngaybd;
    private Date ngaykt;

    public Voucher() {
    }

    public Voucher(Integer id, String mavc, Integer soLuongGiam, Integer dkGiam, int trangThai, Date ngaybd, Date ngaykt) {
        this.id = id;
        this.mavc = mavc;
        this.soLuongGiam = soLuongGiam;
        this.dkGiam = dkGiam;
        this.trangThai = trangThai;
        this.ngaybd = ngaybd;
        this.ngaykt = ngaykt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMavc() {
        return mavc;
    }

    public void setMavc(String mavc) {
        this.mavc = mavc;
    }

    public Integer getSoLuongGiam() {
        return soLuongGiam;
    }

    public void setSoLuongGiam(Integer soLuongGiam) {
        this.soLuongGiam = soLuongGiam;
    }

    public Integer getDkGiam() {
        return dkGiam;
    }

    public void setDkGiam(Integer dkGiam) {
        this.dkGiam = dkGiam;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgaybd() {
        return ngaybd;
    }

    public void setNgaybd(Date ngaybd) {
        this.ngaybd = ngaybd;
    }

    public Date getNgaykt() {
        return ngaykt;
    }

    public void setNgaykt(Date ngaykt) {
        this.ngaykt = ngaykt;
    }

    @Override
    public String toString() {
        return "Voucher{" + "id=" + id + ", mavc=" + mavc + ", soLuongGiam=" + soLuongGiam + ", dkGiam=" + dkGiam + ", trangThai=" + trangThai + ", ngaybd=" + ngaybd + ", ngaykt=" + ngaykt + '}';
    }

    
}
