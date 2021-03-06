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
import javax.swing.JOptionPane;

/**
 *
 * @author amir
 */
public class AddWS extends javax.swing.JFrame {

    
    String DBURL = "jdbc:oracle:thin:@coeoracle.aus.edu:1521:orcl";
    String DBUSER = "b00074559";
    String DBPASS = "b00074559";

    Connection con;
    Statement statement;
    PreparedStatement prepStatement;
    ResultSet rs;
    
    
    /** Creates new form AddWS */
    public AddWS() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        
        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Connect to Oracle Database
            con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            // make the result set scrolable forward/backward updatable
            statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            // populate valid mgr numbers 
            rs = statement.executeQuery("SELECT store_num FROM stores ORDER BY store_num ASC");

//            jComboBox1.addItem("0");
//             // populate mgr combo box
//            while (rs.next()) {
//                jComboBox1.addItem(rs.getString("store_num"));
//            }

            rs.close();
            statement.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Watch ID");

        jLabel2.setText("Watch Name");

        jLabel3.setText("Price");

        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText(".");

        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText(".");

        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText(".");

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel9.setText("Add Watch");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButton1)))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 137, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try 
        {
            // make the result set scrolable forward/backward updatable
            statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            if (isValidData()) 
            {
                prepStatement = con.prepareStatement("INSERT INTO watch_stock (watch_id, watchname, price) VALUES ( ?, ? , ?)");
                prepStatement.setInt(1, Integer.parseInt(jTextField1.getText()));
                prepStatement.setString(2, jTextField2.getText());
                prepStatement.setInt(3, Integer.parseInt(jTextField3.getText()));
                //prepStatement.setInt(4, Integer.parseInt(jTextField4.getText()));
               
              
                int result = prepStatement.executeUpdate();
                if (result > 0) 
                {

                    javax.swing.JLabel label = new javax.swing.JLabel("New watch added successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    //clearInputBoxes();
                } 
                else 
                {
                    //errors 
                    javax.swing.JLabel label = new javax.swing.JLabel("New watch was not added!");   
                }

//                if(jComboBox1.getSelectedItem().toString() != "0")
//                    {
//                        prepStatement = con.prepareStatement("INSERT INTO contains ( st_num, w_id) VALUES (? , ?)");
//                        
//                        prepStatement.setInt(1, Integer.parseInt(jComboBox1.getSelectedItem().toString()));
//                        prepStatement.setInt(2, Integer.parseInt(jTextField1.getText()));
//
//                        result = prepStatement.executeUpdate();
//                        if (result > 0) 
//                        {
//                            javax.swing.JLabel label = new javax.swing.JLabel("customer linked to store successfully.");
//                        }
//                        else
//                        {
//                            javax.swing.JLabel label = new javax.swing.JLabel("customer was not linked to store!");
//                        }
//                    
//                        
//                    }
                   
                    clearInputBoxes();
                
                rs.close();
                statement.close();
                prepStatement.close();
            } 
            else 
            {

                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);

            }

        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error adding new store.");
        }
   
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
    
    public boolean isInteger(String s) {
        try {
                Integer.parseInt(s);
                return true;
            } 
        catch (NumberFormatException ex) 
        {
            return false;
        }
    }
    
    void clearErrorLabels() {
        
        jLabel5.setText("");
        jLabel5.setVisible(false);
        jLabel6.setText("");
        jLabel6.setVisible(false);
        jLabel7.setText("");
        jLabel7.setVisible(false);
      
        
    }
    
    void clearInputBoxes() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
      
        
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
            java.util.logging.Logger.getLogger(AddWS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddWS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddWS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddWS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddWS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
