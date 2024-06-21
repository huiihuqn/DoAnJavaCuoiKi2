package view;

import controller.Client;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Admin
 */
public class JoinRoomPasswordFrm extends javax.swing.JFrame {
    private int room;
    private String password;

    /**
     * Creates new form JoinRoomPasswordFrm
     */
    public JoinRoomPasswordFrm(int room, String password) {
        initComponents();
        this.setTitle("Caro Game");
        this.setIconImage(new ImageIcon("assets/image/caroicon.png").getImage());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.room = room;
        this.password = password;
        exitButton.setIcon(new ImageIcon("assets/icon/door_exit.png"));
        this.setVisible(true);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        frameLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        passwordInput = new javax.swing.JTextField();
        goToRoomButton = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        frameLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        frameLabel.setForeground(new java.awt.Color(255, 255, 255));
        frameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-baidu-64.png"))); // NOI18N
        frameLabel.setText("Vào Phòng ");

        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frameLabel)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(frameLabel)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        goToRoomButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        goToRoomButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-skyrim-30.png"))); // NOI18N
        goToRoomButton.setText("Vào phòng");
        goToRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToRoomButtonActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Nhập mật khẩu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(goToRoomButton)
                        .addGap(17, 17, 17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(goToRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
        new JoinRoomPasswordFrm(12, "123");
    }
    private void goToRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToRoomButtonActionPerformed
        try {
            String password = passwordInput.getText();
            if (!password.equals(this.password))
                throw new Exception("Mật khẩu không chính xác");
            Client.socketHandle.write("join-room," + this.room);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_goToRoomButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        Client.closeView(Client.View.JOIN_ROOM_PASSWORD);
        Client.openView(Client.View.HOMEPAGE);
    }//GEN-LAST:event_exitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel frameLabel;
    private javax.swing.JButton goToRoomButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passwordInput;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables
}
