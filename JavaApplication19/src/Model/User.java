/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author FPTSHOP
 */
public class User {
        private int Id;
    private String ten;
    private String tenDem;
    private String ho;
    private java.util.Date ngaySinh;
    private boolean gioiTinh;
    private String Sdt;
    private int IdCV;
    private String taiKhoan;
    private String matKhau;
    private String Email;
    private boolean TrangThai;

    public User() {
    }

    public User(int Id, String ten, String tenDem, String ho, java.util.Date ngaySinh, boolean gioiTinh, String Sdt, int IdCV, String taiKhoan, String matKhau, String Email, boolean TrangThai) {
        this.Id = Id;
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.Sdt = Sdt;
        this.IdCV = IdCV;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.Email = Email;
        this.TrangThai = TrangThai;
    }
     

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public java.util.Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(java.util.Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public int getIdCV() {
        return IdCV;
    }

    public void setIdCV(int IdCV) {
        this.IdCV = IdCV;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }
    public boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
    public String getHoVaTen(){
    return ho +" "+tenDem+""+ten;
    }
    public String getGioiTinh(){
    return  isGioiTinh() ? "Nam":" Nữ";
    }
    public String GetTrangThai(){
    return isTrangThai() ? "HD":"Nghỉ"; 
            }

    @Override
    public String toString() {
        return "Users{" + "Id=" + Id + ", ten=" + ten + ", tenDem=" + tenDem + ", ho=" + ho + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", Sdt=" + Sdt + ", IdCV=" + IdCV + ", taiKhoan=" + taiKhoan + ", matKhau=" + matKhau + ", Email=" + Email + ", TrangThai=" + TrangThai + '}';
    }



}
