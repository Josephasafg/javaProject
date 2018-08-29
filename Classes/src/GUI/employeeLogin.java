package GUI;

import DB.DBSingleton;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
                final int[] tries = {2};
                Connection connect;
                JFrame loginFrame = new JFrame();
                JPanel mainPanel = new JPanel();
                JLabel title = new JLabel();
                JLabel al1 = new JLabel();
                JLabel al2 = new JLabel();
                JTextField username = new JTextField();
                JPasswordField password = new JPasswordField();
                JButton loginB = new JButton();
                JCheckBox checkB = new JCheckBox();
                DBSingleton dbSingleton = new DBSingleton();
                connect = dbSingleton.getConn();



                loginFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                loginFrame.setTitle("User Login");

                mainPanel.setBackground(new java.awt.Color(100, 200, 255));

                title.setFont(new java.awt.Font("Tahoma", 0, 24));
                title.setText("  USER LOGIN");

                al2.setFont(new java.awt.Font("Tahoma", 0, 18));
                al2.setText("Password");

                al1.setFont(new java.awt.Font("Tahoma", 0, 18));
                al1.setText("User Id");

                //user name field
                username.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        // usernameActionPerformed(evt);
                    }
                });

                loginB.setFont(new java.awt.Font("Tahoma", 0, 16));
                loginB.setText("Login");
                loginB.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        // loginBActionPerformed(evt);
                        try {
                            Statement st = connect.createStatement();
                            ResultSet rs = st.executeQuery("select * from employee");

                            if (rs.next()) {
                                while (tries[0] != 0) {
                                    if (rs.getString("empCode").equals(username.getText()) && (rs.getString("password").equals(password.getText()))) {
                                        JOptionPane.showMessageDialog(loginFrame, "Connected!");
                                        break;
                                    } else {
                                        JOptionPane.showMessageDialog(loginFrame, tries[0] + " tries left!");
                                        tries[0]--;
                                    }
                                    return;
                                }
                                if(tries[0] == 0)
                                {
                                    JOptionPane.showMessageDialog(loginFrame,"User Blocked!");
                                    System.exit(0);
                                }

                                connect.close();
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                });

                checkB.setText("Show Password");
                checkB.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        //  checkBActionPerformed(evt);
                        if(checkB.isSelected()) {
                            password.setEchoChar((char)0);
                        }
                        else{
                            password.setEchoChar('*');
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
                                                        .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                        .addComponent(password))
                                                .addComponent(checkB, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(86, 86, 86))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                        .addGap(145, 145, 145)
                                                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                        .addGap(192, 192, 192)
                                                        .addComponent(loginB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(102, 102, 102)
                                                .addComponent(al1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(308, Short.MAX_VALUE))));
                mainPanelLayout.setVerticalGroup(
                        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(al2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(checkB)
                                        .addGap(36, 36, 36)
                                        .addComponent(loginB)
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
