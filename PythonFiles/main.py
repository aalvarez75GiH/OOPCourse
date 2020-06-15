from account import Account
from uberCar import uberCar
from uberDriver import uberDriver
from uberUser import uberUser
from uberX import uberX
from uberP import uberP

if __name__== "__main__":
    driver1 = uberDriver("Arnoldo Alvarez","652-64-2764","arnoldo.alvarez@uberathens.com")
    driver2 = uberDriver("Kris Summers","752-64-2764","kris.summers@uberathens.com")
    uber1 = uberX("AAS113",driver1,4,"Kia","Rio 5")
    uber2 = uberP("KSS114",driver2,4,"Ford","Fussion")
    
    #driver3 = uberDriver("Race Els","852-64-2764","race.els@check.com")
    #user1 = uberUser("Loreli Els","952-64-2764","loreli.els@check.com")
    
     


