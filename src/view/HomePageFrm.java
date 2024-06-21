package view;

import controller.Client;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class HomePageFrm extends javax.swing.JFrame {
    /**
     * Creates new form GiaoDienChinhFrm
     */
    public HomePageFrm() {
        initComponents();
        this.setTitle("Caro Game");
        this.setIconImage(new ImageIcon("assets/image/caroicon.png").getImage());
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        jLabel4.setText(Client.user.getNickname());
        numberOfWinValue.setText(Integer.toString(Client.user.getNumberOfWin()));
        numberOfGameValue.setText(Integer.toString(Client.user.getNumberOfGame()));
        jLabel8.setIcon(new ImageIcon("assets/avatar/" + Client.user.getAvatar() + ".jpg"));
        sendMessageButton.setIcon(new ImageIcon("assets/image/send2.png"));
        messageTextArea.setEditable(false);
        if (Client.user.getNumberOfGame() == 0) {
            winRatioValue.setText("-");
        } else {
            winRatioValue.setText(String.format("%.2f", (float) Client.user.getNumberOfWin() / Client.user.getNumberOfGame() * 100) + "%");
        }
        drawValue.setText("" + Client.user.getNumberOfDraw());
        markValue.setText("" + (Client.user.getNumberOfGame() + Client.user.getNumberOfWin() * 10));
        rankValue.setText("" + Client.user.getRank());
    }

   
    

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel5 = new javax.swing.JPanel();
        frameLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numberOfWinLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numberOfWinValue = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        numberOfGameValue = new javax.swing.JLabel();
        numberOfGameLabel = new javax.swing.JLabel();
        markLabel = new javax.swing.JLabel();
        markValue = new javax.swing.JLabel();
        rankLabel = new javax.swing.JLabel();
        rankValue = new javax.swing.JLabel();
        winRatioLabel = new javax.swing.JLabel();
        winRatioValue = new javax.swing.JLabel();
        drawLabel = new javax.swing.JLabel();
        drawValue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        messageInput = new javax.swing.JTextField();
        sendMessageButton = new javax.swing.JButton();
        friendListButton = new javax.swing.JButton();
        scoreBoardButton = new javax.swing.JButton();
        createRoomButton = new javax.swing.JButton();
        goRoomButton = new javax.swing.JButton();
        findRoomButton = new javax.swing.JButton();
        quickGameButton = new javax.swing.JButton();
        scoreBotButton = new javax.swing.JButton();
        exitGameButton = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frameLabel.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        frameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frameLabel.setText("Game Caro ");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NickName");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        numberOfWinLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        numberOfWinLabel.setForeground(new java.awt.Color(255, 255, 255));
        numberOfWinLabel.setText("Số ván thắng");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("{day la Nick name}");

        numberOfWinValue.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        numberOfWinValue.setForeground(new java.awt.Color(255, 255, 255));
        numberOfWinValue.setText("{day la so van thang}");

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));

        numberOfGameValue.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        numberOfGameValue.setForeground(new java.awt.Color(255, 255, 255));
        numberOfGameValue.setText("{day la so van da choi}");

        numberOfGameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        numberOfGameLabel.setForeground(new java.awt.Color(255, 255, 255));
        numberOfGameLabel.setText("Số ván đã chơi");

        markLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        markLabel.setForeground(new java.awt.Color(255, 255, 255));
        markLabel.setText("Điểm");

        markValue.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        markValue.setForeground(new java.awt.Color(255, 255, 255));
        markValue.setText("{day la diem}");

        rankLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rankLabel.setForeground(new java.awt.Color(255, 255, 255));
        rankLabel.setText("Thứ hạng");

        rankValue.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rankValue.setForeground(new java.awt.Color(255, 255, 255));
        rankValue.setText("{day la thu hang}");

        winRatioLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        winRatioLabel.setForeground(new java.awt.Color(255, 255, 255));
        winRatioLabel.setText("Tỉ lệ thắng");

        winRatioValue.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        winRatioValue.setForeground(new java.awt.Color(255, 255, 255));
        winRatioValue.setText("{day la ti le thang}");

        drawLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        drawLabel.setForeground(new java.awt.Color(255, 255, 255));
        drawLabel.setText("Số ván hòa");

        drawValue.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        drawValue.setForeground(new java.awt.Color(255, 255, 255));
        drawValue.setText("{day la so van hoa}");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberOfWinLabel)
                            .addComponent(jLabel1)
                            .addComponent(numberOfGameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numberOfWinValue, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberOfGameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(drawLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(markLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(winRatioLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rankLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(markValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(winRatioValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rankValue, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(drawValue, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(numberOfGameValue))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberOfGameLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberOfWinValue)
                            .addComponent(numberOfWinLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drawLabel)
                            .addComponent(drawValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(winRatioLabel)
                            .addComponent(winRatioValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(markValue)
                            .addComponent(markLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel)
                    .addComponent(rankValue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        jScrollPane1.setViewportView(messageTextArea);

        messageInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                messageInputKeyPressed(evt);
            }
        });

        sendMessageButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sendMessageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-send-25.png"))); // NOI18N
        sendMessageButton.setText("Gửi");
        sendMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageButtonActionPerformed(evt);
            }
        });

        friendListButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        friendListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-list-25.png"))); // NOI18N
        friendListButton.setText("Danh sách bạn bè");
        friendListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friendListButtonActionPerformed(evt);
            }
        });

        scoreBoardButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        scoreBoardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-ranking-25.png"))); // NOI18N
        scoreBoardButton.setText("Bảng xếp hạng");
        scoreBoardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreBoardButtonActionPerformed(evt);
            }
        });

        createRoomButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        createRoomButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-create-25.png"))); // NOI18N
        createRoomButton.setText("Tạo Phòng");
        createRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRoomButtonActionPerformed(evt);
            }
        });

        goRoomButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        goRoomButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-room-25.png"))); // NOI18N
        goRoomButton.setText("Vào phòng");
        goRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goRoomButtonActionPerformed(evt);
            }
        });

        findRoomButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        findRoomButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-search-25.png"))); // NOI18N
        findRoomButton.setText("Tìm phòng");
        findRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findRoomButtonActionPerformed(evt);
            }
        });

        quickGameButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        quickGameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-play-25.png"))); // NOI18N
        quickGameButton.setText("Chơi nhanh");
        quickGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickGameButtonActionPerformed(evt);
            }
        });

        scoreBotButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        scoreBotButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-logout-25.png"))); // NOI18N
        scoreBotButton.setText("Đăng xuất");
        scoreBotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreBotButtonActionPerformed(evt);
            }
        });

        exitGameButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        exitGameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-fire-exit-25.png"))); // NOI18N
        exitGameButton.setText("Thoát Game");
        exitGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(messageInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendMessageButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(quickGameButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(createRoomButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(findRoomButton, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(goRoomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scoreBoardButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(friendListButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(scoreBotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitGameButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageInput)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sendMessageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreBoardButton)
                    .addComponent(quickGameButton)
                    .addComponent(findRoomButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(goRoomButton)
                        .addComponent(createRoomButton))
                    .addComponent(friendListButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitGameButton)
                    .addComponent(scoreBotButton))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorMoved

    private void createRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRoomButtonActionPerformed
        int res = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn đặt mật khẩu cho phòng không?", "Tạo phòng", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            Client.closeView(Client.View.HOMEPAGE);
            Client.openView(Client.View.CREATE_ROOM_PASSWORD);
        } else if (res == JOptionPane.NO_OPTION) {
            try {
                Client.socketHandle.write("create-room,");
                Client.closeView(Client.View.HOMEPAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }//GEN-LAST:event_createRoomButtonActionPerformed

    private void findRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findRoomButtonActionPerformed
        try {
            Client.closeView(Client.View.HOMEPAGE);
            Client.openView(Client.View.ROOM_LIST);
            Client.socketHandle.write("view-room-list,");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_findRoomButtonActionPerformed

    private void scoreBoardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreBoardButtonActionPerformed
        Client.openView(Client.View.RANK);
    }//GEN-LAST:event_scoreBoardButtonActionPerformed

    private void scoreBotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreBotButtonActionPerformed
        try {
            Client.socketHandle.write("offline," + Client.user.getID());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        Client.closeView(Client.View.HOMEPAGE);
        Client.openView(Client.View.LOGIN);
    }//GEN-LAST:event_scoreBotButtonActionPerformed

    private void exitGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitGameButtonActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_exitGameButtonActionPerformed

    private void friendListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friendListButtonActionPerformed
        Client.closeView(Client.View.HOMEPAGE);
        Client.openView(Client.View.FRIEND_LIST);
    }//GEN-LAST:event_friendListButtonActionPerformed

    private void quickGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickGameButtonActionPerformed
        Client.closeView(Client.View.HOMEPAGE);
        Client.openView(Client.View.FIND_ROOM);
    }//GEN-LAST:event_quickGameButtonActionPerformed

    private void goRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goRoomButtonActionPerformed
        Client.openView(Client.View.ROOM_NAME_FRM);
    }//GEN-LAST:event_goRoomButtonActionPerformed

    private void sendMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageButtonActionPerformed
        sendMessage();
    }//GEN-LAST:event_sendMessageButtonActionPerformed

    private void messageInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageInputKeyPressed
        if (evt.getKeyCode() == 10) {
            sendMessage();
        }
    }//GEN-LAST:event_messageInputKeyPressed

    private void sendMessage() {
        try {
            if (messageInput.getText().isEmpty()) {
                throw new Exception("Vui lòng nhập nội dung tin nhắn");
            }
            String temp = messageTextArea.getText();
            temp += "Tôi: " + messageInput.getText() + "\n";
            messageTextArea.setText(temp);
            Client.socketHandle.write("chat-server," + messageInput.getText());
            messageInput.setText("");
            messageTextArea.setCaretPosition(messageTextArea.getDocument().getLength());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }

    public void addMessage(String message) {
        String temp = messageTextArea.getText();
        temp += message + "\n";
        messageTextArea.setText(temp);
        messageTextArea.setCaretPosition(messageTextArea.getDocument().getLength());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createRoomButton;
    private javax.swing.JLabel drawLabel;
    private javax.swing.JLabel drawValue;
    private javax.swing.JButton exitGameButton;
    private javax.swing.JButton findRoomButton;
    private javax.swing.JLabel frameLabel;
    private javax.swing.JButton friendListButton;
    private javax.swing.JButton goRoomButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel markLabel;
    private javax.swing.JLabel markValue;
    private javax.swing.JTextField messageInput;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JLabel numberOfGameLabel;
    private javax.swing.JLabel numberOfGameValue;
    private javax.swing.JLabel numberOfWinLabel;
    private javax.swing.JLabel numberOfWinValue;
    private javax.swing.JButton quickGameButton;
    private javax.swing.JLabel rankLabel;
    private javax.swing.JLabel rankValue;
    private javax.swing.JButton scoreBoardButton;
    private javax.swing.JButton scoreBotButton;
    private javax.swing.JButton sendMessageButton;
    private javax.swing.JLabel winRatioLabel;
    private javax.swing.JLabel winRatioValue;
    // End of variables declaration//GEN-END:variables
}
