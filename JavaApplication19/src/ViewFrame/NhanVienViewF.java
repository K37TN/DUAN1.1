/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ViewFrame;

import Model.User;
import Repository.NhanVienRepository;
import Views.NhanVienView;
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
public class NhanVienViewF extends javax.swing.JPanel {
    ArrayList<User> nv;
    private DefaultTableModel dtm;
    NhanVienRepository nhanVienRepository = new NhanVienRepository();

// Định dạng ngày
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public NhanVienViewF() throws SQLException {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnSua = new javax.swing.JButton();
        rdoNam = new javax.swing.JRadioButton();
        dateNgaySinh = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        txtSDT = new javax.swing.JTextField();
        txtTaikhoan = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RdoNu = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        txtTen = new javax.swing.JTextField();
        TxtTenDem = new javax.swing.JTextField();
        txtHo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rdoHoatDong = new javax.swing.JRadioButton();
        btnclean = new javax.swing.JButton();
        rdoDaNghi = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTimkiem = new javax.swing.JTextField();
        tbnTimKiem = new javax.swing.JButton();
        cbbIdCV = new javax.swing.JComboBox<>();

        btnSua.setText("sửa ");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        jPanel4.setLayout(new java.awt.GridLayout(0, 1, 0, 10));
        jPanel4.add(txtSDT);
        jPanel4.add(txtTaikhoan);
        jPanel4.add(txtMatKhau);
        jPanel4.add(txtEmail);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1, 5, 10));

        jLabel3.setText("Tên ");
        jPanel1.add(jLabel3);

        jLabel1.setText("Tên Đệm");
        jPanel1.add(jLabel1);

        jLabel2.setText("Họ");
        jPanel1.add(jLabel2);

        jLabel4.setText("Ngày Sinh ");
        jPanel1.add(jLabel4);

        buttonGroup1.add(RdoNu);
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

        jLabel6.setText("Giới Tính ");

        rdoHoatDong.setText("Hoat Động ");

        btnclean.setText("clean");
        btnclean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncleanActionPerformed(evt);
            }
        });

        rdoDaNghi.setText("Đã Nghỉ");

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

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 5, 10));

        jLabel7.setText("Chức vụ");
        jPanel2.add(jLabel7);

        jLabel8.setText("SDT");
        jPanel2.add(jLabel8);

        jLabel9.setText("Tài KHoản");
        jPanel2.add(jLabel9);

        jLabel10.setText("Mật Khậu ");
        jPanel2.add(jLabel10);

        jLabel11.setText("Email ");
        jPanel2.add(jLabel11);

        jLabel12.setText("Trạng Thái");

        txtTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimkiemActionPerformed(evt);
            }
        });
        txtTimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimkiemKeyReleased(evt);
            }
        });

        tbnTimKiem.setText("Tìm  kiếm ");

        cbbIdCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý cửa hàng giày", "Nhân viên bán hàng giày" }));
        cbbIdCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbIdCVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
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
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbbIdCV, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdd))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoHoatDong)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rdoDaNghi)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSua)
                                    .addComponent(btnclean))))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tbnTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
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
                                .addComponent(RdoNu)))
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbIdCV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnclean)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoHoatDong)
                        .addComponent(rdoDaNghi))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbnTimKiem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
   int index = tbNhanVien.getSelectedRow();
        this.ToConTro(index);
    }//GEN-LAST:event_tbNhanVienMouseClicked

    private void txtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemActionPerformed
       dtm = (DefaultTableModel) tbNhanVien.getModel();
        dtm.setRowCount(0);

        String searchText = txtTimkiem.getText().toLowerCase();
        for (User us : nv) {
            
        
 
            if (us.getTaiKhoan().toLowerCase().contains(searchText) ||
                us.getHo().toLowerCase().contains(searchText) ||
                us.getTenDem().toLowerCase().contains(searchText) ||
                us.getTen().toLowerCase().contains(searchText) ||
                us.getSdt().contains(searchText) ||
                us.getEmail().toLowerCase().contains(searchText)) {

                Object[] rowData = new Object[10];
                rowData[0] = us.getId();
                rowData[1] = us.getHo() + " " + us.getTenDem() + " " + us.getTen();
                rowData[2] = us.getNgaySinh();
                rowData[3] = us.isGioiTinh() ? "Nam" : "Nữ";
                rowData[4] = us.getSdt();
                rowData[5] = us.getIdCV();
                rowData[6] = us.getTaiKhoan();
                rowData[7] = us.getMatKhau();
                rowData[8] = us.getEmail();
                rowData[9] = us.GetTrangThai();

                dtm.addRow(rowData);
            }
        } 
    }//GEN-LAST:event_txtTimkiemActionPerformed

    private void txtHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
       //   JOptionPane.showInternalConfirmDialog(rootPane, evt);
        if (Validation()) {
            try {
                update();
                showDataTable();
            } catch (SQLException ex) {
                Logger.getLogger(NhanVienView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
          if (Validation()) {
            Add();
            showDataTable();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btncleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncleanActionPerformed
        clean();
    }//GEN-LAST:event_btncleanActionPerformed

    private void cbbIdCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbIdCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbIdCVActionPerformed

    private void txtTimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimkiemKeyReleased
     dtm = (DefaultTableModel) tbNhanVien.getModel();
        dtm.setRowCount(0);

        String searchText = txtTimkiem.getText().toLowerCase();
        for (User us : nv) {
            
        
 
            if (us.getTaiKhoan().toLowerCase().contains(searchText) ||
                us.getHo().toLowerCase().contains(searchText) ||
                us.getTenDem().toLowerCase().contains(searchText) ||
                us.getTen().toLowerCase().contains(searchText) ||
                us.getSdt().contains(searchText) ||
                us.getEmail().toLowerCase().contains(searchText)) {

                Object[] rowData = new Object[10];
                rowData[0] = us.getId();
                rowData[1] = us.getHo() + " " + us.getTenDem() + " " + us.getTen();
                rowData[2] = us.getNgaySinh();
                rowData[3] = us.isGioiTinh() ? "Nam" : "Nữ";
                rowData[4] = us.getSdt();
                rowData[5] = us.getIdCV() == 1 ? "Quản lý cửa hàng giày" : us.getIdCV() == 2 ? "Nhân viên bán hàng giày" : "Khác";
                rowData[6] = us.getTaiKhoan();
                rowData[7] = us.getMatKhau();
                rowData[8] = us.getEmail();
                rowData[9] = us.GetTrangThai();

                dtm.addRow(rowData);
            }
        } 
    }//GEN-LAST:event_txtTimkiemKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RdoNu;
    private javax.swing.JTextField TxtTenDem;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnclean;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JButton tbnTimKiem;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTaikhoan;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
private void showDataTable() {
    if (dtm == null) {
        System.out.println("DefaultTableModel (dtm) là null.");
        return;
    }

    dtm.setRowCount(0); // Xóa tất cả các hàng hiện tại

    if (nv == null) {
        System.out.println("Danh sách 'nv' là null.");
        return;
    }
    if (nv.isEmpty()) {
        System.out.println("Danh sách 'nv' không có dữ liệu.");
        return;
    }

    for (User nv : nv) {
        if (nv == null) {
            System.out.println("Đối tượng User là null.");
            continue;
        }
        String chucVuName;
        try {
            int idCV = nv.getIdCV();
            chucVuName = nhanVienRepository.getChucVuNameById(idCV);
            if (chucVuName == null) {
                chucVuName = "Không tìm thấy";
            }
        } catch (SQLException e) {
            chucVuName = "Không tìm thấy";
            e.printStackTrace();
        }

        Object[] row = {
            nv.getId(),
            nv.getHoVaTen(),
            nv.getNgaySinh(),
            nv.getGioiTinh() ,
            nv.getSdt(),
            chucVuName,
            nv.getTaiKhoan(),
            nv.getMatKhau(),
            nv.getEmail(),
            nv.getTrangThai() ? "Đang làm" : "Đã nghỉ"
        };

        dtm.addRow(row);
    }
}


    private void ToConTro(int index) {
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
        dateNgaySinh.setDate(null); // Đặt về null nếu không có giá trị
    }

    int idCV = nvm.getIdCV(); // Lấy idCV

    try {
        // Lấy tên chức vụ theo idCV
        String chucVuName = nhanVienRepository.getChucVuNameById(idCV);

        // Đặt combo box về tên chức vụ
        cbbIdCV.setSelectedItem(chucVuName);
    } catch (SQLException x) {
        // Xử lý lỗi nếu không tìm thấy tên chức vụ
        cbbIdCV.setSelectedIndex(-1); // Bỏ chọn mục nào đó
    }

    rdoNam.setSelected(nvm.isGioiTinh());
    RdoNu.setSelected(!nvm.isGioiTinh());
    rdoHoatDong.setSelected(nvm.isTrangThai());
    rdoDaNghi.setSelected(!nvm.isTrangThai());
}


 private boolean Validation() {
    String ten = txtTen.getText();
    String tenDem = TxtTenDem.getText();
    String ho = txtHo.getText();
    String sdt = txtSDT.getText();
    String taiKhoan = txtTaikhoan.getText();
    String matKhau = txtMatKhau.getText();
    String email = txtEmail.getText();
    boolean gioiTinh = rdoNam.isSelected();
    boolean trangThai = rdoHoatDong.isSelected();

    // Kiểm tra các trường không được để trống
    if (ten.isEmpty() || tenDem.isEmpty() || ho.isEmpty() || sdt.isEmpty() || taiKhoan.isEmpty() || matKhau.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng không để trống bất kỳ trường nào.");
        return false;
    }

    // Kiểm tra số điện thoại
    if (sdt.matches("^0\\d{10}$")) {
        JOptionPane.showMessageDialog(this, "Số điện thoại phải bắt đầu bằng 0 và có 11 số.");
        return false;
    }

    // Kiểm tra định dạng email
    if (!email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$")) {
        JOptionPane.showMessageDialog(this, "Email sai định dạng.");
        return false;
    }

    // Kiểm tra ngày sinh
    LocalDate currentDate = LocalDate.now();
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
        // Giả sử cbbIdCV chứa tên chức vụ, hãy chuyển đổi tên chức vụ thành idCV
        String tenChucVu = cbbIdCV.getSelectedItem().toString();
        int idCV = nhanVienRepository.getIdCVByName(tenChucVu); // Lấy idCV từ tên chức vụ
        nv.setIdCV(idCV);
        
        nv.setTrangThai(rdoHoatDong.isSelected());
        nv.setTen(txtTen.getText());
        nv.setTenDem(TxtTenDem.getText());
        nv.setHo(txtHo.getText());
        nv.setSdt(txtSDT.getText());
        nv.setTaiKhoan(txtTaikhoan.getText());
        nv.setMatKhau(txtMatKhau.getText());
        nv.setEmail(txtEmail.getText());
        nv.setNgaySinh(dateNgaySinh.getDate());

        // Gọi phương thức để thêm nhân viên vào cơ sở dữ liệu
        nhanVienRepository.addUser(nv);
        
        JOptionPane.showMessageDialog(this, "Thêm thành công.");
       this.nv = nhanVienRepository.getAll();
        showDataTable(); // Cập nhật lại bảng dữ liệu
        clean(); // Xóa dữ liệu khỏi các trường nhập
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi thêm nhân viên: " + e.getMessage());
    }
}


    private LocalDate getCurrentLocalDateWithoutTime() {
        LocalDateTime now = LocalDateTime.now();
        return now.toLocalDate();
    }

  private void update() throws SQLException {
    User nv = new User();
    
    // Lấy thông tin từ bảng để cập nhật
    int selectedRow = tbNhanVien.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Chưa chọn nhân viên để sửa.");
        return;
    }
    
    int id = (int) tbNhanVien.getValueAt(selectedRow, 0);
    nv.setId(id); // Cập nhật ID nhân viên hiện tại
    
    String tenChucVu = cbbIdCV.getSelectedItem().toString();
    int idCV = nhanVienRepository.getIdCVByName(tenChucVu);
    nv.setIdCV(idCV);
    
    nv.setTrangThai(rdoHoatDong.isSelected());
    nv.setTen(txtTen.getText());
    nv.setTenDem(TxtTenDem.getText());
    nv.setHo(txtHo.getText());
    nv.setSdt(txtSDT.getText());
    nv.setTaiKhoan(txtTaikhoan.getText());
    nv.setMatKhau(txtMatKhau.getText());
    nv.setEmail(txtEmail.getText());
    nv.setNgaySinh(dateNgaySinh.getDate());

    // Gọi phương thức để cập nhật thông tin nhân viên trong cơ sở dữ liệu
    nhanVienRepository.update(nv);
    
    JOptionPane.showMessageDialog(this, "Sửa thành công.");
     this.nv = nhanVienRepository.getAll();
    showDataTable(); // Cập nhật lại bảng dữ liệu
    clean(); // Xóa dữ liệu khỏi các trường nhập
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
