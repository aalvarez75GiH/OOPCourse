package JavaFiles;
//import java.util.ArrayList;
//import java.util.Map;

class uberV extends uberCar {
    /*Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;*/
    String license;
    Account driver;
    private Integer passengers;
    
    public uberV(String license,Account driver) {
        super(license, driver);
        this.license = license;
        this.driver = driver;
    }

    /*public uberV(final String license, final Account driver, final Map<String, Map<String, Integer>> typeCarAccepted,
            final ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }*/

   @Override
   public void setPassengers(Integer passengers) {
        if(passengers == 6){
           this.passengers = passengers;
           System.out.println("Seats setted to: " + this.passengers + " " + "for this UberV Van");
    }else{
        this.passengers = passengers;
        if (this.passengers != 6)
        {
            System.out.println("You have assigned " + this.passengers + " " + "seats, and that's not permitted");    
            System.out.println("so we are going to re-assign to 6 seats automatically..."); 
            this.passengers = 6;
        }
    }
}

    @Override
    void printDataCar() {
        System.out.println("passengers in PDC UberVan: " + this.passengers);
        if (this.passengers != 0) {
            System.out.println("Driver Name: " + driver.name + "  " + "email: " + driver.email + " " + "Id: " + driver.documentID + " " + "License: " + this.license + " " + "Passengers permitted: " + this.passengers);
        }
    }
    
}