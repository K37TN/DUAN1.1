/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ViewFrame;

import Repository.KhachHangRepository;
import Repositorys.ImplKhachHangRepository;
import Service.DanhSachKHServices;
import Services.ImplDSKHService;
import entity.DanhSachKHViewModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FPTSHOP
 */
public class KhachHang extends javax.swing.JPanel {
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
 DefaultTableModel defaultTableModel = new DefaultTableModel();
 private ImplKhachHangRepository repository;
 List<DanhSachKHViewModel> listLS;
    List<Model.KhachHang> list;
    ImplDSKHService KH;
    ImplKhachHangRepository KHRP;
    public KhachHang() {
        initComponents();
         setToolTipText("Khach Hang");
        repository = new KhachHangRepository();
        cbo_gt.removeAllItems();
        cbo_gt.addItem("Lọc giới tính");
         cbo_gt.addItem("ALL");
        cbo_gt.addItem("Nam");
        cbo_gt.addItem("Nữ");
        KH = new DanhSachKHServices();
        KHRP = new KhachHangRepository();
        list = KHRP.getall();
        showtable(list);
        TXT_01.setText("Tổng số khách hàng là : " + list.size());
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
        txt_tenDem = new javax.swing.JTextField();
        txt_Ten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TB_bang1 = new javax.swing.JTable();
        TXT_01 = new javax.swing.JLabel();
        txt_timkiem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbo_gt = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TB_bang02 = new javax.swing.JTable();
        LBL_SOLUONG = new javax.swing.JLabel();
        btn_hienthi = new javax.swing.JButton();
        date_ngaysinh1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txt_sdt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Ho = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rdo_nam = new javax.swing.JRadioButton();
        rdo_nu = new javax.swing.JRadioButton();
        btn_them = new javax.swing.JButton();
        btn_capnhat = new javax.swing.JButton();
        TXT_ID = new javax.swing.JLabel();
        btn_lammoi = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_makh = new javax.swing.JTextField();

        jLabel4.setText("Số điện thoại");

        jLabel2.setText("Ngày Sinh");

        jLabel1.setText("Tên");

        TB_bang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Ma KH", "Họ Và Tên", "Giới Tính", "Ngày Sinh", "SĐT", "Email"
            }
        ));
        TB_bang1.setGridColor(new java.awt.Color(255, 255, 255));
        TB_bang1.setRowHeight(25);
        TB_bang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_bang1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TB_bang1);

        TXT_01.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TXT_01.setForeground(new java.awt.Color(51, 51, 51));

        txt_timkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_timkiemKeyReleased(evt);
            }
        });

        jLabel8.setText("Tìm kiếm");

        cbo_gt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_gt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_gtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(TXT_01, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbo_gt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXT_01, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(cbo_gt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Thông Tin Khách Hàng", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TB_bang02.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ Và Tên", "SĐT", "Mã Hoá Đơn", "Ngày Tạo Hoá Đơn", "Tổng Tiền", "Trạng Thái"
            }
        ));
        TB_bang02.setRowHeight(25);
        jScrollPane4.setViewportView(TB_bang02);

        LBL_SOLUONG.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LBL_SOLUONG.setForeground(new java.awt.Color(51, 51, 51));

        btn_hienthi.setText("Hiển thị");
        btn_hienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hienthiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LBL_SOLUONG, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_hienthi)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(LBL_SOLUONG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_hienthi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jTabbedPane3.addTab("Lịch Sử Mua Hàng", jPanel2);

        date_ngaysinh1.setDateFormatString("yyyy-MM-dd");

        jLabel3.setText("Tên Đệm");

        jLabel5.setText("Họ");

        jLabel6.setText("Email");

        jLabel7.setText("Gớii tính");

        buttonGroup1.add(rdo_nam);
        rdo_nam.setText("Nam");

        buttonGroup1.add(rdo_nu);
        rdo_nu.setText("Nữ");

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_capnhat.setText("Cập nhật");
        btn_capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capnhatActionPerformed(evt);
            }
        });

        btn_lammoi.setText("Làm mới");
        btn_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoiActionPerformed(evt);
            }
        });

        jLabel9.setText("Mã KH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Ho, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txt_tenDem, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdo_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rdo_nu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_email)
                                .addComponent(jLabel2)
                                .addComponent(date_ngaysinh1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(TXT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txt_makh)
                                .addComponent(txt_sdt)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_capnhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_lammoi)
                            .addComponent(btn_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_them)
                        .addGap(31, 31, 31)
                        .addComponent(btn_capnhat)
                        .addGap(34, 34, 34)
                        .addComponent(btn_lammoi)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(date_ngaysinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tenDem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Ho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdo_nam)
                            .addComponent(rdo_nu)
                            .addComponent(txt_makh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(TXT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TB_bang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_bang1MouseClicked

        int row = TB_bang1.getSelectedRow();
        Model.KhachHang kh = list.get(row);
        txt_makh.setText(kh.getMa());
        txt_Ten.setText(kh.getTen());
        txt_tenDem.setText(kh.getTendem());
        txt_Ho.setText(kh.getHo());
        String gt = TB_bang1.getValueAt(row, 3).toString();
        if ("Nam".equals(gt)) {
            rdo_nam.setSelected(true);
        } else if ("Nữ".equals(gt)) {
            rdo_nu.setSelected(true);
        }
        date_ngaysinh1.setDate((Date) TB_bang1.getValueAt(row, 4));
        txt_sdt.setText(kh.getSdt());
        txt_email.setText(kh.getEmail());

    }//GEN-LAST:event_TB_bang1MouseClicked

    private void txt_timkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timkiemKeyReleased
        defaultTableModel = (DefaultTableModel) TB_bang1.getModel();
        defaultTableModel.setRowCount(0);

        String searchText = txt_timkiem.getText().toLowerCase();
        for (Model.KhachHang kh : list) {
            if (kh.getMa().toLowerCase().contains(searchText) ||
                kh.getHo().toLowerCase().contains(searchText) ||
                kh.getTendem().toLowerCase().contains(searchText) ||
                kh.getTen().toLowerCase().contains(searchText) ||
                kh.getSdt().contains(searchText) ||
                kh.getEmail().toLowerCase().contains(searchText)) {

                Object[] rowData = new Object[7];
                rowData[0] = kh.getId();
                rowData[1] = kh.getMa();
                rowData[2] = kh.getHo() + " " + kh.getTendem() + " " + kh.getTen();
                rowData[3] = kh.getGioitinh()==0?"Nam":"Nữ";
                rowData[4] = (kh.getNgaysinh());
                rowData[5] = kh.getSdt();
                rowData[6] = kh.getEmail();

                defaultTableModel.addRow(rowData);
            }
        }
    }//GEN-LAST:event_txt_timkiemKeyReleased

    private void cbo_gtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_gtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_gtActionPerformed

    private void btn_hienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hienthiActionPerformed
        listLS = KH.getAllDS();
        showLSMH(listLS);
        LBL_SOLUONG.setText("Tổng số hóa đơn là :"+listLS.size());
    }//GEN-LAST:event_btn_hienthiActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if (validateKhachHang()) {
            Model.KhachHang kh = getFrom();
            if (repository.add(kh) != null) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                list = KHRP.getall();
                showtable(list);
                TXT_01.setText("Tổng số khách hàng là : " + list.size());
            } else {
                JOptionPane.showMessageDialog(this, "Không thêm được");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Thông tin khách hàng không hợp lệ");
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capnhatActionPerformed
        Model.KhachHang kh = getData(); 
        int id = layid();
        if (KH.Update(id, kh) != null) {
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            list = KHRP.getall();
            showtable(list);
            TXT_01.setText("Tổng số khách hàng là : " + list.size());
        } else {
            JOptionPane.showMessageDialog(this, "Không cập nhật được");
        }
    }//GEN-LAST:event_btn_capnhatActionPerformed

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
        txt_Ho.setText("");
        txt_Ten.setText("");
        txt_makh.setText("");
        txt_email.setText("");
        txt_sdt.setText("");
        txt_tenDem.setText("");
        date_ngaysinh1.setCalendar(null);
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btn_lammoiActionPerformed
private boolean validateKhachHang() {
    String sdtPattern = "(0\\d{9})"; // Biểu thức chính quy cho số điện thoại
    Pattern pattern = Pattern.compile("^[0-9]+$"); // Biểu thức chính quy cho kiểm tra số

    // Kiểm tra thông tin khách hàng
    if (txt_Ten.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên khách hàng!");
        return false;
    }

    if (pattern.matcher(txt_Ten.getText()).find()) {
        JOptionPane.showMessageDialog(this, "Tên khách hàng không được nhập số!");
        return false;
    }

    if (txt_Ten.getText().length() > 30) {
        JOptionPane.showMessageDialog(this, "Tên khách hàng không được quá 30 kí tự!");
        return false;
    }

    if (txt_sdt.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Bạn chưa nhập số điện thoại!");
        return false;
    }
    
    if (txt_makh.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Bạn chưa nhập Ma!");
        return false;
    }


    try {
        if (!txt_sdt.getText().matches(sdtPattern)) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng!");
            return false;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi kiểm tra số điện thoại: " + e.getMessage());
        return false;
    }

    // Nếu không có lỗi xảy ra trong quá trình kiểm tra
    return true;
}
    private Model.KhachHang getFrom(){
   Model.KhachHang kh = new Model.KhachHang();
   kh.setMa(txt_makh.getText());
   kh.setHo(txt_Ho.getText());
   kh.setTendem(txt_tenDem.getText());
   kh.setTen(txt_Ten.getText());
   Date ngaysinh = date_ngaysinh1.getDate();
         kh.setSdt(txt_sdt.getText());
        kh.setEmail(txt_email.getText());
        
        if (ngaysinh!=null) {
          kh.setNgaysinh(ngaysinh);   
         }
        
        int gt;
        if (rdo_nam.isSelected()) {
            gt = 0;
        } else {
            gt = 1;
        }
        return kh;
    }
    public void showtable(List<Model.KhachHang> list){
      defaultTableModel = (DefaultTableModel) TB_bang1.getModel();
        defaultTableModel.setRowCount(0);
        for (Model.KhachHang khachHang : list) {
            defaultTableModel.addRow(khachHang.toDataRow());
        }

}
    public void showLSMH(List<DanhSachKHViewModel> list01){
      defaultTableModel = (DefaultTableModel) TB_bang02.getModel();
        defaultTableModel.setRowCount(0);
        for (DanhSachKHViewModel khachHang01 : list01) {
            defaultTableModel.addRow(khachHang01.toDataRow());
        }

}
    public int layid() {
        Integer row = TB_bang1.getSelectedRow();
        int id = Integer.parseInt(TB_bang1.getValueAt(row, 0).toString());
        return id;

    }
 private Model.KhachHang getData() {
        Model.KhachHang cv = new Model.KhachHang();
        cv.setMa(txt_makh.getText());
        cv.setTen(txt_Ten.getText());
        cv.setTendem(txt_tenDem.getText());
        cv.setHo(txt_Ho.getText());
        int gt;
        if (rdo_nam.isSelected()) {
            gt = 0;
        } else {
            gt = 1;
        }
        cv.setGioitinh(gt);
        cv.setNgaysinh(date_ngaysinh1.getDate());
        cv.setSdt(txt_sdt.getText());
        cv.setEmail(txt_email.getText());

        return cv;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBL_SOLUONG;
    private javax.swing.JTable TB_bang02;
    private javax.swing.JTable TB_bang1;
    private javax.swing.JLabel TXT_01;
    private javax.swing.JLabel TXT_ID;
    private javax.swing.JButton btn_capnhat;
    private javax.swing.JButton btn_hienthi;
    private javax.swing.JButton btn_lammoi;
    private javax.swing.JButton btn_them;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_gt;
    private com.toedter.calendar.JDateChooser date_ngaysinh1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JRadioButton rdo_nam;
    private javax.swing.JRadioButton rdo_nu;
    private javax.swing.JTextField txt_Ho;
    private javax.swing.JTextField txt_Ten;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_makh;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_tenDem;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}