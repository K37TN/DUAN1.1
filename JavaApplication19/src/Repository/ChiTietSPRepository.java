/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Connection.DBcontext;
import Model.ChiTietSP;
import Model.KhuyenMai;
import Repositorys.ImplChiTietSPRepository;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FPTSHOP
 */
public class ChiTietSPRepository implements ImplChiTietSPRepository{
    final String SQL_UPDATE = "UPDATE dbo.ChitietSP SET Ma = ?, Ten = ?, IdNsx = ?, IdMauSac = ?, IdDMuc = ?, IdKC = ?, IdCL = ?, IdTH = ?, MoTa = ?, SoLuongTon = ?, GiaNhap = ?, GiaBan = ? WHERE Ma = ?";
     List<ChiTietSP> lstsp;

    public ChiTietSPRepository() {
        lstsp = new ArrayList<>();
    }


    @Override
    public List<ChiTietSP> getAll() {
        try {
            lstsp.removeAll(lstsp);
            String sql = "Select * from ChitietSP";
            Connection conn = DBcontext.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lstsp.add(new ChiTietSP(rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException ex) {
              System.out.println("SQLException: " + ex.getMessage());
        }
        return lstsp;
    }


}
