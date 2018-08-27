package GUI;

import javax.swing.*;
import java.awt.*;

public class addNewEmployee extends JFrame {
    public void addNewEmployee(){
        setTitle("GUI.addNewEmployee");

    }

    public static void main(String[] args){
        creatAndRunJFrame();
    }



    public static void creatAndRunJFrame(){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame newEmpFrame = new JFrame();


                JPanel jPanel1 = new JPanel();
                JLabel titel = new JLabel();
                JLabel IdLabel = new JLabel();
                JLabel mobileLabel = new JLabel();
                JLabel nameLabel = new JLabel();
                JLabel adressLabel = new JLabel();
                JLabel jLabel6 = new JLabel();
                JLabel emailLabel = new JLabel();
                JLabel passLabel = new JLabel();
                JLabel typeLabel = new JLabel();


                JTextField jTextField1 = new JTextField();
                JTextField jTextField2 = new JTextField();
                JTextField jTextField3 = new JTextField();
                JTextField jTextField4 = new JTextField();
                JTextField jTextField5 = new JTextField();
                //JTextField jTextField8 = new JTextField();
                JComboBox<String> jComboBox1 = new JComboBox<String>(new String[] {"Seller","Cashier","Manager"});


                JButton anew = new JButton();
                JButton update = new JButton();
                JButton del = new JButton();
                JScrollPane jScrollPane1 = new JScrollPane();
                JTable jTable1 = new JTable();
                JTextField jTextField6 = new JTextField();

                jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); 
                jLabel6.setText("Address");

                newEmpFrame.setResizable(true);
                newEmpFrame.setTitle("Add New User");


                typeLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); 
                typeLabel.setText("User Type");

                titel.setFont(new java.awt.Font("Tahoma", 0, 24)); 
                titel.setText("Add User Details");

                IdLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); 
                IdLabel.setText("User Id");

                mobileLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); 
                mobileLabel.setText("Mobile Number");

                nameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); 
                nameLabel.setText("User Name");

                adressLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); 
                adressLabel.setText("Address");

                emailLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); 
                emailLabel.setText("Email-Id");

                passLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); 
                passLabel.setText("Password");

                jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); 

                jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); 

                jTextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); 

                jTextField4.setFont(new java.awt.Font("Tahoma", 0, 16)); 

                jTextField5.setFont(new java.awt.Font("Tahoma", 0, 16)); 

                anew.setFont(new java.awt.Font("Tahoma", 0, 16)); 
                //anew.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                anew.setText("Add New");
                anew.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                       // anewActionPerformed(evt);
                    }
                });

                update.setFont(new java.awt.Font("Tahoma", 0, 16)); 
                //update.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                update.setText("Update");
                update.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                       // updateActionPerformed(evt);
                    }
                });

                del.setFont(new java.awt.Font("Tahoma", 0, 16)); 
                //del.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                del.setText("Delete");
                del.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                       // delActionPerformed(evt);
                    }
                });

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Id", "Name","Title", "Mobile#.", "Address", "Email", "Password"
                        }
                ));
                jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                       // jTable1MouseClicked(evt);
                    }
                });
                jScrollPane1.setViewportView(jTable1);

                jTextField6.setFont(new java.awt.Font("Tahoma", 0, 16)); 

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(35, 35, 35)
                                                        .addComponent(titel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(anew)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(IdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(adressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(83, 83, 83)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(47, 47, 47)
                                                                        .addComponent(update)
                                                                        .addGap(39, 39, 39)
                                                                        .addComponent(del)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)))
                                        .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(titel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(49, 49, 49)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(IdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(13, 13, 13)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)/////////////////////////////////////////////////
                                                                .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)/////////////////////////////////////////////////////////////
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(adressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(anew)
                                                                .addComponent(update)
                                                                .addComponent(del))
                                                        .addGap(43, 43, 43))))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(newEmpFrame.getContentPane());
                newEmpFrame.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                newEmpFrame.pack();
                newEmpFrame.setVisible(true);

            }
        });

    }

}

