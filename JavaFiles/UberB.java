package JavaFiles;

class uberB extends uberCar
{
    String license;
    Account driver;
    
    

 public uberB(String license, Account driver)
 {
     super(license, driver);
     this.license = license;
     this.driver = driver;

 }  
 @Override
 void printDataCar() {
     super.printDataCar();
 }
}