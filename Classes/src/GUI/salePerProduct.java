package GUI;

import DB.ItemDB;
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


public class salePerProduct extends JInternalFrame {
    public salePerProduct() {
                JPanel jPanel1 = new JPanel();
                JLabel titleLabel = new JLabel();
                JLabel dateLabel = new JLabel();
                JButton viewButton = new JButton();
                JTextField jDate = new JTextField();
                JLabel pidLabel = new JLabel();
                JTextField jTextField1 = new JTextField();

                this.setResizable(true);
                this.setTitle("Sales Per Day");

                titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
                titleLabel.setText("Sales Per Product");

                dateLabel.setText("Date");

                viewButton.setFont(new java.awt.Font("Tahoma", 0, 14));
                viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // TODO: 31/08/2018 add box for result when click view
                Item currentItem = null;
                try {
                    currentItem = new Item();
                } catch (IOException | SQLException e) {
                    e.printStackTrace();
                }

                ItemDB itdb = null;
                Vector<String> data = new Vector<>();
                try {
                    itdb = new ItemDB();
                } catch (IOException | SQLException e) {
                    e.printStackTrace(); }

                try {
                    currentItem =itdb.selectItemByID(Integer.parseInt(jTextField1.getText()));
                } catch (IOException | SQLException e) {
                    e.printStackTrace(); }

                data.add(Integer.toString(currentItem.getId()));
                data.add(currentItem.getName());
            }
        });





        pidLabel.setText("Product Id");

                jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14));



                GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(143, 143, 143)
                                        .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(dateLabel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(pidLabel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jDate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                        .addComponent(viewButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(54, 54, 54)
                                                        .addComponent(viewButton))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(31, 31, 31)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(pidLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(dateLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jDate, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))))
                                        .addContainerGap(309, Short.MAX_VALUE))
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
        salePerProduct frame = new salePerProduct();
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
