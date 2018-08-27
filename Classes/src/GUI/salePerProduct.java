package GUI;

import javax.swing.*;
import java.awt.*;


public class salePerProduct extends JFrame {
    public void salePerProduct(){
        setTitle("SWING");

    }

    public static void main(String[] args){
        creatAndRunJFrame();
    }


    public static void creatAndRunJFrame(){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame salePerProFrame = new JFrame();

                JPanel jPanel1 = new JPanel();
                JLabel titleLabel = new JLabel();
                JLabel dateLabel = new JLabel();
                JButton viewButton = new JButton();
                JTextField jDate = new JTextField();
                JLabel pidLabel = new JLabel();
                JTextField jTextField1 = new JTextField();

                salePerProFrame.setResizable(true);
                salePerProFrame.setTitle("Sales Per Day");

                titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); 
                titleLabel.setText("Sales Per Product");

                dateLabel.setText("Date");

                viewButton.setFont(new java.awt.Font("Tahoma", 0, 14)); 
                viewButton.setText("View");

                pidLabel.setText("Product Id");

                jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); 

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(143, 143, 143)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(pidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(54, 54, 54)
                                                        .addComponent(viewButton))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(31, 31, 31)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(pidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addContainerGap(309, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(salePerProFrame.getContentPane());
                salePerProFrame.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                salePerProFrame.pack();
                salePerProFrame.setVisible(true);

            }
        });

    }


}









