from uberCar import uberCar

class uberX(uberCar):
    brand = str
    model = str
    def __init__(self, license, driver, passengers, brand, model):
        uberCar.__init__(self,license,driver,passengers)
        self.brand = brand
        self.model = model

        def printDataUberX():
            print("-------------")
            print("Esto es uberX")
            print(self.driver.name)
            print(self.driver.email)
            print(self.driver.documentID)
            print(self.license)
            print(self.passengers)
            print(self.brand)
            print(self.model)
             
        printDataUberX()