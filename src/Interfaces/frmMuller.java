
package Interfaces;

import Algoritmos.EvaluadorFunciones;
import Algoritmos.Muller;
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
public class frmMuller extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    frmGrafico grafico;
    String titulos [] = {"Iteraccion", "f(x0)", "f(x1)", "f(x2)", "Delta 0","Delta 1", "Raiz", "Error Aproximado"}; 
        
    public frmMuller() {
        initComponents();
        dtm.setColumnIdentifiers(titulos);
        jTable1.setModel(dtm);
        JTableHeader jtableHeader = jTable1.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        jTable1.setTableHeader(jtableHeader);
    }

    public void celdasFondo(){
        for (int i = 0; i < titulos.length; i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(new GestionCeldas("numerico"));
        }        
    }
    
    public void ValidacionCampos(){
        if(txtErrortolerancia.getText().equals("") || txtErrortolerancia.getText().equals(".")){
            txtErrortolerancia.setBackground(Color.pink);
        }
        if(txtValorX0.getText().equals("") || txtValorX0.getText().equals(".")){
            txtValorX0.setBackground(Color.pink);
        }
        if(txtTamñPaso.getText().equals("") || txtTamñPaso.getText().equals(".")){
            txtTamñPaso.setBackground(Color.pink);
        }
        if(txtX2.getText().equals("") || txtX2.getText().equals(".")){
            txtX2.setBackground(Color.pink);
        }
    }
    
    public void Color(){        
        txtErrortolerancia.setBackground(Color.WHITE);
        txtTamñPaso.setBackground(Color.WHITE);
        txtValorX0.setBackground(Color.WHITE);
        txtFuncion.setBackground(Color.WHITE);
        txtX2.setBackground(Color.WHITE);
    }
    
    public void  LimpiarIngresos(){
        txtFuncion.setText("");
        txtErrortolerancia.setText("");
        txtTamñPaso.setText("");
        txtValorX0.setText("");
        txtX2.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        txtErrortolerancia = new javax.swing.JTextField();
        txtValorX0 = new javax.swing.JTextField();
        txtTamñPaso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtX2 = new javax.swing.JTextField();
        btnGrafica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("BISECCION");

        btnRegresar.setText("Regresar");

        jLabel2.setText("Ingrese la funcion : ");

        jLabel3.setText("Ingrese Error de tolerancia :");

        jLabel4.setText("Ingrese valor de x0 :");

        jLabel5.setText("Ingrese valor de x1  :");

        txtErrortolerancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtErrortoleranciaActionPerformed(evt);
            }
        });
        txtErrortolerancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtErrortoleranciaKeyTyped(evt);
            }
        });

        txtValorX0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorX0KeyTyped(evt);
            }
        });

        txtTamñPaso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTamñPasoKeyTyped(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("La Raiz es :");

        jLabel9.setText("Error de Aproximacion es :");

        jLabel6.setText("Ingrese valor de x2 :");

        txtX2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX2KeyTyped(evt);
            }
        });

        btnGrafica.setText("Visualizar Grafica");
        btnGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(338, 338, 338)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFuncion)
                                    .addComponent(txtTamñPaso, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(txtValorX0)
                                    .addComponent(txtErrortolerancia)
                                    .addComponent(txtX2))
                                .addGap(59, 59, 59)
                                .addComponent(btnGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton1)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtErrortolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnGrafica)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtValorX0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTamñPaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String fun;
        double Es, x0, x1 , x2;
        EvaluadorFunciones ef= new EvaluadorFunciones();
        Muller om = new Muller();
        Color();
        ef.setFuncion(txtFuncion.getText());
        ef.setX(3);
        ef.Evaluar();
        try{
            if(Double.isNaN(ef.getResultado())){
                txtFuncion.setBackground(Color.PINK);
                JOptionPane.showMessageDialog(this, "Ingrese la funcion o escriba la funcion correctamente" + "\nPor ejemplo: 2*x^2");
            }else{
                fun = txtFuncion.getText();            
                Es = Double.parseDouble(txtErrortolerancia.getText());                    
                x0 = Double.parseDouble(txtValorX0.getText());
                x1 = Double.parseDouble(txtTamñPaso.getText()); 
                x2 = Double.parseDouble(txtX2.getText()); 
                dtm = om.Muller(1,fun, Es, x0, x1, x2);
                jTable1.setModel(dtm);
                LimpiarIngresos();
                int tamñ = dtm.getRowCount();
                jLabel8.setText(dtm.getValueAt(tamñ-1, 6).toString()); 
                jLabel10.setText(dtm.getValueAt(tamñ-1, 7).toString()); 
                grafico = new frmGrafico(fun);
                celdasFondo();
            }                       
        }catch(NumberFormatException ex){
            ValidacionCampos();
            JOptionPane.showMessageDialog(null, "Por Favor corrija los campos marcados con rojo", "ERROR", JOptionPane.ERROR_MESSAGE );
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        while(modelo.getRowCount()>0)modelo.removeRow(0);
 
        TableColumnModel modCol = jTable1.getColumnModel();
        while(modCol.getColumnCount()>0)modCol.removeColumn(modCol.getColumn(0));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtErrortoleranciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtErrortoleranciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtErrortoleranciaActionPerformed

    private void txtErrortoleranciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtErrortoleranciaKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtErrortolerancia.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&txtErrortolerancia.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtErrortoleranciaKeyTyped

    private void txtValorX0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorX0KeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtValorX0.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&txtValorX0.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtValorX0KeyTyped

    private void txtTamñPasoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamñPasoKeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtTamñPaso.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&txtTamñPaso.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtTamñPasoKeyTyped

    private void txtX2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX2KeyTyped
        if(!Character.isDigit(evt.getKeyChar())&&evt.getKeyChar()!='.'&&evt.getKeyChar()!='-'){
            evt.consume();
        }
        if(evt.getKeyChar()=='.'&&txtX2.getText().contains(".")){
            evt.consume();
        }
        if(evt.getKeyChar()=='-'&&txtX2.getText().contains("-")){
            evt.consume();
        }
    }//GEN-LAST:event_txtX2KeyTyped

    private void btnGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficaActionPerformed
        grafico.show();
    }//GEN-LAST:event_btnGraficaActionPerformed

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
            java.util.logging.Logger.getLogger(frmMuller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMuller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMuller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMuller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMuller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrafica;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField txtErrortolerancia;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtTamñPaso;
    private javax.swing.JTextField txtValorX0;
    private javax.swing.JTextField txtX2;
    // End of variables declaration//GEN-END:variables
}
