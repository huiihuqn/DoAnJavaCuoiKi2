package view;

import controller.Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class FriendRequestFrm extends javax.swing.JFrame {
    private final int id;
    private final Timer timer;

    
    public FriendRequestFrm(int id, String nickname) {
        this.id = id;
        initComponents();
        this.setTitle("Caro Game");
        this.setIconImage(new ImageIcon("assets/image/caroicon.png").getImage());
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        requestFromLabel.setText("Từ " + nickname + "(ID=" + id + ")");
        timer = new Timer(1000, new ActionListener() {
            int count = 10;

            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                if (count >= 0) {
                    autoCloseLabel.setText("Tự động đóng trong " + count);
                } else {
                    ((Timer) (e.getSource())).stop();
                    disposeFrame();
                }
            }
        });
        timer.setInitialDelay(0);
        timer.start();
    }

    public void disposeFrame() {
        this.dispose();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        frameLabel = new javax.swing.JLabel();
        requestTitleLabel = new javax.swing.JLabel();
        requestFromLabel = new javax.swing.JLabel();
        acceptButton = new javax.swing.JButton();
        declineButton = new javax.swing.JButton();
        autoCloseLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        frameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frameLabel.setForeground(new java.awt.Color(255, 255, 255));
        frameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-add-friend-70.png"))); // NOI18N
        frameLabel.setText("Yêu cầu kết bạn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(frameLabel)
                .addGap(16, 16, 16))
        );

        requestTitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        requestTitleLabel.setForeground(new java.awt.Color(0, 102, 204));
        requestTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requestTitleLabel.setText("Bạn nhận được một lời mời kết bạn ");

        requestFromLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        requestFromLabel.setForeground(new java.awt.Color(0, 102, 204));
        requestFromLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requestFromLabel.setText("Từ");

        acceptButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        acceptButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-yes-18.png"))); // NOI18N
        acceptButton.setText("Đồng ý");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        declineButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        declineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-no-18.png"))); // NOI18N
        declineButton.setText("Từ chối");
        declineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineButtonActionPerformed(evt);
            }
        });

        autoCloseLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        autoCloseLabel.setText("Tự động đóng sau ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(requestTitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(requestFromLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(acceptButton)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(autoCloseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(declineButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(requestTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requestFromLabel)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptButton)
                    .addComponent(declineButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(autoCloseLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        try {
            timer.stop();
            Client.socketHandle.write("make-friend-confirm," + id);
            this.dispose();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Có lỗi xảy ra");
        }
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void declineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineButtonActionPerformed
        timer.stop();
        this.dispose();
    }//GEN-LAST:event_declineButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JLabel autoCloseLabel;
    private javax.swing.JButton declineButton;
    private javax.swing.JLabel frameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel requestFromLabel;
    private javax.swing.JLabel requestTitleLabel;
    // End of variables declaration//GEN-END:variables
}
