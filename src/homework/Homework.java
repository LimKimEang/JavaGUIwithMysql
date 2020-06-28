/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author MSI
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try{
           Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","eang","Nothinglovely123");
           
           Statement myStmt = myConn.createStatement();
           
           ResultSet myRs = myStmt.executeQuery("select * from student");
           while(myRs.next()){
               System.out.println(myRs.getString("id")+","+myRs.getString("name"));
           }
            
       }catch(Exception ex){
           ex.printStackTrace();
       }
    }
    
}
