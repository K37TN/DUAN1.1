/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;
import Model.MauSac; 
import Model.Hang;
import Model.sanPham;
import Model.ChatLieu;
import Model.ComboSanPham;
import Model.KichThuoc;
import Repository.SanPhamRepository;
import Repositorys.ImplSanPham;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FPTSHOP
 */
public class San_Pham extends javax.swing.JFrame {
 DefaultTableModel defaultTableModel;
    DefaultTableModel defaultTableModel1;
      List<sanPham> list;
     DefaultComboBoxModel<ChatLieu> comboChatLieu = new DefaultComboBoxModel<>();

    DefaultComboBoxModel<MauSac> comboMauSac = new DefaultComboBoxModel<>();


    DefaultComboBoxModel<Hang> comboHang = new DefaultComboBoxModel<>();

    DefaultComboBoxModel<KichThuoc> combokichco = new DefaultComboBoxModel<>();
     private ImplSanPham repository;
    public San_Pham() {
        initComponents();
        setTitle("San Pham");
        defaultTableModel = (DefaultTableModel) tb_sanpham.getModel();
        repository = new SanPhamRepository();
         cbo_mausac.setModel((DefaultComboBoxModel) comboMauSac);
        loadComboMauSac();
          cbo_hang.setModel((DefaultComboBoxModel) comboHang);
        loadComboHang();
         cbo_loai.setModel((DefaultComboBoxModel) comboChatLieu);
        loadComboChatLieu();
         cbo_size.setModel((DefaultComboBoxModel) combokichco);
        loadComboKichThuoc();
        LoadData();
    }
void LoadData() {
        defaultTableModel.setRowCount(0);
        
        for (sanPham x : repository.getAll()) {
            defaultTableModel.addRow(new Object[]{
                x.getID(),
                x.getMa(),
                x.getTen(),
                 x.getMoTa(),
                x.getGiaBan(),
              
                x.getSoLuongTon(),
               x.getChatLieu(),
               x.getKichCo(),
               x.getThuongHieu(),
               x.getMauSac(),
      x.getSoLuongTon() > 0 ? "Còn hàng" : "Hết hàng",
                  
            });
          
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_tensp = new javax.swing.JTextField();
        txt_masp = new javax.swing.JTextField();
        txt_gia = new javax.swing.JTextField();
        cbo_loai = new javax.swing.JComboBox<>();
        cbo_hang = new javax.swing.JComboBox<>();
        txt_soluong = new javax.swing.JTextField();
        cbo_mausac = new javax.swing.JComboBox<>();
        btn_size = new javax.swing.JButton();
        btn_loai = new javax.swing.JButton();
        btn_hang = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_mota = new javax.swing.JTextPane();
        cbo_size = new javax.swing.JComboBox<>();
        btn_luu = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btn_lammoi = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btn_hethang = new javax.swing.JButton();
        btn_mausac = new javax.swing.JButton();
        txt_id = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_sanpham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên SP");

        jLabel2.setText("Giá");

        jLabel3.setText("Chất Liệu");

        jLabel4.setText("Hãng");

        jLabel5.setText("Mã SP");

        jLabel6.setText("Số lượng");

        jLabel7.setText("Size");

        jLabel8.setText("Mổ tả");

        jLabel9.setText("Màu Sắc");

        cbo_loai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbo_hang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbo_mausac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_size.setText("Thêm");
        btn_size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sizeActionPerformed(evt);
            }
        });

        btn_loai.setText("Thêm");
        btn_loai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loaiActionPerformed(evt);
            }
        });

        btn_hang.setText("Thêm");
        btn_hang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hangActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txt_mota);

        cbo_size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_luu.setText("Lưu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });

        jButton5.setText("Sửa");

        jButton6.setText("Xóa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btn_lammoi.setText("Mới");
        btn_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoiActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 255, 153));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Còn hàng");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        btn_hethang.setBackground(new java.awt.Color(255, 102, 102));
        btn_hethang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_hethang.setText("Hết hàng");
        btn_hethang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hethangActionPerformed(evt);
            }
        });

        btn_mausac.setText("Thêm");
        btn_mausac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mausacActionPerformed(evt);
            }
        });

        jScrollPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane4MouseClicked(evt);
            }
        });

        tb_sanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Mô tả", "Đơn giá", "Số lượng", "Chất liệu", "Size", "Hãng", "Màu Sắc", "Trạng thái"
            }
        ));
        tb_sanpham.setMinimumSize(new java.awt.Dimension(165, 50));
        tb_sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_sanphamMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tb_sanpham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_luu)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_lammoi)
                        .addGap(349, 349, 349)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btn_hethang))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(25, 25, 25)
                                .addComponent(txt_tensp))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_gia, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cbo_mausac, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbo_hang, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbo_loai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_mausac, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btn_loai, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btn_hang, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_soluong)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbo_size, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_size, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_masp, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_masp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(btn_size)
                            .addComponent(cbo_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txt_tensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_gia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbo_loai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_loai))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbo_hang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_hang))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbo_mausac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_mausac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_luu)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(btn_lammoi)
                    .addComponent(jButton8)
                    .addComponent(btn_hethang))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loaiActionPerformed
         new Chat_Lieu().setVisible(true);
    }//GEN-LAST:event_btn_loaiActionPerformed

    private void btn_hangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hangActionPerformed
         new ThuongHieu().setVisible(true);
    }//GEN-LAST:event_btn_hangActionPerformed

    private void btn_mausacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mausacActionPerformed
         new MauSacView().setVisible(true);
    }//GEN-LAST:event_btn_mausacActionPerformed

    private void btn_sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sizeActionPerformed
         new KichCo().setVisible(true);
    }//GEN-LAST:event_btn_sizeActionPerformed

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
    txt_gia.setText("");
    txt_masp.setText("");
    txt_mota.setText("");
    txt_soluong.setText("");
    txt_tensp.setText("");
