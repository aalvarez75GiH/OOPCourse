package JavaFiles;

public class uberCar {
    
    private String license;
    private Account driver;
    private int passengers;

    public uberCar(String license, Account driver) {
        this.license = license;
        this.driver = driver;

    }

    void printDataCar() {
        System.out.println("passengers in PDC UberCar: " + passengers);
        if (passengers != 0) {
            System.out.println("Driver Name: " + driver.name + "  " + "email: " + driver.email + " " + "Id: " + driver.documentID + " " + "License: " + license + " " + "Passengers permitted: " + getPassengers());
        }
            
    }

    public void setPassengers(Integer passengers) 
    {
        if (passengers == 4) {
            System.out.println("Seats setted to: " + passengers + " " + "for this UberX/UberPool/UberBlack Car");
            this.passengers = passengers;
        }else
        {
            if (passengers != 4) {
                System.out.println("This is not an UberX,UberPool nor an Uber Black, we will set your number of seats to 4");
                this.passengers = 4;
            }
        } 
 }

    public Integer getPassengers() {
        return this.passengers;
    }

    /*public Account getId() {
        return id;
    }

    public void setId(Account id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }*/

    
}
