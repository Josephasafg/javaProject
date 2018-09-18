package GUI;

import DB.ItemDB;
import Shop.Purchase;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.util.Date;
import java.util.Random;
import java.util.Vector;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;


public class billSearch extends JInternalFrame {
    public billSearch() throws IOException {
        ItemDB itemDB = new ItemDB();
        JPanel jPanel1 = new JPanel();
        JLabel titleLabel = new JLabel();
        JLabel bnoLabel = new JLabel();
        JTextField billSearch = new JTextField();
        JButton searchButton = new JButton();
        JTable jTable1 = new JTable();

        JScrollPane jScrollPane1 = new JScrollPane(jTable1);
        jTable1.setFillsViewportHeight(true);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        titleLabel.setText("Bill Search");

        bnoLabel.setText("Bill No.");

        searchButton.setFont(new java.awt.Font("Tahoma", 1, 14));
        searchButton.setForeground(new java.awt.Color(0, 0, 102));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Purchase currentPurchase;
                currentPurchase = itemDB.pullBill(Integer.parseInt(billSearch.getText()));
                Vector<String> data = new Vector<>();
                data.add(Integer.toString(currentPurchase.getPid()));
                data.add(Integer.toString(currentPurchase.getCid()));
                data.add(currentPurchase.getPrice());
                data.add(String.valueOf(currentPurchase.getPdate()));
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.addRow(data);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {"Bill No", "Customer ID", "Total Amount", "Date"}
        ));
        jScrollPane1.setViewportView(jTable1);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(27, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(bnoLabel, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(billSearch, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                                                .addGap(56, 56, 56)
                                                .addComponent(searchButton))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(124, 124, 124)
                                                .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(bnoLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(billSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(69, Short.MAX_VALUE))
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
        this.setClosable(true);
        this.setIconifiable(true);
        this.setMaximizable(true);
        this.setResizable(true);
    }




    private static void createAndShowUI() throws IOException {
        billSearch frame = new billSearch();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(true);
        frame.setVisible(true);
    }



    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowUI();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}