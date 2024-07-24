/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Model.User;
import Repository.NhanVienRepository;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FPTSHOP
 */
public class NhanVienView extends javax.swing.JFrame {

     ArrayList<User> nv;
    private DefaultTableModel dtm;
    NhanVienRepository nhanVienRepository = new NhanVienRepository();

// Định dạng ngày
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public NhanVienView() throws SQLException {
        initComponents();
         dtm = (DefaultTableModel) tbNhanVien.getModel();
        nv = nhanVienRepository.getAll();
        showDataTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RdoNu = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        txtTen = new javax.swing.JTextField();
        TxtTenDem = new javax.swing.JTextField();
        txtHo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rdoHoatDong = new javax.swing.JRadioButton();
        rdoDaNghi = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cbbIdCV = new javax.swing.JComboBox<>();
        txtSDT = new javax.swing.JTextField();
        txtTaikhoan = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnclean = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        rdoNam = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateNgaySinh = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RdoNu.setText("Nữ");

        jPanel3.setLayout(new java.awt.GridLayout(0, 1, 0, 10));
        jPanel3.add(txtTen);
        jPanel3.add(TxtTenDem);

        txtHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoActionPerformed(evt);
            }
        });
        jPanel3.add(txtHo);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 5, 10));

        jLabel7.setText("IdCV");
        jPanel2.add(jLabel7);

        jLabel8.setText("SDT");
        jPanel2.add(jLabel8);

        jLabel9.setText("Tài KHoản");
        jPanel2.add(jLabel9);

        jLabel10.setText("Mật Khậu ");
        jPanel2.add(jLabel10);

        jLabel11.setText("Email ");
        jPanel2.add(jLabel11);

        jLabel12.setText("Trang Thái ");
        jPanel2.add(jLabel12);

        rdoHoatDong.setText("Hoat Động ");

        rdoDaNghi.setText("Dã Nghỉ ");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSua.setText("sửa ");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jPanel4.setLayout(new java.awt.GridLayout(0, 1, 0, 10));

        cbbIdCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel4.add(cbbIdCV);
        jPanel4.add(txtSDT);
        jPanel4.add(txtTaikhoan);
        jPanel4.add(txtMatKhau);
        jPanel4.add(txtEmail);

        btnclean.setText("clean");
        btnclean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncleanActionPerformed(evt);
            }
        });

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ Và Tên ", "Ngày Sinh", "Giới Tính ", "Sdt", "IdCV", "Tài khoản ", "Mat Khẩu ", "Email", "Trang Thai"
            }
        ));
        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanVien);

        rdoNam.setText("Nam");

        jPanel1.setLayout(new java.awt.GridLayout(0, 1, 5, 10));

        jLabel3.setText("Tên ");
        jPanel1.add(jLabel3);

        jLabel1.setText("Tên Đệm");
        jPanel1.add(jLabel1);

        jLabel2.setText("Họ");
        jPanel1.add(jLabel2);

        jLabel4.setText("Ngày Sinh ");
        jPanel1.add(jLabel4);

        jLabel6.setText("Giới Tính ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(dateNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNam)
                                .addGap(41, 41, 41)
                                .addComponent(RdoNu)))
                        .addGap(49, 49, 49)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoHoatDong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdoDaNghi))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(btnAdd)
                        .addGap(28, 28, 28)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnclean)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoHoatDong)
                            .addComponent(rdoDaNghi)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dateNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(rdoNam)
                                    .addComponent(RdoNu))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSua)
                    .addComponent(btnclean))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (Validation()) {
            Add();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        //   JOptionPane.showInternalConfirmDialog(rootPane, evt);
        if (Validation()) {
            update();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btncleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncleanActionPerformed
        clean();
    }//GEN-LAST:event_btncleanActionPerformed

    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
        int index = tbNhanVien.getSelectedRow();
        this.ToConTro(index);
    }//GEN-LAST:event_tbNhanVienMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NhanVienView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RdoNu;
    private javax.swing.JTextField TxtTenDem;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnclean;
    private javax.swing.JComboBox<String> cbbIdCV;
    private com.toedter.calendar.JDateChooser dateNgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoDaNghi;
    private javax.swing.JRadioButton rdoHoatDong;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTaikhoan;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
