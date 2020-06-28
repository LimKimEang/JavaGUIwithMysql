/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author MSI
 */
class user {
    private int sno;
    private String name,address,gender,knowledge,subject;
    
    public user(int sno, String name, String address,String gender,String knowledge,String subject){
        this.sno=sno;
        this.name=name;
        this.address=address;
        this.gender=gender;
        this.knowledge=knowledge;
        this.subject=subject;
    }
    public int getsno(){
        return sno;
    }
    public String getname(){
        return name;
    }
     public String getaddress(){
        return address;
    }
      public String getgender(){
        return gender;
    }
       public String getknowledge(){
        return knowledge;
    }
        public String getsubject(){
        return subject;
    }
}