LoadData();
    }//GEN-LAST:event_btn_lammoiActionPerformed

    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
      ComboSanPham p = getFrom();
    if (repository.add(p) != null) {
        LoadData();
        JOptionPane.showMessageDialog(this, "Thêm thành công");
    } else {
        JOptionPane.showMessageDialog(this, "Không thêm được");
    }
    }//GEN-LAST:event_btn_luuActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     int selected = tb_sanpham.getSelectedRow();
if (selected >= 0) {
    int id = (Integer) tb_sanpham.getValueAt(selected, 0); // Giả sử ID ở cột đầu tiên
    int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa sản phẩm này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        try {
            if (repository.delete(id) > 0) { // Nếu có hàng bị xóa
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                LoadData(); // Tải lại dữ liệu
            } else {
                JOptionPane.showMessageDialog(this, "Không xóa được sản phẩm");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi xóa sản phẩm");
            e.printStackTrace();
        }
    }}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jScrollPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane4MouseClicked
        click();
    }//GEN-LAST:event_jScrollPane4MouseClicked

    private void tb_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_sanphamMouseClicked
       click();
    }//GEN-LAST:event_tb_sanphamMouseClicked

    private void btn_hethangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hethangActionPerformed
     LoadHetHang();
    }//GEN-LAST:event_btn_hethangActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        LoadConHang();
    }//GEN-LAST:event_jButton8ActionPerformed