private void showDataTable() {
        dtm.setRowCount(0);
        for (User nv : nv) {
            Object[] row = {
                nv.getId(),
                nv.getHoVaTen(),
                nv.getNgaySinh(),
                nv.getGioiTinh(),
                nv.getSdt(),
                nv.getIdCV(),
                nv.getTaiKhoan(),
                nv.getMatKhau(),
                nv.getEmail(),
                nv.GetTrangThai()};
            dtm.addRow(row);
        }

    }

    private void ToConTro(int index) {

        // Giả sử index là chỉ số bạn muốn truy cập
        // An toàn để sử dụng nv
        User nvm = nv.get(index);
        txtTen.setText(nvm.getTen());
        TxtTenDem.setText(nvm.getTenDem());
        txtHo.setText(nvm.getHo());
        txtSDT.setText(nvm.getSdt());
        txtTaikhoan.setText(nvm.getTaiKhoan());
        txtMatKhau.setText(nvm.getMatKhau());
        txtEmail.setText(nvm.getEmail());
        if (nvm.getNgaySinh() != null) {
            dateNgaySinh.setDate(nvm.getNgaySinh());
        } else {
            dateNgaySinh.setDate(null); // Đặt ngày là null nếu không có giá trị
        }
        Object idCV = nvm.getIdCV();
        if (idCV != null) {
            cbbIdCV.setSelectedItem(idCV.toString());
        } else {
            cbbIdCV.setSelectedIndex(-1); // Nếu không có giá trị hợp lệ, đặt lựa chọn thành không
        }
        rdoNam.setSelected(nvm.isGioiTinh());
        RdoNu.setSelected(!nvm.isGioiTinh());
        rdoHoatDong.setSelected(nvm.isTrangThai());
        rdoDaNghi.setSelected(!nvm.isTrangThai());
        nv.add(nvm);
    }

    private boolean Validation() {
        String ten = txtTen.getText();
        String tenDem = TxtTenDem.getText();
        String ho = txtHo.getText();
        String ngaySinhStr = dateNgaySinh.getDateFormatString(); // Lỗi ở đây, không nên lấy định dạng chuỗi của ngày mà nên lấy giá trị ngày
        String sdt = txtSDT.getText();
        String taiKhoan = txtTaikhoan.getText();
        String matKhau = txtMatKhau.getText();
        String email = txtEmail.getText();
        boolean gioiTinh = rdoNam.isSelected();
        boolean trangThai = rdoHoatDong.isSelected();
        String idCVStr = cbbIdCV.getSelectedItem().toString();

        // Kiểm tra các trường không được để trống
        if (ten.isEmpty() || tenDem.isEmpty() || ho.isEmpty() || sdt.isEmpty() || taiKhoan.isEmpty() || matKhau.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống bất kỳ trường nào.");
            return false;
        }

        // Kiểm tra ID và IdCV và sdt phải là số
        int idCV;
        try {
            idCV = Integer.parseInt(idCVStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "IdCV phải là số.");
            return false;
        }

        try {
            Integer.parseInt(sdt); // Kiểm tra số điện thoại
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số điện thoại phải là số.");
            return false;
        }

        // Kiểm tra số điện thoại
        if (sdt.matches("^0\\d{10}$")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại phải bắt đầu bằng 0 và có 10 số.");
            return false;
        }

        // Kiểm tra định dạng email
        if (!email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(this, "Email sai định dạng.");
            return false;
        }

        // Kiểm tra ngày sinh
        LocalDate currentDate = getCurrentLocalDateWithoutTime();
        Date birthDate = dateNgaySinh.getDate();

        if (birthDate == null) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không được để trống.");
            return false;
        }

        LocalDate birthLocalDate = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        if (birthLocalDate.isAfter(currentDate)) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không thể là sau ngày hiện tại.");
            dateNgaySinh.setDate(null);
            return false;
        }
        return true;
    }

    private void Add() {
        User nv = new User();

        try {
            nv.setIdCV(Integer.parseInt(cbbIdCV.getSelectedItem().toString()));
            nv.setTrangThai(rdoHoatDong.isSelected());

            nv.setTen(txtTen.getText());
            nv.setTenDem(TxtTenDem.getText());
            nv.setHo(txtHo.getText());
            nv.setSdt(txtSDT.getText());
            nv.setTaiKhoan(txtTaikhoan.getText());
            nv.setMatKhau(txtMatKhau.getText());
            nv.setEmail(txtEmail.getText());

            Date ngaySinh = dateNgaySinh.getDate();
            if (ngaySinh != null) {
                nv.setNgaySinh(ngaySinh);
            } else {
                JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ.");
                return;
            }

            nv.setGioiTinh(rdoNam.isSelected());

            nhanVienRepository.addUser(nv);
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            this.nv = nhanVienRepository.getAll();
            showDataTable();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Có lỗi khi thêm dữ liệu.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi cơ sở dữ liệu.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private LocalDate getCurrentLocalDateWithoutTime() {
        LocalDateTime now = LocalDateTime.now();
        return now.toLocalDate();
    }

    private void update() {
        int index = tbNhanVien.getSelectedRow();
        User nvus = nv.get(index);

        nvus.setTen(txtTen.getText());
        nvus.setTenDem(TxtTenDem.getText());
        nvus.setHo(txtHo.getText());
        nvus.setSdt(txtSDT.getText());
        nvus.setTaiKhoan(txtTaikhoan.getText());
        nvus.setMatKhau(txtMatKhau.getText());
        nvus.setEmail(txtEmail.getText());
        nvus.setGioiTinh(rdoNam.isSelected());

        Date ngaySinh = dateNgaySinh.getDate();
        if (ngaySinh != null) {
            nvus.setNgaySinh(new java.sql.Date(ngaySinh.getTime())); // Đảm bảo ngày sinh là java.sql.Date
        }

        nvus.setTrangThai(rdoHoatDong.isSelected()); // Giả sử TrangThai là int (0 hoặc 1)

        // Kiểm tra và cập nhật IdCV
        if (cbbIdCV.getSelectedItem() != null) {
            nvus.setIdCV(Integer.parseInt(cbbIdCV.getSelectedItem().toString())); // Đảm bảo IdCV là int
        }

        try {
            nhanVienRepository.update(nvus);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
            this.nv = nhanVienRepository.getAll();
            showDataTable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi cơ sở dữ liệu.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clean() {
        txtTen.setText("");
        TxtTenDem.setText("");
        txtHo.setText("");
        txtEmail.setText("");
        txtMatKhau.setText("");
        txtTaikhoan.setText("");
        txtSDT.setText("");
        dateNgaySinh.setDate(null);
        cbbIdCV.setSelectedIndex(0);
        rdoNam.setSelected(true);
        rdoHoatDong.setSelected(true);
    }

}
