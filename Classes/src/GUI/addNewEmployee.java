package GUI;

import DB.DBSingleton;
import EmployeePack.*;
import Utilities.GlobalLogger;
import jdk.nashorn.internal.runtime.ECMAException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

public class addNewEmployee extends JFrame {
    private static GlobalLogger log;

    static {
        try {
            log = new GlobalLogger("projectLog.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addNewEmployee(){
        setTitle("GUI.addNewEmployee");

    }

    public static void main(String[] args){
        creatAndRunJFrame();
    }



    public static void creatAndRunJFrame(){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame newEmpFrame = new JFrame();
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
                Connection connect;
                DBSingleton dbSingleton = new DBSingleton();
                connect = dbSingleton.getConn();
                ArrayList<Employee> employeeList = new ArrayList<Employee>();
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
                //JTextField jTextField8 = new JTextField();
                JComboBox<String> jComboBox1 = new JComboBox<String>(new String[] {"Manager", "Seller", "Cashier"});
                JButton anew = new JButton();
                JButton update = new JButton();
                JButton del = new JButton();
                JTable jTable1 = new JTable();
                JScrollPane jScrollPane1 = new JScrollPane();
                jTable1.setFillsViewportHeight(true);
                String[] columns = {"Id", "First","Last", "Type", "Branch Number", "Phone#"};


                jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16));
                jLabel6.setText("Last Name");

                newEmpFrame.setResizable(true);
                newEmpFrame.setTitle("Add New User");


                typeLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                typeLabel.setText("User Type");

                title.setFont(new java.awt.Font("Tahoma", 0, 24));
                title.setText("Add User Details");

                IdLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                IdLabel.setText("User Id");

                mobileLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                mobileLabel.setText("Mobile Number");

                nameLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                nameLabel.setText("First Name");

                addressLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                addressLabel.setText("Last Name");

                branchLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                branchLabel.setText("Branch Number");

                //passLabel.setFont(new java.awt.Font("Tahoma", 0, 16));
                //passLabel.setText("Password");

                userID.setFont(new java.awt.Font("Tahoma", 0, 16));

                userFirstName.setFont(new java.awt.Font("Tahoma", 0, 16));

                userPhone.setFont(new java.awt.Font("Tahoma", 0, 16));

                userLastName.setFont(new java.awt.Font("Tahoma", 0, 16));

                userBranch.setFont(new java.awt.Font("Tahoma", 0, 16));

                anew.setFont(new java.awt.Font("Tahoma", 0, 16));
                //anew.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                anew.setText("Add New");
                anew.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        // anewActionPerformed(evt);
                        ManagerTools managerTools = null;
                        try {
                            managerTools = new ManagerTools();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        Employee currentEmployee = null;

                        String empType = (String) jComboBox1.getSelectedItem();
                        currentEmployee = managerTools.createEmp(empType);
                        currentEmployee.setId(Integer.parseInt(userID.getText()));
                        currentEmployee.setFirstName(userFirstName.getText());
                        currentEmployee.setBranchNumber(Integer.parseInt(userBranch.getText()));
                        currentEmployee.setLastName(userLastName.getText());
                        currentEmployee.setTotalHours(0.0);
                        currentEmployee.setEmpCode();
                        currentEmployee.setPhone(userPhone.getText());
                        managerTools.addEmployee(currentEmployee);

                        Vector<String> data = new Vector<>();
                        data.add(Integer.toString(currentEmployee.getId()));
                        data.add(currentEmployee.getFirstName());
                        data.add(currentEmployee.getLastName());
                        data.add(currentEmployee.getType().name());
                        data.add(Integer.toString(currentEmployee.getBranchNumber()));
                        data.add(currentEmployee.getPhone());

                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.addRow(data);

                        }
                    });

                update.setFont(new java.awt.Font("Tahoma", 0, 16));
                    //update.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                update.setText("Update");
                update.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {

                        }
                    });

                del.setFont(new java.awt.Font("Tahoma", 0, 16));
                    //del.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
                del.setText("Delete");
                del.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
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
                            } catch (SQLException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
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

                jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object [][] {},columns));


                for (int i=0;i<employeeList.size();i++){
                    Vector<String> data = new Vector<>();
                    data.add(Integer.toString(employeeList.get(i).getId()));
                    data.add(employeeList.get(i).getFirstName());
                    data.add(employeeList.get(i).getLastName());
                    data.add(employeeList.get(i).getType().name());
                    data.add(Integer.toString(employeeList.get(i).getBranchNumber()));
                    data.add(employeeList.get(i).getPhone());

                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.addRow(data);
                }

                jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            // jTable1MouseClicked(evt);
                        }
                    });
                jScrollPane1.setViewportView(jTable1);

                temp.setFont(new java.awt.Font("Tahoma", 0, 16));

                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(35, 35, 35)
                                                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(anew)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(branchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(IdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(83, 83, 83)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(userFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(userPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(userLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(userBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGap(47, 47, 47)
                                                                        .addComponent(update)
                                                                        .addGap(39, 39, 39)
                                                                        .addComponent(del)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)))
                            .addContainerGap())
                            );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(49, 49, 49)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(IdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(13, 13, 13)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(userFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)/////////////////////////////////////////////////
                                                                .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)/////////////////////////////////////////////////////////////
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(userPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(userLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(branchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(userBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(anew)
                                                                .addComponent(update)
                                                                .addComponent(del))
                            .addGap(43, 43, 43))))
                            );

                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(newEmpFrame.getContentPane());
                newEmpFrame.getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                newEmpFrame.pack();
                newEmpFrame.setVisible(true);

                }
            });

        }

    }

