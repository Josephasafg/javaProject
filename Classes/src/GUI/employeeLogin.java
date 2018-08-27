package GUI;

import javax.swing.*;
import java.awt.*;

public class employeeLogin extends JFrame {
    public void employeeLogin(){
        setTitle("SWING");

    }

    public static void main(String[] args){
        creatAndRunJFrame();
    }



    public static void creatAndRunJFrame(){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame loginFrame = new JFrame();
                JPanel mainPanel = new JPanel();
                JLabel titel = new JLabel();
                JLabel al1 = new JLabel();
                JLabel al2 = new JLabel();
                JTextField at1 = new JTextField();
                JPasswordField at2 = new JPasswordField();
                JButton abtn = new JButton();
                JCheckBox ajbx = new JCheckBox();

                loginFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                loginFrame.setTitle("User Login");

                mainPanel.setBackground(new java.awt.Color(100, 200, 255));

                titel.setFont(new java.awt.Font("Tahoma", 0, 24));
                titel.setText("  USER LOGIN");

                al2.setFont(new java.awt.Font("Tahoma", 0, 18));
                al2.setText("Password");

                al1.setFont(new java.awt.Font("Tahoma", 0, 18));
                al1.setText("User Id");

                at1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                       // at1ActionPerformed(evt);
                    }
                });

                abtn.setFont(new java.awt.Font("Tahoma", 0, 16)); 
                abtn.setText("Login");
                abtn.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                       // abtnActionPerformed(evt);
                    }
                });

                ajbx.setText("Show Password");
                ajbx.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                      //  ajbxActionPerformed(evt);
                        if(ajbx.isSelected())
                        {
                            at2.setEchoChar((char)0);
                        }
                        else{
                            at2.setEchoChar('*');
                        }

                    }
                });

                javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
                mainPanel.setLayout(mainPanelLayout);
                mainPanelLayout.setHorizontalGroup(
                        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(al2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(at1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                        .addComponent(at2))
                                                .addComponent(ajbx, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(86, 86, 86))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                        .addGap(145, 145, 145)
                                                        .addComponent(titel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                        .addGap(192, 192, 192)
                                                        .addComponent(abtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(102, 102, 102)
                                                .addComponent(al1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(308, Short.MAX_VALUE)))
                );
                mainPanelLayout.setVerticalGroup(
                        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(titel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(at1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(al2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(at2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ajbx)
                                        .addGap(36, 36, 36)
                                        .addComponent(abtn)
                                        .addContainerGap(105, Short.MAX_VALUE))
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(al1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(252, Short.MAX_VALUE)))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout( loginFrame.getContentPane());
                loginFrame.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                loginFrame.pack();
                loginFrame.setVisible(true);
                
            }
        });

    }



    public static void setLookAndFeel(JFrame theFrame){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            theFrame.pack();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }




}
