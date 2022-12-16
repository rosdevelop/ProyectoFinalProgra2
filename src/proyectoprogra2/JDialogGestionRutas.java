/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyectoprogra2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Sofia Murillo
 */
public class JDialogGestionRutas extends javax.swing.JDialog {
 static ArrayList<GestionRuta> gestionrutas = new ArrayList<GestionRuta>();
  static String IdRuta;
static String LugarSalida;
static String LugarLlegada;
static String Ruta;
static String TiempoEstimado;

    /**
     * Creates new form JDialogGestionRutas
     */
    public JDialogGestionRutas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       cargarData();
        showTable();
        setLocationRelativeTo(null);
        
          jTableGestionRutas.addMouseListener(new MouseAdapter() {
            DefaultTableModel model = new DefaultTableModel();

            @Override
            public void mouseClicked(MouseEvent e) {
                int i = jTableGestionRutas.getSelectedRow();
                    IdRuta = jTableGestionRutas.getValueAt(i, 0).toString();
                LugarSalida= jTableGestionRutas.getValueAt(i, 1).toString();
                LugarLlegada = jTableGestionRutas.getValueAt(i, 2).toString();
                 Ruta = jTableGestionRutas.getValueAt(i, 3).toString();
                  TiempoEstimado = jTableGestionRutas.getValueAt(i, 4).toString();
            }
   });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelPlaca = new javax.swing.JLabel();
        jTextFieldIdRuta = new javax.swing.JTextField();
        jLabelPlaca1 = new javax.swing.JLabel();
        jLabelPlaca2 = new javax.swing.JLabel();
        jLabelNombrebus = new javax.swing.JLabel();
        jLabelCantidaPasajeros = new javax.swing.JLabel();
        jTextFieldLugarSalida = new javax.swing.JTextField();
        jTextFieldRuta = new javax.swing.JTextField();
        jTextFieldLugarLlegada = new javax.swing.JTextField();
        ButtonCrear = new javax.swing.JButton();
        ButtonActualizar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();
        LbError = new javax.swing.JLabel();
        jLabelPlaca3 = new javax.swing.JLabel();
        jTextFieldTiempoestimado = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGestionRutas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(243, 249, 249));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelPlaca.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabelPlaca.setForeground(new java.awt.Color(4, 88, 96));
        jLabelPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlaca.setText("Id de ruta");

        jTextFieldIdRuta.setText(" ");

        jLabelPlaca1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabelPlaca1.setForeground(new java.awt.Color(4, 88, 96));
        jLabelPlaca1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlaca1.setText("Tiempo estimado");

        jLabelPlaca2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabelPlaca2.setForeground(new java.awt.Color(4, 88, 96));
        jLabelPlaca2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelNombrebus.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabelNombrebus.setForeground(new java.awt.Color(4, 88, 96));
        jLabelNombrebus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombrebus.setText("Lugar de llegada");

        jLabelCantidaPasajeros.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabelCantidaPasajeros.setForeground(new java.awt.Color(4, 88, 96));
        jLabelCantidaPasajeros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantidaPasajeros.setText("Lugar de salida");

        jTextFieldLugarSalida.setText(" ");

        jTextFieldRuta.setText(" ");

        jTextFieldLugarLlegada.setText(" ");

        ButtonCrear.setBackground(new java.awt.Color(8, 31, 135));
        ButtonCrear.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ButtonCrear.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCrear.setText("Crear");
        ButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCrearActionPerformed(evt);
            }
        });

        ButtonActualizar.setBackground(new java.awt.Color(8, 31, 135));
        ButtonActualizar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonActualizar.setText("Actualizar");
        ButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActualizarActionPerformed(evt);
            }
        });

        ButtonEliminar.setBackground(new java.awt.Color(54, 86, 21));
        ButtonEliminar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ButtonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEliminar.setText("Eliminar");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        LbError.setText(" ");

        jLabelPlaca3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabelPlaca3.setForeground(new java.awt.Color(4, 88, 96));
        jLabelPlaca3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlaca3.setText("Ruta");

        jTextFieldTiempoestimado.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldLugarLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldLugarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldIdRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldTiempoestimado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombrebus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCantidaPasajeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(LbError, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabelPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPlaca1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ButtonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonEliminar)
                                .addGap(0, 21, Short.MAX_VALUE))))
                    .addComponent(jLabelPlaca3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jLabelPlaca2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(49, 49, 49)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LbError)
                .addGap(43, 43, 43)
                .addComponent(jLabelPlaca)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldIdRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabelCantidaPasajeros)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldLugarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNombrebus)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldLugarLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabelPlaca3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPlaca1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldTiempoestimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCrear)
                    .addComponent(ButtonActualizar)
                    .addComponent(ButtonEliminar))
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jLabelPlaca2)
                    .addContainerGap(511, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(243, 249, 249));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableGestionRutas.setAutoCreateRowSorter(true);
        jTableGestionRutas.setBackground(new java.awt.Color(243, 249, 249));
        jTableGestionRutas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableGestionRutas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableGestionRutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Lugar salida", "Lugar Llegada", "Ruta", "Tiempo estimado"
            }
        ));
        jTableGestionRutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableGestionRutasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableGestionRutas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCrearActionPerformed
        GestionRuta gestRuta = new  GestionRuta ();
        gestRuta.setId(jTextFieldRuta.getText());
        gestRuta.setSalida(jTextFieldLugarSalida.getText());
        gestRuta.setLLegada(jTextFieldLugarLlegada.getText());
         gestRuta.setRuta(jTextFieldRuta.getText());
        gestRuta.setHora(jTextFieldTiempoestimado.getText());
        gestionrutas.add(gestRuta);
        ContextTXTGestionFlotilla.Guardardatos(gestionrutas);
        
        
         LimpiarCasillas();
        showTable(); 
      
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCrearActionPerformed

    private void ButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActualizarActionPerformed
        for (int i = 0; i < 10; i++) {

            if (gestionrutas.get(i).getId().equals(IdRuta))
            {

                //
                gestionrutas.get(i).setId(jTextFieldIdRuta.getText());
                gestionrutas.get(i).setSalida(jTextFieldLugarSalida.getText());
                gestionrutas.get(i).setLLegada(jTextFieldLugarLlegada.getText());
                gestionrutas.get(i).setRuta(jTextFieldRuta.getText());
                gestionrutas.get(i).setHora(jTextFieldTiempoestimado.getText());
                    
                ContextTXTGestionRuta.LeerDatos();
               showTable();

            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonActualizarActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        try {
            for (int i = 0; i < gestionrutas.size(); i++) {
                if (gestionrutas.get(i).getId().equals(IdRuta)) {
                    gestionrutas.remove(i);
                    ContextTXTGestionFlotilla.Guardardatos(gestionrutas);

                   // LeerTabla();
                }

            }
        } catch (Exception e) {
            LbError.setText("Error al eliminar ");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    private void jTableGestionRutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGestionRutasMouseClicked
        jTextFieldIdRuta.setText(IdRuta);
        jTextFieldLugarSalida.setText(LugarSalida);
        jTextFieldLugarLlegada.setText(LugarLlegada);
        jTextFieldRuta.setText(Ruta);
        jTextFieldTiempoestimado.setText(TiempoEstimado);
        ButtonCrear.setEnabled(false);
        jTextFieldIdRuta.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jTableGestionRutasMouseClicked
private void cargarData() {
        
        gestionrutas = ContextTXTGestionRuta.LeerDatos();
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
            java.util.logging.Logger.getLogger(JDialogGestionRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogGestionRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogGestionRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogGestionRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogGestionRutas dialog = new JDialogGestionRutas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActualizar;
    private javax.swing.JButton ButtonCrear;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JLabel LbError;
    private javax.swing.JLabel jLabelCantidaPasajeros;
    private javax.swing.JLabel jLabelNombrebus;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelPlaca1;
    private javax.swing.JLabel jLabelPlaca2;
    private javax.swing.JLabel jLabelPlaca3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGestionRutas;
    private javax.swing.JTextField jTextFieldIdRuta;
    private javax.swing.JTextField jTextFieldLugarLlegada;
    private javax.swing.JTextField jTextFieldLugarSalida;
    private javax.swing.JTextField jTextFieldRuta;
    private javax.swing.JTextField jTextFieldTiempoestimado;
    // End of variables declaration//GEN-END:variables

    

    private void showTable() {
        
         String Ruta[][] = new String[gestionrutas.size()][6];

        for (int i = 0; i < gestionrutas.size(); i++) {
            Ruta[i][0] = gestionrutas.get(i).getId();
            Ruta[i][1] = gestionrutas.get(i).getSalida();
            Ruta[i][2] = gestionrutas.get(i).getLLegada();
            Ruta[i][3] = gestionrutas.get(i).getRuta();
            Ruta[i][4] = gestionrutas.get(i).getHora();
           
        }
         jTableGestionRutas.setModel(new javax.swing.table.DefaultTableModel(Ruta, new String[]{"IdRuta", "Salida", "Llegada", " Ruta", "Hora"}));

    }
  
    private void LimpiarCasillas() {
        
         jTextFieldIdRuta.setText("");
        jTextFieldLugarSalida.setText("");
        jTextFieldLugarLlegada.setText("");
        jTextFieldRuta.setText("");
        jTextFieldTiempoestimado.setText("");
        jTextFieldIdRuta.setEnabled(true);
        ButtonCrear.setEnabled(true);
    }

    private void updateTxt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}