public void click(){
        int index = tb_sanpham.getSelectedRow();
        txt_id.setText(tb_sanpham.getValueAt(index, 0).toString());
        txt_tensp.setText(tb_sanpham.getValueAt(index, 2).toString());
        txt_masp.setText(tb_sanpham.getValueAt(index, 1).toString());
        txt_mota.setText(tb_sanpham.getValueAt(index,3).toString());
        txt_gia.setText(tb_sanpham.getValueAt(index, 4).toString());
        txt_soluong.setText(tb_sanpham.getValueAt(index, 5).toString());
        cbo_loai.setSelectedItem(tb_sanpham.getValueAt(index,6));

        cbo_size.setSelectedItem(tb_sanpham.getValueAt(index,7));
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
            java.util.logging.Logger.getLogger(San_Pham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(San_Pham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(San_Pham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(San_Pham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new San_Pham().setVisible(true);
            }
        });
    }
private void loadComboMauSac() {
      comboMauSac.removeAllElements();
        List<Model.MauSac> mauSacs = repository.getMausac();
        if (mauSacs != null) {
            for (Model.MauSac ms : mauSacs) {
                comboMauSac.addElement(ms);
            }
        }
    }

void LoadHetHang() {
        defaultTableModel.setRowCount(0);
        
        for (sanPham x : repository.getHetHang()) {
            defaultTableModel.addRow(new Object[]{
                x.getID(),
                x.getMa(),
                x.getTen(),
                 x.getMoTa(),
                x.getGiaBan(),
              
                x.getSoLuongTon(),
               x.getChatLieu(),
               x.getKichCo(),
               x.getThuongHieu(),
               x.getMauSac(),
      x.getSoLuongTon() > 0 ? "Còn hàng" : "Hết hàng",
                  
            });
          
        }
    }
void LoadConHang() {
        defaultTableModel.setRowCount(0);
        
        for (sanPham x : repository.getConHang()) {
            defaultTableModel.addRow(new Object[]{
                x.getID(),
                x.getMa(),
                x.getTen(),
                 x.getMoTa(),
                x.getGiaBan(),
              
                x.getSoLuongTon(),
               x.getChatLieu(),
               x.getKichCo(),
               x.getThuongHieu(),
               x.getMauSac(),
      x.getSoLuongTon() > 0 ? "Còn hàng" : "Hết hàng",
                  
            });
          
        }
    }

public void loadComboHang() {
      comboHang.removeAllElements();
        List<Model.Hang> hang = repository.getHang();
        if (hang != null) {
            for (Model.Hang h : hang) {
                comboHang.addElement(h);
            }
        }
    }
private void loadComboChatLieu() {
      comboChatLieu.removeAllElements();
        List<Model.ChatLieu> hang = repository.getChatLieu();
        if (hang != null) {
            for (Model.ChatLieu cl : hang) {
                comboChatLieu.addElement(cl);
            }
        }
    }
private void loadComboKichThuoc() {
      combokichco.removeAllElements();
        List<Model.KichThuoc> hang = repository.getKichThuoc();
        if (hang != null) {
            for (Model.KichThuoc kt : hang) {
                combokichco.addElement(kt);
            }
        }
    }
 private  ComboSanPham getFrom(){
   ComboSanPham sp = new  ComboSanPham();
   sp.setMa(txt_masp.getText());
    sp.setTen(txt_tensp.getText());
    sp.setMoTa(txt_mota.getText());
    sp.setGiaBan(new BigDecimal(txt_gia.getText()));
    sp.setSoLuongTon(Integer.parseInt(txt_soluong.getText()));
    
    // Lấy giá trị từ các JComboBox
    // Giả sử cbo_mausac, cbo_loai, cbo_hang, cbo_size chứa các đối tượng tương ứng
    // và bạn cần lấy đối tượng đã chọn
 Integer selectedHang = (Integer) cbo_hang.getSelectedIndex();
     Integer selectedChatLieu = (Integer) cbo_loai.getSelectedIndex();
      Integer selectedMauSa = (Integer) cbo_mausac.getSelectedIndex();
       Integer selectedKichThuoc = (Integer) cbo_size.getSelectedIndex();
sp.setChatLieu(selectedChatLieu);
sp.setKichCo(selectedKichThuoc);
sp.setMauSac(selectedMauSa);
sp.setThuongHieu(selectedHang);
    return sp;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hang;
    private javax.swing.JButton btn_hethang;
    private javax.swing.JButton btn_lammoi;
    private javax.swing.JButton btn_loai;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_mausac;
    private javax.swing.JButton btn_size;
    private javax.swing.JComboBox<String> cbo_hang;
    private javax.swing.JComboBox<String> cbo_loai;
    private javax.swing.JComboBox<String> cbo_mausac;
    private javax.swing.JComboBox<String> cbo_size;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tb_sanpham;
    private javax.swing.JTextField txt_gia;
    private javax.swing.JLabel txt_id;
    private javax.swing.JTextField txt_masp;
    private javax.swing.JTextPane txt_mota;
    private javax.swing.JTextField txt_soluong;
    private javax.swing.JTextField txt_tensp;
    // End of variables declaration//GEN-END:variables

 
}
