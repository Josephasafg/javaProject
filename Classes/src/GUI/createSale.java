package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class createSale extends JInternalFrame {
    public createSale() {
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
                //JScrollPane jScrollPane1 = new JScrollPane();
                JTable jTable1 = new JTable();
                JScrollPane jScrollPane1 = new JScrollPane(jTable1);
                jTable1.setFillsViewportHeight(true);
                JComboBox jComboBox2 = new JComboBox();
                JLabel totalLable = new JLabel();
                JLabel cnameLable = new JLabel();
                JTextField jTextField2 = new JTextField();

                this.setResizable(true);
                this.setTitle("New Bill");

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
                totalLable.setHorizontalAlignment(SwingConstants.CENTER);
                totalLable.setText("Total");

                cnameLable.setFont(new java.awt.Font("Tahoma", 0, 14));
                cnameLable.setText("Customer Name");

                jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14));

                GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(printButton, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(totalLable, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(bnumLable, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(pidLable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(mrpLable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(quantLable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(discLable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(nameLable, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(cnameLable))
                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(11, 11, 11)
                                                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(69, 69, 69)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(removeButton)))
                                                                        .addGap(40, 40, 40)
                                                                        .addComponent(dateLable, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
                                                        .addContainerGap(162, Short.MAX_VALUE))))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(31, 31, 31)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(bnumLable)))
                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(17, 17, 17)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(dateLable)
                                                                .addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(cnameLable)
                                                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGap(17, 17, 17)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(pidLable))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(nameLable))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(mrpLable))
                                                        .addGap(20, 20, 20)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(quantLable))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(discLable)
                                                                .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGap(80, 80, 80))
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(totalLable)
                                                .addComponent(removeButton))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(printButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(addButton))
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                GroupLayout layout = new GroupLayout(this.getContentPane());
                this.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(0, 0, 0))
                );


        this.pack();
        this.setVisible(true);
        this.setClosable(true);
        this.setIconifiable(true);
        this.setMaximizable(true);
        this.setResizable(true);
    }




    private static void createAndShowUI() {
        createSale frame = new createSale();
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

