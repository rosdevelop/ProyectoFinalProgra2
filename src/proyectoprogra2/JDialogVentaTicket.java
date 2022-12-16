/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyectoprogra2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static proyectoprogra2.JDialogGestionChoferes.ListaChofe;





/**
 *
 * @author jerem
 */
public class JDialogVentaTicket extends javax.swing.JDialog {
    
    ArrayList<VentaTicket>lista = new ArrayList<>();
    ArrayList<VentaTicket>listaTxt = new ArrayList<>();
    ArrayList<GestionViajes>listaViaje = new ArrayList<>();
    ArrayList<GestionViajes>listaTxtViaje = new ArrayList<>();
    String IdViaje;
    String PlacaBus;
    String CedulaChofer;
    String IdRuta;
    String Fecha;
    String Hora;
    int CantidadTickets;

    public JDialogVentaTicket(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarDatosTxt();
        cargarDatosTxtViajes();
        readDataTable();
        String viaje [] = new String[listaViaje.size()];
        
        for(int i = 0; i< listaViaje.size() ; i++)
        {
          viaje[i] = listaViaje.get(i).getIdViaje();
        }
        JCBoxIdViaje.setModel(new javax.swing.DefaultComboBoxModel<>(viaje));
        JCBoxIdViaje.setSelectedIndex(-1);
        
        
         JTblVentaTicket.addMouseListener( new MouseAdapter()
            {
                DefaultTableModel model = new DefaultTableModel();
                @Override
                public void mouseClicked(MouseEvent e)
                    {
                    int i = JTblVentaTicket.getSelectedRow();
                    IdViaje = JTblVentaTicket.getValueAt(i, 0).toString();
                    CantidadTickets = Integer.parseInt(JTblVentaTicket.getValueAt(i, 1).toString());
                    }
                
                }
                  );
    }
    
