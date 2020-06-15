<?php
class account {
 
 public $id;
 public $name;
 public $documentID;
 public $email;
 public $password;
 
 public function __construct($name,$documentID,$email)
 {
     $this->name = $name;
     $this->documentID = $documentID;
     $this->email = $email;
     
 }

}




?>