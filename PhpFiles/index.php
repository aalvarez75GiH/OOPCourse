<?php
require_once('uberCar.php');
require_once('uberX.php');
require_once('account.php');
require_once('uberDriver.php');
require_once('uberUser.php');


$driver1 = new uberDriver("Arnoldo Alvarez","652-64-2764","arnoldo.alvarez@uberathens.com");
$driver2 = new uberDriver("Kris Summers","752-64-2764","kris.summers@uberathens.com");
$driver3 = new uberDriver("Race Els","852-64-2764","race.eals@uberathens.com");
$user1 = new uberUser("Loreli Els","952-64-2764","loreli.eals@uberathens.com");

$uber1 = new uberX("AAS113", $driver1,7,"Kia","Rio");
$uber2 = new uberX("KSS114", $driver2,1,"Ford","Scala");
$uber1->setPassengers(8);
$uber2->setPassengers(9);
$uber1->printDataCar();
$uber2->printDataCar();
//$driver1->printDataDriver();
//$driver2->printDataDriver();
//$driver3->printDataDriver();
//$user1->printDataUser();



?>


