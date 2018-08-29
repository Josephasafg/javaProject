package GUI;

import DB.DBSingleton;
import EmployeePack.*;
import jdk.nashorn.internal.runtime.ECMAException;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
                JLabel statusLabel = new JLabel();
                JPanel jPanel1 = new JPanel();
                JLabel title = new JLabel();
                JLabel IdLabel = new JLabel();
                JLabel mobileLabel = new JLabel();
                JLabel nameLabel = new JLabel();
                JLabel addressLabel = new JLabel();
                JLabel jLabel6 = new JLabel();
                JLabel emailLabel = new JLabel();
                JLabel passLabel = new JLabel();
                JLabel typeLabel = new JLabel();
                Connection connect;
                DBSingleton dbSingleton = new DBSingleton();
                connect = dbSingleton.getConn();


                JTextField userID = new JTextField();
                JTextField userFirstName = new JTextField();
                JTextField userPhone = new JTextField();
                JTextField userLastName = new JTextField();
                JTextField userBranch = new JTextField();
                JTextField temp = new JTextField();
                //JTextField jTextField8 = new JTextField();
                JComboBox<String> jComboBox1 = new JComboBox<String>(new String[] {"Manager", "Seller", "Cashier"});
                JButton anew = new JButton();
                JButton update = new JButton();
                JButton del = new JButton();
                JTable jTable1 = new JTable();
                JScrollPane jScrollPane1 = new JScrollPane(jTable1);
                jTable1.setFillsViewportHeight(true);


                jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16));
                jLabel6.setText("Last Name");

                newEmpFrame.setResizable(true);
                newEmpFrame.setTitle("Add New User");


                typeLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                typeLabel.setText("User Type");

                title.setFont(new java.awt.Font("Tahoma", 0, 24));
                title.setText("Add User Details");

                IdLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                IdLabel.setText("User Id");

                mobileLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                mobileLabel.setText("Mobile Number");

                nameLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                nameLabel.setText("First Name");

                addressLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                addressLabel.setText("Last Name");

                emailLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                emailLabel.setText("Branch Number");

                //passLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                //passLabel.setText("Password");

                userID.setFont(new java.awt.Font("Tahoma", 0, 16));

                userFirstName.setFont(new java.awt.Font("Tahoma", 0, 16));

                userPhone.setFont(new java.awt.Font("Tahoma", 0, 16));

                userLastName.setFont(new java.awt.Font("Tahoma", 0, 16));

                userBranch.setFont(new java.awt.Font("Tahoma", 0, 16));

                anew.setFont(new java.awt.Font("Tahoma", 0, 16));
                //anew.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                anew.setText("Add New");
                anew.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        // anewActionPerformed(evt);
                        ManagerTools managerTools = null;
                        try {
                            managerTools = new ManagerTools();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Employee currentEmployee = null;

                        String empType = (String) jComboBox1.getSelectedItem();
                        switch (empType) {
                            case "Manager":
                                try {
                                    currentEmployee = new Manager();
                                    currentEmployee.setType(EmployeeTypes.MANAGER);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case "Seller":
                                try {
                                    currentEmployee = new Seller();
                                    currentEmployee.setType(EmployeeTypes.SELLER);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case "Cashier":
                                try {
                                    currentEmployee = new Cashier();
                                    currentEmployee.setType(EmployeeTypes.CASHIER);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                }
                                break;
                        }
                        currentEmployee.setId(Integer.parseInt(userID.getText()));
                        currentEmployee.setFirstName(userFirstName.getText());
                        currentEmployee.setBranchNumber(Integer.parseInt(userBranch.getText()));
                        currentEmployee.setLastName(userLastName.getText());
                        currentEmployee.setTotalHours(0.0);
                        currentEmployee.setEmpCode();
                        managerTools.addEmployee(currentEmployee);

                        

                        }
                    });

                update.setFont(new java.awt.Font("Tahoma", 0, 16));
                    //update.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                update.setText("Update");
                update.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {

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
                        new Object [][] {},
                            new String [] {
                        "Id", "First","Last", "Type", "Branch Number", "Phone#"}
                ));
                jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            // jTable1MouseClicked(evt);
                        }
                    });
                jScrollPane1.setViewportView(jTable1);

                temp.setFont(new java.awt.Font("Tahoma", 0, 16));

                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(35, 35, 35)
                                                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(83, 83, 83)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(userFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(userPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(userLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(userBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(49, 49, 49)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(IdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(13, 13, 13)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(userFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)/////////////////////////////////////////////////
                                                                .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)/////////////////////////////////////////////////////////////
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(userPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(userLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(userBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

