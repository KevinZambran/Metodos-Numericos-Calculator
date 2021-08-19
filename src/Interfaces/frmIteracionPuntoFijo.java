
package Interfaces;

import Algoritmos.EvaluadorFunciones;
import Algoritmos.IteracionPuntoFijo;
import Controlador.GestionCeldas;
import Controlador.GestionEncabezadoTabla;
import Principal.frmPrincipal;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author PERSONAL
 */
public class frmIteracionPuntoFijo extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    frmGrafico grafico;
    String titulos [] = {"Iteraccion", "Raiz","f(x)", "Error Aproximado"};  
        
    public frmIteracionPuntoFijo() {
        initComponents();
        dtm.setColumnIdentifiers(titulos);
        jTable1.setModel(dtm);
        JTableHeader jtableHeader = jTable1.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        jTable1.setTableHeader(jtableHeader);  
        
    }
    public JPanel panel (){
        return jPanel2;        
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
    }
    
    public void Color(){        
        txtErrortolerancia.setBackground(Color.WHITE);
        txtValorX0.setBackground(Color.WHITE);
        txtFuncion.setBackground(Color.WHITE);
    }
    
    public void  LimpiarIngresos(){
        txtFuncion.setText("");
        txtErrortolerancia.setText("");
        txtValorX0.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnGrafica = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtValorX0 = new javax.swing.JTextField();
        txtErrortolerancia = new javax.swing.JTextField();
        txtFuncion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGrafica.setText("Visualizar Grafica");
        btnGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficaActionPerformed(evt);
            }
        });
        jPanel2.add(btnGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 52, 206, 20));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 480, 255, 14));

        jLabel9.setText("Error de Aproximacion es :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 480, -1, -1));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 480, 207, 14));

        jLabel7.setText("La Raiz es :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 480, -1, -1));

        jButton2.setText("Limpiar Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 166, -1, -1));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 166, -1, -1));

        txtValorX0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorX0KeyTyped(evt);
            }
        });
        jPanel2.add(txtValorX0, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 128, 166, -1));

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
        jPanel2.add(txtErrortolerancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 90, 166, -1));
        jPanel2.add(txtFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 52, 166, -1));

        jLabel4.setText("Ingrese valor de x0 :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 131, -1, -1));

        jLabel3.setText("Ingrese Error de tolerancia :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 93, -1, -1));

        jLabel2.setText("Ingrese la funcion : ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 55, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 104, 34));

        jLabel1.setText("Iteracion de Punto Fijo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 11, -1, -1));

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
        jTable1.setMaximumSize(new java.awt.Dimension(2380, 950));
        jTable1.setMinimumSize(new java.awt.Dimension(2380, 950));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1362, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String fun;
        double Es, xl;
        EvaluadorFunciones ef= new EvaluadorFunciones();  
        IteracionPuntoFijo ot = new IteracionPuntoFijo();
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
                xl = Double.parseDouble(txtValorX0.getText());
                dtm = ot.PuntoFijo(0,fun, Es, xl);
                jTable1.setModel(dtm);
                LimpiarIngresos();
                int tamñ = dtm.getRowCount();
                jLabel8.setText(dtm.getValueAt(tamñ-1, 1).toString()); 
                jLabel10.setText(dtm.getValueAt(tamñ-1, 3).toString());
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

    private void btnGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficaActionPerformed
        grafico.show();
    }//GEN-LAST:event_btnGraficaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        frmPrincipal frm = new frmPrincipal();
        frm.Activated();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmIteracionPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIteracionPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIteracionPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIteracionPuntoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIteracionPuntoFijo().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtErrortolerancia;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtValorX0;
    // End of variables declaration//GEN-END:variables
}
