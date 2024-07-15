/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package apps;

import connection.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JDialog {

    /**
     * Creates new form register
     */
    public Register(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setResizable(false);
    }
    
    Connection db = new Connection();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

    
    private void createSaler(){
        if(db.getConnection()){
            try{
                String saler = "daniel@gmail.com";
                String query = "INSERT INTO saler (email_corp_saler) VALUES (?)";
                PreparedStatement smtp = db.conn.prepareStatement(query);
                
                smtp.setString(1, saler);
                ResultSet result = smtp.executeQuery();
                
                JOptionPane.showMessageDialog(null, "saler registered with success");
                System.out.println(result);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error to get category datas!"+e.toString());
            }
        }
    }
    
    private void listSaler(){
        if(db.getConnection()){
            try{
                String query = "SELECT id_saler, email_corp_saler FROM saler";
                PreparedStatement smtp = db.conn.prepareStatement(query);
                ResultSet result = smtp.executeQuery();
                
                System.out.println(result);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error to get category datas!"+e.toString());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
