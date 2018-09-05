package GUI;

import DB.DBSingleton;
import DB.EmployeeDB;
import EmployeePack.Employee;
import EmployeePack.ManagerTools;
import Singleton.Authenticate;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;


public class employeeLogin extends JFrame {
    Employee currentEmp;
    boolean flag = false;
    private Authenticate auth;
    private EmployeeDB employeeDB = new EmployeeDB();
    private Controller controller;
    public employeeLogin(Controller controller) throws IOException, SQLException {
        this.controller = controller;
        ManagerTools managerTools = new ManagerTools();
        final int[] tries = {2};
        Connection connect;
        JPanel mainPanel = new JPanel();
        JFrame loginFrame = new JFrame();
        JLabel title = new JLabel();
        JLabel al1 = new JLabel();
        JLabel al2 = new JLabel();
        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();
        JButton loginB = new JButton();
        JCheckBox checkB = new JCheckBox();
        DBSingleton dbSingleton = new DBSingleton();
        connect = dbSingleton.getConn();

        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("User Login");

        mainPanel.setBackground(new java.awt.Color(100, 200, 255));

        title.setFont(new java.awt.Font("Tahoma", 0, 24));
        title.setText("USER LOGIN");

        al2.setFont(new java.awt.Font("Tahoma", 0, 18));
        al2.setText("Password");

        al1.setFont(new java.awt.Font("Tahoma", 0, 18));
        al1.setText("User Id");

        //user name field
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // usernameActionPerformed(evt);
            }
        });

        loginB.setFont(new java.awt.Font("Tahoma", 0, 16));
        loginB.setText("Login");
        auth = new Authenticate();
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    // TODO: 31/08/2018 check which type of employee is connecting
                    String s = String.valueOf(password.getPassword());
                    boolean pass = auth.login(Integer.parseInt(username.getText()),s);
                    //currentEmp = managerTools.createEmp(type);

                    if (tries[0] != 0) {
                        if (pass) {
                            currentEmp = employeeDB.chooseEmpByID(Integer.parseInt(username.getText()));
                            JOptionPane.showMessageDialog(loginFrame, "Connected!");
                            controller.showMain();
                            //flag = true;
                        } else {
                            JOptionPane.showMessageDialog(loginFrame, tries[0] + " tries left!");
                            tries[0]--;
                        }
                        return;
                    }
//
                    if(tries[0] == 0) {
                        JOptionPane.showMessageDialog(loginFrame,"User Blocked!");
                        System.exit(0);
                    }
                    connect.close();
                } catch (SQLException | IOException e) {
                    e.printStackTrace(); }
            }
        });


        checkB.setText("Show Password");
        checkB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //  checkBActionPerformed(evt);
                if(checkB.isSelected()) {
                    password.setEchoChar((char)0);
                }
                else{
                    password.setEchoChar('*');
                }
            }
        });

        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(al2, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(username, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                .addComponent(password))
                                        .addComponent(checkB, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86))
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(145, 145, 145)
                                                .addComponent(title, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(192, 192, 192)
                                                .addComponent(loginB, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(al1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(308, Short.MAX_VALUE))));
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(title, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(username, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(al2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkB)
                                .addGap(36, 36, 36)
                                .addComponent(loginB)
                                .addContainerGap(105, Short.MAX_VALUE))
                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(151, 151, 151)
                                        .addComponent(al1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(252, Short.MAX_VALUE)))
        );

        GroupLayout layout = new GroupLayout( this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        this.pack();
        this.setVisible(true);
    }

    public Employee getEmp() {
        return currentEmp;
    }

    private static void createAndShowUI() throws IOException, SQLException {

    }


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowUI();
                } catch (IOException | SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}