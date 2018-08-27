package GUI;

import javax.swing.*;
import java.awt.*;

public class createSale extends JFrame {
    public void createSale(){
        setTitle("SWING");

    }

    public static void main(String[] args){
        creatAndRunJFrame();
    }



    public static void creatAndRunJFrame(){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame newSaleFrame = new JFrame();
                JPanel jPanel1 = new JPanel();
                JLabel bnumLable = new JLabel();
                JTextField jTextField1 = new JTextField();
                JLabel pidLable = new JLabel();
                JLabel nameLable = new JLabel();
                JTextField jTextField3 = new JTextField();
                JLabel mrpLable = new JLabel();
                JTextField jTextField4 = new JTextField();
                JLabel quantLable = new JLabel();
                JTextField jTextField5 = new JTextField();
                JLabel discLable = new JLabel();
                JTextField jTextField6 = new JTextField();
                JButton addButton = new JButton();
                JButton removeButton = new JButton();
                JTextField jTextField7 = new JTextField();
                JButton printButton = new JButton();
                JLabel dateLable = new JLabel();
                JTextField jTextField8 = new JTextField();
                JScrollPane jScrollPane1 = new JScrollPane();
                JTable jTable1 = new JTable();
                JComboBox jComboBox2 = new JComboBox();
                JLabel totalLable = new JLabel();
                JLabel cnameLable = new JLabel();
                JTextField jTextField2 = new JTextField();

                newSaleFrame.setResizable(true);
                newSaleFrame.setTitle("New Bill");

                bnumLable.setFont(new java.awt.Font("Tahoma", 0, 14)); 
                bnumLable.setText("Bill No");

                pidLable.setFont(new java.awt.Font("Tahoma", 0, 14)); 
                pidLable.setText("Product ID");

                nameLable.setFont(new java.awt.Font("Tahoma", 0, 14)); 
                nameLable.setText("Name");

                jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); 

                mrpLable.setFont(new java.awt.Font("Tahoma", 0, 14)); 
                mrpLable.setText("Mrp");

                jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); 

                quantLable.setFont(new java.awt.Font("Tahoma", 0, 14)); 
                quantLable.setText("Quantity");

                jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); 

                discLable.setFont(new java.awt.Font("Tahoma", 0, 14)); 
                discLable.setText("Discount");

                jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); 

                addButton.setFont(new java.awt.Font("Tahoma", 1, 14)); 
                addButton.setForeground(new java.awt.Color(0, 0, 102));
                //addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                addButton.setText("Add");
                addButton.setBorder(null);
                addButton.setBorderPainted(false);
                addButton.setContentAreaFilled(false);
                addButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        // addButtonActionPerformed(evt);
                    }
                });

                removeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); 
                removeButton.setForeground(new java.awt.Color(0, 0, 102));
                removeButton.setText("Remove");
                removeButton.setBorder(null);
                removeButton.setBorderPainted(false);
                removeButton.setContentAreaFilled(false);
                removeButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        // removeButtonActionPerformed(evt);
                    }
                });

                jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); 
                jTextField7.setHighlighter(null);
                jTextField7.setMargin(new java.awt.Insets(2, 4, 2, 2));
                jTextField7.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        // jTextField7ActionPerformed(evt);
                    }
                });

                printButton.setFont(new java.awt.Font("Tahoma", 1, 14)); 
                printButton.setForeground(new java.awt.Color(0, 0, 102));
                //printButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                printButton.setText("Print");
                printButton.setBorder(null);
                printButton.setBorderPainted(false);
                printButton.setContentAreaFilled(false);
                printButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        // printButtonActionPerformed(evt);
                    }
                });

                dateLable.setFont(new java.awt.Font("Tahoma", 0, 14)); 
                dateLable.setText("Date");

                jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); 

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Quantity", "Name", "Mrp", "Price"
                        }
                ));
                jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        // jTable1MouseClicked(evt);
                    }
                });
                jScrollPane1.setViewportView(jTable1);

                jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                    public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                    }
                    public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                        // jComboBox2PopupMenuWillBecomeInvisible(evt);
                    }
                    public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                    }
                });

                totalLable.setFont(new java.awt.Font("Tahoma", 1, 14)); 
                totalLable.setForeground(new java.awt.Color(0, 0, 102));
                totalLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                totalLable.setText("Total");

                cnameLable.setFont(new java.awt.Font("Tahoma", 0, 14)); 
                cnameLable.setText("Customer Name");

                jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); 

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(totalLable, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(bnumLable, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(pidLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(mrpLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(quantLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(discLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(nameLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(cnameLable))
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(11, 11, 11)
                                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(69, 69, 69)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(removeButton)))
                                                                        .addGap(40, 40, 40)
                                                                        .addComponent(dateLable, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addContainerGap(162, Short.MAX_VALUE))))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(31, 31, 31)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(bnumLable)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(17, 17, 17)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(dateLable)
                                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(cnameLable)
                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(17, 17, 17)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(pidLable))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(nameLable))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(mrpLable))
                                                        .addGap(20, 20, 20)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(quantLable))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(discLable)
                                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(80, 80, 80))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(totalLable)
                                                .addComponent(removeButton))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(addButton))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(newSaleFrame.getContentPane());
                newSaleFrame.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(0, 0, 0))
                );

                newSaleFrame.pack();
                newSaleFrame.setVisible(true);

            }
        });

    }


}
