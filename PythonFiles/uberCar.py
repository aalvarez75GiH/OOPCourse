from account import Account

class uberCar:
    id = int
    license = str
    driver = Account
    passengers = int     
    
    def __init__(self, license, driver, passengers):
        
        self.license = license
        self.driver = driver
        self.__passengers = passengers 