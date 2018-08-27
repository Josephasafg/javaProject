package GUI;

import javax.swing.*;
import java.awt.*;

public class billSearch extends JFrame {
    public void billSearch(){
        setTitle("SWING");

    }

    public static void main(String[] args){
        creatAndRunJFrame();
    }



    public static void creatAndRunJFrame(){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame billSrcFrame = new JFrame();
                JPanel jPanel1 = new JPanel();
                JLabel titleLabel = new JLabel();
                JLabel bnoLabel = new JLabel();
                JTextField jTextField1 = new JTextField();
                JButton searchButton = new JButton();
                JScrollPane jScrollPane1 = new JScrollPane();
                JTable jTable1 = new JTable();

                billSrcFrame.setResizable(true);
                billSrcFrame.setTitle("Bill Search");


                titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); 
                titleLabel.setText("Bill Search");

                bnoLabel.setText("Bill No");

                searchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); 
                searchButton.setForeground(new java.awt.Color(0, 0, 102));
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
                                "Bill No", "Customer Name", "Total Amount", "Date"
                        }
                ));
                jScrollPane1.setViewportView(jTable1);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(27, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(bnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(56, 56, 56)
                                                        .addComponent(searchButton))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(124, 124, 124)
                                                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(69, 69, 69))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(bnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(69, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(billSrcFrame.getContentPane());
                billSrcFrame.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                billSrcFrame.pack();
                billSrcFrame.setVisible(true);

            }
        });

    }

}


