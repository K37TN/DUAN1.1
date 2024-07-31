
package Views;

import Model.TaiKhoan;
import Repository.DangnhapRepository;
import Repository.NhanVienRepository;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import poly.edu.main.main;
//import poly.edu.model.TaiKhoan;
//import poly.edu.service.TaiKhoan_Respository;
//import poly.edu.repository.Auth;
//import poly.edu.service.NhanVien_Respository;


public class View_Login extends javax.swing.JFrame {

private DangnhapRepository dangnhapRepository  = new DangnhapRepository();
    
    public View_Login() {
        initComponents();
        setCustomColors();
        
        this.setLocationRelativeTo(null);
    }
    
    void mess(String mess){
        JOptionPane.showMessageDialog(this, mess,"Thông Báo",JOptionPane.INFORMATION_MESSAGE);
    }
    
    void dangNhap(){
          if (!checkValidate()) {
            return;
        }
        String username = txt_Username.getText().trim();
        String password = new String(pwp_Password.getPassword()).trim();

        if (dangnhapRepository.checkLogin(username, password)) {

   JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
    new main().setVisible(true);
        } else {
JOptionPane.showMessageDialog(this, "Đăng nhập thất bại");
        }
    }
   
    boolean checkValidate(){
        if(txt_Username.getText().isEmpty()){
            mess("Bạn chưa nhập Username");
            return false;
        }
        if(new String(pwp_Password.getPassword()).trim().equals("")){
            mess("Bạn chưa nhập mật khẩu");
            return false;
        }
        return true;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLeft = new javax.swing.JPanel();
        jPanelRight = new javax.swing.JPanel();
        btn_singup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_SignIn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txt_Username = new javax.swing.JTextField();
        pwp_Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelLeft.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout jPanelLeftLayout = new javax.swing.GroupLayout(jPanelLeft);
        jPanelLeft.setLayout(jPanelLeftLayout);
        jPanelLeftLayout.setHorizontalGroup(
            jPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );
        jPanelLeftLayout.setVerticalGroup(
            jPanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanelRight.setBackground(new java.awt.Color(156, 207, 238));
        jPanelRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_singup.setBackground(new java.awt.Color(156, 207, 238));
        btn_singup.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_singup.setForeground(new java.awt.Color(255, 255, 255));
        btn_singup.setText("Sign Up");
        btn_singup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelRight.add(btn_singup, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 90, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Forget Password ?");
        jPanelRight.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 210, -1));

        btn_SignIn.setBackground(new java.awt.Color(156, 207, 238));
        btn_SignIn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_SignIn.setForeground(new java.awt.Color(255, 255, 255));
        btn_SignIn.setText("Sign In");
        btn_SignIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignInActionPerformed(evt);
            }
        });
        jPanelRight.add(btn_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 90, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanelRight.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 220, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanelRight.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 220, -1));

        txt_Username.setBackground(new java.awt.Color(156, 207, 238));
        txt_Username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Username.setForeground(new java.awt.Color(255, 255, 255));
        txt_Username.setBorder(null);
        jPanelRight.add(txt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 220, -1));

        pwp_Password.setBackground(new java.awt.Color(156, 207, 238));
        pwp_Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pwp_Password.setForeground(new java.awt.Color(255, 255, 255));
        pwp_Password.setBorder(null);
        jPanelRight.add(pwp_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelRight, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRight, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignInActionPerformed
        // TODO add your handling code here:
        if(!checkValidate()){
            return;
        }
        this.dangNhap();
    }//GEN-LAST:event_btn_SignInActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Login().setVisible(true);
            }
        });
    }

    private void setCustomColors() {
           jPanelLeft.setBackground(new java.awt.Color(255, 87, 34)); // Màu cam đậm
        jPanelRight.setBackground(new java.awt.Color(255, 138, 101)); // Màu cam nhạt

        // Đặt màu nền và màu chữ cho các nút
        btn_SignIn.setBackground(new java.awt.Color(255, 87, 34)); // Màu cam đậm
        btn_SignIn.setForeground(new java.awt.Color(255, 255, 255)); // Màu trắng

        btn_singup.setBackground(new java.awt.Color(255, 87, 34)); // Màu cam đậm
        btn_singup.setForeground(new java.awt.Color(255, 255, 255)); // Màu trắng

        // Đặt màu chữ cho các JLabel
        txt_Username.setForeground(new java.awt.Color(255, 255, 255)); // Màu trắng
        txt_Username.setForeground(new java.awt.Color(255, 255, 255)); // Màu trắng
        pwp_Password.setForeground(new java.awt.Color(255, 255, 255)); // Màu trắng
        pwp_Password.setForeground(new java.awt.Color(255, 255, 255)); // Màu trắng

        // Đặt màu nền và màu chữ cho các JTextField và JPasswordField
        txt_Username.setBackground(new java.awt.Color(255, 138, 101)); // Màu cam nhạt
        txt_Username.setForeground(new java.awt.Color(255, 255, 255)); // Màu trắng

        pwp_Password.setBackground(new java.awt.Color(255, 138, 101)); // Màu cam nhạt
        pwp_Password.setForeground(new java.awt.Color(255, 255, 255)); // Màu trắng
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SignIn;
    private javax.swing.JButton btn_singup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelLeft;
    private javax.swing.JPanel jPanelRight;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pwp_Password;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables

}
