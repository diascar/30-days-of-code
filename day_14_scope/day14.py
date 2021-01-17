# Day 14

class Difference:
    elements = None
    maximumDifference = None

    def __init__(self, array: list):
        self.__elements = array
    
    def computeDifference(self):
        sorted_array = sorted(self.__elements)
        self.maximumDifference = abs(sorted_array[-1] - sorted_array[0])

