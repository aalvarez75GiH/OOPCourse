<?php
require_once('uberCar.php');
class uberP extends uberCar 
{
    public $brand;
    public $model;
    
    public function __construct($license,$driver,$passengers,$brand,$model)
    {
        parent::__construct($license,$driver,$passengers);
        $this->$brand = $brand;
        $this->$model = $model;
    }

}

?>