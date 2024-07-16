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

/**
 *
 * @author lid2jvl
 */
public class RegisterProducts extends javax.swing.JDialog {

    public RegisterProducts(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
        
    Connect db = new Connect();
    
    private void getCategory(){
        if(db.getConnection()){
            try{
                String categoryId = "1";
             
                String query = "SELECT name_category FROM category WHERE id_category_product = ?";
                PreparedStatement stmt = db.conn.prepareStatement(query);
                
                stmt.setString(1, categoryId);
                ResultSet result = stmt.executeQuery();
                
                System.out.println(result);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error to get category datas!"+e.toString());
            }
        }
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
    private void createProduct(){
        if(db.getConnection()){
            try{
                String nameProduct = "daniel@gmail.com"; // Adicionar no input
                String priceProduct = "123";
                String fkCategoryProduct = "123";
             
                String query = "INSERT INTO saler (name_product, price_product, fk_category_product) VALUES (?, ?, ?)";
                PreparedStatement stmt = db.conn.prepareStatement(query);
                
                stmt.setString(1, nameProduct);
                stmt.setString(2, priceProduct);
                stmt.setString(2, fkCategoryProduct);
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
