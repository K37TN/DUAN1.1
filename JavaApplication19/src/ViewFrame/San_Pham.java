/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ViewFrame;

import Model.ChatLieu;
import Model.ComboSanPham;
import Model.Hang;
import Model.KichThuoc;
import Model.MauSac;
import Model.sanPham;
import Repository.SanPhamRepository;
import Repositorys.ImplSanPham;
import Views.Chat_Lieu;
import Views.KichCo;
import Views.MauSacView;
import Views.ThuongHieu;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FPTSHOP
 */
public class San_Pham extends javax.swing.JPanel {
 DefaultTableModel defaultTableModel;
    DefaultTableModel defaultTableModel1;
      List<sanPham> list;
  DefaultComboBoxModel<String> comboChatLieu = new DefaultComboBoxModel<>();

    DefaultComboBoxModel<String> comboMauSac = new DefaultComboBoxModel<>();

    DefaultComboBoxModel<String> comboHang = new DefaultComboBoxModel<>();

    DefaultComboBoxModel<String> combokichco = new DefaultComboBoxModel<>();
     private ImplSanPham repository;
    public San_Pham() {
        initComponents();
        setToolTipText("San Pham");
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbo_size = new javax.swing.JComboBox<>();
        btn_luu = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btn_lammoi = new javax.swing.JButton();
        btn_conhang = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btn_hethang = new javax.swing.JButton();
        txt_tensp = new javax.swing.JTextField();
        btn_mausac = new javax.swing.JButton();
        txt_masp = new javax.swing.JTextField();
        txt_gia = new javax.swing.JTextField();
        cbo_loai = new javax.swing.JComboBox<>();
        cbo_hang = new javax.swing.JComboBox<>();
        txt_soluong = new javax.swing.JTextField();
        cbo_mausac = new javax.swing.JComboBox<>();
        btn_size = new javax.swing.JButton();
        btn_loai = new javax.swing.JButton();
        txt_id = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_sanpham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_hang = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_mota = new javax.swing.JTextPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

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

        btn_conhang.setBackground(new java.awt.Color(153, 255, 153));
        btn_conhang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_conhang.setText("Còn hàng");
        btn_conhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conhangActionPerformed(evt);
            }
        });

        jLabel9.setText("Màu Sắc");

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

        jLabel1.setText("Tên SP");

        jLabel2.setText("Giá");

        jLabel3.setText("Chất Liệu");

        jLabel4.setText("Hãng");

        jLabel5.setText("Mã SP");

        jLabel6.setText("Số lượng");

        jLabel7.setText("Size");

        jLabel8.setText("Mổ tả");

        btn_hang.setText("Thêm");
        btn_hang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hangActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txt_mota);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Lọc");

        jLabel11.setText("Tìm Kiếm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_loai))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btn_hang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btn_mausac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_soluong)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbo_size, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_size))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_masp, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_luu)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_lammoi)
                .addGap(361, 361, 361)
                .addComponent(btn_conhang, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_hethang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_luu)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(btn_lammoi)
                    .addComponent(btn_conhang)
                    .addComponent(btn_hethang))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
  int response = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thêm sản phẩm này không?", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.YES_OPTION) {
        ComboSanPham p = getFrom();
        if (p != null) {
            if (repository.add(p) != null) {
                LoadData();
                JOptionPane.showMessageDialog(this, "Thêm thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Không thêm được");
            }
        }
    }
    }//GEN-LAST:event_btn_luuActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      int selected = tb_sanpham.getSelectedRow();
    if (selected >= 0) {
        int id = (Integer) tb_sanpham.getValueAt(selected, 0); // Giả sử ID ở cột đầu tiên
        int response = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa sản phẩm này không?", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
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
        }
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm để xóa");
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
        txt_gia.setText("");
        txt_masp.setText("");
        txt_mota.setText("");
        txt_soluong.setText("");
        txt_tensp.setText("");
        LoadData();
    }//GEN-LAST:event_btn_lammoiActionPerformed

    private void btn_mausacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mausacActionPerformed
        new MauSacView().setVisible(true);
    }//GEN-LAST:event_btn_mausacActionPerformed

    private void btn_sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sizeActionPerformed
        new KichCo().setVisible(true);
    }//GEN-LAST:event_btn_sizeActionPerformed

    private void btn_loaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loaiActionPerformed
        new Chat_Lieu().setVisible(true);
    }//GEN-LAST:event_btn_loaiActionPerformed

    private void tb_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_sanphamMouseClicked
        click();
    }//GEN-LAST:event_tb_sanphamMouseClicked

    private void jScrollPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane4MouseClicked
        click();
    }//GEN-LAST:event_jScrollPane4MouseClicked

    private void btn_hangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hangActionPerformed
        new ThuongHieu().setVisible(true);
    }//GEN-LAST:event_btn_hangActionPerformed

    private void btn_conhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conhangActionPerformed
       LoadConHang();
    }//GEN-LAST:event_btn_conhangActionPerformed

    private void btn_hethangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hethangActionPerformed
      LoadHetHang();
    }//GEN-LAST:event_btn_hethangActionPerformed
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
    public void loadComboHang() {
        comboHang.removeAllElements();
        List<Model.Hang> hang = repository.getHang();
        if (hang != null) {
            for (Model.Hang h : hang) {
                comboHang.addElement(h.getTen());
            }
        }
    }

    private void loadComboChatLieu() {
        comboChatLieu.removeAllElements();
        List<Model.ChatLieu> hang = repository.getChatLieu();
        if (hang != null) {
            for (Model.ChatLieu cl : hang) {
                comboChatLieu.addElement(cl.getTen());
            }
        }
    }
  private void loadComboMauSac() {
        comboMauSac.removeAllElements();
        List<Model.MauSac> mauSacs = repository.getMausac();
        if (mauSacs != null) {
            for (Model.MauSac ms : mauSacs) {
                System.out.println(ms.getTen());
                comboMauSac.addElement(ms.getTen());
            }
        }
    }
    private void loadComboKichThuoc() {
        combokichco.removeAllElements();
        List<Model.KichThuoc> hang = repository.getKichThuoc();
        if (hang != null) {
            for (Model.KichThuoc kt : hang) {
                combokichco.addElement(kt.getTen());
            }
        }
    }
 private  ComboSanPham getFrom(){
   ComboSanPham sp = new ComboSanPham();
    
    // Validate mã sản phẩm
    if (txt_masp.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Mã sản phẩm không được để trống");
        return null;
    }
    sp.setMa(txt_masp.getText());

    // Validate tên sản phẩm
    if (txt_tensp.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Tên sản phẩm không được để trống");
        return null;
    }
    sp.setTen(txt_tensp.getText());

    // Validate mô tả
    if (txt_mota.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Mô tả không được để trống");
        return null;
    }
    sp.setMoTa(txt_mota.getText());

    // Validate giá bán
    try {
        BigDecimal giaBan = new BigDecimal(txt_gia.getText().trim());
        if (giaBan.compareTo(BigDecimal.ZERO) <= 0) {
            JOptionPane.showMessageDialog(this, "Giá bán phải lớn hơn 0");
            return null;
        }
        sp.setGiaBan(giaBan);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Giá bán phải là số hợp lệ");
        return null;
    }

    // Validate số lượng tồn
    try {
        int soLuongTon = Integer.parseInt(txt_soluong.getText().trim());
        if (soLuongTon < 0) {
            JOptionPane.showMessageDialog(this, "Số lượng tồn phải lớn hơn hoặc bằng 0");
            return null;
        }
        sp.setSoLuongTon(soLuongTon);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Số lượng tồn phải là số hợp lệ");
        return null;
    }

    // Lấy giá trị từ các JComboBox và validate
    // MauSac
    MauSac selectedMauSa = repository.getMausac().stream()
        .filter(ms -> ms.getTen().equalsIgnoreCase(cbo_mausac.getSelectedItem().toString()))
        .findFirst()
        .orElse(null);
    if (selectedMauSa == null) {
        JOptionPane.showMessageDialog(this, "Màu sắc không hợp lệ");
        return null;
    }
    sp.setMauSac(selectedMauSa.getID());

    // Hang
    Hang selectedHang = repository.getHang().stream()
        .filter(h -> h.getTen().equalsIgnoreCase(cbo_hang.getSelectedItem().toString()))
        .findFirst()
        .orElse(null);
    if (selectedHang == null) {
        JOptionPane.showMessageDialog(this, "Hãng không hợp lệ");
        return null;
    }
    sp.setThuongHieu(selectedHang.getID());

    // ChatLieu
    ChatLieu selectedChatLieu = repository.getChatLieu().stream()
        .filter(cl -> cl.getTen().equalsIgnoreCase(cbo_loai.getSelectedItem().toString()))
        .findFirst()
        .orElse(null);
    if (selectedChatLieu == null) {
        JOptionPane.showMessageDialog(this, "Chất liệu không hợp lệ");
        return null;
    }
    sp.setChatLieu(selectedChatLieu.getID());

    // KichThuoc
    KichThuoc selectedKichThuoc = repository.getKichThuoc().stream()
        .filter(kt -> kt.getTen().equalsIgnoreCase(cbo_size.getSelectedItem().toString()))
        .findFirst()
        .orElse(null);
    if (selectedKichThuoc == null) {
        JOptionPane.showMessageDialog(this, "Kích thước không hợp lệ");
        return null;
    }
    sp.setKichCo(selectedKichThuoc.getID());

    return sp;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_conhang;
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tb_sanpham;
    private javax.swing.JTextField txt_gia;
    private javax.swing.JLabel txt_id;
    private javax.swing.JTextField txt_masp;
    private javax.swing.JTextPane txt_mota;
    private javax.swing.JTextField txt_soluong;
    private javax.swing.JTextField txt_tensp;
    // End of variables declaration//GEN-END:variables
}
