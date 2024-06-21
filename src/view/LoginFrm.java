package view;

import controller.Client;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginFrm extends javax.swing.JFrame {
    /**
     * Creates new form DemoFrm
     */
    public LoginFrm() {
        initComponents();
        this.setTitle("Caro Game");
        this.setIconImage(new ImageIcon("assets/image/caroicon.png").getImage());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public LoginFrm(String taiKhoan, String matKhau) {
        initComponents();
        passwordValue.setText(matKhau);
        usernameValue.setText(taiKhoan);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public void showError(String message) {
        JOptionPane.showMessageDialog(rootPane, message);
    }

    public void log(String message) {
        JOptionPane.showMessageDialog(rootPane, "ID của server thread là:" + message);
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameValue = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordValue = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        frameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        usernameLabel.setText("Tài khoản");

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        passwordLabel.setText("Mật khẩu");

        loginButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-login-30.png"))); // NOI18N
        loginButton.setText("Đăng Nhập");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-crab-30.png"))); // NOI18N
        registerButton.setText("Đăng kí");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        frameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        frameLabel.setForeground(new java.awt.Color(255, 255, 255));
        frameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-homer-simpson-64.png"))); // NOI18N
        frameLabel.setText("Đăng Nhập");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(frameLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(frameLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameValue, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(passwordValue)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(loginButton)
                        .addGap(18, 18, 18)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(registerButton))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try {
            String taiKhoan = usernameValue.getText();
            if (taiKhoan.isEmpty())
                throw new Exception("Vui lòng nhập tên tài khoản");
            String matKhau = String.copyValueOf(passwordValue.getPassword());
            if (matKhau.isEmpty())
                throw new Exception("Vui lòng nhập mật khẩu");
            Client.closeAllViews();
            Client.openView(Client.View.GAME_NOTICE, "Đăng nhập", "Đang xác thực thông tin đăng nhập");
            Client.socketHandle.write("client-verify," + taiKhoan + "," + matKhau);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        Client.closeView(Client.View.LOGIN);
        Client.openView(Client.View.REGISTER);
    }//GEN-LAST:event_registerButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel frameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordValue;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameValue;
    // End of variables declaration//GEN-END:variables
}
