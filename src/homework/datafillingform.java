/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author MSI
 */
public class datafillingform extends javax.swing.JFrame {

   Connection con=null;
   PreparedStatement prestmt =null;
   ResultSet rs=null;
   String gender;
   
    public datafillingform() {
        initComponents();
        show_student();
    }
    public ArrayList<user> student(){
        ArrayList<user> student = new ArrayList<>();
        try{
         //   Class.forName("com.mysqlsever.jdbc.Driver").newInstance();
           // String url="jdbc:mysql://localhost:3306;databaseName=demo;user=eang;password=Nothinglovely123";
           // Connection con=DriverManager.getConnection(url);
             Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","eang","Nothinglovely123");
            String query1="SELECT * FROM student1";
            Statement st = myConn.createStatement();
            ResultSet rs = st.executeQuery(query1);
            user Student;
            
            while(rs.next()){
                Student=new user(rs.getInt("sno"),rs.getString("name"),rs.getString("address"),rs.getString("gender"),rs.getString("knowledge")
                                    ,rs.getString("subject"));
                student.add(Student);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return student;
    }
    public void show_student(){
        ArrayList<user> list = student();
        DefaultTableModel model = (DefaultTableModel )jTable_Display_Student.getModel();
        Object[] row = new Object[6];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getsno();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).getaddress();
            row[3]=list.get(i).getgender();
            row[4]=list.get(i).getknowledge();
            row[5]=list.get(i).getsubject();
            model.addRow(row);
        }
    }
    
