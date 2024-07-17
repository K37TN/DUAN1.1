/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FPTSHOP
 */
public class DBcontext {
   public static String USER = "sa";
    public static String PASS = "123456";
    public static String URL = "jdbc:sqlserver://localhost:1433;databaseName= Nhom7;encrypt=true;trustServerCertificate=true";

      private static String CONNECT_STRING;
    // Chạy và được gọi đầu tiên
    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            Logger.getLogger(DBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
   
  
    private static Connection conn;

    //1. Mở kết nối
    public static Connection openDbConnection() {
        try {
            return DriverManager.getConnection(CONNECT_STRING);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    //2. Thực thi truy vấn Thêm, Sửa , Xoá
    public static int ExcuteQuery(String sql, Object... args) {
        PreparedStatement pstm = getStmt(sql, args);
        try {
            try {
                return pstm.executeUpdate();
            } finally {
                pstm.close();
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi tại ExcuteDungna");
            ex.printStackTrace();
            return 0;
        }
    }

    //3. Trả lại 1 tập đối tượng
    public static ResultSet getDataFromQuery(String sql, Object... args) throws SQLException {
        PreparedStatement pstm = getStmt(sql, args);
        return pstm.executeQuery();
    }

    //4. Chuẩn bị câu truy vấn trước khi thực thi - Các varargs sử dụng dấu ba chấm (...) sau kiểu dữ liệu.
    public static PreparedStatement getStmt(String sql, Object... args) {
        try {
            conn = openDbConnection();
            PreparedStatement ps;
            //ps = conn.prepareCall(sql) Gọi store procedure
            ps = conn.prepareStatement(sql);//Dùng để triển khai các câu lệnh truy vấn thường
for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);//Cộng các value sau câu truy vấn
            }
            return ps;
        } catch (SQLException ex) {
            return null;
        }
    }



    public static void main(String[] args) {
        Connection con = getConnection();
        if (con != null) {
            System.out.println("Kết nối thành công");
        }else {
            System.out.println("Lỗi kết nối");
        }
    }
}
