
class uberCar
{
    
    constructor(license,driver,passengers)
    {
        this.license = license;
        this.driver = driver;
        this.passengers = passengers;
        
    }

    

  printDataCar()
    {
        console.log("Name: " + this.driver.name);
        console.log( "Email: " + this.driver.email);
        console.log("Id: " + this.driver.documentID);
        console.log("License: " + this.license);
        console.log("Passengers permited: " + this.passengers);
        
               
    }
}


 