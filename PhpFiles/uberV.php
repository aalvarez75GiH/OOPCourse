<?php
require_once('uberCar.php');
class uberV extends uberCar 
{
    
    public $typeCarAccepted;
    public $seatsMaterial;
    
    public function __construct($license,$driver,$passengers,$typeCarAccepted, $seatsMaterial)
    {
        parent::__construct($license,$driver,$passengers);
        $this->$typeCarAccepted = $typeCarAccepted;
        $this->$seatsMaterial = $seatsMaterial;
    }
}
?>