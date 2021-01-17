# Day 13

from abc import ABCMeta, abstractmethod

class Book(metaclass = ABCMeta):
    def __init__(self, title, author):
        self.title = title
        self.author = author

    @abstractmethod
    def display():
        pass

class MyBook(Book):
    def __init__(self, title, author, price):
        super().__init__(title, author)
        self.price = price
    
    def display(self):
        print(f'Title: {self.title}')
        print(f'Author: {self.author}')
        print(f'Price: {self.price}')




b = MyBook('The Alchemist', 'Paulo Coelho', 248)