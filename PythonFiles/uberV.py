from uberCar import uberCar

class uberV:
    typeCarAccepted = []
    seatsMaterial = []

    def __init__(self, license,driver,passengers, typeCarAccepted, seatsMaterial):
        super.__init__(license,driver,passengers)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial