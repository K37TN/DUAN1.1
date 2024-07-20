/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import Model.Voucher;
import Repository.VoucherRepository;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Administrator
 */
public class QLVoucher extends javax.swing.JFrame {
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
DefaultTableModel model = new DefaultTableModel();
    List<Voucher> list;
    Voucher vc = new Voucher();
    VoucherRepository repo = new VoucherRepository();
    private DefaultTableModel dtm = new DefaultTableModel();


    public QLVoucher() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("QUẢN LÝ VOUCHER");
    repo = new VoucherRepository();
    list = repo.getAll();
        showtable(list);
    }

    


  public void showtable(List<Model.Voucher> list){
     model = (DefaultTableModel) tblVoucher.getModel();
        model.setRowCount(0);
      List<Voucher> gg = repo.getAll();
        for (Voucher p : gg) {
            model.addRow(new Object[]{p.getId(), p.getMavc(), p.getSoLuongGiam(), p.getDkGiam(),p.getTrangThai()==0?"Đang hoạt động":"Đã ngừng",
                 p.getNgaybd(), p.getNgaykt()});
        }

}
   

    private void showDetail() {
         int index = tblVoucher.getSelectedRow();
        if (index != -1) {
             txt_id.setText(tblVoucher.getValueAt(index, 0).toString());
            txtMaVoucher.setText(tblVoucher.getValueAt(index, 1).toString());
            txtSLGiam.setText(tblVoucher.getValueAt(index, 2).toString());
            txtDKGiam.setText(tblVoucher.getValueAt(index, 3).toString());
            
            String trangThai = tblVoucher.getValueAt(index, 4).toString();
            rdoHoatDong.setSelected(trangThai.equals("Đang hoạt động"));
            rdoNgung.setSelected(trangThai.equals("Đã ngừng"));
            
            try {
                Date ngaybd = sdf.parse(tblVoucher.getValueAt(index, 5).toString());
                txtd_ngaybatdau.setDate(ngaybd);
                
                Date ngaykt = sdf.parse(tblVoucher.getValueAt(index, 6).toString());
                txt_ngayketthuc.setDate(ngaykt);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void reset() {
     
        txtMaVoucher.setText("");
        txtDKGiam.setText("");
        txtSLGiam.setText("");
        rdoHoatDong.isSelected();
       txtd_ngaybatdau.setCalendar(null);
       txt_ngayketthuc.setCalendar(null);
         buttonGroup1.clearSelection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaVoucher = new javax.swing.JTextField();
        txtSLGiam = new javax.swing.JTextField();
        txtDKGiam = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        rdoHoatDong = new javax.swing.JRadioButton();
        rdoNgung = new javax.swing.JRadioButton();
        txtd_ngaybatdau = new com.toedter.calendar.JDateChooser();
        txt_ngayketthuc = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVoucher = new javax.swing.JTable();
        txt_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ VOUCHER");

        jLabel2.setText("Mã voucher:");

        jLabel3.setText("Số luọng giảm:");

        jLabel4.setText("Điều kiện giảm:");

        jLabel5.setText("Trạng thái:");

        jLabel6.setText("Ngày bắt đầu:");

        jLabel7.setText("Ngày kết thúc:");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnReset.setText("Mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoHoatDong);
        rdoHoatDong.setSelected(true);
        rdoHoatDong.setText("Đang hoạt động");

        buttonGroup1.add(rdoNgung);
        rdoNgung.setText("Đã ngừng");
        rdoNgung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNgungActionPerformed(evt);
            }
        });

        txtd_ngaybatdau.setDateFormatString("yyyy-MM-dd");

        txt_ngayketthuc.setDateFormatString("yyyy-MM-dd");

        tblVoucher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Voucher", "Số lượng giảm", "Điều kiện giảm", "Trạng thái", "Ngày bắt đầu", "Ngày kết thúc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVoucherMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVoucher);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaVoucher))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDKGiam)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdoHoatDong)
                                .addGap(19, 19, 19)
                                .addComponent(rdoNgung, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtSLGiam)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem)
                        .addGap(28, 28, 28)
                        .addComponent(btnSua)
                        .addGap(25, 25, 25)
                        .addComponent(btnXoa)
                        .addGap(37, 37, 37)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_ngayketthuc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtd_ngaybatdau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(133, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(txtMaVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(txtd_ngaybatdau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(txt_ngayketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSLGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDKGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rdoHoatDong)
                            .addComponent(rdoNgung)
                            .addComponent(btnReset)
                            .addComponent(btnXoa)
                            .addComponent(btnSua)
                            .addComponent(btnThem))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
   // Lấy dữ liệu từ các trường nhập liệu
    String maVoucher = txtMaVoucher.getText();
    int soLuongGiam = Integer.parseInt(txtSLGiam.getText());
    int dieuKienGiam = Integer.parseInt(txtDKGiam.getText());
    Date ngayBatDau = txtd_ngaybatdau.getDate();
    Date ngayKetThuc = txt_ngayketthuc.getDate();
    int trangThai = rdoHoatDong.isSelected() ? 0 : 1;

    // Tạo đối tượng Voucher mới
    Voucher newVoucher = new Voucher();
    newVoucher.setMavc(maVoucher);
    newVoucher.setSoLuongGiam(soLuongGiam);
    newVoucher.setDkGiam(dieuKienGiam);
    newVoucher.setTrangThai(trangThai);
    newVoucher.setNgaybd(ngayBatDau);
    newVoucher.setNgaykt(ngayKetThuc);

    try {
        // Thêm Voucher mới vào cơ sở dữ liệu
        if (repo.add(newVoucher) > 0) { // Nếu thêm thành công
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            list = repo.getAll(); // Lấy lại danh sách Voucher
            showtable(list); // Hiển thị lại bảng
        } else {
            JOptionPane.showMessageDialog(this, "Không thêm được sản phẩm");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Lỗi khi thêm sản phẩm");
        e.printStackTrace();
    }
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
    Integer id = Integer.valueOf(txt_id.getText()); // Giả sử bạn có một ô text để nhập ID
    String mavc = txtMaVoucher.getText(); // Lấy mã voucher từ ô text
    Integer soLuongGiam = Integer.valueOf(txtSLGiam.getText()); // Lấy số lượng giảm
    Integer dkGiam = Integer.valueOf(txtDKGiam.getText()); // Lấy giá trị giảm
    int trangThai = rdoHoatDong.isSelected() ? 1 : 0; // Lấy trạng thái từ radio button
    Date ngaybd = txtd_ngaybatdau.getDate(); // Lấy ngày bắt đầu từ calendar picker
    Date ngaykt = txt_ngayketthuc.getDate(); // Lấy ngày kết thúc từ calendar picker

    // Tạo đối tượng Voucher
    Voucher voucher = new Voucher(id, mavc, soLuongGiam, dkGiam, trangThai, ngaybd, ngaykt);
    
    // Tạo đối tượng repository và gọi phương thức update
    VoucherRepository repo = new VoucherRepository();
    Integer result = repo.update(voucher);
        showtable(list);
    // Hiển thị thông báo dựa trên kết quả
    if (result != null && result > 0) {
        JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
    } else {
        JOptionPane.showMessageDialog(this, "Không cập nhật được thông tin.");
    }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
int selected = tblVoucher.getSelectedRow();
if (selected >= 0) {
    int id = (Integer) tblVoucher.getValueAt(selected, 0); // Giả sử ID ở cột đầu tiên
    int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa sản phẩm này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        try {
            if (repo.delete(id) > 0) { // Nếu có hàng bị xóa
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                showtable(list); // Tải lại dữ liệu
            } else {
                JOptionPane.showMessageDialog(this, "Không xóa được sản phẩm");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi xóa sản phẩm");
            e.printStackTrace();
        }
    }}
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblVoucherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVoucherMouseClicked
   showDetail();
 
    }//GEN-LAST:event_tblVoucherMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void rdoNgungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNgungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNgungActionPerformed

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
            java.util.logging.Logger.getLogger(QLVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLVoucher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLVoucher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoHoatDong;
    private javax.swing.JRadioButton rdoNgung;
    private javax.swing.JTable tblVoucher;
    private javax.swing.JTextField txtDKGiam;
    private javax.swing.JTextField txtMaVoucher;
    private javax.swing.JTextField txtSLGiam;
    private javax.swing.JLabel txt_id;
    private com.toedter.calendar.JDateChooser txt_ngayketthuc;
    private com.toedter.calendar.JDateChooser txtd_ngaybatdau;
    // End of variables declaration//GEN-END:variables
}
