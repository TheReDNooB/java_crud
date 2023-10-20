/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

/**
 *
 * @author SENA
 */
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class formTable extends javax.swing.JFrame {

    /**
     * Creates new form formTable
     */
   

    public formTable() {
        initComponents();
        
        this.buttonUpdate.setVisible(false);
        this.buttonDelete.setVisible(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        textPhone = new javax.swing.JTextField();
        selectSex = new javax.swing.JComboBox<>();
        textEps = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textComment = new javax.swing.JTextArea();
        buttonCreate = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        buttonConnection = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemCreate = new javax.swing.JMenuItem();
        menuItemSearch = new javax.swing.JMenuItem();
        menuItemUpdate = new javax.swing.JMenuItem();
        menuItemDelete = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemExit = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Formulario de Ingresos PQR");

        jLabel2.setText("identificacion");

        jLabel3.setText("nombres");

        jLabel4.setText("email");

        jLabel5.setText("telefono");

        jLabel6.setText("genero");

        jLabel7.setText("eps");

        jLabel8.setText("comentario");

        selectSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        textComment.setColumns(20);
        textComment.setRows(5);
        jScrollPane2.setViewportView(textComment);

        buttonCreate.setText("Create");
        buttonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateActionPerformed(evt);
            }
        });

        buttonClear.setText("Clear");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonSearch.setText("Search");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonConnection.setText("Connection");
        buttonConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConnectionActionPerformed(evt);
            }
        });

        buttonExit.setText("Exit");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        menuItemCreate.setText("Create");
        menuItemCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCreateActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemCreate);

        menuItemSearch.setText("Search");
        menuItemSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSearchActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemSearch);

        menuItemUpdate.setText("Update");
        menuItemUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUpdateActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemUpdate);

        menuItemDelete.setText("Delete");
        menuItemDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDeleteActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemDelete);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemExit);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(buttonUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(buttonDelete)
                        .addGap(18, 18, 18)
                        .addComponent(buttonClear)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textPhone)
                                    .addComponent(textEmail)
                                    .addComponent(textName)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(selectSex, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(textId)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textEps)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSearch)
                            .addComponent(buttonExit)
                            .addComponent(buttonConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConnection))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(selectSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textEps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonDelete)
                    .addComponent(buttonCreate)
                    .addComponent(buttonClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearInputs() {
        textId.setText(null);
        textName.setText(null);
        textEmail.setText(null);
        textPhone.setText(null);
        selectSex.setSelectedIndex(0);
        textEps.setText(null);
        textComment.setText(null);
        textId.requestFocus();

    }

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        // TODO add your handling code here:
        clearInputs();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConnectionActionPerformed
        // TODO add your handling code here:
        try {
            
            //Variables
            String base = "pqr"; //Nombre de la base de datos
            String url = "jdbc:mysql://localhost:3306/pqr"; //Direccion, puerto y nombre de la Base de Datos
            String user = "root"; //Usuario de Acceso a MySQL
            String password = ""; //Password del usuario
            Connection con = DriverManager.getConnection(url, user, password);
            
       
            Statement miStatement = con.createStatement();
            ResultSet miResultSet = miStatement.executeQuery("select * from pqr");
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Mi conexion exitosa");

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonConnectionActionPerformed

    private void buttonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateActionPerformed
        // TODO add your handling code here:
            String base = "pqr"; //Nombre de la base de datos
            String url = "jdbc:mysql://localhost:3306/pqr"; //Direccion, puerto y nombre de la Base de Datos
            String user = "root"; //Usuario de Acceso a MySQL
            String password = ""; //Password del usuario
            Connection con;

            try {
                con = DriverManager.getConnection(url, user, password);
                PreparedStatement ps = con.prepareStatement("INSERT INTO pqr (identificacion, nombres, email, telefono, genero, eps, comentario) VALUES(?,?,?,?,?,?,?) ");
                ps.setString(1, textId.getText());
                ps.setString(2, textName.getText());
                ps.setString(3, textEmail.getText());
                ps.setString(4, textPhone.getText());
                ps.setString(5, selectSex.getSelectedItem().toString());
                ps.setString(6, textEps.getText());
                ps.setString(7, textComment.getText());

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar el registro");
                }

                clearInputs();
                con.close();

            } catch (HeadlessException | SQLException e) {
                System.err.println(e);
            }
        
    }//GEN-LAST:event_buttonCreateActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
            String base = "pqr"; //Nombre de la base de datos
            String url = "jdbc:mysql://localhost:3306/pqr"; //Direccion, puerto y nombre de la Base de Datos
            String user = "root"; //Usuario de Acceso a MySQL
            String password = ""; //Password del usuario
            Connection con;

        try {
            con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("SELECT * FROM pqr WHERE identificacion = ?");
            ps.setString(1, textId.getText());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                textId.setText(rs.getString("identificacion"));
                textName.setText(rs.getString("nombres"));
                textEmail.setText(rs.getString("email"));
                textPhone.setText(rs.getString("telefono"));
                textEps.setText(rs.getString("eps"));
                textComment.setText(rs.getString("comentario"));
                selectSex.setSelectedItem(rs.getString("genero"));
                this.buttonUpdate.setVisible(true);
                this.buttonDelete.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe un registro con ese N° de identificacion");
                clearInputs();
            }

        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
            String base = "pqr"; //Nombre de la base de datos
            String url = "jdbc:mysql://localhost:3306/pqr"; //Direccion, puerto y nombre de la Base de Datos
            String user = "root"; //Usuario de Acceso a MySQL
            String password = ""; //Password del usuario
            Connection con;

        try {
            con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement("UPDATE pqr SET nombres=?, email=?, telefono=?, genero=?, eps=?, comentario=? WHERE identificacion=?");
                
                ps.setString(1, textName.getText());
                ps.setString(2, textEmail.getText());
                ps.setString(3, textPhone.getText());
                ps.setString(4, selectSex.getSelectedItem().toString());
                ps.setString(5, textEps.getText());
                ps.setString(6, textComment.getText());
                ps.setString(7, textId.getText());

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar el registro");
            }
            clearInputs();
            con.close();

        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        
            String base = "pqr"; //Nombre de la base de datos
           String url = "jdbc:mysql://localhost:3306/pqr"; //Direccion, puerto y nombre de la Base de Datos
           String user = "root"; //Usuario de Acceso a MySQL
           String password = ""; //Password del usuario
           Connection con;

            try {
                con = DriverManager.getConnection(url, user, password);
                PreparedStatement ps = con.prepareStatement("DELETE FROM pqr WHERE identificacion=?");
                ps.setInt(1, Integer.parseInt(textId.getText()));

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
                }
                clearInputs();
                con.close();

            } catch (HeadlessException | NumberFormatException | SQLException e) {
                System.err.println(e);
            }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // TODO add your handling code here:
        
        Object[] opciones = null;
        int eleccion = JOptionPane.showOptionDialog(rootPane, "Realmente deseas cerrar la App?", "Mensaje de confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_buttonExitActionPerformed

    private void menuItemCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCreateActionPerformed
        // TODO add your handling code here:
         buttonCreateActionPerformed(evt);
    }//GEN-LAST:event_menuItemCreateActionPerformed

    private void menuItemSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSearchActionPerformed
        // TODO add your handling code here:
        buttonSearchActionPerformed(evt);
    }//GEN-LAST:event_menuItemSearchActionPerformed

    private void menuItemUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUpdateActionPerformed
        // TODO add your handling code here:
        buttonUpdateActionPerformed(evt);
    }//GEN-LAST:event_menuItemUpdateActionPerformed

    private void menuItemDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDeleteActionPerformed
        // TODO add your handling code here:
        buttonDeleteActionPerformed(evt);
    }//GEN-LAST:event_menuItemDeleteActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        // TODO add your handling code here:
        buttonExitActionPerformed(evt);
    }//GEN-LAST:event_menuItemExitActionPerformed

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
            java.util.logging.Logger.getLogger(formTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonConnection;
    private javax.swing.JButton buttonCreate;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem menuItemCreate;
    private javax.swing.JMenuItem menuItemDelete;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemSearch;
    private javax.swing.JMenuItem menuItemUpdate;
    private javax.swing.JComboBox<String> selectSex;
    private javax.swing.JTextArea textComment;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textEps;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPhone;
    // End of variables declaration//GEN-END:variables
}
