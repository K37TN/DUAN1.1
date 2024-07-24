/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author FPTSHOP
 */
public class TaiKhoan {
     private int id;
    private String tk;
    private String mk;

    public TaiKhoan() {
    }

    public TaiKhoan(int id, String tk, String mk) {
        this.id = id;
        this.tk = tk;
        this.mk = mk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }
}
