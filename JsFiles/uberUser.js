
class uberUser extends account
{
    constructor(name, documentID,email)
    {
        super(name,documentID,email)
               
    }
    printDataUser()
    {
        console.log("Name: " + this.name);
        console.log( "Id: " + this.documentID);
        console.log("email: " + this.email);
                  
    }
}



