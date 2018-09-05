package GUI;

import EmployeePack.ManagerTools;
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


public class inventoryUpdate extends JInternalFrame {
    public inventoryUpdate() {
        JPanel jPanel1 = new JPanel();
        JLabel titelLable = new JLabel();
        JLabel pidLable = new JLabel();
        JLabel quntLable = new JLabel();
        JLabel nameLable = new JLabel();
        JLabel jLable1 = new JLabel();
        JLabel adressLable = new JLabel();
        JLabel typeLabel = new JLabel();
        JTextField prodID = new JTextField();
        JTextField prodName = new JTextField();
        JTextField addedQuan = new JTextField();
        JTextField prodCost = new JTextField();
        JButton newButton = new JButton();
        //JScrollPane jScrollPane1 = new JScrollPane();
        JTable jTable2 = new JTable();
        JScrollPane jScrollPane1 = new JScrollPane(jTable2);
        jTable2.setFillsViewportHeight(true);
        JLabel addedQuantLable = new JLabel();
        JTextField availQuan = new JTextField();
        JButton updateButton = new JButton();
        JComboBox<String> jComboBox1 = new JComboBox<String>(new String[] {"Belt", "Hat", "Pants", "Shirt", "Shoes","Socks"});
        adressLable.setText("Address");

        this.setResizable(true);
        this.setTitle("Update Inventory");

        //typeLabel.setFont(new java.awt.Font("Tahoma", 0, 15));
        typeLabel.setText("Product Type");

//        titelLable.setFont(new java.awt.Font("Tahoma", 0, 18));
//        titelLable.setText("Update Inventory");

        pidLable.setText("Product Id");

        quntLable.setText("Available Quantity");

        nameLable.setText("Product Name");
        jLable1.setText("");
        //newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // newButtonActionPerformed(evt);
                ManagerTools managerTools = null;
                try {
                    managerTools = new ManagerTools();
                    Item currentItem = new Item();
                    Vector<String> data = new Vector<>();
                    currentItem.setId(Integer.parseInt(prodID.getText()));
                    currentItem.setName(prodName.getText());
                    currentItem.setOriginalQuantity(Integer.parseInt(addedQuan.getText()));
                    currentItem.setCurrentQuantity(Integer.parseInt(availQuan.getText()));
                    currentItem.setCost(Integer.parseInt(prodCost.getText()));
                    // TODO: 01/09/2018 add size to form
                    managerTools.addItemToInventory(currentItem);
                    data.add(Integer.toString(currentItem.getId()));
                    data.add(currentItem.getName());
                    data.add(Integer.toString(currentItem.getCurrentQuantity()));
                    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                    model.addRow(data);
                } catch (IOException | SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {
                        "Product Id", "Product Name", "Available"}));

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

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(pidLable, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameLable, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(quntLable, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLable1)
                                                        .addComponent(typeLabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(addedQuantLable, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(newButton, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 109, Short.MAX_VALUE)
                                                .addComponent(updateButton))
                                        .addComponent(prodCost)
                                        .addComponent(addedQuan)
                                        .addComponent(prodName)
                                        .addComponent(prodID)
                                        .addComponent(availQuan)
                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 515, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(titelLable, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(titelLable, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                                .addGap(54, 54, 54)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()

                                                                .addComponent(pidLable, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(13, 13, 13)
                                                                .addComponent(nameLable, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(quntLable, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(addedQuantLable, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLable1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(prodID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(13, 13, 13)
                                                                .addComponent(prodName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(addedQuan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(prodCost, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(availQuan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(typeLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                                .addGap(64, 64, 64)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(newButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(updateButton))))
                                .addContainerGap(58, Short.MAX_VALUE))
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
        inventoryUpdate frame = new inventoryUpdate();
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
