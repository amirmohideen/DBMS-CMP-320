/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcgui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AddLoginUser extends javax.swing.JFrame {

   
    String DBURL = "jdbc:oracle:thin:@coeoracle.aus.edu:1521:orcl";
    String DBUSER = "b00074559";
    String DBPASS = "b00074559";

    Connection con;
    Statement statement;
    PreparedStatement prepStatement;
    ResultSet rs;
    
    
    public AddLoginUser() {
        initComponents();
         // center form in screen 
        this.setLocationRelativeTo(null);
        // set all error labels to invisible
        lblUsernameError.setVisible(false);
        lblPasswordError.setVisible(false);
        lblPasswordConfError.setVisible(false);
        lblNameError.setVisible(false);
       //populate type combo boxes 
        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Connect to Oracle Database
            con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            // make the result set scrolable forward/backward updatable
            statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            // populate valid type numbers 
            rs = statement.executeQuery("SELECT Type FROM loginusers order by Type");
            // populate type combo box
            while (rs.next()) {
                boxType.addItem(rs.getString("Type"));
            }
            
            rs.close();
            statement.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsernameError1 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtPasswordConfirm = new javax.swing.JPasswordField();
        txtName = new javax.swing.JTextField();
        btnAddUser = new javax.swing.JButton();
        lblUsernameError = new javax.swing.JLabel();
        boxType = new javax.swing.JComboBox<>();
        lblPasswordError = new javax.swing.JLabel();
        lblPasswordConfError = new javax.swing.JLabel();
        lblNameError = new javax.swing.JLabel();

        lblUsernameError1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblUsernameError1.setForeground(new java.awt.Color(255, 0, 0));
        lblUsernameError1.setText("error label");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Title.setText("Add New Login User");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Confirm Password:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Type:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnAddUser.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddUser.setText("Add New");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        lblUsernameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblUsernameError.setForeground(new java.awt.Color(255, 0, 0));
        lblUsernameError.setText("error label");

        boxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTypeActionPerformed(evt);
            }
        });

        lblPasswordError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        lblPasswordError.setText("error label");

        lblPasswordConfError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblPasswordConfError.setForeground(new java.awt.Color(255, 0, 0));
        lblPasswordConfError.setText("error label");

        lblNameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblNameError.setText("error label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(Title))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(txtUsername)
                                    .addComponent(txtPasswordConfirm))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsernameError, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(lblPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(lblPasswordConfError, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(lblNameError, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddUser)
                                    .addComponent(boxType, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsernameError))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasswordError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasswordConfError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(boxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnAddUser)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void boxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTypeActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
         try {
            // make the result set scrolable forward/backward updatable
            statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
// insert user into database
            if (isValidData()) {
                prepStatement = con.prepareStatement("INSERT INTO loginusers (username, password, name, type ) VALUES ( ? , ?, ?, ?)");
                prepStatement.setString(1,  txtUsername.getText());
                prepStatement.setString(2, txtPassword.getText());
                prepStatement.setString(3, txtName.getText());
                prepStatement.setInt(4, Integer.parseInt(boxType.getSelectedItem().toString()));
                int result = prepStatement.executeUpdate();
                if (result > 0) {

                    javax.swing.JLabel label = new javax.swing.JLabel("New Login User added successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    clearInputBoxes();
                } else {
                    // check validation errors 
                }

                rs.close();
                statement.close();
                prepStatement.close();
            } else {

                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new Login User.");
        }
    }//GEN-LAST:event_btnAddUserActionPerformed

    void clearErrorLabels() {
        lblNameError.setText("");
        lblUsernameError.setVisible(false);
        lblPasswordError.setText("");
        lblPasswordConfError.setVisible(false);
    
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
            java.util.logging.Logger.getLogger(AddLoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLoginUser().setVisible(true);
            }
        });
    }

     boolean isValidData() {

        clearErrorLabels();
        boolean result = true;
        int result1=1;
        try {
            // checks if username already exist
            prepStatement = con.prepareStatement("Select * from loginusers WHERE username = ?");
               prepStatement.setString(1, (txtUsername.getText().trim()));
                 result1 = prepStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddLoginUser.class.getName()).log(Level.SEVERE, null, ex);
        }
                

        if (txtUsername.getText().trim().isEmpty() || (txtUsername.getText().trim().length() > 25 ) || result1>0) {
            if (txtUsername.getText().trim().isEmpty()) {
                lblUsernameError.setText("Invalid. Cannot be empty.");
            } else if (txtUsername.getText().trim().length() > 25) {
                lblUsernameError.setText("Invalid. Must be < 25 chars.");
            } else if(result1>0){
              lblUsernameError.setText("Invalid. username exists");

            }

            lblUsernameError.setVisible(true);
            result = false;
        }

        if (txtPassword.getText().trim().isEmpty() || (txtPassword.getText().trim().length() > 25)) {
            if (txtPassword.getText().trim().isEmpty()) {
                lblPasswordError.setText("Invalid. Cannot be empty.");
            } else if ((txtPassword.getText().trim().length() > 25)) {
                lblPasswordError.setText("Invalid. Must be < 25 chars.");
            }

            lblPasswordError.setVisible(true);
            result = false;
        }
        // checks if passwords are the same
if (txtPasswordConfirm.getText().trim().isEmpty() || (txtPasswordConfirm.getText().trim().length() > 25) || !(txtPassword.getText().trim().equals(txtPasswordConfirm.getText().trim()))) {
            if (txtPasswordConfirm.getText().trim().isEmpty()) {
                lblPasswordConfError.setText("Invalid. Cannot be empty.");
            } else if ((txtPasswordConfirm.getText().trim().length() > 25)) {
                lblPasswordConfError.setText("Invalid. Must be < 25 chars.");
            } else if( !(txtPassword.getText().trim().equals(txtPasswordConfirm.getText().trim()))){
             lblPasswordConfError.setText("Invalid. Password doesn't match.");

            }
            
            lblPasswordConfError.setVisible(true);
            result = false;
        }

        if (txtName.getText().trim().isEmpty() || (txtName.getText().trim().length() > 25)) {
            if (txtName.getText().trim().isEmpty()) {
                lblNameError.setText("Invalid. Cannot be empty.");
            } else if (txtName.getText().trim().length() > 25) {
                lblNameError.setText("Invalid. Must be < 25 chars.");
            }
            lblNameError.setVisible(true);
            result = false;
        }

        return result;
    }

    void clearInputBoxes() {
        txtUsername.setText("");
        txtPassword.setText("");
        txtPasswordConfirm.setText("");
        txtName.setText("");
        boxType.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JComboBox<String> boxType;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPasswordConfError;
    private javax.swing.JLabel lblPasswordError;
    private javax.swing.JLabel lblUsernameError;
    private javax.swing.JLabel lblUsernameError1;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordConfirm;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