    public void LimpiarCasillas()
     {
     TxtCantidadTickets.setText("");
     TxtCantidadTickets.setEditable(true);
     JCBoxIdViaje.setSelectedItem(null);
     BtnComprar.setEnabled(true);
     
     }
     /**
      * updateTxt
      * Este metodo va a guardar la información en el txt
      */
     public void  updateTxt()
     {
         ContentTXTVentaTicket.Guardardatos(lista);
     
         
     }
     /**
      * cargarDatosTxt
      * Este metodo agarra la información del txt 
      */
     public void cargarDatosTxt()
     {
         listaTxt = ContentTXTVentaTicket.LeerDatos();
         lista = listaTxt;
     
     }
     /**
      * cargarDatosTxtViajes
      * Este metodo agarra la información del txt de los viajes
      */
     public void cargarDatosTxtViajes()
     {
         listaTxtViaje = ContentTXTGestionViajes.LeerDatos();
         listaViaje = listaTxtViaje;
     }
     /**
      * readDataTable
      * Este metodo añadira los datos a la tabla
      */
    public void readDataTable()
     {
     
     String matriz [][] = new String[lista.size()][2];
        
     for(int i = 0; i< lista.size() ; i++)
        {
            matriz[i][0]= lista.get(i).getIdViaje();
            matriz[i][1]= String.valueOf(lista.get(i).getCantidadTickets());
        }
        JTblVentaTicket.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"Id Viaje","Tickets Vendidos"}));
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
        BtnComprar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        JLblEdit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JCBoxIdViaje = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        TxtCantidadTickets = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTblVentaTicket = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnComprar.setText("Comprar");
        BtnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnComprarMouseClicked(evt);
            }
        });

        BtnActualizar.setText("Actualizar");
        BtnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnActualizarMouseClicked(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseClicked(evt);
            }
        });

        BtnEditar.setText("Editar");
        BtnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEditarMouseClicked(evt);
            }
        });

        JLblEdit.setText("........................................................");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(JLblEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(BtnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(BtnEditar)
                            .addGap(11, 11, 11)
                            .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JLblEdit)
                    .addGap(21, 21, 21)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BtnComprar)
                        .addComponent(BtnEditar)
                        .addComponent(BtnActualizar)
                        .addComponent(BtnEliminar))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 390, -1));

        jLabel1.setText("ID del viaje:");

        JCBoxIdViaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Cantidad de Tickets:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtCantidadTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBoxIdViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCBoxIdViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCantidadTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 320));

        JTblVentaTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id Viaje", "Tickets Vendidos"
            }
        ));
        JTblVentaTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTblVentaTicketMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTblVentaTicket);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 410, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void confirmarDatosViaje(){
        
        for (int i = 0; i < listaViaje.size() ; i++) {
            if(JCBoxIdViaje.getSelectedItem().toString().equals(listaViaje.get(i).getIdViaje()))
            {
                PlacaBus = listaViaje.get(i).getPlacaBus();
                CedulaChofer = listaViaje.get(i).getCedulaChofer();
                IdRuta = listaViaje.get(i).getIdRuta();
                Fecha = listaViaje.get(i).getFecha();
                Hora = listaViaje.get(i).getHora();
            
            }
        }
    }
    /**
     * 
     * @return verificarViaje
     * verifica que exista ese dato adentro del sistema
     */
    public boolean verificarViaje()
     {
         
        boolean var1 = false;
        cargarDatosTxt();
        for (int i = 0; i < lista.size() ; i++) 
        {
           
          if(JCBoxIdViaje.getSelectedItem().toString().equals(lista.get(i).getIdViaje()))
          {
             var1 = true;
          }
        }
         
         
         
     return var1;
     
     }
    private void JTblVentaTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTblVentaTicketMouseClicked
   
        
    }//GEN-LAST:event_JTblVentaTicketMouseClicked

    private void BtnComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnComprarMouseClicked
        // TODO add your handling code here:
        int vari;
        if(verificarViaje()==false & !JCBoxIdViaje.getSelectedItem().equals("") & !TxtCantidadTickets.getText().isEmpty())
        {
            confirmarDatosViaje();           

            
            VentaTicket ventaticket = new VentaTicket(JCBoxIdViaje.getSelectedItem().toString(), PlacaBus, CedulaChofer, IdRuta, Fecha, Hora, Integer.parseInt(TxtCantidadTickets.getText()));
            lista.add(ventaticket);
            updateTxt();
            LimpiarCasillas();
            readDataTable();      
       }
        if (verificarViaje()==true & !TxtCantidadTickets.getText().isEmpty())
          { 
            //cantidadTiquetes = cantidadTiquetes + Integer.parseInt(txtTiquetes.getText());
            for (int j = 0; j < lista.size() ; j++) 
            { 
              if(JCBoxIdViaje.getSelectedItem().toString().equals(lista.get(j).getIdViaje())){
              vari = j;
              lista.get(vari).setCantidadTickets(lista.get(vari).getCantidadTickets() + Integer.parseInt(TxtCantidadTickets.getText()));
              }  
            }
            updateTxt();
            LimpiarCasillas();
            readDataTable();     
          }
        else
        {
          
         if (JCBoxIdViaje.getSelectedIndex() == -1)
          { 
              JOptionPane.showMessageDialog(null, "El campo ID de Viaje se encuentra vacio");
          }
           if(TxtCantidadTickets.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Por favor ingrese la cantidad de tickets que desea comprar");
            }
          
        }
    }//GEN-LAST:event_BtnComprarMouseClicked

    private void BtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEditarMouseClicked
        // TODO add your handling code here:
        JCBoxIdViaje.setSelectedItem(IdViaje);
        TxtCantidadTickets.setText(String.valueOf(CantidadTickets));
        BtnComprar.setEnabled(false);
        JLblEdit.setText("Presione Actualizar una vez los datos sean actualizados");
    }//GEN-LAST:event_BtnEditarMouseClicked

    private void BtnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnActualizarMouseClicked
        // TODO add your handling code here:
        for (int j = 0; j < lista.size() ; j++) 
        {
          if(IdViaje.equals(lista.get(j).getIdViaje()))
          {    
              
              lista.get(j).setIdViaje(JCBoxIdViaje.getSelectedItem().toString());
              //confirmarDatosViaje();
              lista.get(j).setCantidadTickets(Integer.parseInt(TxtCantidadTickets.getText()));
              System.out.println(lista.get(j).getIdViaje());   
              //String idViajes, String placaBus, String cedulaChofer, String idRuta, String fecha, String hora,int cantidadTiquetes
                 
          }
        }
            
        
        readDataTable();
        LimpiarCasillas();
        updateTxt();
        JLblEdit.setText("");
    }//GEN-LAST:event_BtnActualizarMouseClicked

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        // TODO add your handling code here:
        for (int i = 0; i < lista.size(); i++) 
        {
            if(IdViaje.equals(lista.get(i).getIdViaje()))
            {
                lista.remove(i);
            
            }
        }
        
        readDataTable();
        updateTxt();
        LimpiarCasillas();
    }//GEN-LAST:event_BtnEliminarMouseClicked

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
            java.util.logging.Logger.getLogger(JDialogVentaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogVentaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogVentaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogVentaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogVentaTicket dialog = new JDialogVentaTicket(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnComprar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JComboBox<String> JCBoxIdViaje;
    private javax.swing.JLabel JLblEdit;
    private javax.swing.JTable JTblVentaTicket;
    private javax.swing.JTextField TxtCantidadTickets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
