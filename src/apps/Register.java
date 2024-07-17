package apps;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import connection.Connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import classes.Session;
import javax.swing.JOptionPane;

/**
 *
 * @author lid2jvl
 */
public class Register extends javax.swing.JFrame {
    private int idSaler ;
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Connect db = new Connect();
    
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        createSaler();
    }    
    
    private void selectUser(String email){
        String query = "SELECT id_saler FROM saler WHERE email_corp_saler = ?";

        try {
            PreparedStatement stmt = db.conn.prepareStatement(query);
            stmt.setString(1, email);
            ResultSet result = stmt.executeQuery();

            if (result.next()) {
                this.idSaler = result.getInt("id_saler");
            }
            
            result.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void createSaler(){
        if(db.getConnection()){
            try{                
                String query = "INSERT saler (email_corp_saler, password_saler) VALUES (?, ?)";
                PreparedStatement stmt = db.conn.prepareStatement(query);
                
                stmt.setString(1, jTextField_email.getText());
                stmt.setString(2, jTextField_password.getText());
                stmt.executeUpdate();
                stmt.close();
                
                JOptionPane.showMessageDialog(null, "Saler registered with success");
                
                selectUser(jTextField_email.getText());
                
                db.conn.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error to register saler!"+e.toString());
            }
        }
    }
    
    private void listSaler(){
        if(db.getConnection()){
            try{
                String query = "SELECT id_saler, email_corp_saler FROM saler";
                PreparedStatement stmt = db.conn.prepareStatement(query);
                ResultSet result = stmt.executeQuery();
                
                System.out.println(result);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error to get category datas!"+e.toString());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
