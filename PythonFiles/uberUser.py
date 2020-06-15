from account import Account

class uberUser(Account):
    name = str
    documentID = str
    email = str
    def __init__(self,name,documentID,email):
        
        Account.__init__(self,name,documentID,email)
        self.name = name
        self.documentID = documentID
        self.email = email
        def printDataUser():
            print("----------------")
            print("Esto es uberUser")
            print(self.name)
            print(self.email)
            print(self.documentID)
        printDataUser()
        