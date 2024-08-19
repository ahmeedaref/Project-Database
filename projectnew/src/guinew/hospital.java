/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guinew;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohamed Aref
 */
public class hospital extends javax.swing.JFrame {

    
    
    
  DefaultTableModel model;
  Connection con;
  Statement stmt;
  ResultSet rs;
    public hospital() throws SQLException {
             initComponents();
        connecToSql();
    }

    
    
    
    
    
    
        public void connecToSql() throws SQLException{
      model=new DefaultTableModel();
      model.addColumn("id");
      model.addColumn("firstname");
      model.addColumn("lastname");
      model.addColumn("speclization"); 
      tabledoc.setModel(model);
      
      
       String path="jdbc:sqlserver://localhost:1433;databaseName=hospital"; 
        String user="ahmedaref";
        String pass="1234";
        try{
        con=DriverManager.getConnection(path, user, pass);
        stmt=con.createStatement();
        rs=stmt.executeQuery("select*from doctor");
        while(rs.next()){
            model.addRow(new Object[]{rs.getInt("doctor_id"),rs.getString("f_name"),rs.getString("l_name"),rs.getString("speclization")});
        }
        
            
        }catch(SQLException e){
          
            System.out.println("connection is field");
            
        }
        }
    @SuppressWarnings("unchecked")
    
    
    
    
 
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabledoctor = new javax.swing.JScrollPane();
        tabledoc = new javax.swing.JTable();
        Insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delet = new javax.swing.JButton();
        search = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IDinput = new javax.swing.JTextField();
        firstnameinput = new javax.swing.JTextField();
        lastnameinput = new javax.swing.JTextField();
        speclizationinput = new javax.swing.JTextField();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabledoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabledoctor.setViewportView(tabledoc);
        tabledoc.getAccessibleContext().setAccessibleDescription("");

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delet.setText("delet");
        delet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletActionPerformed(evt);
            }
        });

        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        firstname.setText("firstname");

        jLabel3.setText("lastname");

        jLabel4.setText("speclization");

        next.setText("next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabledoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Insert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(IDinput, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(firstnameinput, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(delet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search)
                        .addGap(18, 18, 18)
                        .addComponent(exit)
                        .addGap(18, 18, 18)
                        .addComponent(next))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lastnameinput, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(speclizationinput, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabledoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstname)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstnameinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speclizationinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert)
                    .addComponent(update)
                    .addComponent(delet)
                    .addComponent(search)
                    .addComponent(exit)
                    .addComponent(next))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
 
             int doctor_id=Integer.parseInt(IDinput.getText());
         String f_name=firstnameinput.getText();
         String l_name=lastnameinput.getText();
         String speclization=speclizationinput.getText(); 
         String query="insert into doctor values("+doctor_id +",'" +f_name +" ','"+l_name+ "','" +speclization +"')";
         
         try{
             
             stmt.executeUpdate(query);
             model.addRow(new Object[]{doctor_id,f_name,l_name,speclization});
             System.out.println("inserted");
             
         }catch(SQLException ex){
             
             Logger.getLogger(hospital.class.getName()).log(Level.SEVERE,null, ex);
              
             System.out.println("insert is fsild");
         }
        
        
        
        
    }//GEN-LAST:event_InsertActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        setVisible(false);
      try {
          new patient().show();
      } catch (SQLException ex) {
          Logger.getLogger(hospital.class.getName()).log(Level.SEVERE, null, ex);
      }


    }//GEN-LAST:event_nextActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
     int  doctor_id=Integer.parseInt(IDinput.getText());
      String f_name=firstnameinput.getText();
      String l_name=lastnameinput.getText();  
      String speclization=speclizationinput.getText();
      
            String sql="update doctor set [f_name]" + " ='"+ f_name + "',[l_name]='"+l_name+"'"
                    + ",[speclization]"+"='"+speclization+"'"+"where doctor_id ='"+doctor_id+"'";
            try {
                
                stmt.executeUpdate(sql);
                
                System.out.println("update is done");
                
            }catch(SQLException ex){
                
                System.out.println("update is faild");                
                
            }
            
    }//GEN-LAST:event_updateActionPerformed

    private void deletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletActionPerformed
        // TODO add your handling code here:
        
   int id=Integer.parseInt(IDinput.getText());
    try{
        
        
        stmt.executeUpdate("delete from doctor where doctor_id="+id);
        
        System.out.println("delete is done");
    }catch(SQLException ex){
        Logger.getLogger(hospital.class.getName()).log(Level.SEVERE, null,ex);
        System.out.println("delete is faild");
    }
    model.removeRow(id);
  
        
        
          
    }//GEN-LAST:event_deletActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

        String doctor_id=IDinput.getText();
        String query="select*from doctor where doctor_id='"+doctor_id+"'";
        try{
            rs=stmt.executeQuery(query);
            int countl=model.getRowCount();
            for(int i=0;i<countl;i++){
                model.removeRow(0);
            }
            while(rs.next()){
            model.addRow(new Object[]{rs.getInt("doctor_id"),rs.getString("f_name"),rs.getString("l_name"),rs.getString("speclization")});
                System.out.println("searched is done ");
            }
            
        }catch(SQLException ex){
             
                    System.out.println("search is faild");
                    
             } 
        
        
    }//GEN-LAST:event_searchActionPerformed

    
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
            java.util.logging.Logger.getLogger(hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new hospital().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(hospital.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDinput;
    private javax.swing.JButton Insert;
    private javax.swing.JButton delet;
    private javax.swing.JButton exit;
    private javax.swing.JLabel firstname;
    private javax.swing.JTextField firstnameinput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField lastnameinput;
    private javax.swing.JButton next;
    private javax.swing.JButton search;
    private javax.swing.JTextField speclizationinput;
    private javax.swing.JTable tabledoc;
    private javax.swing.JScrollPane tabledoctor;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private void showMessageDialog(Object object, String data_Deleted_successfully) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
