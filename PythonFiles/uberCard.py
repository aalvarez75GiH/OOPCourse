from payment import Payment

class uberCard(Payment):
    number = int
    cvv = int
    date = str
    
    def __init__(self,number,cvv,date):
        super.__init__(id)
        self.number
        self.cvv
        self.date
        
        