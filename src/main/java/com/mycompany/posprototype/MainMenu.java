/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.posprototype;
import java.io.BufferedReader;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.time.LocalDate;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashMap;
import java.util.Map;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import static jdk.jfr.FlightRecorder.register;
public class MainMenu extends javax.swing.JFrame {
     String oldID = null,newID = null;
           int id = 0;
    double Nettot = 0,finalTotal = 0;
    double disco = 0;
    int ssh = 0;
    Connection con = null;
    int count = 0,count2 = 0,IDlocatorCount = 0,whichBoxID = 0;
    int IDlocator[] = new int[2];
    String query = "SELECT * FROM shipmentOrders WHERE ";
    String username = "",Name = "",cusID = "",Date="",deleteKey = "";
    int tempo = 0;
    public void dbConnect(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/UserInfo?useSSL=false","root","raveen007");    
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null,ee.toString());
        }
        
    }
    public MainMenu(String username) {
        initComponents();
       // FirebaseConnect();
        dbConnect();
        this.username = username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jPanel20 = new javax.swing.JPanel();
        IDg10 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SearchBox = new javax.swing.JTextField();
        FINDBTN = new javax.swing.JButton();
        NewName = new javax.swing.JTextField();
        NewCode = new javax.swing.JTextField();
        NewAmount = new javax.swing.JTextField();
        NewPrice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        NewCbox = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        SavBtn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        DeBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Nameg = new javax.swing.JLabel();
        IDg = new javax.swing.JLabel();
        Priceg = new javax.swing.JLabel();
        Amountg = new javax.swing.JLabel();
        Catagoryg = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CodeBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        NameBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PriceBox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        AmountBox = new javax.swing.JTextField();
        Savebtn = new javax.swing.JButton();
        Clearbtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        box_1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        box_3 = new javax.swing.JTextField();
        box_2 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        newidbox = new javax.swing.JTextField();
        newCoCode = new javax.swing.JTextField();
        newDescription = new javax.swing.JTextField();
        newDestination = new javax.swing.JTextField();
        newServicebox = new javax.swing.JComboBox<>();
        newSender = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        idbox = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        desSearchBox = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        DataNotFound = new javax.swing.JLabel();
        cbox_1 = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        box_4 = new javax.swing.JTextField();
        box_5 = new javax.swing.JTextField();
        box_6 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        box_7 = new javax.swing.JTextField();
        textArea2 = new java.awt.TextArea();
        jLabel56 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        totlbl = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cashier = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        AmuL = new javax.swing.JLabel();
        TotL = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        confirm = new javax.swing.JLabel();
        txtArea = new java.awt.TextArea();
        jLabel22 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Box1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        Box2 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        rdb1 = new javax.swing.JRadioButton();
        rdb2 = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        Box3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        check1 = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        NameL = new javax.swing.JLabel();
        UnitL = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        sub = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JCalendar();
        jLabel28 = new javax.swing.JLabel();
        dataShow = new java.awt.TextArea();
        jLabel43 = new javax.swing.JLabel();
        box256 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        box123 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        itemsDetails = new javax.swing.JCheckBox();
        employeeDetails = new javax.swing.JCheckBox();
        customerDetails = new javax.swing.JCheckBox();
        EmployeeInfo = new javax.swing.JCheckBox();
        shipmentProducts = new javax.swing.JCheckBox();
        shipmentOrders = new javax.swing.JCheckBox();
        jButton11 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        b13 = new javax.swing.JCheckBox();
        b10 = new javax.swing.JCheckBox();
        b11 = new javax.swing.JCheckBox();
        b14 = new javax.swing.JCheckBox();
        b15 = new javax.swing.JCheckBox();
        b12 = new javax.swing.JCheckBox();
        jButton10 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        restorelabel = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        IDg10.setForeground(new java.awt.Color(255, 255, 255));
        IDg10.setText("Null");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(IDg10)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(IDg10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(768, 1366));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel3.setText("Add new items");

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setForeground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Update and delete data");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Search (With the item ID)");

        FINDBTN.setText("Find");
        FINDBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FINDBTNActionPerformed(evt);
            }
        });

        NewName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewNameActionPerformed(evt);
            }
        });

        NewCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCodeActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("New code");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("New name");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("New price");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("New amount");

        NewCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Stationary", "Cosmatics", "Medicines", "Equipments" }));

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("New catagory");

        SavBtn.setText("Update");
        SavBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavBtnActionPerformed(evt);
            }
        });

        jButton6.setText("Clear");

        DeBtn.setText("Delete");
        DeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeBtnActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID :");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Name  :");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Price : ");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Amount : ");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Catagory : ");

        Nameg.setForeground(new java.awt.Color(255, 255, 255));
        Nameg.setText("Null");
        Nameg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        IDg.setForeground(new java.awt.Color(255, 255, 255));
        IDg.setText("Null");

        Priceg.setForeground(new java.awt.Color(255, 255, 255));
        Priceg.setText("Null");

        Amountg.setForeground(new java.awt.Color(255, 255, 255));
        Amountg.setText("Null");

        Catagoryg.setForeground(new java.awt.Color(255, 255, 255));
        Catagoryg.setText("Null");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Nameg))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(IDg)))
                .addGap(74, 74, 74)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Amountg)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Priceg)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(Catagoryg)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(IDg)
                    .addComponent(Priceg)
                    .addComponent(Catagoryg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Nameg)
                    .addComponent(jLabel19)
                    .addComponent(Amountg))
                .addGap(23, 23, 23))
        );

        lbl1.setText("Status - Not searched ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewCode, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewName, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FINDBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(NewCbox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(SavBtn)
                        .addGap(31, 31, 31)
                        .addComponent(DeBtn)
                        .addGap(36, 36, 36)
                        .addComponent(jButton6))
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(SearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FINDBTN))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SavBtn)
                    .addComponent(DeBtn)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(lbl1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Item code");

        CodeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodeBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Catagory");

        cBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Stationary", "Cosmatics", "Medicines", "Equipments" }));

        jButton3.setText("Auto genarate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Item name");

        jLabel7.setText("Unit price");

        jLabel8.setText("Amount");

        Savebtn.setText("Save");
        Savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebtnActionPerformed(evt);
            }
        });

        Clearbtn.setText("Clear");
        Clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NameBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceBox)
                            .addComponent(AmountBox)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Savebtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Clearbtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(22, 22, 22)
                                .addComponent(cBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(CodeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Savebtn)
                            .addComponent(Clearbtn))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Inventory", jPanel1);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setText("Place a shipment order");

        jLabel47.setText("Shipment ID");

        jLabel48.setText("Description");

        jLabel49.setText("Product ID");

        jPanel13.setBackground(new java.awt.Color(153, 153, 153));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Search and delete shipments");

        newServicebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FedEx", "DHL", "Sky lines", "MSC Shipping lines" }));

        newSender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSenderActionPerformed(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText("Destination");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setText("ID");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jButton12.setText("Find");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jCheckBox3)
                        .addGap(18, 18, 18)
                        .addComponent(idbox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(desSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(idbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("Search by");

        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Destination");

        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setText("New country code");

        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("Description");

        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("sending location");

        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("New service provider");

        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText("New ID");

        jButton13.setText("Update");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Delete");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        DataNotFound.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        DataNotFound.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14)
                        .addGap(27, 27, 27)
                        .addComponent(DataNotFound)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addComponent(jLabel57)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel62))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newCoCode)
                                    .addComponent(newServicebox, 0, 108, Short.MAX_VALUE)
                                    .addComponent(newidbox))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(newSender))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel58)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(newDestination))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel63)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(newDescription)))))
                        .addGap(42, 42, 42))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel50)
                .addGap(7, 7, 7)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newidbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67)
                    .addComponent(jLabel64)
                    .addComponent(newSender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newServicebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(jLabel58)
                    .addComponent(newDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newCoCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63)
                    .addComponent(newDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(DataNotFound))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        cbox_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FedEx", "DHL", "Sky lines", "MSC Shipping lines" }));
        cbox_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbox_1MouseClicked(evt);
            }
        });

        jLabel51.setText("Service provider");

        jLabel52.setText("Sending location");

        jLabel53.setText("Destination");

        jLabel54.setText("Country code");

        box_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_4ActionPerformed(evt);
            }
        });

        jLabel55.setText("Amount");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel56.setText("Preview");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");

        jButton15.setText("Genarate ID");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        totlbl.setText("Total - ");

        jButton20.setText("Add");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jTextField5.setText("Add or remove providers");
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });

        jButton21.setText("Remove");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(totlbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(saveBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 21, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel55))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box_3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box_2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box_4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box_5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box_6, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(box_7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(add_btn))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(box_1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton15))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(cbox_1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton21))))
                            .addComponent(jLabel46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47)
                            .addComponent(jButton15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbox_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51)
                            .addComponent(jButton20)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(box_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(box_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55)
                            .addComponent(add_btn))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(saveBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearBtn))
                            .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel56)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totlbl)
                        .addGap(7, 7, 7))
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Shipment orders", jPanel3);

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Customer Invoice");

        jLabel23.setFont(new java.awt.Font("Maiandra GD", 1, 25)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Crinton");

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Queen's street, Colombo 6, Sri Lanka");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Date - ");

        date.setForeground(new java.awt.Color(0, 0, 0));

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Cashier - ");

        cashier.setForeground(new java.awt.Color(0, 0, 0));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Conatct");

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Email - Crinton20@yahoo.com");

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Phone - 0318733391");

        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Amount");

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Total");

        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Cash");

        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Balance");

        AmuL.setForeground(new java.awt.Color(0, 0, 0));

        TotL.setForeground(new java.awt.Color(0, 0, 0));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton7.setText("Cash");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        result.setForeground(new java.awt.Color(0, 0, 0));

        confirm.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cashier))
                            .addComponent(jLabel21)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TotL)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(AmuL)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel36)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton7)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(confirm)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(result)))))))
                        .addGap(15, 15, 15))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)))
                .addGap(1, 1, 1)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(date))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(cashier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(AmuL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TotL))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirm)
                                    .addComponent(result))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel22.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel22.setText("Customer checkout");

        jLabel32.setText("Item code");

        jLabel37.setText("Amount");

        jLabel38.setText("Payment type");

        rdb1.setText("Cash");

        rdb2.setText("Card");

        jLabel40.setText("Discount rate");

        jButton4.setText("Enter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton8.setText("Clear");

        check1.setText("Discounts ");

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));

        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Item name");

        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Unit price");

        NameL.setForeground(new java.awt.Color(0, 0, 0));

        UnitL.setForeground(new java.awt.Color(0, 0, 0));

        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Preview");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(UnitL)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(NameL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(NameL)))
                    .addComponent(jLabel44))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(UnitL))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jButton5.setText("Subtotal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jLabel42.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Sub total");

        sub.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        sub.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(29, 29, 29)
                        .addComponent(rdb1)
                        .addGap(18, 18, 18)
                        .addComponent(rdb2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(20, 20, 20)
                        .addComponent(jButton8)
                        .addGap(26, 26, 26)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(check1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel40)
                        .addGap(24, 24, 24)
                        .addComponent(Box3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel37))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Box1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(Box2)))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(Box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(Box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(rdb1)
                    .addComponent(rdb2))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Box3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check1)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton8)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Purchase", jPanel2);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Search results");

        jButton9.setText("Find");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Select a date to find the sales");

        jLabel43.setText("Average");

        jLabel45.setText("Total ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel45)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(box123, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel43)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(box256, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 426, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9))
                    .addComponent(dataShow, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box256, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reports", jPanel4);

        jLabel59.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel59.setText("Backup Data");

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(51, 51, 51));
        jLabel66.setText("Official web service provider");

        jLabel68.setForeground(new java.awt.Color(51, 51, 51));
        jLabel68.setText("Firebase by Google 2024. ");

        jLabel61.setForeground(new java.awt.Color(51, 51, 51));
        jLabel61.setText("All rights recieved");

        jButton18.setText("Refresh");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
        jLabel71.setText("Delete all the data and start new ");

        jLabel72.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel61))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel71)
                                .addGap(10, 10, 10))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel72)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel72)
                .addGap(59, 59, 59))
        );

        jLabel60.setText("Select the below tables to backup");

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));

        itemsDetails.setForeground(new java.awt.Color(0, 0, 0));
        itemsDetails.setText("Items");

        employeeDetails.setForeground(new java.awt.Color(0, 0, 0));
        employeeDetails.setText("Employee details");

        customerDetails.setForeground(new java.awt.Color(0, 0, 0));
        customerDetails.setText("Customer details");

        EmployeeInfo.setForeground(new java.awt.Color(0, 0, 0));
        EmployeeInfo.setText("Employee info");

        shipmentProducts.setForeground(new java.awt.Color(0, 0, 0));
        shipmentProducts.setText("Shipment products");

        shipmentOrders.setForeground(new java.awt.Color(0, 0, 0));
        shipmentOrders.setText("Shipment orders");

        jButton11.setText("Backup");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 0));

        jButton16.setText("Backup new");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton16))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(employeeDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customerDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shipmentOrders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmployeeInfo)
                            .addComponent(itemsDetails)
                            .addComponent(shipmentProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemsDetails)
                    .addComponent(employeeDetails))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerDetails)
                    .addComponent(EmployeeInfo))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shipmentProducts)
                    .addComponent(shipmentOrders))
                .addGap(41, 41, 41)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel73)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));

        b13.setForeground(new java.awt.Color(0, 0, 0));
        b13.setText("Items");

        b10.setForeground(new java.awt.Color(0, 0, 0));
        b10.setText("Employee details");

        b11.setForeground(new java.awt.Color(0, 0, 0));
        b11.setText("Customer details");

        b14.setForeground(new java.awt.Color(0, 0, 0));
        b14.setText("Employee info");

        b15.setForeground(new java.awt.Color(0, 0, 0));
        b15.setText("Shipment products");

        b12.setForeground(new java.awt.Color(0, 0, 0));
        b12.setText("Shipment orders");

        jButton10.setText("Prepare");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton17.setText("Prepare new");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton19.setText("Restore");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        restorelabel.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(restorelabel)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b14)
                            .addComponent(b13)
                            .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton17)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b13)
                    .addComponent(b10))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b11)
                    .addComponent(b14))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b15)
                    .addComponent(b12))
                .addGap(39, 39, 39)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton17)
                    .addComponent(jButton19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restorelabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel69.setText("Select the below tables to Restore");

        jLabel70.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel70.setText("Restore data");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addGap(33, 33, 33)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70)
                    .addComponent(jLabel69)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70)
                            .addComponent(jLabel59))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addComponent(jLabel69))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79))))
        );

        jTabbedPane1.addTab("Backup and restore", jPanel15);

        jPanel5.setBackground(new java.awt.Color(51, 0, 153));

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crinton");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Queen's street, Colombo 6, Sri Lanka");

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Log In");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(14, 14, 14))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        setSize(new java.awt.Dimension(1094, 674));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CodeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodeBoxActionPerformed

    private void SavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtnActionPerformed
        if(NameBox.getText().equals("") || CodeBox.getText().equals("") || PriceBox.getText().equals("")||AmountBox.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all the fields");
        }
        else{
            try{
                PreparedStatement ps= con.prepareStatement("Insert into Items values (?,?,?,?,?)");
           ps.setString(1, CodeBox.getText());
           ps.setString(2, NameBox.getText());
           String choice =(String)cBox1.getSelectedItem();
           ps.setString(3, choice);
           ps.setDouble(4, Double.parseDouble(PriceBox.getText()));
           ps.setInt(5, Integer.parseInt(AmountBox.getText()));
           int result = ps.executeUpdate();
           if(result == 1){
               JOptionPane.showMessageDialog(null, "Data Saved");
               NameBox.setText("");
        CodeBox.setText("");
        AmountBox.setText("");
        PriceBox.setText("");
           }
           else{
               JOptionPane.showMessageDialog(null, "Data not Saved");
           }
            }
            catch(SQLException ee){
                JOptionPane.showMessageDialog(null, ee.toString());
            }
            
        }
    }//GEN-LAST:event_SavebtnActionPerformed

    private void ClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbtnActionPerformed
        NameBox.setText("");
        CodeBox.setText("");
        AmountBox.setText("");
        PriceBox.setText("");
        if(ssh == 1){
         try{
           BufferedReader reader = new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\itemIDgenarator.txt"));
           String id = reader.readLine();
           int ID = Integer.parseInt(id);
           ID--;
            //JOptionPane.showMessageDialog(null,"" + ID);
            //CodeBox.setText("I00"+String.valueOf(ID));
            FileWriter writer1 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\itemIDgenarator.txt");
            writer1.append(String.valueOf(ID));
            writer1.close();
            reader.close();
       }
       catch(Exception ee){
           JOptionPane.showMessageDialog(null, ee.toString());
       }
         ssh = 0;
        }
        else{
           JOptionPane.showMessageDialog(null, "Data is already cleared. Genarate a new key to start");
           Clearbtn.setEnabled(false);
        }
         
    }//GEN-LAST:event_ClearbtnActionPerformed

    private void NewNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewNameActionPerformed

    private void NewCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewCodeActionPerformed

    private void FINDBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FINDBTNActionPerformed
        if(SearchBox.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill the fields before search data");
        }   
        else{
           try{
                String id = null,name = null,catagory = null;
                double unit = 0;
                int amu = 0;
                PreparedStatement ps= con.prepareStatement("SELECT *FROM Items WHERE ItemCode = ?");
                ps.setString(1, SearchBox.getText());
                try(ResultSet dataRead = ps.executeQuery()){
                    if(dataRead != null){
                         lbl1.setText("Status - Data found");
                        while(dataRead.next()){
                            id = dataRead.getString("ItemCode");
                            name = dataRead.getString("ItemName");
                            catagory = dataRead.getString("Catagory");
                            unit = dataRead.getDouble("UnitPrice");
                            amu = dataRead.getInt("Amount");
                        }
                        if(id != null){
                        NewName.setEnabled(true);
                        NewAmount.setEnabled(true);
                        NewCbox.setEnabled(true);
                        NewPrice.setEnabled(true);
                        NewCode.setEnabled(true);
                        SavBtn.setEnabled(true);
                        DeBtn.setEnabled(true);
                        IDg.setText(id);
                        Nameg.setText(name);
                        Priceg.setText(String.valueOf(unit));
                        Amountg.setText(String.valueOf(amu));
                        Catagoryg.setText(catagory);
                        }
                        else{
                           lbl1.setText("Status - Data not found");
                        NewName.setEnabled(false);
                        NewAmount.setEnabled(false);
                        NewCbox.setEnabled(false);
                        NewPrice.setEnabled(false);
                        NewCode.setEnabled(false); 
                        SavBtn.setEnabled(false);
                        DeBtn.setEnabled(false);
                        }
                        
                    }
                }
                
           }
           catch(SQLException ee){
               JOptionPane.showMessageDialog(null, "Error");
           }
        }
    }//GEN-LAST:event_FINDBTNActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        box123.setEditable(false);
        box256.setEditable(false);
        CodeBox.setEnabled(false);
        NewName.setEnabled(false);
        NewAmount.setEnabled(false);
        NewCbox.setEnabled(false);
        NewPrice.setEnabled(false);
        NewCode.setEnabled(false);
        SavBtn.setEnabled(false);
        DeBtn.setEnabled(false);
        jTextField1.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(false);
        buttonGroup1.add(rdb1);
        buttonGroup1.add(rdb2);
        rdb1.setEnabled(false);
        rdb2.setEnabled(false);
        dataShow.setEditable(false);
        txtArea.setEditable(false);
        //TBpane.setEnabled(false);
       // saveBtn.setEnabled(false);
        clearBtn.setEnabled(false);
        add_btn.setEnabled(false);
        textArea2.setEditable(false);
        idbox.setEnabled(false);
        desSearchBox.setEnabled(false);
        newidbox.setEnabled(false);
        newServicebox.setEnabled(false);
        newCoCode.setEnabled(false);
        newSender.setEnabled(false);
        newDestination.setEnabled(false);
        newDescription.setEnabled(false);
        textArea1.setEditable(false);
        box_1.setEnabled(false);
        setResizable(false);
        setDefaultCloseOperation(MainMenu.DO_NOTHING_ON_CLOSE);
        LocalDate today = LocalDate.now();
        date.setText("" + today);
        Date = today.toString();
        try{
            PreparedStatement ps = con.prepareStatement("SELECT name FROM emInfo WHERE usName = ?");
            ps.setString(1, username);
            
            try(ResultSet data = ps.executeQuery()){
                if(data != null){
                    while(data.next()){
                        Name = data.getString("name");
                    }
                }
                cashier.setText(Name);
            }        
        }
        catch(SQLException ss){
            JOptionPane.showMessageDialog(null, ss.toString());
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
        
    }//GEN-LAST:event_formWindowActivated

    private void SavBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavBtnActionPerformed
        if(NewName.getText().equals("")|| NewCode.getText().equals("")||NewPrice.getText().equals("")||NewAmount.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill the fields before updating the row");
        }
        else{
            try{
                PreparedStatement ps =  con.prepareStatement("UPDATE Items SET ItemCode = ?,ItemName = ?,Catagory = ?,UnitPrice = ?,Amount = ? WHERE ItemCode = ?");
                ps.setString(1, NewCode.getText());
                ps.setString(2, NewName.getText());
                String choice =(String)NewCbox.getSelectedItem();
                ps.setString(3,choice );
                ps.setDouble(4, Double.parseDouble(NewPrice.getText()));
                ps.setInt(5,Integer.parseInt(NewAmount.getText()) );
                ps.setString(6, SearchBox.getText());
                int confirm = ps.executeUpdate();
                if(confirm == 1){
                    JOptionPane.showMessageDialog(null, "ID:" + SearchBox.getText()+"Updated");
                }
                else{
                    JOptionPane.showMessageDialog(null, "ID:" + SearchBox.getText()+"Not updated");
                }
            }
            catch(SQLException ee){
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }
    }//GEN-LAST:event_SavBtnActionPerformed

    private void DeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeBtnActionPerformed
         try{
                PreparedStatement ps =  con.prepareStatement("DELETE FROM Items WHERE ItemCode = ?");
                ps.setString(1, SearchBox.getText());
                int confirm = ps.executeUpdate();
                if(confirm == 1){
                    JOptionPane.showMessageDialog(null, "ID:" + SearchBox.getText()+"Deleted");
                }
                else{
                    JOptionPane.showMessageDialog(null, "ID:" + SearchBox.getText()+"Not deleted");
                }
            }
            catch(SQLException ee){
                JOptionPane.showMessageDialog(null, ee.toString());
            }
    }//GEN-LAST:event_DeBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          if(Box1.getText().equals("")||Box2.getText().equals("")){
              JOptionPane.showMessageDialog(null, "Fill the fields");
          }      
          else{
              try{
                  
                  String itName = "";
                  double Unit = 0;
                  int amuNt = 0;
                  PreparedStatement ps = con.prepareStatement("SELECT ItemName,UnitPrice,Amount FROM Items WHERE ItemCode = ?");
                  ps.setString(1, Box1.getText());
                  try(ResultSet dataRead = ps.executeQuery()){
                      if(dataRead != null){
                          while(dataRead.next()){
                             itName = dataRead.getString("ItemName");
                             Unit = dataRead.getDouble("UnitPrice");
                             amuNt = dataRead.getInt("Amount");
                          }
                      }
                  }
                  if(amuNt == 0){
                          JOptionPane.showMessageDialog(null, "Out of stock");
                      }
                      else{
                          JOptionPane.showMessageDialog(null, "Pssed");
                      NameL.setText(itName);
                      UnitL.setText(String.valueOf(Unit));
                      double tot = Unit * Double.parseDouble(Box2.getText());
                      jTextField4.setText(String.valueOf(tot));
                      Nettot  = Nettot + tot;
                      jTextField1.setText(String.valueOf(Nettot));
                      double amu = Double.parseDouble(Box2.getText());
                      amuNt =(int)(amuNt - amu);
                      try{
                      PreparedStatement ps3 = con.prepareStatement("UPDATE Items SET Amount = ? WHERE ItemCode = ?");
                      ps3.setInt(1, amuNt);
                      ps3.setString(2, Box1.getText());
                      int rse = ps3.executeUpdate();
                      if(rse == 1){
                          JOptionPane.showMessageDialog(null, "Data updated");
                      }
                      else{
                          JOptionPane.showMessageDialog(null, "Data not updated"); 
                      }
                      }
                      catch(Exception ll){
                          JOptionPane.showMessageDialog(null, ll.toString());
                      }
                      Box1.setText("");
                      Box2.setText("");
                      txtArea.setEditable(false);
                      txtArea.append("Item name:" + itName +" Unit price:"+ Unit +" Amount:"+ String.valueOf(amu) + "\n");    
                      }
              }
              catch(SQLException ee){
                  JOptionPane.showMessageDialog(null, ee.toString());
              }
              catch(Exception ss){
                  JOptionPane.showMessageDialog(null, ss.toString());
              }
          }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       rdb1.setEnabled(true);
       rdb2.setEnabled(true);
       check1.setEnabled(true);
       Box3.setEnabled(true);
        if(check1.isSelected() == true){
            if(Box3.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill the relavant fields");
            }
            else{
             double dis = Double.parseDouble(Box3.getText());
             double tot  = Double.parseDouble(jTextField1.getText());
             double tot2 = tot * (dis/100);
             disco = tot2;
             //TESTING-----------------
             //JOptionPane.showMessageDialog(null, disco);
             tot2 = tot - tot2; 
             sub.setText(""+tot2);    
            }
            
        }
        else{
           sub.setText(jTextField1.getText());    
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        if(jTextField2.getText().equals(""))
      {
          JOptionPane.showMessageDialog(null, "Fill the relavent fields");
      }
      else{
        try{
        double sub1 = Double.parseDouble(sub.getText());
        double given = Double.parseDouble(jTextField2.getText());
        double bal = 0;
        bal = given - sub1;
        jTextField3.setText("" + bal);
         PreparedStatement ps = con.prepareStatement("SELECT cusID FROM Customer WHERE cusID = (SELECT MAX(cusID) FROM Customer)");
            try(ResultSet data = ps.executeQuery()){
                if(data != null){
                    while(data.next()){
                        cusID = data.getString("cusID");
                    }
                }
            }
            int cus = Integer.parseInt(cusID);
            int newCus = 0;
            newCus = cus + 1;
        PreparedStatement ps2 = con.prepareStatement("INSERT INTO Customer VALUES (?,?,?,?,?,?)");
        ps2.setString(1, String.valueOf(newCus));
        String choice = "";
        if(rdb1.isSelected() == true){
            choice = "cash";
        }
        else{
            choice = "card";
        }
        ps2.setString(2, choice);
        ps2.setDouble(3, Double.parseDouble(sub.getText()));
        ps2.setDouble(4,Double.parseDouble(jTextField2.getText()));
        ps2.setString(5, Date);
        ps2.setString(6, cashier.getText());
        int result = ps2.executeUpdate();
        if(result == 1){
            confirm.setText("Data saved");
        }
        else{
            confirm.setText("Data not saved");
        }
       }
       catch(SQLException ss){
        JOptionPane.showMessageDialog(null, ss.toString());    
        }
       catch(Exception ee){
        JOptionPane.showMessageDialog(null, ee.toString());    
       }  
      }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dataShow.setText("");
        try{
            String formattedDate = "";
            java.util.Date selectedDate =  dateChooser.getDate();
            
         if (selectedDate != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    formattedDate = sdf.format(selectedDate);
                    //JOptionPane.showMessageDialog(null, formattedDate);
                } else {
                    JOptionPane.showMessageDialog(null, "Error :( ");
                }
         PreparedStatement ps = con.prepareStatement("SELECT * FROM Customer WHERE date = ?");
         ps.setString(1,formattedDate);
         double tot = 0,avg = 0;
         int count = 0;
         try(ResultSet dataRead = ps.executeQuery()){
             if(dataRead!=null){
                 while(dataRead.next()){
                     String ID = dataRead.getString("cusID");
                     String pType = dataRead.getString("pType");
                     double bill = dataRead.getDouble("billTot");
                     double givelAmu = dataRead.getDouble("givenAmu");
                     String date = dataRead.getString("date");
                     String cashier = dataRead.getString("cashier");
                     dataShow.append("ID:" + ID + "   Payment type:" + pType + "   Total amount:" + bill + "   Given amount:" + givelAmu + "   Date:" + date + "  Cashier:" + cashier + "\n");
                     tot = tot + bill; 
                     count++;
                 }
                 box123.setText(String.valueOf(tot));
                 avg = tot / count;
                 box256.setText(String.valueOf(avg));
             }
         }
        }
        catch(SQLException ss){
            JOptionPane.showMessageDialog(null, ss.toString());
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void box_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_4ActionPerformed

    private void newSenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newSenderActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
       jButton15.setEnabled(false);
        if(box_1.getText().equals("")||box_2.getText().equals("")||box_3.getText().equals("")||box_4.getText().equals("")||box_5.getText().equals("")||box_6.getText().equals("")||box_7.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Please fill the fields");
       }
       else{
           try{
               PreparedStatement ps = con.prepareStatement("INSERT INTO shipmentProducts(productID,shipmentOrID,amount) VALUES (?,?,?)");
               ps.setString(1, box_6.getText());
               ps.setString(2, newID);
               ps.setDouble(3, Double.parseDouble(box_7.getText()));
               PreparedStatement ps2 = con.prepareStatement("SELECT UnitPrice FROM Items WHERE ItemCode = ?");
               ps2.setString(1, box_6.getText());
               double amount = Double.parseDouble(box_7.getText());
               try(ResultSet dataset = ps2.executeQuery()){
                   if(dataset!=null){
                       while(dataset.next()){
                           double price = dataset.getDouble("UnitPrice");
                           finalTotal = finalTotal + (price * amount);
                       }
                   }
                   totlbl.setText("Total: "+finalTotal);
               }
               int result = ps.executeUpdate();
               if(result == 1){
                   textArea2.setText("Product ID: " + box_6.getText()+" Shipment order ID: "+newID+" Amount: "+box_7.getText());
                   box_6.setText("");
                   box_7.setText("");
               }
               else{
                   JOptionPane.showMessageDialog(null,"error");
               }
           }
           catch(Exception ee){
               JOptionPane.showMessageDialog(null, ee.toString());
           }
       }
    }//GEN-LAST:event_add_btnActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       try{
          
           PreparedStatement ps = con.prepareStatement("SELECT ID FROM shipmentOrders WHERE ID = (SELECT MAX(ID) FROM shipmentOrders)");
           try(ResultSet dataRead = ps.executeQuery()){
               if(dataRead != null){
                   while(dataRead.next()){
                       id = Integer.parseInt(dataRead.getString("ID"));
                   }
                   
               }
               id++;
               oldID = String.valueOf(id);
               newID = "e"+oldID;
               box_1.setText(newID);
               add_btn.setEnabled(true);
           }
       }
       catch(Exception ee){
        JOptionPane.showMessageDialog(null, ee.toString());
    }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
       try{
           PreparedStatement ps = con.prepareStatement("INSERT INTO shipmentOrders VALUES (?,?,?,?,?,?,?,?)");
           ps.setString(1, String.valueOf(oldID));
           ps.setString(2, newID);
           ps.setString(3, String.valueOf(cbox_1.getSelectedItem()));
           ps.setString(4, box_2.getText());
           ps.setString(5, box_3.getText());
           ps.setString(6, box_4.getText());
           ps.setString(7, box_5.getText());
           ps.setDouble(8, finalTotal);
           int result = ps.executeUpdate();
           if(result == 1){
               JOptionPane.showMessageDialog(null, "Data saved");
               clearBtn.setEnabled(true);
           }
           else{
               JOptionPane.showMessageDialog(null, "Data not saved");
           }
       }
       catch(Exception ee){
           JOptionPane.showMessageDialog(null, ee.toString());
       }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected()){ //ID: 1 = Destination
        desSearchBox.setEnabled(true);
        query = query + "destination = ? AND ";
        IDlocator[IDlocatorCount] = 1;
            IDlocatorCount++;
        }
        else{
            desSearchBox.setEnabled(false);
            IDlocatorCount--;
            IDlocator[IDlocatorCount] = 0;
            
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if(jCheckBox3.isSelected()){ //ID:2=ID
        idbox.setEnabled(true);  
        query = query + "shipmentID = ? AND ";
        IDlocator[IDlocatorCount] = 2;
            IDlocatorCount++;
        }
        else{
            idbox.setEnabled(false);
            IDlocatorCount--;
            IDlocator[IDlocatorCount] = 0;
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       query = query.substring(0, query.length() - 1);
        query = query.substring(0, query.length() - 1); // removing the last 3 charaters (to remove AND)
        query = query.substring(0, query.length() - 1);
        query = query.substring(0, query.length() - 1);
        //JOptionPane.showMessageDialog(null, query);
        try{
            //JOptionPane.showMessageDialog(null, query);
            PreparedStatement ps = con.prepareStatement(query);
            if(!idbox.getText().equals("")){
                 whichBoxID = 2;
                while(count<2){
                    if(IDlocator[count] == whichBoxID){
                        count2 = count;
                    }
                    count++;
                }
               count2++;
                ps.setString(count2, idbox.getText());
            }
            if(!desSearchBox.getText().equals("")){
                 count = 0;
                 count2 = 0;
                 IDlocatorCount = 0;
                 whichBoxID = 1;
                while(count<2){
                    if(IDlocator[count] == whichBoxID){
                        count2 = count;
                    }
                    count++;
                }
               count2++;
                ps.setString(count2, desSearchBox.getText());
            }
            try(ResultSet dataRead = ps.executeQuery()){
                String line1 = "";
                        String line2 = "";
                        String line3 = "";
                        String line4 = "";
                        String line5 = "";
                        String line6 = "";
                        String line7 = "";
                        String line8 = "";
                if(dataRead!=null){
                    while(dataRead.next()){
                         line1 = dataRead.getString("ID");
                         line2 = dataRead.getString("shipmentID");
                         line3 = dataRead.getString("serviceProvider");
                         line4 = dataRead.getString("sendingLocation");
                         line5 = dataRead.getString("destination");
                         line6 = dataRead.getString("countryCode");
                         line7 = dataRead.getString("description");
                         line8 = String.valueOf(dataRead.getString("total"));
                    }
                    if(line1 != ""){
                    newidbox.setEnabled(true);
                    newServicebox.setEnabled(true);
                    newCoCode.setEnabled(true);
                    newSender.setEnabled(true);
                    newDestination.setEnabled(true);
                    newDescription.setEnabled(true);
                    deleteKey = line1;
                    textArea1.setText("ID: "+line1+" Shipment ID : "+line2+" Service provider : "+line3+" Sending location : "+line4+" Destination : "+line5+" Country code : "+line6+" Description : "+line7+" Invoice amount : "+line8);    
                    }
                    else{
                    DataNotFound.setText("Data not found");
                    }
                    jCheckBox3.setSelected(false);
                    jCheckBox2.setSelected(false);
                    desSearchBox.setText("");
                    idbox.setText("");
                    count = 0;
                    count2 = 0;
                    IDlocatorCount = 0;
                    whichBoxID = 0;
                    for (int i = 0; i < 2; i++) {
                         IDlocator[i] = 0;
                    }
                    query = "SELECT * FROM shipmentOrders WHERE ";
                }
                
            }
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try{
            int resonse = JOptionPane.showConfirmDialog(null, "Do want to remove this record? (ID : "+deleteKey + ")");
            if(resonse == JOptionPane.YES_OPTION){
                PreparedStatement ps = con.prepareStatement("DELETE FROM shipmentOrders WHERE ID = ?");
                ps.setString(1, deleteKey);
                int result = ps.executeUpdate();
                if(result == 1){
                    JOptionPane.showMessageDialog(null, "Data deleted");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Data not deleted");
                }
                    newidbox.setEnabled(false);
                    newServicebox.setEnabled(false);
                    newCoCode.setEnabled(false);
                    newSender.setEnabled(false);
                    newDestination.setEnabled(false);
                    newDescription.setEnabled(false);
                    jCheckBox3.setSelected(false);
                    jCheckBox3.setSelected(false);
                    jCheckBox2.setSelected(false);
                    desSearchBox.setText("");
                    idbox.setText("");
                    count = 0;
                    count2 = 0;
                    IDlocatorCount = 0;
                    whichBoxID = 0;
                    for (int i = 0; i < 2; i++) {
                         IDlocator[i] = 0;
                    }
                    query = "SELECT * FROM shipmentOrders WHERE ";
            }
        }
        catch(Exception ee){
            
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       try{
           if(newidbox.getText().equals("")||newSender.getText().equals("")||newDestination.getText().equals("")||newCoCode.getText().equals("")||newDescription.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Fill the fields");
           }
           else{
           PreparedStatement ps = con.prepareStatement("UPDATE shipmentOrders SET serviceProvider = ?, sendingLocation = ?,destination = ?,countryCode = ?,description = ? WHERE ID = ?");  
           ps.setString(1, (String) newServicebox.getSelectedItem());
           ps.setString(2, newSender.getText());
           ps.setString(3, newDestination.getText());
           ps.setString(4, newCoCode.getText());
           ps.setString(5, newDescription.getText());
           ps.setString(6, deleteKey);
           int Result = ps.executeUpdate();
           if(Result == 1) {
               DataNotFound.setText("Data updated (ID : "+deleteKey+")");
           }
           else{
               DataNotFound.setText("Data not updated");
           }
           newidbox.setEnabled(false);
                    newServicebox.setEnabled(false);
                    newCoCode.setEnabled(false);
                    newSender.setEnabled(false);
                    newDestination.setEnabled(false);
                    newDescription.setEnabled(false);
           jCheckBox3.setSelected(false);
                    jCheckBox2.setSelected(false);
                    desSearchBox.setText("");
                    idbox.setText("");
                    count = 0;
                    count2 = 0;
                    IDlocatorCount = 0;
                    whichBoxID = 0;
                    for (int i = 0; i < 2; i++) {
                         IDlocator[i] = 0;
                    }
                    query = "SELECT * FROM shipmentOrders WHERE ";
           }
           
       }
       catch(Exception ee){
           JOptionPane.showMessageDialog(null, ee.toString());
       }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      if(tempo == 0){
            try{
            FileWriter condis;
            condis = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\conditions.txt");
            condis.append("1");
            condis.close();
        }
        catch(Exception ll){
            JOptionPane.showMessageDialog(null, ll.toString());
        }
        if(employeeDetails.isSelected() || customerDetails.isSelected() || shipmentOrders.isSelected() || itemsDetails.isSelected() || EmployeeInfo.isSelected() || shipmentProducts.isSelected()){
             FileWriter filewriter2 = null;
         try {
             filewriter2 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\choices.txt");
         } catch (IOException ex) {
             Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
         }
      if(employeeDetails.isSelected()){
          FileWriter fileWriter1;
          try {
              filewriter2.append("1" + "\n");
          } catch (IOException ex) {
              Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
          }
          try{
              fileWriter1 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\borrowed.txt",true);
              String line1 = null,line2 = null,line3 = null,line4 = null;
            PreparedStatement ps = con.prepareStatement("SELECT * FROM employee");
            try(ResultSet dataRead = ps.executeQuery()){
                if(dataRead!= null){
                    while(dataRead.next()){
                        line1 = dataRead.getString("accID");
                        line2 = dataRead.getString("empID");
                        line3 = dataRead.getString("userName");
                        line4 = dataRead.getString("pass");
                        fileWriter1.append(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n");
                    }
                     fileWriter1.close();
                }
            }
          }
          catch(Exception ee){
              JOptionPane.showMessageDialog(null, ee.toString());
          }
      }
      if(customerDetails.isSelected()){
              try {
              filewriter2.append("2" + "\n");
              FileWriter fileWriter3;
              String line1,line2,line3,line4,line5,line6;
              fileWriter3 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\cusDetails.txt",true);
              PreparedStatement ps = con.prepareStatement("SELECT * FROM Customer");
              try(ResultSet dataRead = ps.executeQuery()){
                  if(dataRead!=null){
                      while(dataRead.next()){
                          line1 = dataRead.getString("cusID");
                          line2 = dataRead.getString("pType");
                          line3 = String.valueOf(dataRead.getDouble("billTot"));
                          line4 = String.valueOf(dataRead.getDouble("givenAmu"));
                          line5 = dataRead.getString("date");
                          line6 = dataRead.getString("cashier");
                          fileWriter3.append(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n" + line6 + "\n");
                      }
                  }
                  fileWriter3.close();
              }
              
          }
          catch(SQLException ee){
              JOptionPane.showMessageDialog(null, ee.toString());
          }
          catch (IOException ex) {
              JOptionPane.showMessageDialog(null, ex.toString());
          }
          catch(Exception ss){
              JOptionPane.showMessageDialog(null, ss.toString());
          }
      }
      if(shipmentOrders.isSelected()){
              try {
              filewriter2.append("3" + "\n");
              FileWriter fileWriter4;
              String line1,line2,line3,line4,line5,line6,line7,line8;
              fileWriter4 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\shipmentOrders.txt",true);
              PreparedStatement ps = con.prepareStatement("SELECT * FROM shipmentOrders");
              try(ResultSet dataRead = ps.executeQuery()){
                  if(dataRead!=null){
                      while(dataRead.next()){
                          line1 = dataRead.getString("ID");
                          line2 = dataRead.getString("shipmentID");
                          line3 = dataRead.getString("serviceProvider");
                          line4 = dataRead.getString("sendingLocation");
                          line5 = dataRead.getString("destination");
                          line6 = dataRead.getString("countryCode");
                          line7 = dataRead.getString("description");
                          line8 = String.valueOf(dataRead.getDouble("total"));
                          fileWriter4.append(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n" + line6 + "\n" + line7 + "\n" + line8 + "\n");
                      }
                  }
                  fileWriter4.close();
              }
              
          } catch (Exception ex) {
              Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
          } 
      }
      if(itemsDetails.isSelected()){
              try {
              filewriter2.append("4" + "\n");
              FileWriter fileWriter5;
              String line1,line2,line3,line4,line5;
              fileWriter5 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\Items.txt",true);
              PreparedStatement ps = con.prepareStatement("SELECT * FROM Items");
              try(ResultSet dataRead = ps.executeQuery()){
                  if(dataRead!=null){
                      while(dataRead.next()){
                          line1 = dataRead.getString("ItemCode");
                          line2 = dataRead.getString("ItemName");
                          line3 = dataRead.getString("Catagory");
                          line4 = String.valueOf(dataRead.getDouble("UnitPrice"));
                          line5 = String.valueOf(dataRead.getInt("Amount"));
                          fileWriter5.append(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n");
                      }
                  }
                  fileWriter5.close();
              }
              
          } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, ex.toString());
          }  
      }
      if(EmployeeInfo.isSelected()){
              try {
              filewriter2.append("5" + "\n");
               FileWriter fileWriter6;
              String line1,line2,line3,line4;
              fileWriter6 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\emInfo.txt",true);
              PreparedStatement ps = con.prepareStatement("SELECT * FROM emInfo");
              try(ResultSet dataRead = ps.executeQuery()){
                  if(dataRead!=null){
                      while(dataRead.next()){
                          line1 = dataRead.getString("emID");
                          line2 = dataRead.getString("name");
                          line3 = dataRead.getString("address");
                          line4 = dataRead.getString("usName");
                          fileWriter6.append(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n");
                      }
                  }
                  fileWriter6.close();
              }
              
          } catch (Exception ex) {
              Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
      if(shipmentProducts.isSelected()){
              try {
              filewriter2.append("6" + "\n");
               FileWriter fileWriter7;
              String line1,line2,line3,line4;
              fileWriter7 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\shipmentProducts.txt",true);
              PreparedStatement ps = con.prepareStatement("SELECT * FROM shipmentProducts");
              try(ResultSet dataRead = ps.executeQuery()){
                  if(dataRead!=null){
                      while(dataRead.next()){
                          line1 = dataRead.getString("shid");
                          line2 = dataRead.getString("productID");
                          line3 = dataRead.getString("shipmentOrID");
                          line4 = String.valueOf(dataRead.getDouble("amount"));
                          fileWriter7.append(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n");
                      }
                  }
                  fileWriter7.close();
              }
              
          } catch (Exception ex) {
              Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
         try {
             filewriter2.close();
         } catch (IOException ex) {
             Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
         }
         jLabel73.setText("Data prepared for the backup");
         JOptionPane.showMessageDialog(null, "Important\n" + "By clicking this you prepared the selected data\n"+"for the backup. please go to Firebase data backup center to\n"+"complete the backup.\n"+"To cancel and create a new backup click Backup new.");
         employeeDetails.setEnabled(false);
         customerDetails.setEnabled(false);
         shipmentOrders.setEnabled(false);
         shipmentProducts.setEnabled(false);
         EmployeeInfo.setEnabled(false);
         itemsDetails.setEnabled(false);
         jButton11.setEnabled(false);
        } 
        else{
            JOptionPane.showMessageDialog(null, "Please select a table to prepare");
        }
        tempo =1;
      }
      
    }//GEN-LAST:event_jButton11ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       if(tempo == 0){
           try{
                     PrintWriter writer9 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb1.txt");
                     PrintWriter writer8 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb2.txt");
                     PrintWriter writer7 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb3.txt");
                     PrintWriter writer6 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb4.txt");
                     PrintWriter writer5 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb5.txt");
                     PrintWriter writer4 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb6.txt");
                     writer9.print("");
                     writer8.print("");
                     writer7.print("");
                     writer6.print("");
                     writer5.print("");
                     writer4.print("");
                     writer9.close();
                     writer8.close();
                     writer7.close();
                     writer6.close();
                     writer5.close();
                     writer4.close();  
           }
           catch(Exception ll){
               JOptionPane.showMessageDialog(null, ll.toString());
           }
            try{
                
                 PrintWriter writer = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\restorechoices.txt");
             PrintWriter writer2 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\conditions.txt");
             writer.print("");
             writer2.print("");
             writer.close();
             writer2.close();
            if(!b10.isSelected() && !b11.isSelected() && !b12.isSelected() && !b13.isSelected() && !b14.isSelected() && !b15.isSelected()){
                JOptionPane.showMessageDialog(null, "Please select a table");
            }
            else{
                try{
                    FileWriter condis;
            condis = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\conditions.txt");
            condis.append("2");
            condis.close();
                    FileWriter filewriter;
                    filewriter = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\restorechoices.txt");
                if(b10.isSelected()){
                    filewriter.append("0\n");
                }
                if(b11.isSelected()){
                    filewriter.append("1\n");
                }
                if(b12.isSelected()){
                    filewriter.append("2\n");
                }
                if(b13.isSelected()){
                    filewriter.append("3\n");
                }
                if(b14.isSelected()){
                    filewriter.append("4\n");
                }
                if(b15.isSelected()){
                    filewriter.append("5\n");
                }
                 b10.setEnabled(false);
                 b11.setEnabled(false);
                 b12.setEnabled(false);
                 b13.setEnabled(false);
                 b14.setEnabled(false);
                 b15.setEnabled(false);
                 jButton10.setEnabled(false);
                 JOptionPane.showMessageDialog(null, "Important\n" + "By clicking this you prepared the selected data\n"+"for the restore. please go to Firebase data backup center to\n"+"complete the Restore.\n"+"To cancel and create a new restore click Restore new.");
                 filewriter.close();
                }
                catch(Exception ll){
                    JOptionPane.showMessageDialog(null, ll.toString());
                }   
            }          
        }
        catch(Exception ll){
            JOptionPane.showMessageDialog(null, ll.toString());
        }
           tempo = 1;
       }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        try{
             PrintWriter writer1 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\choices.txt");
             PrintWriter writer2 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\borrowed.txt");
             PrintWriter writer3 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\cusDetails.txt");
             PrintWriter writer4 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\shipmentOrders.txt");
             PrintWriter writer5 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\Items.txt");
             PrintWriter writer6 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\emInfo.txt");
             PrintWriter writer7 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\shipmentProducts.txt");
             PrintWriter writer8 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\conditions.txt");
              writer1.print("");
              writer2.print("");
              writer3.print("");
              writer4.print("");
              writer5.print("");
              writer6.print("");
              writer7.print("");
              writer8.print("");
              writer1.close();
              writer2.close();
              writer3.close();
              writer4.close();
              writer5.close();
              writer6.close();
              writer7.close();
              writer8.close();
              employeeDetails.setEnabled(true);
              customerDetails.setEnabled(true);
               shipmentOrders.setEnabled(true);
         shipmentProducts.setEnabled(true);
         EmployeeInfo.setEnabled(true);
         itemsDetails.setEnabled(true);
         employeeDetails.setSelected(false);
         customerDetails.setSelected(false);
         shipmentOrders.setSelected(false);
         shipmentProducts.setSelected(false);
         EmployeeInfo.setSelected(false);
         itemsDetails.setSelected(false); 
         jButton11.setEnabled(true);
          jLabel73.setText("");
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
         try{
                     PrintWriter writer9 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb1.txt");
                     PrintWriter writer8 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb2.txt");
                     PrintWriter writer7 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb3.txt");
                     PrintWriter writer6 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb4.txt");
                     PrintWriter writer5 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb5.txt");
                     PrintWriter writer4 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb6.txt");
                     writer9.print("");
                     writer8.print("");
                     writer7.print("");
                     writer6.print("");
                     writer5.print("");
                     writer4.print("");
                     writer9.close();
                     writer8.close();
                     writer7.close();
                     writer6.close();
                     writer5.close();
                     writer4.close();  
           }
           catch(Exception ll){
               JOptionPane.showMessageDialog(null, ll.toString());
           }
        try {
             PrintWriter writer = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\restorechoices.txt");
             PrintWriter writer2 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\conditions.txt");
             writer.print("");
             writer2.print("");
             writer.close();
             writer2.close();
         } catch (FileNotFoundException ex) {
             JOptionPane.showMessageDialog(null, ex.toString());
         }
                 b10.setEnabled(true);
                 b11.setEnabled(true);
                 b12.setEnabled(true);
                 b13.setEnabled(true);
                 b14.setEnabled(true);
                 b15.setEnabled(true);
                 
                  b10.setSelected(false);
                 b11.setSelected(false);
                 b12.setSelected(false);
                 b13.setSelected(false);
                 b14.setSelected(false);
                 b15.setSelected(false);
                 
                 jButton10.setEnabled(true); 
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
       tempo = 0;
        jButton17ActionPerformed(evt);
        jButton16ActionPerformed(evt);
        jLabel72.setText("Freshed");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        int c = 0; 
        try{
             BufferedReader bufferedReader1=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb1.txt"));
             BufferedReader bufferedReader2=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb2.txt"));
             BufferedReader bufferedReader3=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb3.txt"));
             BufferedReader bufferedReader4=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb4.txt"));
             BufferedReader bufferedReader5=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb5.txt"));
             BufferedReader bufferedReader6=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb6.txt"));
             String line1 = "",line2 = "",line3 = "",line4 = "",line5 = "",line6 = "";
                     line1=bufferedReader1.readLine();
                     line2=bufferedReader2.readLine();
                     line3=bufferedReader3.readLine();
                     line4=bufferedReader4.readLine();
                     line5=bufferedReader5.readLine();
                     line6=bufferedReader6.readLine();
                     if(line1 != null){
                         BufferedReader b1=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb1.txt"));
                         try{
                             PreparedStatement ps = con.prepareStatement("DELETE FROM employee");
                             int result = ps.executeUpdate();
                         }
                         catch(Exception ee){
                             JOptionPane.showMessageDialog(null, ee.toString());
                         }
                         String l1 = "";
                          while ((l1=b1.readLine())!=null) {
                         String l2 = b1.readLine();
                         String l3 = b1.readLine();
                         String l4 = b1.readLine();
                            try{
                             PreparedStatement ps2 = con.prepareStatement("INSERT INTO employee VALUES(?,?,?,?)");
                             ps2.setString(1, l1);
                             ps2.setString(2, l2);
                             ps2.setString(3, l4);
                             ps2.setString(4, l3);
                             int result = ps2.executeUpdate();
                             if(result == 1){
                                // JOptionPane.showMessageDialog(null, "Restored");
                                restorelabel.setText("Restored");
                                c++;
                             }
                             else{
                                 //JOptionPane.showMessageDialog(null, "Operation could not be performed");
                             }
                         }
                         catch(SQLException ss){
                             JOptionPane.showMessageDialog(null, ss.toString());
                         }
                         catch(Exception ll){
                             JOptionPane.showMessageDialog(null, ll.toString());
                         }
                         }
                        
                     }
                     if(line2 != null){
                          BufferedReader b2=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb2.txt"));
                           try{
                             PreparedStatement ps = con.prepareStatement("DELETE FROM Customer");
                             int result = ps.executeUpdate();
                         }
                         catch(Exception ee){
                             JOptionPane.showMessageDialog(null, ee.toString());
                         }
                           String l1 = "";
                          while ((l1=b2.readLine())!=null) {
                         String l2 = b2.readLine();
                         String l3 = b2.readLine();
                         String l4 = b2.readLine();
                         String l5 = b2.readLine();
                         String l6 = b2.readLine();
                         try{
                             PreparedStatement ps2 = con.prepareStatement("INSERT INTO Customer VALUES(?,?,?,?,?,?)");
                             ps2.setString(1, l3);
                             ps2.setString(2, l6);
                             ps2.setDouble(3, Double.parseDouble(l1));
                             ps2.setDouble(4, Double.parseDouble(l5));
                             ps2.setString(5, l4);
                             ps2.setString(6, l2);
                             int result = ps2.executeUpdate();
                             if(result == 1){
                                // JOptionPane.showMessageDialog(null, "Restored");
                                restorelabel.setText("Restored");
                                c++;
                             }
                             else{
                                 //JOptionPane.showMessageDialog(null, "Operation could not be performed");
                             }
                         }
                         catch(Exception ee){
                             JOptionPane.showMessageDialog(null, ee.toString());
                         }
                     }
                     }
                     if(line3 != null){
                          BufferedReader b2=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb3.txt"));
                          String l1 = "";
                            try{
                             PreparedStatement ps = con.prepareStatement("DELETE FROM shipmentOrders");
                             int result = ps.executeUpdate();
                         }
                         catch(Exception ee){
                             JOptionPane.showMessageDialog(null, ee.toString());
                         }
                        while ((l1=b2.readLine())!=null) {
                         String l2 = b2.readLine();
                         String l3 = b2.readLine();
                         String l4 = b2.readLine();
                         String l5 = b2.readLine();
                         String l6 = b2.readLine();
                         String l7 = b2.readLine();
                         String l8 = b2.readLine();
                         try{
                            PreparedStatement ps2 = con.prepareStatement("INSERT INTO shipmentOrders VALUES(?,?,?,?,?,?,?,?)");
                            ps2.setString(1, l1);
                            ps2.setString(2, l2);
                            ps2.setString(3, l3);
                            ps2.setString(4, l4);
                            ps2.setString(5, l5);
                            ps2.setString(6, l6);
                            ps2.setString(7, l7);
                            ps2.setDouble(8, Double.parseDouble(l8));
                            int result = ps2.executeUpdate();
                            if(result == 1){
                                // JOptionPane.showMessageDialog(null, "Restored");
                                restorelabel.setText("Restored");
                                c++;
                             }
                             else{
                                 //JOptionPane.showMessageDialog(null, "Operation could not be performed");
                             }
                            
                         }
                         catch(Exception ee){
                             JOptionPane.showMessageDialog(null, ee.toString());
                         }
                     } 
                     }
                     if(line4 != null){
                         BufferedReader b2=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb4.txt"));
                          try{
                             PreparedStatement ps = con.prepareStatement("DELETE FROM Items");
                             int result = ps.executeUpdate();
                         }
                         catch(Exception ee){
                             JOptionPane.showMessageDialog(null, ee.toString());
                         }
                          String l1 = "";
                          while ((l1=b2.readLine())!=null) {
                         String l2 = b2.readLine();
                         String l3 = b2.readLine();
                         String l4 = b2.readLine();
                         String l5 = b2.readLine();
                         PreparedStatement ps2 = con.prepareStatement("INSERT INTO Items VALUES (?,?,?,?,?)");
                         ps2.setString(1, l1);
                         ps2.setString(2, l2);
                         ps2.setString(3, l3);
                         ps2.setDouble(4, Double.parseDouble(l4));
                         ps2.setInt(5, Integer.parseInt(l5));
                         int result = ps2.executeUpdate();
                         if(result == 1){
                                // JOptionPane.showMessageDialog(null, "Restored");
                                restorelabel.setText("Restored");
                                c++;
                         }
                         else{
                                 //JOptionPane.showMessageDialog(null, "Operation could not be performed");
                         }
                     }
                     }
                     if(line5 != null){
                          BufferedReader b2=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb5.txt"));
                           try{
                             PreparedStatement ps = con.prepareStatement("DELETE FROM emInfo");
                             int result = ps.executeUpdate();
                         }
                         catch(Exception ee){
                             JOptionPane.showMessageDialog(null, ee.toString());
                         }
                           String l1 = "";
                          while ((l1=b2.readLine())!=null) {
                           String l2 = b2.readLine();
                           String l3 = b2.readLine();
                           String l4 = b2.readLine();
                           PreparedStatement ps2 = con.prepareStatement("INSERT INTO emInfo VALUES(?,?,?,?)");
                           ps2.setString(1, l1);
                           ps2.setString(2, l2);
                           ps2.setString(3, l3);
                           ps2.setString(4, l4);
                           int result = ps2.executeUpdate();
                           if(result == 1){
                                // JOptionPane.showMessageDialog(null, "Restored");
                                restorelabel.setText("Restored");
                                c++;
                         }
                         else{
                                 //JOptionPane.showMessageDialog(null, "Operation could not be performed");
                         }
                        }
                     }
                     if(line6 != null){
                      BufferedReader b2=new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb6.txt"));
                       try{
                             PreparedStatement ps = con.prepareStatement("DELETE FROM shipmentProducts");
                             int result = ps.executeUpdate();
                         }
                         catch(Exception ee){
                             JOptionPane.showMessageDialog(null, ee.toString());
                         }
                       String l1 = "";
                      while ((l1=b2.readLine())!=null) {
                         String l2 = b2.readLine();
                         String l3 = b2.readLine();
                         String l4 = b2.readLine();
                         try{
                             PreparedStatement ps2 = con.prepareStatement("INSERT INTO shipmentProducts VALUES (?,?,?,?)");
                             ps2.setInt(1, Integer.parseInt(l1));
                             ps2.setString(2, l2);
                             ps2.setString(3, l3);
                             ps2.setDouble(4, Double.parseDouble(l4));
                              int result = ps2.executeUpdate();
                           if(result == 1){
                                // JOptionPane.showMessageDialog(null, "Restored");
                                restorelabel.setText("Restored");
                                c++;
                         }
                         else{
                                 //JOptionPane.showMessageDialog(null, "Operation could not be performed");
                         }
                         }
                         catch(Exception ee){
                             JOptionPane.showMessageDialog(null, ee.toString());
                         }
                     }   
                      
                     }
                     //WIPE THE DATA
                     jButton18ActionPerformed(evt);
                     PrintWriter writer = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb1.txt");
                     PrintWriter writer1 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb2.txt");
                     PrintWriter writer2 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb3.txt");
                     PrintWriter writer3 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb4.txt");
                     PrintWriter writer4 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb5.txt");
                     PrintWriter writer5 = new PrintWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\tb6.txt");
                     writer.print("");
                     writer1.print("");
                     writer2.print("");
                     writer3.print("");
                     writer4.print("");
                     writer5.print("");
                     writer.close();
                     writer1.close();
                     writer2.close();
                     writer3.close();
                     writer4.close();
                     writer5.close();
                     if(c == 0){
                         restorelabel.setText("No tables are restoed restored");
                     }
                     else{
                         restorelabel.setText("Tables are successfuly restored");
                     }
         }   
         catch(Exception ee){
             JOptionPane.showMessageDialog(null, ee.toString());
         }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       LogIn l1 = new LogIn();
       this.hide();
       l1.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       int ssh2 = 0;
       if(CodeBox.getText().equals("")){
        
        try{
           BufferedReader reader = new BufferedReader(new FileReader("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\itemIDgenarator.txt"));
           String id = reader.readLine();
           int ID = Integer.parseInt(id);
           ID++;
            //JOptionPane.showMessageDialog(null,"" + ID);
            CodeBox.setText("I00"+String.valueOf(ID));
            FileWriter writer1 = new FileWriter("D:\\Work\\College_works\\EAD projects (NetBeans)\\POSprototype\\itemIDgenarator.txt");
            writer1.append(String.valueOf(ID));
            writer1.close();
            reader.close();
            ssh = 1;
            Clearbtn.setEnabled(true);
       }
       catch(Exception ee){
           JOptionPane.showMessageDialog(null, ee.toString());
       }   
       }
       else{
           JOptionPane.showMessageDialog(null, "Key already genarated");
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
       cbox_1.addItem(jTextField5.getText());
       JOptionPane.showMessageDialog(null,jTextField5.getText() + " Added" );
    }//GEN-LAST:event_jButton20ActionPerformed

    private void cbox_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbox_1MouseClicked
       
    }//GEN-LAST:event_cbox_1MouseClicked

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        jTextField5.setText("");
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
       
    }//GEN-LAST:event_jTextField5FocusLost

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        cbox_1.removeItem(jTextField5.getText());
        JOptionPane.showMessageDialog(null,jTextField5.getText() + " Removed" );
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       int response = JOptionPane.showConfirmDialog(null, "Are you sure to exit?","Confirm",JOptionPane.YES_NO_OPTION);
       if(response == JOptionPane.YES_OPTION){
        System.exit(0);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountBox;
    private javax.swing.JLabel Amountg;
    private javax.swing.JLabel AmuL;
    private javax.swing.JTextField Box1;
    private javax.swing.JTextField Box2;
    private javax.swing.JTextField Box3;
    private javax.swing.JLabel Catagoryg;
    private javax.swing.JButton Clearbtn;
    private javax.swing.JTextField CodeBox;
    private javax.swing.JLabel DataNotFound;
    private javax.swing.JButton DeBtn;
    private javax.swing.JCheckBox EmployeeInfo;
    private javax.swing.JButton FINDBTN;
    private javax.swing.JLabel IDg;
    private javax.swing.JLabel IDg10;
    private javax.swing.JTextField NameBox;
    private javax.swing.JLabel NameL;
    private javax.swing.JLabel Nameg;
    private javax.swing.JTextField NewAmount;
    public javax.swing.JComboBox<String> NewCbox;
    private javax.swing.JTextField NewCode;
    private javax.swing.JTextField NewName;
    private javax.swing.JTextField NewPrice;
    private javax.swing.JTextField PriceBox;
    private javax.swing.JLabel Priceg;
    private javax.swing.JButton SavBtn;
    private javax.swing.JButton Savebtn;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JLabel TotL;
    private javax.swing.JLabel UnitL;
    private javax.swing.JButton add_btn;
    private javax.swing.JCheckBox b10;
    private javax.swing.JCheckBox b11;
    private javax.swing.JCheckBox b12;
    private javax.swing.JCheckBox b13;
    private javax.swing.JCheckBox b14;
    private javax.swing.JCheckBox b15;
    private javax.swing.JTextField box123;
    private javax.swing.JTextField box256;
    private javax.swing.JTextField box_1;
    private javax.swing.JTextField box_2;
    private javax.swing.JTextField box_3;
    private javax.swing.JTextField box_4;
    private javax.swing.JTextField box_5;
    private javax.swing.JTextField box_6;
    private javax.swing.JTextField box_7;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JComboBox<String> cBox1;
    private javax.swing.JLabel cashier;
    private javax.swing.JComboBox<String> cbox_1;
    private javax.swing.JCheckBox check1;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel confirm;
    private javax.swing.JCheckBox customerDetails;
    private java.awt.TextArea dataShow;
    private javax.swing.JLabel date;
    private com.toedter.calendar.JCalendar dateChooser;
    private javax.swing.JTextField desSearchBox;
    private javax.swing.JCheckBox employeeDetails;
    private javax.swing.JTextField idbox;
    private javax.swing.JCheckBox itemsDetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lbl1;
    private javax.swing.JTextField newCoCode;
    private javax.swing.JTextField newDescription;
    private javax.swing.JTextField newDestination;
    private javax.swing.JTextField newSender;
    private javax.swing.JComboBox<String> newServicebox;
    private javax.swing.JTextField newidbox;
    private javax.swing.JRadioButton rdb1;
    private javax.swing.JRadioButton rdb2;
    private javax.swing.JLabel restorelabel;
    private javax.swing.JLabel result;
    private javax.swing.JButton saveBtn;
    private javax.swing.JCheckBox shipmentOrders;
    private javax.swing.JCheckBox shipmentProducts;
    private javax.swing.JLabel sub;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    private javax.swing.JLabel totlbl;
    private java.awt.TextArea txtArea;
    // End of variables declaration//GEN-END:variables
}

