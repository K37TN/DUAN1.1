
package Views;

import Model.TaiKhoan;
import Repository.NhanVienRepository;
import javax.swing.JOptionPane;
import poly.edu.main.main;
//import poly.edu.model.TaiKhoan;
//import poly.edu.service.TaiKhoan_Respository;
//import poly.edu.repository.Auth;
//import poly.edu.service.NhanVien_Respository;


public class View_Login extends javax.swing.JFrame {

//    private final TaiKhoan_Respository tkr = new TaiKhoan_Respository();
    private final  NhanVienRepository nvr = new NhanVienRepository();
    
    public View_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    void mess(String mess){
        JOptionPane.showMessageDialog(this, mess,"Thông Báo",JOptionPane.INFORMATION_MESSAGE);
    }
    
    void dangNhap(){
        String tk = txt_Username.getText().trim();
        String mk = String.valueOf(pwp_Password.getPassword()).trim();
        TaiKhoan taikhoan = nvr.getbyTaiKhoan(tk);
        
        if(taikhoan == null){
            mess("Tài khoản không tồn tại");
        }
        else if(!mk.equals(taikhoan.getMk())){
            mess("Sai mật khẩu");
        }
        else {
            
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_SignIn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txt_Username = new javax.swing.JTextField();
        pwp_Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(51, 150, 207));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(156, 207, 238));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(156, 207, 238));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign Up");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 90, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Forget Password ?");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 210, -1));

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
        jPanel5.add(btn_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 90, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 220, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 220, -1));

        txt_Username.setBackground(new java.awt.Color(156, 207, 238));
        txt_Username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Username.setForeground(new java.awt.Color(255, 255, 255));
        txt_Username.setBorder(null);
        jPanel5.add(txt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 220, -1));

        pwp_Password.setBackground(new java.awt.Color(156, 207, 238));
        pwp_Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pwp_Password.setForeground(new java.awt.Color(255, 255, 255));
        pwp_Password.setBorder(null);
        jPanel5.add(pwp_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SignIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pwp_Password;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}
