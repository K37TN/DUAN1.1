/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Repositorys.ImplKhuyenmaiRepository;
import Service.ChiTietSPServices;
import Service.KhuyenMaiService;
import Services.ImplChiTietSPService;
import Services.ImplKhuyenmaiService;
import entity.ChiTietSPViewModel;
import entity.KhuyenmaiViewmodel;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FPTSHOP
 */
public class KhuyenMai extends javax.swing.JFrame {
 DefaultTableModel defaultTableModel;
    DefaultTableModel defaultTableModel1;
    private ImplKhuyenmaiService khuyenmaiService;
    ImplChiTietSPService chiTietSPServices;
    
    public KhuyenMai() {
        initComponents();
        setTitle("Khuyến mãi");
        khuyenmaiService = new KhuyenMaiService(); // Khởi tạo khuyenmaiService
        defaultTableModel = (DefaultTableModel) tb_khuyenmai.getModel();
        defaultTableModel1 = (DefaultTableModel) tb_sp.getModel();
        khuyenmaiService.updateTT();
        khuyenmaiService.updateTT2();
        chiTietSPServices = new ChiTietSPServices();
        LoadData();
        LoadDataSP();
    }
void LoadData() {
        defaultTableModel.setRowCount(0);
        int stt = 1;
        for (KhuyenmaiViewmodel x : khuyenmaiService.getall()) {
            defaultTableModel.addRow(new Object[]{
                stt,
                x.getTenKM(),
                x.getNgayBatDau(),
                x.getNgayKetThuc(),
                String.format("%.0f", x.getGiaTriGiam()) + " " + x.getHinhThucKM(),
                x.getTrangthai() == 0 ? "Còn hạn" : "Hết hạn"
            });
            stt++;
        }
    }
  void LoadDataSP() {
        defaultTableModel1.setRowCount(0);
        for (ChiTietSPViewModel x : chiTietSPServices.GetAll()) {
            defaultTableModel1.addRow(new Object[]{
                x.getMa(),
                x.getTen()
            });
        }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txt_tenkm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_giatrgiam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        date_BD = new com.toedter.calendar.JDateChooser();
        date_KT = new com.toedter.calendar.JDateChooser();
        cb_selectAll = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_sp = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_khuyenmai = new javax.swing.JTable();
        btn_them = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        rd_phantram = new javax.swing.JRadioButton();
        rd_VND = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên Khuyến mại");

        jLabel2.setText("Ngày Bắt Đầu");

        jLabel3.setText("Ngày Kết Thúc");

        jLabel4.setText("Giá Trị Giảm");

        date_BD.setDateFormatString("dd/MM/yyyy");

        date_KT.setDateFormatString("dd/MM/yyyy");

        cb_selectAll.setText("Select All");
        cb_selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_selectAllActionPerformed(evt);
            }
        });

        tb_sp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Mã sản phẩm", "Tên sản phẩm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb_sp);

        tb_khuyenmai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên khuyến mãi", "Ngày bắt đầu", "Ngày kết thúc", "Giá trị giảm", "Trạng thái"
            }
        ));
        tb_khuyenmai.setRowHeight(25);
        tb_khuyenmai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_khuyenmaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_khuyenmai);

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        jButton2.setText("Cập Nhật");

        jButton3.setText("Làm Mới");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd_phantram);
        rd_phantram.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd_phantram.setText("%");
        rd_phantram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_phantramActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd_VND);
        rd_VND.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rd_VND.setText("VND");
        rd_VND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_VNDActionPerformed(evt);
            }
        });

        jLabel5.setText("Hình thức giảm giá");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_selectAll)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(txt_tenkm)
                            .addComponent(jLabel3)
                            .addComponent(date_KT, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_giatrgiam)
                                    .addComponent(date_BD, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_them)
                                    .addComponent(jButton2)
                                    .addComponent(jButton3)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rd_VND, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(rd_phantram, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_tenkm, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(date_BD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_them))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_giatrgiam, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(date_KT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_VND, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_phantram, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cb_selectAll)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_selectAllActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < tb_sp.getRowCount(); i++) {
            if (cb_selectAll.isSelected() == true) {
                tb_sp.setValueAt(true, i, 0);
            } else {
                tb_sp.setValueAt(false, i, 0);
            }
        }
    }//GEN-LAST:event_cb_selectAllActionPerformed

    private void tb_khuyenmaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_khuyenmaiMouseClicked
    
    }//GEN-LAST:event_tb_khuyenmaiMouseClicked

    private void rd_VNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_VNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd_VNDActionPerformed

    private void rd_phantramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_phantramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd_phantramActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         txt_tenkm.setText("");
          txt_giatrgiam.setText("");
        date_BD.setCalendar(null);
        date_KT.setCalendar(null);
         buttonGroup1.clearSelection();
        LoadData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
       Pattern p = Pattern.compile("^[0-9]+$");
        try {
            if (txt_tenkm.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên khuyến mãi");
                return;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            if (date_BD.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn ngày bắt đầu");
                return;
            }
        } catch (Exception e) {
        }
        try {
            if (date_KT.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn ngày kết thúc");
                return;
            }
        } catch (Exception e) {
        }
        try {
            if (!rd_VND.isSelected() && !rd_phantram.isSelected()) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn hình thức giảm giá");
                return;
            }
        } catch (Exception e) {
        }

        try {
            if (txt_giatrgiam.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập giá trị giảm");
                return;
            }
        } catch (Exception e) {
        }

        try {
            Integer.valueOf(txt_giatrgiam.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá trị giảm phải là số!");
            return;
        }
        
        try {
            if (date_KT.getDate().before(date_BD.getDate())) {
                JOptionPane.showMessageDialog(this, "Ngày kết thúc phải lớn hơn ngày bắt đầu");
                return;
            }
        } catch (Exception e) {
        }
        if (p.matcher(txt_tenkm.getText()).find() == true) {
            JOptionPane.showMessageDialog(this, "Tên không được nhập số");
            return;
        }
        if (txt_tenkm.getText().length() > 50) {
            JOptionPane.showMessageDialog(this, "Tên không được quá 50 kí tự");
            return;
        }
        if (khuyenmaiService.checktrung(txt_tenkm.getText()) != null) {
            JOptionPane.showMessageDialog(this, "Tên khuyến mãi đã tồn tại");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không","add",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
            
        }
        KhuyenmaiViewmodel km = new KhuyenmaiViewmodel();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = sdf.format(date_BD.getDate());
        String date2 = sdf.format(date_KT.getDate());
        km.setNgayBatDau(date1);
        km.setNgayKetThuc(date2);
        km.setTenKM(txt_tenkm.getText());
        if (rd_VND.isSelected()) {
            km.setHinhThucKM("VND");
        }else if(rd_phantram.isSelected()){
            km.setHinhThucKM("%");
        }
        km.setGiaTriGiam(Double.parseDouble(txt_giatrgiam.getText()));
        khuyenmaiService.add(km);
        LoadData();
        for (int i =0;i<tb_sp.getRowCount();i++) {
            boolean ischeckbox = (boolean) tb_sp.getValueAt(i,0 );
            if (ischeckbox) {
                System.out.println(tb_sp.getValueAt(i, 1));
           
            }
        }
    }//GEN-LAST:event_btn_themActionPerformed

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
            java.util.logging.Logger.getLogger(KhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhuyenMai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_them;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb_selectAll;
    private com.toedter.calendar.JDateChooser date_BD;
    private com.toedter.calendar.JDateChooser date_KT;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rd_VND;
    private javax.swing.JRadioButton rd_phantram;
    private javax.swing.JTable tb_khuyenmai;
    private javax.swing.JTable tb_sp;
    private javax.swing.JTextField txt_giatrgiam;
    private javax.swing.JTextField txt_tenkm;
    // End of variables declaration//GEN-END:variables
}
