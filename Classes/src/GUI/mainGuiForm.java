package GUI;

import EmployeePack.Employee;
import EmployeePack.Manager;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class mainGuiForm extends JFrame {
    private static final int DT_WIDTH = 1900;
    private static final int DT_HEIGHT = 1000;
    private static final Dimension DESKTOP_SIZE = new Dimension(DT_WIDTH, DT_HEIGHT);
    private employeeLogin empLogin = null;
    private JButton userView =null;
    private Controller controller;
    public mainGuiForm(Controller controller) throws IOException, SQLException {
        this.controller =controller;
        JDesktopPane desktop = new JDesktopPane();
        this.userView = new JButton();
        JButton pInfoButton = new JButton();
        JButton iViewButton = new JButton();
        JButton newSaleButton = new JButton();
        JButton exitButton = new JButton();
        JLabel  logoButton = new JLabel();
        JButton spProductButton = new JButton();
        JButton billSearchButton = new JButton();
        JButton CustomerButton = new JButton();
        JButton newEmployeeButton = new JButton();

        //logoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Clothing Store");
        this.setBackground(UIManager.getDefaults().getColor("Button.darkShadow"));
        desktop.setPreferredSize(DESKTOP_SIZE);
        GroupLayout desktopLayout = new GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
                desktopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 1350, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
                desktopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 710, Short.MAX_VALUE)
        );

        userView.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        userView.setForeground(new java.awt.Color(0, 0, 102));
        userView.setText(controller.frame1.currentEmp.getType().name()+ ": "
                +controller.frame1.currentEmp.getFirstName()+ " "+
                controller.frame1.currentEmp.getLastName());
        userView.setBorder(null);
        userView.setContentAreaFilled(false);
        userView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //userViewActionPerformed(evt);
            }
        });

        pInfoButton.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        pInfoButton.setForeground(new java.awt.Color(0, 0, 102));
        //pInfoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        pInfoButton.setText("Product Info");
        pInfoButton.setContentAreaFilled(false);
        pInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productInfo pi = new productInfo();
                pi.setVisible(true);
                desktop.add(pi);

            }
        });


        iViewButton.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        iViewButton.setForeground(new java.awt.Color(0, 0, 102));
        //iViewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        iViewButton.setText("Inventory");
        iViewButton.setContentAreaFilled(false);
        iViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                inventoryView iv = new inventoryView();
                iv.setVisible(true);
                desktop.add(iv);
                inventoryUpdate iu  = null;
                try {
                    iu = new inventoryUpdate();
                } catch (IOException | SQLException e) {
                    e.printStackTrace();
                }
                iu.setVisible(true);
                desktop.add(iu);
            }
        });

        newSaleButton.setBackground(UIManager.getDefaults().getColor("Button.disabledShadow"));
        newSaleButton.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        newSaleButton.setForeground(new java.awt.Color(0, 0, 102));
        //newSaleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        newSaleButton.setText("New Sale");
        newSaleButton.setContentAreaFilled(false);
        newSaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSale ns = null;
                try {
                    ns = new createSale();
                } catch (IOException | SQLException e) {
                    e.printStackTrace(); }
                ns.setVisible(true);
                desktop.add(ns);
            }
        });

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        exitButton.setForeground(new java.awt.Color(0, 0, 102));
        //exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        exitButton.setText("Exit");
        exitButton.setContentAreaFilled(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // exitButtonActionPerformed(evt);
                System.exit(0);
            }
        });


        spProductButton.setBackground(UIManager.getDefaults().getColor("Button.disabledShadow"));
        spProductButton.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        spProductButton.setForeground(new java.awt.Color(0, 0, 102));
        //spProductButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        spProductButton.setText("Sales per Product");
        spProductButton.setContentAreaFilled(false);
        spProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // spProductButtonActionPerformed(evt);
                salePerProduct spp = new salePerProduct();
                spp.setVisible(true);
                desktop.add(spp);
            }
        });

        billSearchButton.setBackground(UIManager.getDefaults().getColor("Button.disabledShadow"));
        billSearchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        billSearchButton.setForeground(new java.awt.Color(0, 0, 102));
        //billSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        billSearchButton.setText("Bill Search");
        billSearchButton.setContentAreaFilled(false);
        billSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billSearch bs = null;
                try {
                    bs = new billSearch();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                bs.setVisible(true);
                desktop.add(bs);
            }
        });

        CustomerButton.setBackground(UIManager.getDefaults().getColor("Button.disabledShadow"));
        CustomerButton.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        CustomerButton.setForeground(new java.awt.Color(0, 0, 102));
        //CustomerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        CustomerButton.setText("Customers");
        if(!controller.frame1.currentEmp.getType().name().equals("MANAGER") &&
                !controller.frame1.currentEmp.getType().name().equals("CASHIER")){
            CustomerButton.setEnabled(false);
        }
        CustomerButton.setContentAreaFilled(false);
        CustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewCustomer anc = null;
                try {
                    anc = new addNewCustomer();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                anc.setVisible(true);
                desktop.add(anc);
            }
        });

        newEmployeeButton.setBackground(UIManager.getDefaults().getColor("Button.disabledShadow"));
        newEmployeeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        newEmployeeButton.setForeground(new java.awt.Color(0, 0, 102));
        //newEmployeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        newEmployeeButton.setText("New Employee");
        newEmployeeButton.setContentAreaFilled(false);
        if(!controller.frame1.currentEmp.getType().name().equals("MANAGER")){
            newEmployeeButton.setEnabled(false);
        }
        newEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewEmployee ane = null;
                try {
                    ane = new addNewEmployee();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ane.setVisible(true);
                desktop.add(ane);
            }
        });

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(logoButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(userView, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                .addGap(208, 208, 208)
                                .addComponent(pInfoButton)
                                .addGap(36, 36, 36)
                                .addComponent(iViewButton)
                                .addGap(41, 41, 41)
                                .addComponent(newSaleButton)
                                .addGap(45, 45, 45)
                                .addComponent(billSearchButton)
                                .addGap(46, 46, 46)
                                .addComponent(spProductButton)
                                .addGap(46, 46, 46)
                                .addComponent(newEmployeeButton)
                                .addGap(40, 40, 40)
                                .addComponent(CustomerButton)
                                .addGap(187, 187, 187)
                                .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                        .addComponent(desktop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(logoButton)
                                        .addComponent(userView, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(pInfoButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(iViewButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(newSaleButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(spProductButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(billSearchButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(newEmployeeButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(CustomerButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addComponent(desktop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        this.pack();
        this.setVisible(true);
    }

    private static void createAndShowUI() throws IOException, SQLException {
        //mainGuiForm frame = new mainGuiForm();
        //frame.getContentPane().add(new InternalFrameToFront());
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setResizable(true);
//        frame.setTitle("Clothing Store");
//        frame.setVisible(true);
        //employeeLogin employeeLogin = new employeeLogin();
        //frame.userView.setText(employeeLogin.currentEmp.getType().name());
    }

    private void setLogin(employeeLogin e) {
        this.empLogin = e;
    }



//    public static void main(String[] args) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    createAndShowUI();
//                } catch (IOException | SQLException e) {
//                    e.printStackTrace(); }
//            }
//        });
//    }
}