package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;


import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import DB.DBSingleton;
import EmployeePack.*;
import Utilities.GlobalLogger;
import Utilities.LoginTools;
import jdk.nashorn.internal.runtime.ECMAException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;
import java.util.Vector;

public class addNewEmployee extends JInternalFrame {
    public addNewEmployee() throws IOException {
        GlobalLogger log = new GlobalLogger("projectLog.log");
        LoginTools loginTools = new LoginTools();
        JLabel statusLabel = new JLabel();
        JPanel jPanel1 = new JPanel();
        JLabel title = new JLabel();
        JLabel IdLabel = new JLabel();
        JLabel mobileLabel = new JLabel();
        JLabel nameLabel = new JLabel();
        JLabel addressLabel = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel branchLabel = new JLabel();
        JLabel passLabel = new JLabel();
        JLabel typeLabel = new JLabel();
        String[] columns = {"Id", "First","Last", "Type", "Branch Number", "Phone#"};
        Connection connect;
        DBSingleton dbSingleton = new DBSingleton();
        connect = dbSingleton.getConn();
        ArrayList<Employee> employeeList = new ArrayList<>();
        Employee e = null;
        try {
            PreparedStatement statement = connect.prepareStatement("SELECT * from employee");
            ResultSet rs =statement.executeQuery();
            while(rs.next()) {
                try {
                    e = new Employee(){};
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                e.setId(rs.getInt("id"));
                e.setFirstName(rs.getString("firstName"));
                e.setLastName(rs.getString("lastName"));
                e.setBranchNumber(rs.getInt("branchNumber"));
                e.setPhone(rs.getString("phone"));
                e.setTotalHours(rs.getDouble("totalHours"));
                e.setType(EmployeeTypes.valueOf(rs.getString("type")));
                e.setPassword(rs.getString("password"));
                e.setEmpCode(rs.getInt("empCode"));
                employeeList.add(e);
            }
            statement.close();
        }catch (SQLException s) {s.printStackTrace();}


        JTextField userID = new JTextField();
        JTextField userFirstName = new JTextField();
        JTextField userPhone = new JTextField();
        JTextField userLastName = new JTextField();
        JTextField userBranch = new JTextField();
        JTextField temp = new JTextField();
        JComboBox<String> jComboBox1 = new JComboBox<String>(new String[]
                {EmployeeTypes.MANAGER.name(), EmployeeTypes.SELLER.name(), EmployeeTypes.CASHIER.name()});
        JButton anew = new JButton();
        JButton update = new JButton();
        JButton del = new JButton();
        JTable jTable1 = new JTable();
        JScrollPane jScrollPane1 = new JScrollPane(jTable1);
        jTable1.setFillsViewportHeight(true);




        jLabel6.setFont(new Font("Tahoma", 0, 16));
        jLabel6.setText("Last Name");

        this.setResizable(true);
        this.setTitle("Add New User");

        typeLabel.setFont(new Font("Tahoma", 0, 15));
        typeLabel.setText("Product Type");

        title.setFont(new Font("Tahoma", 0, 24));
        title.setText("Add User Details");

        IdLabel.setFont(new Font("Tahoma", 0, 16));
        IdLabel.setText("User Id");

        mobileLabel.setFont(new Font("Tahoma", 0, 16));
        mobileLabel.setText("Mobile Number");

        nameLabel.setFont(new Font("Tahoma", 0, 16));
        nameLabel.setText("First Name");

        addressLabel.setFont(new Font("Tahoma", 0, 16));
        addressLabel.setText("Last Name");

        branchLabel.setFont(new Font("Tahoma", 0, 14));
        branchLabel.setText("Branch Number");

        passLabel.setFont(new Font("Tahoma", 0, 16));
        passLabel.setText("Password");

        userID.setFont(new Font("Tahoma", 0, 16));

        userFirstName.setFont(new Font("Tahoma", 0, 16));

        userPhone.setFont(new Font("Tahoma", 0, 16));

        userLastName.setFont(new Font("Tahoma", 0, 16));

        userBranch.setFont(new Font("Tahoma", 0, 16));

        anew.setFont(new Font("Tahoma", 0, 16));
        //anew.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        anew.setText("Add New");
        anew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerTools managerTools = null;
                try {
                    managerTools = new ManagerTools();
                } catch (SQLException | IOException e) {
                    e.printStackTrace(); }
                Employee currentEmployee = null;

                String empType = (String) jComboBox1.getSelectedItem();
                currentEmployee = managerTools.createEmp(empType);
                currentEmployee.setId(Integer.parseInt(userID.getText()));
                currentEmployee.setFirstName(userFirstName.getText());
                currentEmployee.setBranchNumber(Integer.parseInt(userBranch.getText()));
                currentEmployee.setLastName(userLastName.getText());
                String pass = loginTools.encryptedPass(temp.getText());
                currentEmployee.setPassword(pass);
                currentEmployee.setPhone(userPhone.getText());
                currentEmployee.setTotalHours(0.0);
                currentEmployee.setEmpCode();
                managerTools.addEmployee(currentEmployee);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                Vector<String> data = new Vector<>();
                data.add(Integer.toString(currentEmployee.getId()));
                data.add(currentEmployee.getFirstName());
                data.add(currentEmployee.getLastName());
                data.add(currentEmployee.getType().name());
                data.add(Integer.toString(currentEmployee.getBranchNumber()));
                data.add(currentEmployee.getPhone());
                model.addRow(data);
            }
        });

        update.setFont(new Font("Tahoma", 0, 16));
        //update.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultTableModel model = new DefaultTableModel();
                // TODO: 06/09/2018 method is written, need to update GUI form with hours of each employee
                Employee currentEmployee;
                ManagerTools managerTools = null;
                model.setColumnIdentifiers(columns);
                int i = jTable1.getSelectedRow();
                if (i >= 0) {
                    model.setValueAt(userID.getText(),i,0);
                    model.setValueAt(userFirstName.getText(),i,1);
                    model.setValueAt(userLastName.getText(),i,2);
                    model.setValueAt(userPhone.getText(),i,4);
                }
            }
        });

        del.setFont(new Font("Tahoma", 0, 16));
        //del.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // delActionPerformed(evt);
                Employee currentEmployee = null;
                ArrayList<String> details = new ArrayList<>();
                for(int i =0; i< jTable1.getColumnCount();i++)
                {
                    Object o = jTable1.getValueAt(jTable1.getSelectedRow(),i);
                    details.add((String) o);
                }
                ManagerTools managerTools = null;
                try {
                    managerTools = new ManagerTools();
                } catch (SQLException | IOException e) {
                    e.printStackTrace(); }
                String emptype = details.get(3).substring(0,1).toUpperCase()+
                        details.get(3).substring(1).toLowerCase();
                currentEmployee = managerTools.createEmp(emptype);
                currentEmployee.setId(Integer.parseInt(details.get(0)));
                managerTools.deleteEmp(currentEmployee);
                //this line deletes the selected row
                ((DefaultTableModel)jTable1.getModel()).removeRow(jTable1.getSelectedRow());
                log.logger.info("Selected row was deleted successfully!");
            }
        });



        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {}, columns));

        for (Employee anEmployeeList : employeeList) {
            Vector<String> data = new Vector<>();
            data.add(Integer.toString(anEmployeeList.getId()));
            data.add(anEmployeeList.getFirstName());
            data.add(anEmployeeList.getLastName());
            data.add(anEmployeeList.getType().name());
            data.add(Integer.toString(anEmployeeList.getBranchNumber()));
            data.add(anEmployeeList.getPhone());

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(data);
        }
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        temp.setFont(new Font("Tahoma", 0, 16));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(title, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(anew)
                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(branchLabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(passLabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(IdLabel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(mobileLabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(typeLabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(addressLabel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(83, 83, 83)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(userFirstName, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(userID, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(userPhone, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(userLastName, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(userBranch, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(temp, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(47, 47, 47)
                                                                .addComponent(update)
                                                                .addGap(39, 39, 39)
                                                                .addComponent(del)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(title, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(IdLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(13, 13, 13)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)/////////////////////////////////////////////////
                                                        .addComponent(typeLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)/////////////////////////////////////////////////////////////
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(mobileLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addressLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(branchLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userBranch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(passLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(temp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(anew)
                                                        .addComponent(update)
                                                        .addComponent(del))
                                                .addGap(43, 43, 43))))
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




    private static void createAndShowUI() throws IOException {
        addNewEmployee frame = new addNewEmployee();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(true);
        frame.setVisible(true);
    }



    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
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

