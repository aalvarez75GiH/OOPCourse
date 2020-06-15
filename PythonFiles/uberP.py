from uberCar import uberCar

class uberP(uberCar):
    brand = str
    model = str

    def __init__(self, license, driver, passengers, brand, model):
        uberCar.__init__(self,license,driver,passengers)
        self.brand = brand
        self.model = model
        def printDataUberP():
            print("-------------")
            print("Esto es uberP")
            print(self.driver.name)
            print(self.driver.email)
            print(self.driver.documentID)
            print(self.license)
            print(self.passengers)
            print(self.brand)
            print(self.model)
          
        printDataUberP()