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

public class Register extends javax.swing.JDialog {
    public Register(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setResizable(false);
    }
    
    Connect db = new Connect();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_background = new javax.swing.JPanel();
        jPanel_container = new javax.swing.JPanel();
        jLabel_title = new javax.swing.JLabel();
        jLabel_subtitle = new javax.swing.JLabel();
        jLabel_logo = new javax.swing.JLabel();
        jButton_signup = new javax.swing.JButton();
        jTextField_password = new javax.swing.JTextField();
        jLabel_password = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jLabel_email = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel_background.setBackground(new java.awt.Color(240, 238, 226));
        jPanel_background.setPreferredSize(new java.awt.Dimension(1000, 683));

        jPanel_container.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_title.setFont(new java.awt.Font("Bosch Sans", 1, 24)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(77, 73, 73));
        jLabel_title.setText("create account");

        jLabel_subtitle.setFont(new java.awt.Font("Bosch Sans", 0, 18)); // NOI18N
        jLabel_subtitle.setForeground(new java.awt.Color(173, 173, 173));
        jLabel_subtitle.setText("and start sending!");

        jLabel_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo-medium.png"))); // NOI18N

        jButton_signup.setBackground(new java.awt.Color(77, 73, 73));
        jButton_signup.setFont(new java.awt.Font("Bosch Sans", 1, 16)); // NOI18N
        jButton_signup.setForeground(new java.awt.Color(255, 255, 255));
        jButton_signup.setText("sign up");

        jTextField_password.setFont(new java.awt.Font("Bosch Sans", 0, 16)); // NOI18N
        jTextField_password.setForeground(new java.awt.Color(77, 73, 73));

        jLabel_password.setFont(new java.awt.Font("Bosch Sans", 0, 16)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(77, 73, 73));
        jLabel_password.setText("password");

        jTextField_email.setFont(new java.awt.Font("Bosch Sans", 0, 16)); // NOI18N
        jTextField_email.setForeground(new java.awt.Color(77, 73, 73));

        jLabel_email.setFont(new java.awt.Font("Bosch Sans", 0, 16)); // NOI18N
        jLabel_email.setForeground(new java.awt.Color(77, 73, 73));
        jLabel_email.setText("email");

        javax.swing.GroupLayout jPanel_containerLayout = new javax.swing.GroupLayout(jPanel_container);
        jPanel_container.setLayout(jPanel_containerLayout);
        jPanel_containerLayout.setHorizontalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                        .addComponent(jLabel_subtitle)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                        .addComponent(jLabel_title)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                        .addComponent(jLabel_logo)
                        .addGap(189, 189, 189))))
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_email)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_password)
                    .addComponent(jTextField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel_containerLayout.setVerticalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_subtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_backgroundLayout = new javax.swing.GroupLayout(jPanel_background);
        jPanel_background.setLayout(jPanel_backgroundLayout);
        jPanel_backgroundLayout.setHorizontalGroup(
            jPanel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_backgroundLayout.createSequentialGroup()
                .addContainerGap(378, Short.MAX_VALUE)
                .addComponent(jPanel_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(363, 363, 363))
            .addGroup(jPanel_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_backgroundLayout.setVerticalGroup(
            jPanel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(jPanel_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_background, javax.swing.GroupLayout.DEFAULT_SIZE, 1172, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_background, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createSaler(){
        if(db.getConnection()){
            try{
                String salerEmail = "daniel@gmail.com"; // Adicionar no input
                String salerPassword = "123";
                
                String query = "INSERT INTO saler (email_corp_saler, salerPassword) VALUES (?, ?)";
                PreparedStatement stmt = db.conn.prepareStatement(query);
                
                stmt.setString(1, salerEmail);
                stmt.setString(2, salerPassword);
                ResultSet result = stmt.executeQuery();
                
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
                PreparedStatement stmt = db.conn.prepareStatement(query);
                ResultSet result = stmt.executeQuery();
                
                System.out.println(result);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error to get category datas!"+e.toString());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_logo;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_subtitle;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JPanel jPanel_background;
    private javax.swing.JPanel jPanel_container;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_password;
    // End of variables declaration//GEN-END:variables
}
