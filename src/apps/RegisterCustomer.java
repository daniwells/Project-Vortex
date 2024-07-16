/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package apps;

import connection.Connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegisterCustomer extends javax.swing.JDialog {

    public RegisterCustomer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

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

    /**
     * @param args the command line arguments
     */
    
    Connect db = new Connect();
    
    private void createCustomerClub(){
        if(db.getConnection()){
            try{
                String nameCustomer = "daniel@gmail.com"; // Adicionar no input
                String CPFCustomer = "123";
                String phoneCustomer = "123";
                
                String query = "INSERT INTO saler (name_customer, CPF_customer, phone_customer) VALUES (?, ?, ?)";
                PreparedStatement stmt = db.conn.prepareStatement(query);
                
                stmt.setString(1, nameCustomer);
                stmt.setString(2, CPFCustomer);
                stmt.setString(2, phoneCustomer);
                ResultSet result = stmt.executeQuery();
                
                JOptionPane.showMessageDialog(null, "saler registered with success");
                System.out.println(result);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error to get category datas!"+e.toString());
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
