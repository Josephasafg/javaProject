package GUI;

import javax.swing.*;
import java.awt.*;

public class inventoryUpdate extends JFrame {
    public void inventoryUpdate(){
        setTitle("SWING");

    }

    public static void main(String[] args){
        creatAndRunJFrame();
    }



    public static void creatAndRunJFrame(){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame invUpdateFrame = new JFrame();

                JPanel jPanel1 = new JPanel();
                JLabel titelLable = new JLabel();
                JLabel pidLable = new JLabel();
                JLabel quntLable = new JLabel();
                JLabel nameLable = new JLabel();
                JLabel mrpLable = new JLabel();
                JLabel adressLable = new JLabel();
                JTextField jTextField1 = new JTextField();
                JTextField jTextField2 = new JTextField();
                JTextField jTextField3 = new JTextField();
                JTextField jTextField4 = new JTextField();
                JButton newButton = new JButton();
                JScrollPane jScrollPane1 = new JScrollPane();
                JTable jTable2 = new JTable();
                JLabel addedQuantLable = new JLabel();
                JTextField jTextField5 = new JTextField();
                JButton updateButton = new JButton();

                adressLable.setText("Address");

                invUpdateFrame.setResizable(true);
                invUpdateFrame.setTitle("Update Inventory");

                titelLable.setFont(new java.awt.Font("Tahoma", 0, 18)); 
                titelLable.setText("Update Inventory");

                pidLable.setText("Product Id");

                quntLable.setText("Available Quantity");

                nameLable.setText("Product Name");

                mrpLable.setText("Mrp");

                //newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                newButton.setText("New");
                newButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                       // newButtonActionPerformed(evt);
                    }
                });

                jTable2.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Product Id", "Product Name", "Available"
                        }
                ));
                jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                       // jTable2MouseClicked(evt);
                    }
                });
                jScrollPane1.setViewportView(jTable2);

                addedQuantLable.setText("Added Quantity");

                //updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                updateButton.setText("Update");
                updateButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                       // updateButtonActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(53, 53, 53)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(pidLable, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(nameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(quntLable, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(mrpLable)
                                                                .addComponent(addedQuantLable, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(89, 89, 89)
                                                        .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(0, 109, Short.MAX_VALUE)
                                                        .addComponent(updateButton))
                                                .addComponent(jTextField4)
                                                .addComponent(jTextField3)
                                                .addComponent(jTextField2)
                                                .addComponent(jTextField1)
                                                .addComponent(jTextField5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(147, 147, 147)
                                        .addComponent(titelLable, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(titelLable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(54, 54, 54)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(pidLable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(13, 13, 13)
                                                                        .addComponent(nameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(quntLable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(addedQuantLable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(mrpLable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(13, 13, 13)
                                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(64, 64, 64)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(updateButton))))
                                        .addContainerGap(58, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(invUpdateFrame.getContentPane());
                invUpdateFrame.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                invUpdateFrame.pack();
                invUpdateFrame.setVisible(true);

            }
        });

    }


}


