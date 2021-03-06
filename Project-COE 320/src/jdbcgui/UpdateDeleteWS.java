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

/**
 *
 * @author amir
 */
public class UpdateDeleteWS extends javax.swing.JFrame {

    
    String DBURL = "jdbc:oracle:thin:@coeoracle.aus.edu:1521:orcl";
    String DBUSER = "b00074559";
    String DBPASS = "b00074559";

    Connection con;
    Statement statement;
    //Statement statement2;
    PreparedStatement prepStatement;
    ResultSet rs;
    //ResultSet rsdeptno;
    /**
     * Creates new form UpdateDeleteWS
     */
    public UpdateDeleteWS() {
        initComponents();
        this.setLocationRelativeTo(null);
          
        try 
        {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Connect to Oracle Database
            con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            // make the result set scrolable forward/backward updatable
            statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //statement2 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            getNewData();
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Connection error.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
        }  
          
          
    }
    
    
    private void getNewData() {

        try 
        {
            String str;
           
            rs = statement.executeQuery("SELECT watch_id, watchname,price FROM watch_stock ORDER BY watch_id ASC ");


            // populate rest of fields
            rs.beforeFirst();
            rs.first();
            populateFields();
        } 
        catch (SQLException e) 
        {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Cant load table.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    
    private void populateFields() {
        try {
            jTextField1.setText(rs.getString("watch_id"));
            jTextField2.setText(rs.getString("watchname"));
            jTextField3.setText(rs.getString("price"));
            //cmbMgr.setSelectedItem(rs.getString("mgr"));
            //jTextField4.setText(rs.getString("quantity"));

            EnableDisableButtons();
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void EnableDisableButtons() {
        try 
        {
            if (rs.isFirst()) {
                jButton1.setEnabled(false);
            } else {
                jButton1.setEnabled(true);
            }
            if (rs.isLast()) {
                jButton4.setEnabled(false);
            } else {
                jButton4.setEnabled(true);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(UpdateDeleteEmployee.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabelWSTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelWSTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabelWSTitle.setText("Update/Delete Watch Stock");

        jLabel1.setText("Watch ID");

        jLabel2.setText("Watch Name");

        jLabel3.setText("Price");

        jLabel5.setText(".");

        jLabel6.setText(".");

        jLabel7.setText(".");

        jButton1.setText("<<Previous");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Next>>");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(2, 2, 2)))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelWSTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelWSTitle)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try {
           // confirmation
            int value = JOptionPane.showConfirmDialog(this, "Do you confirm to update Watch?");
                if (value == 0) 
                {
                    if (isValidData()) 
                    {
                        prepStatement = con.prepareStatement("UPDATE watch_stock SET  watchname = ?, price = ? WHERE watch_id = ?");
                        
                        prepStatement.setString(1, jTextField2.getText());
                        prepStatement.setInt(2, Integer.parseInt(jTextField3.getText()));
                        
                        
                        prepStatement.setInt(3, Integer.parseInt(jTextField1.getText()));
                        
                        int result = prepStatement.executeUpdate();
                       
                            if (result > 0) 
                            {
                                javax.swing.JLabel label = new javax.swing.JLabel("Watch ID " + jTextField1.getText() + " updated successfully.");
                                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                                getNewData();
                            } 
                            else 
                            {
                                // Error 1
                                JOptionPane.showMessageDialog(null, "Can't update Watch");
                            }
                        prepStatement.close();
                    } 
                    else 
                    {
                        javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                        JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
                    }

                } 
                else 
                {
                    //Error 2
                    JOptionPane.showMessageDialog(null, "Error 2" );
                }
            } 
            catch (SQLException e) 
            {
                JOptionPane.showMessageDialog(null, "Error updating Watch." + e.getMessage());
            }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        // confirmation
        int value = JOptionPane.showConfirmDialog(this, "Do you confirm to delete Watch Stock?");
        if (value == 0) 
        {
                    try {

//                            prepStatement = con.prepareStatement("select * from buys_from2 WHERE wat_id = ?");
//                            prepStatement.setInt(1, Integer.parseInt(jTextField1.getText()));
//                            int result = prepStatement.executeUpdate();
//                        
//                            if(result>0)
//                            {
//                                prepStatement = con.prepareStatement("DELETE buys_from2 WHERE wat_id = ?");
//                                prepStatement.setInt(1, Integer.parseInt(jTextField1.getText()));
//                                result = prepStatement.executeUpdate();
//                                
//                            }
                            
                            //old lab way
                            prepStatement = con.prepareStatement("DELETE watch_stock WHERE watch_id = ?");
                            prepStatement.setInt(1, Integer.parseInt(jTextField1.getText()));
                            int result = prepStatement.executeUpdate();
                        
                            //new lab way
                            //String prepSQL = "DELETE customers WHERE ssn = " + jTextField1.getText();
                            //int result = dbCon.executePrepared(prepSQL);
                            if (result > 0) 
                            {
                                javax.swing.JLabel label = new javax.swing.JLabel("Watch ID " + jTextField1.getText().trim() + " deleted successfully.");
                                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                                getNewData();
                            }
                         } 
                            catch (SQLException e) 
                            {
                                JOptionPane.showMessageDialog(null, "Error deleting customer.");
                            }
            }  
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MoveNext();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void MoveNext() {
        try {
            if (!rs.isLast()) 
            {
                rs.next();
                populateFields();
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(UpdateDeleteEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MovePrevious();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MovePrevious() {
        try 
        {

            if (!rs.isFirst()) 
            {
                rs.previous();
                populateFields();
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(UpdateDeleteEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    boolean isValidData() {

        clearErrorLabels();
        boolean result = true;
        if (jTextField1.getText().trim().isEmpty() || !isInteger(jTextField1.getText())) 
        {
            if (jTextField1.getText().trim().isEmpty()) 
            {
                jLabel5.setText("Invalid. Cannot be empty.");
            } 
            else if (!isInteger(jTextField1.getText())) 
            {
                jLabel5.setText("Invalid. Must be integer.");
            } 

            jLabel5.setVisible(true);
            result = false;
        }

        
            if (jTextField2.getText().trim().isEmpty()) 
            {
                jLabel6.setText("Invalid. Cannot be empty.");
          
            jLabel6.setVisible(true);
            result = false;
            }
        
      
            if (jTextField3.getText().trim().isEmpty()) 
            {
                jLabel7.setText("Invalid. Cannot be empty.");

                jLabel7.setVisible(true);
                result = false;
            }
        
        
            

        return result;
        
    }
    
    void clearErrorLabels() {
        
        jLabel5.setText("");
        jLabel5.setVisible(false);
        jLabel6.setText("");
        jLabel6.setVisible(false);
        jLabel7.setText("");
        jLabel7.setVisible(false);
        

    }
    
    
    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
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
            java.util.logging.Logger.getLogger(UpdateDeleteWS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteWS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteWS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteWS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeleteWS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelWSTitle;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
