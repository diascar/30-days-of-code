

class Person():
    def __init__(self, initialAge):
        if initialAge >= 0:
            self.age = initialAge
        else:
            self.age = 0
            print("Age is not valid, setting age to 0.")
    
    def yearPasses(self):
        self.age += 1
    
    def amIOld(self):
        if self.age < 13:
            print("You are young.")
        elif self.age >= 13 and self.age < 18:
            print("You are a teenager.")
        else:
            print("You are old.")

p1 = Person(-1)
p2 = Person(10)
p3 = Person(16)
p4 = Person(18)

p1.amIOld()
p2.amIOld()
p3.amIOld()
p4.amIOld()

p1.age
p1.yearPasses()
p1.age
p1.yearPasses()
p1.yearPasses()
p1.age