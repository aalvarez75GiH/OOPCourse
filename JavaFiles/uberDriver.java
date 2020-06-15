package JavaFiles;

public class uberDriver extends Account
{
 String name;
 String documentID;
 String email;
 public uberDriver( String name, String documentID, String email)
 {
     super(name,documentID,email);
     this.name = name;
     this.documentID = documentID;
     this.email = email;
     
 }
 
 void printDataDriver()
 {
     System.out.println("Driver Name: " + this.name + "  " + "ID: " + this.documentID + " " + "email: " + this.email); 
        
 }
}