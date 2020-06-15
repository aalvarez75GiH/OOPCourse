package JavaFiles;

public class uberP extends uberCar
{
 String brand;
 String model;

 public uberP(String license, Account driver,String brand, String model)
 {
     super(license, driver);
     this.brand = brand;
     this.model = model;
    
 }
 @Override
 void printDataCar() {
     super.printDataCar();
     System.out.println("Brand: " + this.brand + " " + "&" + " " + "Model: " + this.model);
 }
}