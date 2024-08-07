/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Model.Khuyenmai;
import Model.Users2;
import Repository.KhuyenMai2Repository;
import Service.KhuyenMai2Service;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FPTSHOP
 */
public class KhuyenMai2 extends javax.swing.JFrame {
        ArrayList<Users2> km;
    private DefaultTableModel dtm;
    KhuyenMai2Repository khuyenMaiRepository= new KhuyenMai2Repository();
    // Định dạng ngày
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public KhuyenMai2() throws SQLException {
        initComponents();
     dtm = (DefaultTableModel) tblKM.getModel();
        km = khuyenMaiRepository.getAll();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKM = new javax.swing.JTable();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        cbbTrangThai = new javax.swing.JComboBox<>();
        rdPhanTram = new javax.swing.JRadioButton();
        rdVND = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        txtGiaTriGiam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dateKT = new com.toedter.calendar.JDateChooser();
        dateBD = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblKM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên KM", "Ngày BD", "Ngày KT", "Giá trị giảm", "Hình thức", "Trạng thái"
            }
        ));
        tblKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKM);

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        cbbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));

        rdPhanTram.setText("%");

        rdVND.setText("VND");

        jLabel6.setText("Hình thức giảm");

        jLabel7.setText("Trạng Thái");

        btnReset.setText("Làm mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnUpdate.setText("Cập Nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel5.setText("Giá Trị Giảm");

        jLabel4.setText("Ngày Kết Thúc");

        jLabel3.setText("Ngày Bắt Đầu");

        jLabel2.setText("Tên Khuyến Mại");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Khuyến Mại");

        dateKT.setDateFormatString("yyyy-MM-dd");

        dateBD.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateKT, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(rdVND)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rdPhanTram)
                                    .addGap(128, 128, 128))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addGap(152, 152, 152)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGiaTriGiam, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(cbbTrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(dateBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(txtTimKiem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnTimKiem))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(207, 207, 207)
                    .addComponent(jLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnUpdate)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dateKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGiaTriGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(btnReset)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addComponent(cbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rdPhanTram)
                                            .addComponent(rdVND)))))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(471, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKMMouseClicked
        // TODO add your handling code here:
        int index = tblKM.getSelectedRow();
        this.ToConTro(index);
    }//GEN-LAST:event_tblKMMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        search();
        // ViewKhuyenMai.java

        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        clean();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        Add();
    }//GEN-LAST:event_btnThemActionPerformed

     
     private void showDataTable() {
        dtm.setRowCount(0);
        for (Users2 km : km) {
            Object[] row = {
                km.getID(),
                km.getTenKM(),
                km.getNgayBatDau(),
                km.getNgayKetThuc(),
                km.getGiaTriGiam(),
                km.getHinhThucKM(),
                km.getTrangthai()};
                
            dtm.addRow(row);
        }

    }
     
     private void ToConTro(int index) {

        // Giả sử index là chỉ số bạn muốn truy cập
        // An toàn để sử dụng nv
        Users2 kvm = km.get(index);
        txtTen.setText(kvm.getTenKM());
 
        if (kvm.getNgayBatDau() != null) {
            dateBD.setDate(kvm.getNgayBatDau());
        } else {
            dateBD.setDate(null); // Đặt ngày là null nếu không có giá trị
        }
        
        if (kvm.getNgayKetThuc() != null) {
            dateKT.setDate(kvm.getNgayKetThuc());
        } else {
            dateKT.setDate(null); // Đặt ngày là null nếu không có giá trị
        }
        
        txtGiaTriGiam.setText(Double.toString(kvm.getGiaTriGiam()));
        
        
        String hinhThucKM = kvm.getHinhThucKM();
    if ("VND".equals(hinhThucKM)) {
        rdVND.setSelected(true);
        rdPhanTram.setSelected(false);
    } else if ("%".equals(hinhThucKM)) {
        rdVND.setSelected(false);
        rdPhanTram.setSelected(true);
    } else {
        rdVND.setSelected(false);
        rdPhanTram.setSelected(false);
    }
        
        Object trangThai = kvm.getTrangthai();
        if (trangThai != null) {
            cbbTrangThai.setSelectedItem(trangThai.toString());
        } else {
            cbbTrangThai.setSelectedIndex(-1); // Nếu không có giá trị hợp lệ, đặt lựa chọn thành không
        }
        
        km.add(kvm);
    }
     
     
     
     private void Add() {
    Users2 km = new Users2();

    try {
        // Kiểm tra tên khuyến mãi
        String tenKM = txtTen.getText().trim();
        if (tenKM.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên khuyến mãi không được để trống.");
            return;
        }
        km.setTenKM(tenKM);

        // Kiểm tra ngày bắt đầu
        Date ngayBD = dateBD.getDate();
        if (ngayBD == null) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu không hợp lệ.");
            return;
        }
        
        // Kiểm tra ngày kết thúc
        Date ngayKT = dateKT.getDate();
        if (ngayKT == null) {
            JOptionPane.showMessageDialog(this, "Ngày kết thúc không hợp lệ.");
            return;
        }
        
        // Kiểm tra ngày bắt đầu phải trước ngày kết thúc
        if (ngayBD.after(ngayKT)) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu phải trước ngày kết thúc.");
            return;
        }

        km.setNgayBatDau(ngayBD);
        km.setNgayKetThuc(ngayKT);

        // Kiểm tra hình thức khuyến mãi
        String hinhThucKM;
        if (rdVND.isSelected()) {
            hinhThucKM = "VND"; // Hoặc giá trị String nào bạn chọn để đại diện cho VND
        } else if (rdPhanTram.isSelected()) {
            hinhThucKM = "%"; // Hoặc giá trị String nào đó đại diện cho tỷ lệ phần trăm
        } else {
            JOptionPane.showMessageDialog(this, "Chọn hình thức khuyến mãi.");
            return;
        }
        km.setHinhThucKM(hinhThucKM);

        // Kiểm tra giá trị giảm
        String giaTriGiamStr = txtGiaTriGiam.getText().trim();
        if (giaTriGiamStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giá trị giảm không được để trống.");
            return;
        }

        Double giaTriGiam;
        try {
            giaTriGiam = Double.parseDouble(giaTriGiamStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá trị giảm không hợp lệ. Vui lòng nhập số hợp lệ.");
            return;
        }
        km.setGiaTriGiam(giaTriGiam);

        // Kiểm tra trạng thái
        if (cbbTrangThai.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Trạng thái không được để trống.");
            return;
        }
        km.setTrangthai(Integer.parseInt(cbbTrangThai.getSelectedItem().toString()));

        // Thực hiện thêm dữ liệu vào cơ sở dữ liệu
        khuyenMaiRepository.addKM(km);
        JOptionPane.showMessageDialog(this, "Thêm thành công!");
        this.km = khuyenMaiRepository.getAll();
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
        int index = tblKM.getSelectedRow();
        Users2 nvus = km.get(index);

        nvus.setTenKM(txtTen.getText());
        Date ngayBD = dateBD.getDate();
        if (ngayBD != null) {
            nvus.setNgayBatDau(new java.sql.Date(ngayBD.getTime())); // Đảm bảo ngày  là java.sql.Date
        }
        Date ngayKT = dateKT.getDate();
        if (ngayKT != null) {
            nvus.setNgayKetThuc(new java.sql.Date(ngayKT.getTime())); // Đảm bảo ngày  là java.sql.Date
        }
        String hinhThucKM = null;
    if (rdVND.isSelected()) {
        hinhThucKM = "VND";
    } else if (rdPhanTram.isSelected()) {
        hinhThucKM = "%";
    }
    if (hinhThucKM == null) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn hình thức khuyến mãi.");
        return;
    }
    nvus.setHinhThucKM(hinhThucKM);
    
        // Cập nhật giá trị giảm
    String giaTriGiamStr = txtGiaTriGiam.getText().trim();
    if (giaTriGiamStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Giá trị giảm không được để trống.");
        return;
    }
    Double giaTriGiam;
    try {
        giaTriGiam = Double.parseDouble(giaTriGiamStr);
        if (giaTriGiam < 0) { // Kiểm tra giá trị giảm không âm
            JOptionPane.showMessageDialog(this, "Giá trị giảm không được là số âm.");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Giá trị giảm không hợp lệ. Vui lòng nhập số hợp lệ.");
        return;
    }
    nvus.setGiaTriGiam(giaTriGiam);
        if (cbbTrangThai.getSelectedItem() != null) {
            nvus.setTrangthai(Integer.parseInt(cbbTrangThai.getSelectedItem().toString())); // Đảm bảo TT là int
        }

        
        try {
            khuyenMaiRepository.update(nvus);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
            this.km = khuyenMaiRepository.getAll();
            showDataTable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi cơ sở dữ liệu.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    private void search(){
        String idStr = txtTimKiem.getText().trim();
    if (idStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập ID khuyến mãi.");
        return;
    }
    
    try {
        int id = Integer.parseInt(idStr);
        // Giả sử khuyenMaiRepository là một đối tượng quản lý cơ sở dữ liệu của bạn
        Users2 km = khuyenMaiRepository.getKhuyenMaiById(id);
        
        if (km != null) {
            // Cập nhật bảng với dữ liệu tìm được
            dtm.setRowCount(0); // Xóa dữ liệu cũ
            Object[] row = {
                km.getID(),
                km.getTenKM(),
                km.getNgayBatDau(),
                km.getNgayKetThuc(),
                km.getGiaTriGiam(),
                km.getHinhThucKM(),
                km.getTrangthai()
            };
            dtm.addRow(row);
        } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy khuyến mãi với ID này.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID không hợp lệ. Vui lòng nhập số.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Lỗi cơ sở dữ liệu: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Lỗi không xác định: " + e.getMessage());
    }
        
    }

     
     
     
     
     private void clean() {
        txtTen.setText("");
        dateBD.setDate(null);
        dateKT.setDate(null);
        txtGiaTriGiam.setText("");
        rdVND.setSelected(true);
        cbbTrangThai.setSelectedIndex(0);
       
    }

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
            java.util.logging.Logger.getLogger(KhuyenMai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new KhuyenMai2().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(KhuyenMai2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbTrangThai;
    private com.toedter.calendar.JDateChooser dateBD;
    private com.toedter.calendar.JDateChooser dateKT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdPhanTram;
    private javax.swing.JRadioButton rdVND;
    private javax.swing.JTable tblKM;
    private javax.swing.JTextField txtGiaTriGiam;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
