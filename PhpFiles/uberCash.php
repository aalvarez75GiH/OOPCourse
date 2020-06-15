<?php
require_once('payment.php');

class uberCash extends payment 
{
    
    public function __construct($id)
    {
        parent::__construct($id);
        
    }
}

?>