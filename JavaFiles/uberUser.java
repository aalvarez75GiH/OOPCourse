package JavaFiles;
public class uberUser extends Account
{
 String name;
 String documentID;
 String email;
 public uberUser( String name, String documentID, String email)
 {
     super(name,documentID,email);
     this.name = name;
     this.documentID = documentID;
     this.email = email;
     
 }
 void printDataUser()
 {
     System.out.println("User Name: " + this.name + "  " + "ID: " + this.documentID + " " + "email: " + this.email); 
 }

}