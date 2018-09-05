package GUI;

import Shop.Item;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
import java.util.Vector;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;


public class productInfo extends JInternalFrame {
    public productInfo() {
        JPanel jPanel1 = new JPanel();
                JLabel titleLabel = new JLabel();
                JLabel pnameLabel = new JLabel();
                JTextField jTextField1 = new JTextField();
                JButton searchButton = new JButton();
                //JScrollPane jScrollPane1 = new JScrollPane();
                JTable jTable1 = new JTable();
                JScrollPane jScrollPane1 = new JScrollPane(jTable1);
                jTable1.setFillsViewportHeight(true);

                this.setResizable(true);
                this.setTitle("Product Information");

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
                        Item currentItem = null;
                        try {
                            currentItem = new Item();
                        } catch (IOException | SQLException e) {
                            e.printStackTrace();
                        }
                        Vector<String> data = new Vector<>();
                        try {
                            currentItem = currentItem.selectItemID(Integer.parseInt(jTextField1.getText()));
                        } catch (IOException | SQLException e) {
                            e.printStackTrace();
                        }
                        data.add(Integer.toString(currentItem.getId()));
                        data.add(currentItem.getName());
                        data.add(Integer.toString(currentItem.getCurrentQuantity()));
                        data.add(Double.toString(currentItem.getCost()));
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.addRow(data);
                    }
                });

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Product Id", "Product Name", "Available"
                        }
                ));
                jScrollPane1.setViewportView(jTable1);

                GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(68, 68, 68)
                                                        .addComponent(pnameLabel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(51, 51, 51)
                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(56, 56, 56)
                                                        .addComponent(searchButton))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(169, 169, 169)
                                                        .addComponent(titleLabel)))
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 60, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(titleLabel)
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(pnameLabel)
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                        .addGap(13, 13, 13))
                );

                GroupLayout layout = new GroupLayout(this.getContentPane());
                this.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 25, Short.MAX_VALUE))
                );

        this.pack();
        this.setVisible(true);
        this.setClosable(true);
        this.setIconifiable(true);
        this.setMaximizable(true);
        this.setResizable(true);
    }




    private static void createAndShowUI() {
        productInfo frame = new productInfo();
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