     public void refreshTable() {
        DefaultTableModel dm = (DefaultTableModel) jTable_Display_Student.getModel();
        dm.setRowCount(0);
        show_student();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        boxsubject = new javax.swing.JComboBox<>();
        btninsert = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        cbjava = new javax.swing.JCheckBox();
        cbphython = new javax.swing.JCheckBox();
        cbC = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Student = new javax.swing.JTable();
        btnmale = new javax.swing.JRadioButton();
        btnfemale = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Address");

        jLabel3.setText("Gender");

        jLabel4.setText("Knowledge");

        jLabel5.setText("Subject");

        boxsubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "IT-Enginering" }));

        btninsert.setText("Insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        cbjava.setText("Java");

        cbphython.setText("Phython");

        cbC.setText("C++");

        jTable_Display_Student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sno", "Name", "Address", "Gender", "Knowledge", "Subject"
            }
        ));
        jTable_Display_Student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_StudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_Student);

        buttonGroup1.add(btnmale);
        btnmale.setText("Male");

        buttonGroup1.add(btnfemale);
        btnfemale.setText("Female");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtname)
                                        .addComponent(txtaddress)
                                        .addComponent(boxsubject, 0, 231, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbjava, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbphython)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbC))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnmale)
                                .addGap(36, 36, 36)
                                .addComponent(btnfemale))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnmale)
                            .addComponent(btnfemale))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbjava)
                            .addComponent(cbphython)
                            .addComponent(cbC))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(boxsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btninsert)
                            .addComponent(btndelete)
                            .addComponent(btnupdate)
                            .addComponent(btnClear)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
          try{
              Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","eang","Nothinglovely123");
              int row = jTable_Display_Student.getSelectedRow();
              String value = (jTable_Display_Student.getModel().getValueAt(row, 0).toString());
              
              //SQL Update statement
              String query = "UPDATE student1 SET name=?,address=?,gender=?,knowledge=?,subject=? where sno="+value;
           prestmt = con.prepareStatement(query);
           prestmt.setString( 1,txtname.getText()); //getText() not getName()
           prestmt.setString( 2,txtaddress.getText());
           if(btnmale.isSelected()){
               gender="Male";
           }
           if(btnfemale.isSelected()){
               gender="Female";
           }
           prestmt.setString(3, gender);
           
           String knowledge="";
           if(cbjava.isSelected()){
               knowledge+="Java ";
           }
           if(cbphython.isSelected()){
               knowledge+="Phython ";
           }
           if(cbC.isSelected()){
                knowledge+="C++ ";
           }
           prestmt.setString(4, knowledge);
           
           String Course;
           Course=boxsubject.getSelectedItem().toString();
           prestmt.setString(5, Course);
           prestmt.setString(6, value);
           prestmt.executeUpdate();
           refreshTable();
           DefaultTableModel model =(DefaultTableModel)jTable_Display_Student.getModel();
           model.setRowCount(0);
           show_student();
           JOptionPane.showMessageDialog(null, "Update Successfully");
         
        }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
       }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       try {
            
             Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","eang","Nothinglovely123");
            int row = jTable_Display_Student.getSelectedRow();
            String value = (jTable_Display_Student.getModel().getValueAt(row,0).toString());
            String query = "DELETE students where sno = ?";
            PreparedStatement pst = myConn.prepareCall(query);
            pst.setString(1, value);
            pst.executeUpdate();
            refreshTable();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot Update: Bad Database");
            System.out.print(ex);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
       
        try{
           con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","eang","Nothinglovely123");
           String query = "INSERT INTO student1 (name,address,gender,knowledge,subject) VALUES(?,?,?,?,?)";
                  
                  
    
           prestmt = con.prepareStatement(query);
           prestmt.setString( 1,txtname.getText()); //getText() not getName()
           prestmt.setString( 2,txtaddress.getText());
           if(btnmale.isSelected()){
               gender="Male";
           }
           if(btnfemale.isSelected()){
               gender="Female";
           }
           prestmt.setString(3, gender);
           
           String knowledge="";
           if(cbjava.isSelected()){
               knowledge+=cbjava.getText()+" ";
           }
           if(cbphython.isSelected()){
               knowledge+=cbphython.getText()+" ";
           }
           if(cbC.isSelected()){
               knowledge+=cbC.getText()+" ";
           }
           prestmt.setString(4, knowledge);
           
           String Course;
           Course=boxsubject.getSelectedItem().toString();
           prestmt.setString(5, Course);
           prestmt.executeUpdate();
           DefaultTableModel model =(DefaultTableModel)jTable_Display_Student.getModel();
           model.setRowCount(0);
           show_student();
           JOptionPane.showMessageDialog(null, "Insert Successfully");
          
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
       }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtname.setText("");
        txtaddress.setText("");
        buttonGroup1.clearSelection();
        boxsubject.setSelectedIndex(0);
        cbjava.setSelected(false);
        cbphython.setSelected(false);
        cbC.setSelected(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void jTable_Display_StudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_StudentMouseClicked
        int i = jTable_Display_Student.getSelectedRow();
        
        // Create Object called model
        TableModel model =jTable_Display_Student.getModel();
        txtname.setText(model.getValueAt(i, 1).toString());
        txtaddress.setText(model.getValueAt(i, 2).toString());
        
        String gender = model.getValueAt(i, 3).toString();
            if(gender.equals("Male")){
                btnmale.setSelected(true);
            }
            else{
                btnfemale.setSelected(true);
            }
            
        String knowledge = model.getValueAt(i, 4).toString();
            if(knowledge.equals("Java")){
                cbjava.setSelected(true);
            }
            if(knowledge.equals("Phython")){
                cbphython.setSelected(true);
            }
            if(knowledge.equals("C++")){
                cbC.setSelected(true);
            }
           
         String Course = model.getValueAt(i, 5).toString();
                switch(Course){
                    case "Computer Science":
                       boxsubject.setSelectedIndex(0);
                        break;
                    case " IT-Enginering":
                        boxsubject.setSelectedIndex(1);
                }
        
    }//GEN-LAST:event_jTable_Display_StudentMouseClicked

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
            java.util.logging.Logger.getLogger(datafillingform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datafillingform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datafillingform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datafillingform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datafillingform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxsubject;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btndelete;
    private javax.swing.JRadioButton btnfemale;
    private javax.swing.JButton btninsert;
    private javax.swing.JRadioButton btnmale;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox cbC;
    private javax.swing.JCheckBox cbjava;
    private javax.swing.JCheckBox cbphython;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_Student;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables

   
}
