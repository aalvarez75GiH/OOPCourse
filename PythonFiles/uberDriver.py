from account import Account

class uberDriver(Account):
    name = str
    documentID = str
    email = str
    def __init__(self,name,documentID,email):
        
        Account.__init__(self,name,documentID,email)
        self.name = name
        self.documentID = documentID
        self.email = email
        def printDataDriver():
            print("----------------")
            print("Esto es uberDriver")
            print(self.name)
            print(self.email)
            print(self.documentID)
        printDataDriver()
        
             

        
        

