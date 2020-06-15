<?php
require_once('account.php');
class uberDriver extends account
{
    public $name;
    public $documentID;
    public $email;
    public function __construct($name,$documentID,$email)
    {
        parent::__construct($name,$documentID,$email);
        $this->$name = $name;
        $this->$documentID = $documentID;
        $this->$email = $email;
    }
    public function printDataDriver()
    {
        echo "<p>Driver Name: ".$this->name."</p>";
        echo "<p>Driver Name: ".$this->documentID."</p>";
        echo "<p>Driver Name: ".$this->email."</p>";
        
        
    }
    
}

?>