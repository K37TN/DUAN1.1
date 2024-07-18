/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author FPTSHOP
 */
public class KhachHang {
       private int id;
       private String ma;
    private String ten;
    private String tendem;
    private String ho;
    private int gioitinh;
    private Date ngaysinh;
    private String email;
    private String sdt;

    public KhachHang() {
    }

    public KhachHang(int id, String ma, String ten, String tendem, String ho, int gioitinh, Date ngaysinh, String email, String sdt) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tendem = tendem;
        this.ho = ho;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.email = email;
        this.sdt = sdt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTendem() {
        return tendem;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

   

  public Object[] toDataRow() {
        return new Object[]{id,ma,ho + " " + tendem + " " + ten, gioitinh == 0 ? "Nam" : "Nữ", ngaysinh, sdt, email};

    }
    
}
