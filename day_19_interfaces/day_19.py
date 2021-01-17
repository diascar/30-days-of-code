# Day 19

class AdvancedArithmetic(object):
    def divisorSum(n):
        raise NotImplementedError


class Calculator(AdvancedArithmetic):
    def divisorSum(self, n):
        divisors = [1, n]
        for i in range(2, (n//2) + 1):
            if n % i == 0:
                divisors.append(i)
        return sum(set(divisors))


c = Calculator()

c.divisorSum(55)


# alternative: using abcmeta will return an error when trying to instantiate a subclass not overriding an interface (abstract) method.
# from abc import ABCMeta, abstractmethod

# class AdvancedArithmetic(metaclass = ABCMeta):
#     @abstractmethod
#     def divisorSum(n):
#         raise NotImplementedError

# class Calculator(AdvancedArithmetic):
#     def divisorSum(self, n):
#         divisors = [1, n]
#         for i in range(2, (n//2) + 1):
#             if n % i == 0:
#                 divisors.append(i)
#         return sum(set(divisors))