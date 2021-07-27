/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Algoritmos.Biseccion;
import Algoritmos.EvaluadorFunciones;
import Algoritmos.IteracionPuntoFijo;
import Algoritmos.Muller;
import Algoritmos.Newton_Raphson;
import Algoritmos.Secante;
import Algoritmos.SerieTeylor;
import Controlador.TLista;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author PERSONAL
 */
public class frmCalculadora extends javax.swing.JFrame {
//Actualizar
    String Tipo = "";
    DefaultTableModel dtm = new DefaultTableModel();
    public frmCalculadora(String tipo) {
        this.Tipo = tipo;
        initComponents();
        MostrarDatos();        
        Etiquetas();
        extender();
    }
    
    public void MostrarDatos()
    {      
        if(Tipo.equals("Teylor")){
            String titulos [] = {"n", "f'(x0)","Termino (n+1)","Aproximación orden n","Ea","Condicion", "Et"};
            dtm.setColumnIdentifiers(titulos);
            jTable1.setModel(dtm);
        }
        if(Tipo.equals("Biseccion")){
            String titulos [] = {"Iteraccion", "Intervalo","xl","xu","xr","f(xl)","f(xu)", "f(xr)","f(xl)*f(xr)", "Ea", "Condicion"};            
            dtm.setColumnIdentifiers(titulos);
            jTable1.setModel(dtm);
        }
        if(Tipo.equals("Newton-Raphson")){
            String titulos [] = {"Iteraccion", "Xi+1","f(xi)","f'(xi)", "Ea", "Et", "Condicion"};            
            dtm.setColumnIdentifiers(titulos);
            jTable1.setModel(dtm);
        }
        if(Tipo.equals("Secante")){
            String titulos [] = {"Iteraccion", "Xi+1" , "f(Xi-1)","f(xi)", "Ea", "Et", "Condicion"};            
            dtm.setColumnIdentifiers(titulos);
            jTable1.setModel(dtm);
        }
        if(Tipo.equals("Punto Fijo")){
            String titulos [] = {"Iteraccion", "Xi+1","g(xi)", "Ea", "Et", "Condicion"};            
            dtm.setColumnIdentifiers(titulos);
            jTable1.setModel(dtm);
        }
        if(Tipo.equals("Muller")){
            String titulos [] = {"Iteraccion", "X0","x1", "x2","fx0", "fx1", "fx2", "h0", "h1", "Delta 0",
                "Delta 1", "a", "b", "c", "Signo+", "Signo-","x3", "Ea", "Condicion"};            
            dtm.setColumnIdentifiers(titulos);
            jTable1.setModel(dtm);
        }
        if(Tipo.equals("FalsaPosicion")){
            String titulos [] = {"Iteraccion", "Intervalo","xl","xu","xr","f(xl)","f(xu)", "f(xr)","f(xl)*f(xr)", "Ea", "Condicion"};            
            dtm.setColumnIdentifiers(titulos);
            jTable1.setModel(dtm);
        }
    }

    public void Etiquetas(){
        if(Tipo.equals("Biseccion")){
            jLabel1.setText("Metodo de Biseccion");
            jLabel3.setText("xl=");
            jLabel4.setText("xu=");
            jLabel5.setText("vv=");
            jLabel7.setVisible(false);
            txtValorVerdad.setVisible(false);
        }
        if(Tipo.equals("Newton-Raphson")){
            jLabel1.setText("Metodo de Newton-Raphson");
            jLabel3.setText("x=");
            jLabel4.setText("vv=");            
            jLabel5.setVisible(false);
            jLabel7.setVisible(false);
            txth.setVisible(false);
            txtValorVerdad.setVisible(false);
        }
        if(Tipo.equals("Secante")){
            jLabel1.setText("Metodo de Secante");
            jLabel3.setText("x0=");
            jLabel4.setText("x1=");
            jLabel5.setText("vv=");
            jLabel7.setVisible(false);
            txtValorVerdad.setVisible(false);
        }
        if(Tipo.equals("Punto Fijo")){
            jLabel1.setText("Punto Fijo");
            jLabel3.setText("x0=");
            jLabel4.setText("x1=");
            jLabel5.setText("vv=");
            jLabel5.setVisible(false);
            txth.setVisible(false);         
        }
        
        if(Tipo.equals("Muller")){
            jLabel1.setText("Muller");
            jLabel3.setText("x0=");
            jLabel4.setText("x1=");
            jLabel5.setText("x2=");
            jLabel7.setText("vv=");        
        }
        
        if(Tipo.equals("FalsaPosicion")){
            jLabel1.setText("Metodo de Falsa Posicion");
            jLabel3.setText("xl=");
            jLabel4.setText("xu=");
            jLabel5.setText("vv=");
            jLabel7.setVisible(false);
            txtValorVerdad.setVisible(false);
        }
    }
    
