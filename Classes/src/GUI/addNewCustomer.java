package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class addNewCustomer extends JInternalFrame {

    public addNewCustomer() {
                JPanel jPanel1 = new JPanel();
                JLabel titel = new JLabel();
                JLabel IdLabel = new JLabel();
                JLabel mobileLabel = new JLabel();
                JLabel fnameLabel = new JLabel();
                JLabel adressLabel = new JLabel();
                JLabel jLabel6 = new JLabel();
                JLabel emailLabel = new JLabel();
                JLabel lnameLabel = new JLabel();
                JLabel typeLabel = new JLabel();

                JTextField jTextField1 = new JTextField();
                JTextField jTextField2 = new JTextField();
                JTextField jTextField3 = new JTextField();
                JTextField jTextField4 = new JTextField();
                JTextField jTextField5 = new JTextField();
                JComboBox<String> jComboBox1 = new JComboBox<String>(new String[] {"New","Returning","VIP"});


                JButton anew = new JButton();
                JButton update = new JButton();
                JButton del = new JButton();
                //JScrollPane jScrollPane1 = new JScrollPane();
                JTable jTable1 = new JTable();
                JTextField jTextField6 = new JTextField();
                JScrollPane jScrollPane1 = new JScrollPane(jTable1);
                jTable1.setFillsViewportHeight(true);

                jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16));
                jLabel6.setText("Address");


                this.setResizable(true);
                this.setTitle("Add New Customer");


                typeLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                typeLabel.setText("Customer Type");


                titel.setFont(new java.awt.Font("Tahoma", 0, 24));
                titel.setText("Customer Details");

                IdLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                IdLabel.setText("Customer Id");

                mobileLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                mobileLabel.setText("Mobile Number");

                fnameLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                fnameLabel.setText("First Name");

                lnameLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                lnameLabel.setText("Last Name");

                adressLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                adressLabel.setText("Address");

                emailLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                emailLabel.setText("Email");

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
                                "Id", "First Name","Last Name","Type", "Phone#.", "Address",
                        }
                ));
                jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        // jTable1MouseClicked(evt);
                    }
                });
                jScrollPane1.setViewportView(jTable1);

                jTextField6.setFont(new java.awt.Font("Tahoma", 0, 16));

                GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(35, 35, 35)
                                                        .addComponent(titel, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                .addComponent(anew)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                       // .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lnameLabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(IdLabel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(fnameLabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(mobileLabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(typeLabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(adressLabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(83, 83, 83)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                                                               // .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(47, 47, 47)
                                                                        .addComponent(update)
                                                                        .addGap(39, 39, 39)
                                                                        .addComponent(del)))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)))
                                        .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(titel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(49, 49, 49)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(IdLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGap(13, 13, 13)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(fnameLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lnameLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)/////////////////////////////////////////////////
                                                                .addComponent(typeLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)/////////////////////////////////////////////////////////////
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(mobileLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(adressLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        //.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(anew)
                                                                .addComponent(update)
                                                                .addComponent(del))
                                                        .addGap(43, 43, 43))))
                );

                GroupLayout layout = new GroupLayout(this.getContentPane());
                this.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
        this.pack();
        this.setVisible(true);
        this.setClosable(true);
        this.setIconifiable(true);
        this.setMaximizable(true);
        this.setResizable(true);
    }




    private static void createAndShowUI() {
        addNewCustomer frame = new addNewCustomer();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(true);
        frame.setVisible(true);



    }



    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                createAndShowUI();
            }
        });
    }
}
