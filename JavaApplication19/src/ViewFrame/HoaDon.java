/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ViewFrame;

import Model.HoaDonChiTiet;
import Model.sanPham;
import Repository.HoaDonRepository;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FPTSHOP
 */
public class HoaDon extends javax.swing.JPanel {

    DefaultTableModel defaultTableModel;
    private  HoaDonRepository donRepository;
    public HoaDon() {
        initComponents();
          donRepository = new HoaDonRepository();
        loadDataToTable();
    }
         private void addSelectionListener() {
        tbl_hoadon.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tbl_hoadon.getSelectedRow();
                    if (selectedRow != -1) {
                        // Get maHoaDon from the selected row
                        String maHoaDon = tbl_hoadon.getValueAt(selectedRow, 0).toString();
                        lbMahoadon.setText("Hóa đơn: " + maHoaDon); // Trực tiếp đặt maHoaDon
                        
                        try {
                            // Call the method with maHoaDon
                            loadDataToTable1(maHoaDon);
                        } catch (SQLException ex) {
                            Logger.getLogger(Views.HoaDon.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        });
    }
       private void loadDataToTable1(String maHoaDon) throws SQLException {
        List<HoaDonChiTiet> listChiTiet = donRepository.GetChiTietHoaDon(maHoaDon);
        DefaultTableModel model = (DefaultTableModel) tbHoaDonChiTiet.getModel();
        model.setRowCount(0);
        int stt = 1;

        for (HoaDonChiTiet chiTiet : listChiTiet) {
            sanPham sanPham = chiTiet.getSanPham();
            if (sanPham != null) {
                String tenSanPham = sanPham.getTen();
                BigDecimal giaBan = sanPham.getGiaBan();
                int soLuong = chiTiet.getSoluong();
                BigDecimal thanhTien = giaBan.multiply(BigDecimal.valueOf(soLuong));
                Double dongia = chiTiet.getDonGia(); 
                Double donGiaKhiGiam = chiTiet.getDonKhiGiam(); // Lấy giá khi giảm

                model.addRow(new Object[]{
                    stt++,
                    tenSanPham != null ? tenSanPham : "N/A",
                    giaBan,
                    soLuong,
                    thanhTien
                });
                lbgiagoc.setText("Đơn giá: " + dongia);
            lbgiasaukhigiam.setText("Đơn giá khi giảm: " + donGiaKhiGiam);

            } else {
                model.addRow(new Object[]{
                    stt++,
                    "N/A",
                    BigDecimal.ZERO,
                    chiTiet.getSoluong(),
                    BigDecimal.ZERO
                });
            }
        }
    }
   private void loadDataToTable() {
       List<Model.HoaDon> listHoaDon = donRepository.GetAllHD();
    DefaultTableModel model = (DefaultTableModel) tbl_hoadon.getModel();
    model.setRowCount(0); // Xóa các hàng hiện tại

    // Khởi tạo DecimalFormat để định dạng tiền tệ
    DecimalFormat currencyFormat = new DecimalFormat("#,###");

    for (Model.HoaDon hd : listHoaDon) {
        model.addRow(new Object[]{
            hd.getMa(),  // Mã hóa đơn
            hd.getKhachHang() != null ? hd.getKhachHang().getTen() : "Chưa có thông tin", // Tên khách hàng (kiểm tra null)
            currencyFormat.format(hd.getTongTien()),  // Tổng tiền định dạng
            hd.getNgayTao(),  // Ngày tạo
            hd.getNgayThanhToan(),  // Ngày thanh toán
            hd.getTinhTrang() == 0 ? "Chưa thanh toán" : "Đã thanh toán", // Trạng thái
            hd.getGhichu() != null ? hd.getGhichu() : "Không có" // Ghi chú (kiểm tra null)
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_hoadon = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHoaDonChiTiet = new javax.swing.JTable();
        lbMahoadon = new javax.swing.JLabel();
        lbgiagoc = new javax.swing.JLabel();
        lbgiasaukhigiam = new javax.swing.JLabel();

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Hóa Đơn"));

        tbl_hoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã HD", "Tên KH", "Tổng Tiền", "Ngày Tạo", "Ngày Thanh Toán", "Trạng Thái", "Ghi Chú"
            }
        ));
        tbl_hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_hoadonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_hoadon);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Hóa Đơn Chi Tiết"));

        tbHoaDonChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "sản phẩm ", "giá tiền ", "số lương ", "tổng"
            }
        ));
        jScrollPane2.setViewportView(tbHoaDonChiTiet);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbMahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(lbgiagoc, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbgiasaukhigiam, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbMahoadon, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbgiasaukhigiam, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(lbgiagoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_hoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_hoadonMouseClicked
        int selectedRow = tbl_hoadon.getSelectedRow();
        if (selectedRow != -1) {
            // Get maHoaDon from the selected row
            String maHoaDon = tbl_hoadon.getValueAt(selectedRow, 0).toString();
            lbMahoadon.setText("Hóa đơn: " + maHoaDon);
            try {
                loadDataToTable1(maHoaDon);
            } catch (SQLException ex) {
                Logger.getLogger(Views.HoaDon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tbl_hoadonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbMahoadon;
    private javax.swing.JLabel lbgiagoc;
    private javax.swing.JLabel lbgiasaukhigiam;
    private javax.swing.JTable tbHoaDonChiTiet;
    private javax.swing.JTable tbl_hoadon;
    // End of variables declaration//GEN-END:variables
}
