from uberCar import uberCar

class uberB:
    typeCarAccepted = str
    seatsMaterial = str

    def __init__(self, license,driver,passengers, typeCarAccepted, seatsMaterial):
        super.__init__(license,driver,passengers)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial