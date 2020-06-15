package JavaFiles;
public class Main
{
    public static void main(final String[] args) 
    {
        //Objects:
        uberDriver driver1 = new uberDriver("Arnoldo Alvarez", "652-64-2764", "arnoldo.alvarez@uberathens.com");
        uberDriver driver2 = new uberDriver("Kris Summers", "752-64-2764", "kris.summers@uberathens.com");
        uberP carrito1 = new uberP("AAS113",driver1,"Kia","Rio 5");
        uberB carrito2 = new uberB("KSS114",driver2);
        uberV van1 = new uberV("VAN123", driver1); 
        carrito1.setPassengers(4);
        carrito1.printDataCar();
        carrito2.setPassengers(4);
        carrito2.printDataCar();
        van1.setPassengers(5);
        van1.printDataCar();
        
        
    }

}