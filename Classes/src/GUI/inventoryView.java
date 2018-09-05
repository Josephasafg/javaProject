package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class inventoryView extends JInternalFrame {
    public inventoryView() {
                JPanel jPanel1 = new JPanel();
                JLabel titleLabel = new JLabel();
                JLabel pidLabel = new JLabel();
                JTextField jTextField1 = new JTextField();
                JButton viewButton = new JButton();

                this.setResizable(true);
                this.setTitle("View Inventory");

                titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
                titleLabel.setText("View Inventory");

                pidLabel.setText("Product Id");

                viewButton.setFont(new java.awt.Font("Tahoma", 0, 14));
                viewButton.setText("View");

                GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(pidLabel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(viewButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(166, 166, 166)
                                        .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(pidLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(viewButton))
                                        .addContainerGap(330, Short.MAX_VALUE))
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
        inventoryView frame = new inventoryView();
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