    public void Color(){        
        txtEs.setBackground(Color.WHITE);
        txtx0.setBackground(Color.WHITE);
        txtx1.setBackground(Color.WHITE);
        txth.setBackground(Color.WHITE);
        txtValorVerdad.setBackground(Color.WHITE);
        jComboBox1.setBackground(Color.WHITE);
        jLabel9.setBackground(Color.WHITE);
        jLabel9.setText("");
    }
    public void Limpiar(){
        jComboBox1.setSelectedIndex(-1);
        txtFuncion.setText("");
        txtEs.setText("");
        txtx0.setText("");
        txtx1.setText("");
        txth.setText("");
        txtValorVerdad.setText("");
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        while(modelo.getRowCount()>0)modelo.removeRow(0);
 
        TableColumnModel modCol = jTable1.getColumnModel();
        while(modCol.getColumnCount()>0)modCol.removeColumn(modCol.getColumn(0));
        MostrarDatos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEs = new javax.swing.JTextField();
        txtx0 = new javax.swing.JTextField();
        txtx1 = new javax.swing.JTextField();
        txth = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtValorVerdad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Serie de Taylor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 11, -1, -1));
        getContentPane().add(txtFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 180, 30));

        jLabel2.setText("Error de tolerancia=");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel3.setText("X0=");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel4.setText("X1=");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel5.setText("h=");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setText("Funcion:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEsActionPerformed(evt);
            }
        });
        txtEs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEsKeyTyped(evt);
            }
        });
        getContentPane().add(txtEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 120, -1));

        txtx0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtx0KeyTyped(evt);
            }
        });
        getContentPane().add(txtx0, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 120, -1));

        txtx1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtx1KeyTyped(evt);
            }
        });
        getContentPane().add(txtx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 120, -1));

        txth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthKeyTyped(evt);
            }
        });
        getContentPane().add(txth, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 120, -1));

        jLabel7.setText("Valor de Verdad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txtValorVerdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorVerdadKeyTyped(evt);
            }
        });
        getContentPane().add(txtValorVerdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 120, -1));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setMinimumSize(new java.awt.Dimension(60, 130));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 380));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jLabel8.setText("Cifras Significativas:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "#", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jButton4.setText("Limpiar Tabla");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String fun;
        double Es,vv, xl, xu, x,x0, x1,x2;
        int h,i=0;
        EvaluadorFunciones ef= new EvaluadorFunciones();        
        Color();
        String n = jComboBox1.getSelectedItem().toString();
        if(jComboBox1.getSelectedIndex() > 0  ){
            if(Tipo.equals("Teylor")){            
                try{                
                    fun = txtFuncion.getText();            
                    Es = Double.parseDouble(txtEs.getText());                    
                    x0 = Double.parseDouble(txtx0.getText());
                    h = Integer.parseInt(txth.getText());
                    vv = Double.parseDouble(txtValorVerdad.getText());
                    Teylor(i, n,  fun,Es, x0, h, vv);   
                }catch(Exception ex){
                    if(txtEs.getText().equals("") || txtEs.getText().equals(".")){
                        txtEs.setBackground(Color.red);
                    }
                    if(txtx0.getText().equals("") || txtx0.getText().equals(".")){
                        txtx0.setBackground(Color.red);
                    }
                    if(txtx1.getText().equals("") || txtx1.getText().equals(".")){
                        txtx1.setBackground(Color.red);
                    }
                    if(txth.getText().equals("") || txth.getText().equals(".")){
                        txth.setBackground(Color.red);
                    }
                    if(txtValorVerdad.getText().equals("") || txtValorVerdad.getText().equals(".")){
                        txtValorVerdad.setBackground(Color.red);
                    }  
                    jLabel9.setBackground(Color.red);
                    jLabel9.setText("Porfavor ingrese correctamente los cuadros marcados con rojo");
                }
            }

            if(Tipo.equals("Biseccion")){            
                try{
                    fun = txtFuncion.getText();
                    Es = Double.parseDouble(txtEs.getText()); 
                    xl = Double.parseDouble(txtx0.getText());
                    xu = Double.parseDouble(txtx1.getText());
                    vv = Double.parseDouble(txth.getText());
                    Biseccion(1,n,fun,Es,xl,xu,vv);
                }catch(Exception ex){
                    if(txtEs.getText().equals("") || txtEs.getText().equals(".")){
                        txtEs.setBackground(Color.red);
                    }
                    if(txtx0.getText().equals("") || txtx0.getText().equals(".")){
                        txtx0.setBackground(Color.red);
                    }
                    if(txtx1.getText().equals("") || txtx1.getText().equals(".")){
                        txtx1.setBackground(Color.red);
                    }
                    if(txtValorVerdad.getText().equals("") || txtValorVerdad.getText().equals(".")){
                        txtValorVerdad.setBackground(Color.red);
                    } 
                    jLabel9.setBackground(Color.red);
                    jLabel9.setText("Porfavor ingrese correctamente los cuadros marcados con rojo");
                }
            }

            if(Tipo.equals("Newton-Raphson")){
                try{
                    fun = txtFuncion.getText();
                    Es = Double.parseDouble(txtEs.getText());
                    x = Double.parseDouble(txtx0.getText());
                    vv = Double.parseDouble(txtx1.getText());
                    NewtonRaphson(i,n,fun,Es,x,vv);
                }catch(Exception ex){
                    if(txtEs.getText().equals("") || txtEs.getText().equals(".")){
                        txtEs.setBackground(Color.red);
                    }
                    if(txtx0.getText().equals("") || txtx0.getText().equals(".")){
                        txtx0.setBackground(Color.red);
                    }
                    if(txtValorVerdad.getText().equals("") || txtValorVerdad.getText().equals(".")){
                        txtValorVerdad.setBackground(Color.red);
                    } 
                    jLabel9.setBackground(Color.red);
                    jLabel9.setText("Porfavor ingrese correctamente los cuadros marcados con rojo");
                }
            }

            if(Tipo.equals("Secante")){                
                try{
                    fun = txtFuncion.getText();
                    Es = Double.parseDouble(txtEs.getText());
                    x0 = Double.parseDouble(txtx0.getText());
                    x1 = Double.parseDouble(txtx1.getText());
                    vv = Double.parseDouble(txth.getText());
                    Secante(-1,n,fun,Es,x0,x1,vv);
                }catch(Exception ex){
                    if(txtEs.getText().equals("") || txtEs.getText().equals(".")){
                        txtEs.setBackground(Color.red);
                    }
                    if(txtx0.getText().equals("") || txtx0.getText().equals(".")){
                        txtx0.setBackground(Color.red);
                    }
                    if(txtx1.getText().equals("") || txtx1.getText().equals(".")){
                        txtx1.setBackground(Color.red);
                    }
                    if(txth.getText().equals("") || txth.getText().equals(".")){
                        txth.setBackground(Color.red);
                    }
                    if(txtValorVerdad.getText().equals("") || txtValorVerdad.getText().equals(".")){
                        txtValorVerdad.setBackground(Color.red);
                    } 
                    jLabel9.setBackground(Color.red);
                    jLabel9.setText("Porfavor ingrese correctamente los cuadros marcados con rojo");
                }
            }

            if(Tipo.equals("Punto Fijo")){
                try{
                    fun = txtFuncion.getText();
                    Es = Double.parseDouble(txtEs.getText());
                    x0 = Double.parseDouble(txtx0.getText());
                    x1 = Double.parseDouble(txtx1.getText());           
                    vv = Double.parseDouble(txtValorVerdad.getText());
                    PuntoFijo(0,n,fun,Es,x0,x1,vv);
                }catch(Exception ex){
                    if(txtEs.getText().equals("") || txtEs.getText().equals(".")){
                        txtEs.setBackground(Color.red);
                    }
                    if(txtx0.getText().equals("") || txtx0.getText().equals(".")){
                        txtx0.setBackground(Color.red);
                    }
                    if(txtx1.getText().equals("") || txtx1.getText().equals(".")){
                        txtx1.setBackground(Color.red);
                    }
                    if(txth.getText().equals("") || txth.getText().equals(".")){
                        txth.setBackground(Color.red);
                    }
                    if(txtValorVerdad.getText().equals("") || txtValorVerdad.getText().equals(".")){
                        txtValorVerdad.setBackground(Color.red);
                    } 
                    jLabel9.setBackground(Color.red);
                    jLabel9.setText("Porfavor ingrese correctamente los cuadros marcados con rojo");
                }
            }

            if(Tipo.equals("Muller")){
                try{
                    fun = txtFuncion.getText();
                    Es = Double.parseDouble(txtEs.getText());
                    x0 = Double.parseDouble(txtx0.getText());
                    x1 = Double.parseDouble(txtx1.getText());
                    x2 = Double.parseDouble(txth.getText());
                    vv = Double.parseDouble(txtValorVerdad.getText());
                    Muller(1,n,fun,Es,x0,x1,x2,vv);
                }catch(Exception ex){
                    if(txtEs.getText().equals("") || txtEs.getText().equals(".")){
                        txtEs.setBackground(Color.red);
                    }
                    if(txtx0.getText().equals("") || txtx0.getText().equals(".")){
                        txtx0.setBackground(Color.red);
                    }
                    if(txtx1.getText().equals("") || txtx1.getText().equals(".")){
                        txtx1.setBackground(Color.red);
                    }
                    if(txth.getText().equals("") || txth.getText().equals(".")){
                        txth.setBackground(Color.red);
                    }
                    if(txtValorVerdad.getText().equals("") || txtValorVerdad.getText().equals(".")){
                        txtValorVerdad.setBackground(Color.red);
                    }    
                    jLabel9.setBackground(Color.red);
                    jLabel9.setText("Porfavor ingrese correctamente los cuadros marcados con rojo");
                }
            }   

            if(Tipo.equals("FalsaPosicion")){
                try{
                    fun = txtFuncion.getText();
                    Es = Double.parseDouble(txtEs.getText());
                    xl = Double.parseDouble(txtx0.getText());
                    xu = Double.parseDouble(txtx1.getText());
                    vv = Double.parseDouble(txth.getText());
                    FalsaPosicion(1,n,fun,Es,xl,xu,vv);
                }catch(Exception ex){
                    if(txtEs.getText().equals("") || txtEs.getText().equals(".")){
                        txtEs.setBackground(Color.red);
                    }
                    if(txtx0.getText().equals("") || txtx0.getText().equals(".")){
                        txtx0.setBackground(Color.red);
                    }
                    if(txtx1.getText().equals("") || txtx1.getText().equals(".")){
                        txtx1.setBackground(Color.red);
                    }
                    if(txth.getText().equals("") || txth.getText().equals(".")){
                        txth.setBackground(Color.red);
                    }
                    if(txtValorVerdad.getText().equals("") || txtValorVerdad.getText().equals(".")){
                        txtValorVerdad.setBackground(Color.red);
                    }
                    jLabel9.setBackground(Color.red);
                    jLabel9.setText("Porfavor ingrese correctamente los cuadros marcados con rojo");
                }
            }
        }else{
            jComboBox1.setBackground(Color.red);
            jLabel9.setBackground(Color.red);
            jLabel9.setText("Porfavor ingrese correctamente los cuadros marcados con rojo");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frmPrincipal frm = new frmPrincipal();
        this.dispose();
        frm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEsActionPerformed
        
    }//GEN-LAST:event_txtEsActionPerformed

    private void txtEsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEsKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtEs.getText().contains(".")){
            evt.consume();
        }
        
    }//GEN-LAST:event_txtEsKeyTyped

    private void txtx0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtx0KeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtx0.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtx0KeyTyped

    private void txtx1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtx1KeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtx1.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtx1KeyTyped

    private void txthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txth.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txthKeyTyped

    private void txtValorVerdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorVerdadKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtValorVerdad.getText().contains(".")){
            evt.consume();
        }
    }//GEN-LAST:event_txtValorVerdadKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        while(modelo.getRowCount()>0)modelo.removeRow(0);
 
        TableColumnModel modCol = jTable1.getColumnModel();
        while(modCol.getColumnCount()>0)modCol.removeColumn(modCol.getColumn(0));
        MostrarDatos(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    public void Teylor(int i,String n, String fun, double Es, double x0,int h, double vv){
        String cond;
        double aprox=0,ea, et;
        SerieTeylor st = new SerieTeylor();
        EvaluadorFunciones ef = new EvaluadorFunciones();
        SerieTeylor os = new SerieTeylor();        
        try{
            do{
                if(i==0){
                double fx0= st.fx0(fun, x0);
                double term = st.termino(i, fun, x0, h);
                aprox= st.OrdenN(i, fun, x0, 0, 0);
                ea = 0;
                cond = "";
                et = st.et(vv, aprox);
                dtm.addRow(TLista.MostrarSerieTaylor(i, n,fx0, term, aprox, ea, cond, et));
                ea = 1;
                i++;
            }else{
                fun = os.derivar(fun);
                double aproxanterior = aprox;
                double fx0= st.fx0(fun, x0);
                double term = st.termino(i, fun, x0, h);
                aprox= st.OrdenN(i, fun, x0, term, aprox);
                ea = st.ea(aprox,aproxanterior);
                if(ea<Es){
                    cond = "ALTO";                      
                }else{
                    cond = "SIGA";                         
                }                
                et = st.et(vv, aprox);
                dtm.addRow(TLista.MostrarSerieTaylor(i, n, fx0, term, aprox, ea, cond, et));
                ++i;
            }
            }while(ea > Es);
        }catch(Exception ex){
            System.out.println(ef.getError());
        }
        jTable1.setModel(dtm);
    }
    
    public void Biseccion(int i,String n, String fun, double Es, double xl, double xu, double vv){
        double inter, xr =0, fxl,fxu, fxr, fxlfxr =0, ea =0, auxr, et = 0;
        String cond ;
        Biseccion ob = new Biseccion();
        try{
            do {
                if(i==1) {
                    //Intervalo
                    inter = xu-xl;
                    //xr
                    xr= (xu+xl)/2;
                    //f(xl)
                    fxl= ob.fun(fun, xl);
                    //f(xu)
                    fxu= ob.fun(fun, xu);
                    //f(xr)
                    fxr= ob.fun(fun, xr);
                    //f(xl)*f(xr)
                    fxlfxr= fxl* fxr;
                    //Imprimir
                    dtm.addRow(TLista.MostrarBiseccion(i,n,inter,xl,xu,xr,fxl,fxu,fxr,fxlfxr,ea,""));	
                    ea = 1;
                    i++;
                }else {			

                    //xl
                    if(fxlfxr>0) {
                       xl = xr;
                    }
                    //xu
                    if(fxlfxr<0) {
                        xu = xr;
                    }
                    //xr anterior guardado en auxxr
                    auxr= xr;
                    //Intervalo
                    inter = xu-xl;
                    //xr
                    xr = (xl + xu )/2;
                    //f(xl)
                    fxl= ob.fun(fun, xl);
                    //f(xu)
                    fxu= ob.fun(fun, xu);
                    //f(xr)
                    fxr= ob.fun(fun, xr);
                    //f(xl)*f(xr)
                    fxlfxr= fxl* fxr;
                    //Imprimir
                    ea = ob.ea(xr,auxr);
                    et = ob.et(vv, xr);
                    if(ea<Es){
                        cond = "ALTO";                      
                    }else{
                        cond = "SIGA";                         
                    } 
                    dtm.addRow(TLista.MostrarBiseccion(i,n,inter,xl,xu,xr,fxl,fxu,fxr,fxlfxr,ea,cond));	
                    i++;
                }
            }while(ea > Es);
        }catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }
        jTable1.setModel(dtm);
    }
    
    public void NewtonRaphson(int i,String n, String fun, double es, double x0, double vv){
        double x1 =0, fx,dxfx, ea, et, aux;
        String cond, dfx;
        Newton_Raphson on = new Newton_Raphson();
        try{
            do{
                if(i == 0){
                    x1 = x0;
                    dtm.addRow(TLista.MostrarNewtonRaphson(i,n, x1, 0, 0, 0, 0, ""));
                    ea= 1;
                    i++;
                }else{                
                    fx = on.evaluar(fun, x1);
                    dfx = on.derivar(fun);
                    dxfx = on.evaluar(dfx, x1);
                    aux = x1;
                    x1 = x1 - fx / dxfx;
                    ea= on.ea(x1, aux);
                    et = on.et(vv, x1);
                    if(ea<es){
                            cond = "ALTO";                      
                        }else{
                            cond = "SIGA";                         
                    } 
                    dtm.addRow(TLista.MostrarNewtonRaphson(i, n,x1, fx, dxfx, ea, et, cond));
                    i++;
                }
            }while(ea > es);
        }catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }
        jTable1.setModel(dtm);
    }
    
    public void Secante(int i, String n, String fun, double es, double x0, double x1, double vv){
        double  ea, et, aux, fx0, fx1;
        String cond;
        Secante os = new Secante();
        try{
            do{
                if(i == -1){
                    dtm.addRow(TLista.MostrarSecante(i,n, x0, 0, 0, 0, 0, ""));
                    ea= 1;
                    i++;
                }else{ 
                    if(i == 0){
                        ea = os.ea(x1, x0); 
                        et = os.et(vv, x1);
                        dtm.addRow(TLista.MostrarSecante(i,n, x1, 0, 0, ea, et, ""));
                        i++;
                    }else{
                        aux = x1;
                        fx0 = os.evaluar(fun, x0);
                        fx1 = os.evaluar(fun, x1);                 
                        x1= x1-(fx1*(x0-x1))/(fx0-fx1);
                        x0 = aux;
                        ea= os.ea(x1, aux);
                        et = os.et(vv, x1);
                        if(ea<es){
                                cond = "ALTO";                      
                            }else{
                                cond = "SIGA";                         
                        } 
                        dtm.addRow(TLista.MostrarSecante(i,n, x1, fx0, fx1, ea, et, cond));
                        i++;
                    }                    
                }
            }while(ea > es);
        }catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }
        jTable1.setModel(dtm);
    }
    
    public void PuntoFijo(int i,String n, String fun, double es, double x0,double x1, double vv){
        double  fx, ea, et, aux;
        String cond;
        IteracionPuntoFijo itpf = new IteracionPuntoFijo();
        try{
            do{
                if(i == 0){
                    dtm.addRow(TLista.MostrarPuntoFijo(i,n, x1, 0, 0, 0, ""));
                   // aux = x1;
                    ea= 1;
                    i++;
                }else{ 
                    aux = x1;
                    fx = itpf.evaluar(fun, x1);
                    x1= fx;
                    ea= itpf.ea(x1, aux);
                    et = itpf.et(vv, x1);
                    if(ea<es){
                            cond = "ALTO";                      
                        }else{
                            cond = "SIGA";                         
                    } 
                    dtm.addRow(TLista.MostrarPuntoFijo(i,n, x1, fx, ea, et, cond));
                    i++;
                }
            }while(ea > es);
        }catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }
        jTable1.setModel(dtm);
    }
    
    public void Muller(int i, String n, String fun, double es, double x0,double x1, double x2, double vv){
        double x3 =0, ea , fx0,fx1,fx2, h0, h1, delta0, delta1, a, b ,c, sigmas, signeg;
        String cond;
        Muller om = new Muller();
        try{
            do{
                if(i == 1){
                    fx0= om.evaluar(fun, x0);
                    fx1= om.evaluar(fun, x1);
                    fx2= om.evaluar(fun, x2);
                    h0= x1 -x0;
                    h1= x2 - x1;
                    delta0= (fx1 - fx0) / h0;
                    delta1= (fx2 - fx1) / h1;
                    a = (delta1 - delta0)/(h1+h0);
                    b = a * h1 + delta1;
                    c = fx2;
                    sigmas = b + Math.sqrt(Math.pow(b, 2) - 4*a*c);
                    signeg = b - Math.sqrt(Math.pow(b, 2) - 4*a*c);
                    if(Math.abs(sigmas) > Math.abs(signeg)){
                        x3 = x2 + (-2*c)/sigmas;
                    }else{
                        x3 = x2 + (-2*c)/signeg;
                    }
                    ea = om.ea(x3, x2);    
                    if(ea<es){
                            cond = "ALTO";                      
                        }else{
                            cond = "SIGA";                         
                    }
                    dtm.addRow(TLista.MostrarMuller(i,n, x0, x1, x2, fx0, fx1, fx2, h0, h1, delta0, delta1, a, b, c, sigmas, signeg, x3, ea, cond));
                    i++;
                }else{ 
                    x0 = x1;
                    x1 = x2;
                    x2 = x3;
                    fx0= om.evaluar(fun, x0);
                    fx1= om.evaluar(fun, x1);
                    fx2= om.evaluar(fun, x2);
                    h0= x1 -x0;
                    h1= x2 - x1;
                    delta0= (fx1 - fx0) / h0;
                    delta1= (fx2 - fx1) / h1;
                    a = (delta1 - delta0)/(h1+h0);
                    b = a * h1 + delta1;
                    c = fx2;
                    sigmas = b + Math.sqrt(Math.pow(b, 2) - 4*a*c);
                    signeg = b - Math.sqrt(Math.pow(b, 2) - 4*a*c);
                    if(Math.abs(sigmas) > Math.abs(signeg)){
                        x3 = x2 + (-2*c)/sigmas;
                    }else{
                        x3 = x2 + (-2*c)/signeg;
                    }
                    ea = om.ea(x3, x2);                   
                    if(ea<es){
                            cond = "ALTO";                      
                        }else{
                            cond = "SIGA";                         
                    } 
                    dtm.addRow(TLista.MostrarMuller(i, n,x0, x1, x2, fx0, fx1, fx2, h0, h1, delta0, delta1, a, b, c, sigmas, signeg, x3, ea, cond));
                    i++;
                }
            }while(ea > es);
        }catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }
        jTable1.setModel(dtm);
    }
    
    public void FalsaPosicion(int i,String n, String fun, double Es, double xl, double xu, double vv){
        double inter, xr =0, fxl,fxu, fxr, fxlfxr =0, ea =0, auxr;
        String cond;
        Biseccion ob = new Biseccion();
        try{
            do {
                if(i==1) {
                //Intervalo
                inter = xu-xl;
                //f(xl)
                fxl= ob.fun(fun, xl);
                //f(xu)
                fxu= ob.fun(fun, xu);                    
                //xr
                xr= xu - (fxu*(xl-xu))/(fxl-fxu);
                //f(xr)
                fxr= ob.fun(fun, xr);
                //f(xl)*f(xr)
                fxlfxr= fxl* fxr;
                //Imprimir
                dtm.addRow(TLista.MostrarBiseccion(i,n,inter,xl,xu,xr,fxl,fxu,fxr,fxlfxr,ea,""));
                ea=1;
                ++i;
            }else {			

                //xl
                if(fxlfxr>0) {
                   xl = xr;
                }
                //xu
                if(fxlfxr<0) {
                    xu = xr;
                }
                //xr anterior guardado en auxxr
                auxr= xr;
                //Intervalo
                inter = xu-xl;
                //f(xl)
                fxl= ob.fun(fun, xl);
                //f(xu)
                fxu= ob.fun(fun, xu);
                //xr
                xr= xu - (fxu*(xl-xu))/(fxl-fxu);
                //f(xr)
                fxr= ob.fun(fun, xr);
                //f(xl)*f(xr)
                fxlfxr= fxl* fxr;
                //Imprimir
                ea = ob.ea(xr,auxr);
                if(ea<Es){
                    cond = "ALTO";                      
                }else{
                    cond = "SIGA";                         
                } 
                dtm.addRow(TLista.MostrarBiseccion(i,n,inter,xl,xu,xr,fxl,fxu,fxr,fxlfxr,ea,cond));
                ++i;
            }
            }while(ea > Es);
        }catch(Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }
        jTable1.setModel(dtm);
    }
    
    public void extender(){
    GraphicsEnvironment env =
    GraphicsEnvironment.getLocalGraphicsEnvironment();
    this.setMaximizedBounds(env.getMaximumWindowBounds());
    this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
    }
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
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmCalculadora("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField txtEs;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtValorVerdad;
    private javax.swing.JTextField txth;
    private javax.swing.JTextField txtx0;
    private javax.swing.JTextField txtx1;
    // End of variables declaration//GEN-END:variables
}
