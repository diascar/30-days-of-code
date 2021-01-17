# Day 12

class Person():
    def __init__(self, firstName, lastName, idNumber, scores):
        self.firstName = firstName
        self.lastName = lastName
        self.idNumber = idNumber
    
    def printPerson(self):
        print("Name:", self.lastName + ",", self.firstName)
        print("ID:", self.idNumber)


class Student(Person):
    def __init__(self, firstName, lastName, idNumber, scores):
        super().__init__(firstName, lastName, idNumber)
        #alternatively
        # Person.__init__(self, firstName, lastName, idNumber)
        self.scores = scores
    
    def calculate(self):
        avg_grade = sum(self.scores)/len(self.scores)
        if avg_grade >= 90 and avg_grade <= 100:
            return "O"
        elif avg_grade >= 80 and avg_grade < 90:
            return "E"
        elif avg_grade >= 70 and avg_grade < 80:
            return "A"
        elif avg_grade >= 55 and avg_grade < 70:
            return "P"
        elif avg_grade >= 40 and avg_grade <55:
            return "D"
        else:
            return "T"
    

