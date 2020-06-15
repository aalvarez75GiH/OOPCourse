<?php
require_once("account.php");

class uberCar 
{
    public $license;
    public $driver;
    public $passengers;

    public function __construct($license,$driver,$passengers)
    {
        $this->license = $license;
        $this->driver = $driver;
        $this->passengers = 2;
    }
    public function printDataCar()
    {
        
        echo "<p>Driver Name: ".$this->driver->name."</p>";
        echo "<p>Email: ".$this->driver->email."</p>";
        echo "<p>License: ".$this->license."</p>";
        echo "<p>Passengers Permited: ".$this->getPassengers()."</p>";
        
    }

    public function setPassengers($new_passengers)
    {
        $this->$passengers = $new_passengers;
    }
    public function getPassengers()
    {
        return $this->$new_passengers;
    }
}
?>