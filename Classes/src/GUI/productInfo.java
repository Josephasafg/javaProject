package GUI;

import javax.swing.*;
import java.awt.*;


public class productInfo extends JFrame {
    public void productInfo(){
        setTitle("SWING");

    }

    public static void main(String[] args){
        creatAndRunJFrame();
    }



    public static void creatAndRunJFrame(){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame proInfoFrame = new JFrame();

                JPanel jPanel1 = new JPanel();
                JLabel titleLabel = new JLabel();
                JLabel pnameLabel = new JLabel();
                JTextField jTextField1 = new JTextField();
                JButton searchButton = new JButton();
                JScrollPane jScrollPane1 = new JScrollPane();
                JTable jTable1 = new JTable();

                proInfoFrame.setResizable(true);
                proInfoFrame.setTitle("Product Information");

                titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); 
                titleLabel.setText("Product Information");

                pnameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); 
                pnameLabel.setText("Product ");

                jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); 

                searchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); 
                searchButton.setForeground(new java.awt.Color(0, 0, 102));
               // searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                searchButton.setText("Search");
                searchButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                       // searchButtonActionPerformed(evt);
                    }
                });

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Product Id", "Product Name", "Available", "Mrp"
                        }
                ));
                jScrollPane1.setViewportView(jTable1);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(68, 68, 68)
                                                        .addComponent(pnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(51, 51, 51)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(56, 56, 56)
                                                        .addComponent(searchButton))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(169, 169, 169)
                                                        .addComponent(titleLabel)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 60, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(titleLabel)
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(pnameLabel)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                        .addGap(13, 13, 13))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(proInfoFrame.getContentPane());
                proInfoFrame.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 25, Short.MAX_VALUE))
                );

                proInfoFrame.pack();
                proInfoFrame.setVisible(true);

            }
        });

    }


}










