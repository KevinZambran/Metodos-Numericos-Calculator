/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Algoritmos.Bairstown;
import Controlador.GestionCeldas;
import Controlador.GestionEncabezadoTabla;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author PERSONAL
 */
public class frmBairstow extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    String titulos [] = {"Ite. final", "r","s", "Error Aprox. R","Error Aprox. S", "Discrepancia", "Raiz", "Raiz 1", "Raiz 2"};            
   
    public frmBairstow() {        
        initComponents();
        dtm.setColumnIdentifiers(titulos);
        jTable1.setModel(dtm);
        JTableHeader jtableHeader = jTable1.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        jTable1.setTableHeader(jtableHeader);
    }
    //dos
    public void celdasFondo(){
        for (int i = 0; i < titulos.length; i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(new GestionCeldas("numerico"));
        }        
    }
    
    public void TamañoColumnas(){
        TableColumnModel columnModel = jTable1.getColumnModel();
        
        columnModel.getColumn(0).setPreferredWidth(1);
        columnModel.getColumn(1).setPreferredWidth(2);
        columnModel.getColumn(2).setPreferredWidth(2);
        columnModel.getColumn(3).setPreferredWidth(2);
        columnModel.getColumn(4).setPreferredWidth(2);
        columnModel.getColumn(5).setPreferredWidth(2);
        columnModel.getColumn(6).setPreferredWidth(2);
        columnModel.getColumn(7).setPreferredWidth(100);
        columnModel.getColumn(8).setPreferredWidth(100);
    }

    public void ValidacionCampos(){
        if(txtErrorTolerancia.getText().equals("") || txtErrorTolerancia.getText().equals(".")){
            txtErrorTolerancia.setBackground(Color.pink);
        }
        if(txtR.getText().equals("") || txtR.getText().equals(".")){
            txtR.setBackground(Color.pink);
        }
        if(txtS.getText().equals("") || txtS.getText().equals(".")){
            txtS.setBackground(Color.pink);
        }
        if(txtCoeficientea0.getText().equals("") || txtCoeficientea0.getText().equals(".")){
            txtCoeficientea0.setBackground(Color.pink);
        }
        if(txtCoeficientea1.getText().equals("") || txtCoeficientea1.getText().equals(".")){
            txtCoeficientea1.setBackground(Color.pink);
        }
        if(txtCoeficientea2.getText().equals("") || txtCoeficientea2.getText().equals(".")){
            txtCoeficientea2.setBackground(Color.pink);
        }
        if(txtCoeficientea3.getText().equals("") || txtCoeficientea3.getText().equals(".")){
            txtCoeficientea3.setBackground(Color.pink);
        }
        if(txtCoeficientea4.getText().equals("") || txtCoeficientea4.getText().equals(".")){
            txtCoeficientea4.setBackground(Color.pink);
        }
        if(txtCoeficientea5.getText().equals("") || txtCoeficientea5.getText().equals(".")){
            txtCoeficientea5.setBackground(Color.pink);
        }
        if(txtCoeficientea6.getText().equals("") || txtCoeficientea6.getText().equals(".")){
            txtCoeficientea6.setBackground(Color.pink);
        }
    }
    public void  LimpiarIngresos(){
        txtCoeficientea0.setText("");
        txtCoeficientea1.setText("");
        txtCoeficientea2.setText("");
        txtCoeficientea3.setText("");
        txtCoeficientea4.setText("");
        txtCoeficientea5.setText("");
        txtCoeficientea6.setText("");
        txtErrorTolerancia.setText("");
        txtR.setText("");
        txtS.setText("");
    }
    public void ColorNormal(){
        txtCoeficientea0.setBackground(Color.WHITE);
        txtCoeficientea1.setBackground(Color.WHITE);
        txtCoeficientea2.setBackground(Color.WHITE);
        txtCoeficientea3.setBackground(Color.WHITE);
        txtCoeficientea4.setBackground(Color.WHITE);
        txtCoeficientea5.setBackground(Color.WHITE);
        txtCoeficientea6.setBackground(Color.WHITE);
        txtErrorTolerancia.setBackground(Color.WHITE);
        txtR.setBackground(Color.WHITE);
        txtS.setBackground(Color.WHITE);
        jComboBox1.setBackground(Color.PINK);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtCoeficientea0 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCoeficientea1 = new javax.swing.JTextField();
        txtCoeficientea2 = new javax.swing.JTextField();
        txtCoeficientea3 = new javax.swing.JTextField();
        txtCoeficientea4 = new javax.swing.JTextField();
        txtCoeficientea5 = new javax.swing.JTextField();
        txtCoeficientea6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnLimpiarTabla = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtR = new javax.swing.JTextField();
        txtS = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtErrorTolerancia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Bairstown");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 11, -1, -1));

        jLabel2.setText("Ingrese el grado de la funcion :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 46, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "#", "1", "2", "3", "4", "5", "6" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 50, -1));

        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 74, 350, -1));

        txtCoeficientea0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCoeficientea0KeyTyped(evt);
            }
        });
        getContentPane().add(txtCoeficientea0, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 132, 50, -1));

        jLabel4.setText("Coeficiente a0 :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 135, -1, -1));

        jLabel5.setText("Coeficiente a1 :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 166, -1, -1));

        jLabel6.setText("Coeficiente a2 :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 197, -1, -1));

        jLabel7.setText("Coeficiente a3 :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 228, -1, -1));

        jLabel8.setText("Coeficiente a4 :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 259, -1, -1));

        jLabel9.setText("Coeficiente a5 :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel10.setText("Coeficiente a6 :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txtCoeficientea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCoeficientea1KeyTyped(evt);
            }
        });
        getContentPane().add(txtCoeficientea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 163, 50, -1));

        txtCoeficientea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCoeficientea2KeyTyped(evt);
            }
        });
        getContentPane().add(txtCoeficientea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 194, 50, -1));

        txtCoeficientea3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCoeficientea3KeyTyped(evt);
            }
        });
        getContentPane().add(txtCoeficientea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 225, 50, -1));

        txtCoeficientea4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCoeficientea4KeyTyped(evt);
            }
        });
        getContentPane().add(txtCoeficientea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 256, 50, -1));

        txtCoeficientea5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCoeficientea5KeyTyped(evt);
            }
        });
        getContentPane().add(txtCoeficientea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 50, -1));

        txtCoeficientea6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCoeficientea6KeyTyped(evt);
            }
        });
        getContentPane().add(txtCoeficientea6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 50, -1));

        jButton1.setText("Regresar");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 95, -1));

        btnLimpiarTabla.setText("Limpiar Tabla");
        btnLimpiarTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTablaActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 130));

        jLabel11.setText("r :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 135, -1, -1));

        jLabel12.setText("s :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 166, -1, -1));

        txtR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRKeyTyped(evt);
            }
        });
        getContentPane().add(txtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 132, 59, -1));

        txtS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSKeyTyped(evt);
            }
        });
        getContentPane().add(txtS, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 163, 58, -1));

        jLabel13.setText("Ingrese el Error de tolerancia :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 104, -1, -1));

        txtErrorTolerancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtErrorToleranciaKeyTyped(evt);
            }
        });
        getContentPane().add(txtErrorTolerancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 59, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // a6(x^6) + a5(x^5) + a4(x^4) + a3(x^3) + a2(x^2) + a1(x^1) + a0
        if(jComboBox1.getSelectedIndex() == 1){
            jLabel3.setText("a1(x^1) + a0");
            txtCoeficientea2.setVisible(false);
            txtCoeficientea3.setVisible(false);
            txtCoeficientea4.setVisible(false);
            txtCoeficientea5.setVisible(false);
            txtCoeficientea6.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
        }
        if(jComboBox1.getSelectedIndex() == 2){
            jLabel3.setText("a2(x^2) + a1(x^1) + a0");
            txtCoeficientea2.setVisible(true);
            txtCoeficientea3.setVisible(false);
            txtCoeficientea4.setVisible(false);
            txtCoeficientea5.setVisible(false);
            txtCoeficientea6.setVisible(false);
            jLabel6.setVisible(true);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
        }
        if(jComboBox1.getSelectedIndex() == 3){
            jLabel3.setText("a3(x^3) + a2(x^2) + a1(x^1) + a0");
            txtCoeficientea2.setVisible(true);
            txtCoeficientea3.setVisible(true);
            txtCoeficientea4.setVisible(false);
            txtCoeficientea5.setVisible(false);
            txtCoeficientea6.setVisible(false);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
        }
        if(jComboBox1.getSelectedIndex() == 4){
            jLabel3.setText("a4(x^4) + a3(x^3) + a2(x^2) + a1(x^1) + a0");
            txtCoeficientea2.setVisible(true);
            txtCoeficientea3.setVisible(true);
            txtCoeficientea4.setVisible(true);
            txtCoeficientea5.setVisible(false);
            txtCoeficientea6.setVisible(false);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
        }
        if(jComboBox1.getSelectedIndex() == 5){
            jLabel3.setText(" a5(x^5) + a4(x^4) + a3(x^3) + a2(x^2) + a1(x^1) + a0");
            txtCoeficientea2.setVisible(true);
            txtCoeficientea3.setVisible(true);
            txtCoeficientea4.setVisible(true);
            txtCoeficientea5.setVisible(true);
            txtCoeficientea6.setVisible(false);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            jLabel10.setVisible(false);
        }
        if(jComboBox1.getSelectedIndex() == 6){
            jLabel3.setText("a6(x^6) + a5(x^5) + a4(x^4) + a3(x^3) + a2(x^2) + a1(x^1) + a0");
            txtCoeficientea2.setVisible(true);
            txtCoeficientea3.setVisible(true);
            txtCoeficientea4.setVisible(true);
            txtCoeficientea5.setVisible(true);
            txtCoeficientea6.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            jLabel10.setVisible(true);
        }        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double Es;
        try{
            Bairstown ob = new Bairstown();
            int grado = Integer.parseInt(jComboBox1.getSelectedItem().toString());
            Es = Double.parseDouble(txtErrorTolerancia.getText());
            double r = Double.parseDouble(txtR.getText());
            double s = Double.parseDouble(txtS.getText());
            ColorNormal();
            TamañoColumnas();
            if(grado > 0){
                if(grado == 6){
                    double a0 = Double.parseDouble(txtCoeficientea0.getText());
                    double a1 = Double.parseDouble(txtCoeficientea1.getText());
                    double a2 = Double.parseDouble(txtCoeficientea2.getText());
                    double a3 = Double.parseDouble(txtCoeficientea3.getText());
                    double a4 = Double.parseDouble(txtCoeficientea4.getText());
                    double a5 = Double.parseDouble(txtCoeficientea5.getText());
                    double a6 = Double.parseDouble(txtCoeficientea6.getText());
                    LimpiarIngresos();
                    dtm.addRow(ob.Bairstow(1, grado,  Es, a0, a1, a2, a3, a4, a5, a6, r, s));
                    grado = grado - 2;

                    if(grado == 4){
                        dtm.addRow(ob.Bairstow(1, grado,  Es, ob.getA0(), ob.getA1(), ob.getA2(), ob.getA3(), ob.getA4(), ob.getA5(), ob.getA6(), r, s));
                        grado = grado - 2;
                    }   
                    if(grado == 2){
                        dtm.addRow(ob.Bairstow(1, grado,  Es, ob.getA0(), ob.getA1(), ob.getA2(), ob.getA3(), ob.getA4(), ob.getA5(), ob.getA6(), r, s));
                        grado = grado - 2;
                    }
                }
                if(grado == 5){
                    double a0 = Double.parseDouble(txtCoeficientea0.getText());
                    double a1 = Double.parseDouble(txtCoeficientea1.getText());
                    double a2 = Double.parseDouble(txtCoeficientea2.getText());
                    double a3 = Double.parseDouble(txtCoeficientea3.getText());
                    double a4 = Double.parseDouble(txtCoeficientea4.getText());
                    double a5 = Double.parseDouble(txtCoeficientea5.getText());
                    LimpiarIngresos();
                    dtm.addRow(ob.Bairstow(1, grado,  Es, a0, a1, a2, a3, a4, a5, 0, r, s));
                    grado = grado - 2;

                    if(grado == 3){
                        dtm.addRow(ob.Bairstow(1, grado,  Es, ob.getA0(), ob.getA1(), ob.getA2(), ob.getA3(), ob.getA4(), ob.getA5(), ob.getA6(), r, s));
                        grado = grado - 2;
                    }   
                    if(grado == 1){
                        dtm.addRow(ob.Bairstow(1, grado,  Es, ob.getA0(), ob.getA1(), ob.getA2(), ob.getA3(), ob.getA4(), ob.getA5(), ob.getA6(), r, s));
                        grado = grado - 2;
                    }
                }

                if(grado == 4){
                    double a0 = Double.parseDouble(txtCoeficientea0.getText());
                    double a1 = Double.parseDouble(txtCoeficientea1.getText());
                    double a2 = Double.parseDouble(txtCoeficientea2.getText());
                    double a3 = Double.parseDouble(txtCoeficientea3.getText());
                    double a4 = Double.parseDouble(txtCoeficientea4.getText());
                    LimpiarIngresos();
                    dtm.addRow(ob.Bairstow(1, grado,  Es, a0, a1, a2, a3, a4, 0, 0, r, s));
                    grado = grado - 2;

                    if(grado == 2){
                        dtm.addRow(ob.Bairstow(1, grado,  Es, ob.getA0(), ob.getA1(), ob.getA2(), ob.getA3(), ob.getA4(), ob.getA5(), ob.getA6(), r, s));
                        grado = grado - 2;
                    }
                }   

                if(grado == 3){
                    System.err.println("entro en 3");
                    double a0 = Double.parseDouble(txtCoeficientea0.getText());
                    double a1 = Double.parseDouble(txtCoeficientea1.getText());
                    double a2 = Double.parseDouble(txtCoeficientea2.getText());
                    double a3 = Double.parseDouble(txtCoeficientea3.getText());
                    LimpiarIngresos();
                    dtm.addRow(ob.Bairstow(1, grado,  Es, a0, a1, a2, a3, 0, 0, 0, r, s));
                    grado = grado - 2;

                    if(grado == 1){
                        dtm.addRow(ob.Bairstow(1, grado,  Es, ob.getA0(), ob.getA1(), ob.getA2(), ob.getA3(), ob.getA4(), ob.getA5(), ob.getA6(), r, s));
                        grado = grado - 2;
                    }
                }

                if(grado == 2){
                    double a0 = Double.parseDouble(txtCoeficientea0.getText());
                    double a1 = Double.parseDouble(txtCoeficientea1.getText());
                    double a2 = Double.parseDouble(txtCoeficientea2.getText());
                    LimpiarIngresos();
                    dtm.addRow(ob.Bairstow(1, grado,  Es, a0, a1, a2, 0, 0, 0, 0, r, s));
                }  

                if(grado == 1){
                    System.err.println("entro en 1");
                    double a0 = Double.parseDouble(txtCoeficientea0.getText());
                    double a1 = Double.parseDouble(txtCoeficientea1.getText());
                    LimpiarIngresos();
                    dtm.addRow(ob.Bairstow(1, grado,  Es, a0, a1, 0, 0, 0, 0, 0, r, s));
                }
                jComboBox1.setSelectedIndex(0);
                celdasFondo();
            }else{
                JOptionPane.showMessageDialog(null, " Elija el grado de la funcion correctamente", "ERROR", JOptionPane.ERROR_MESSAGE );
                jComboBox1.setBackground(Color.PINK);
            }            

        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, " Por Favor corrija los campos marcados con rojo", "ERROR", JOptionPane.ERROR_MESSAGE );
            
            if(jComboBox1.getSelectedIndex() <= 0){
                jComboBox1.setBackground(Color.red);
            }else{
                ValidacionCampos();                
            }     
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTablaActionPerformed
          DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        while(modelo.getRowCount()>0)modelo.removeRow(0);
 
        TableColumnModel modCol = jTable1.getColumnModel();
        while(modCol.getColumnCount()>0)modCol.removeColumn(modCol.getColumn(0));
    }//GEN-LAST:event_btnLimpiarTablaActionPerformed

    private void txtErrorToleranciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtErrorToleranciaKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtErrorTolerancia.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&txtErrorTolerancia.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtErrorToleranciaKeyTyped

    private void txtRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtR.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&txtR.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtRKeyTyped

    private void txtSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtS.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&txtS.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtSKeyTyped

    private void txtCoeficientea0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoeficientea0KeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtCoeficientea0.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&txtCoeficientea0.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtCoeficientea0KeyTyped

    private void txtCoeficientea1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoeficientea1KeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtCoeficientea1.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&txtCoeficientea1.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtCoeficientea1KeyTyped

    private void txtCoeficientea2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoeficientea2KeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtCoeficientea2.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&txtCoeficientea2.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtCoeficientea2KeyTyped

    private void txtCoeficientea3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoeficientea3KeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtCoeficientea3.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&txtCoeficientea3.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtCoeficientea3KeyTyped

    private void txtCoeficientea4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoeficientea4KeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtCoeficientea4.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&txtCoeficientea4.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtCoeficientea4KeyTyped

    private void txtCoeficientea5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoeficientea5KeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtCoeficientea5.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&txtCoeficientea5.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtCoeficientea5KeyTyped

    private void txtCoeficientea6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCoeficientea6KeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtCoeficientea6.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&txtCoeficientea6.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtCoeficientea6KeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmBairstow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBairstow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBairstow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBairstow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBairstow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiarTabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCoeficientea0;
    private javax.swing.JTextField txtCoeficientea1;
    private javax.swing.JTextField txtCoeficientea2;
    private javax.swing.JTextField txtCoeficientea3;
    private javax.swing.JTextField txtCoeficientea4;
    private javax.swing.JTextField txtCoeficientea5;
    private javax.swing.JTextField txtCoeficientea6;
    private javax.swing.JTextField txtErrorTolerancia;
    private javax.swing.JTextField txtR;
    private javax.swing.JTextField txtS;
    // End of variables declaration//GEN-END:variables
}
