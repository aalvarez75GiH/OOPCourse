<?php
class uberUser extends account
{
    public function __construct($name,$documentID,$email)
    {
        parent::__construct($name,$documentID,$email);
        
    }
    public function printDataUser()
    {
        echo "<p>Driver Name: ".$this->name."</p>";
        echo "<p>Driver Name: ".$this->documentID."</p>";
        echo "<p>Driver Name: ".$this->email."</p>";
        
        
    }
}

?>


 