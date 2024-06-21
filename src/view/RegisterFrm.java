package view;

import controller.Client;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegisterFrm extends javax.swing.JFrame {

    public RegisterFrm() {
        initComponents();
        this.setTitle("Caro Game");
        this.setIconImage(new ImageIcon("assets/image/caroicon.png").getImage());
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        avatarComboBox.setMaximumRowCount(5);
        for (int i = 0; i <= 5; i++) {
            avatarComboBox.addItem(new ImageIcon("assets/avatar/" + i + ".jpg"));
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameValue = new javax.swing.JTextField();
        nicknameValue = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        nicknameLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        jPasswordValue = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        framelabel = new javax.swing.JLabel();
        avatarLabel = new javax.swing.JLabel();
        avatarComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        usernameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-myspace-30.png"))); // NOI18N
        usernameLabel.setText("Tài Khoản");

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        passwordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-key-30.png"))); // NOI18N
        passwordLabel.setText("Mật Khẩu");

        nicknameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        nicknameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-hand-cursor-30.png"))); // NOI18N
        nicknameLabel.setText("NickName");

        registerButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-done-35.png"))); // NOI18N
        registerButton.setText("Đăng ký");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        loginLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(0, 0, 255));
        loginLabel.setText("Đã có tài khoản, đăng nhập tại đây");
        loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLabelMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        framelabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        framelabel.setForeground(new java.awt.Color(255, 255, 255));
        framelabel.setText("Đăng Ký");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(framelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(framelabel)
                .addGap(20, 20, 20))
        );

        avatarLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        avatarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-cursor-50.png"))); // NOI18N
        avatarLabel.setText("Chọn Avatar");

        avatarComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avatarComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nicknameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordValue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nicknameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(avatarLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avatarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(loginLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(registerButton)))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nicknameValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nicknameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avatarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avatarLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(loginLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseClicked
        Client.closeView(Client.View.REGISTER);
        Client.openView(Client.View.LOGIN);
    }//GEN-LAST:event_loginLabelMouseClicked

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        try {
            String username = usernameValue.getText();
            if (username.isEmpty())
                throw new Exception("Vui lòng nhập tên tài khoản");
            String password = String.copyValueOf(jPasswordValue.getPassword());
            if (password.isEmpty())
                throw new Exception("Vui lòng nhập mật khẩu");
            String nickName = nicknameValue.getText();
            int avatar = avatarComboBox.getSelectedIndex();
            if (avatar == -1) {
                throw new Exception("Vui lòng chọn avatar");
            }
            if (nickName.isEmpty())
                throw new Exception("Vui lòng nhập nickname");
            Client.closeAllViews();
            Client.openView(Client.View.GAME_NOTICE, "Đăng kí tài khoản", "Đang chờ phản hồi");
            Client.socketHandle.write("register," + username + "," + password + "," + nickName + "," + avatar);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void avatarComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avatarComboBoxActionPerformed

    }//GEN-LAST:event_avatarComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<ImageIcon> avatarComboBox;
    private javax.swing.JLabel avatarLabel;
    private javax.swing.JLabel framelabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordValue;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel nicknameLabel;
    private javax.swing.JTextField nicknameValue;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameValue;
    // End of variables declaration//GEN-END:variables
}
