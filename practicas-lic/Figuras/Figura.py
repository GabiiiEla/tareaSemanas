from abc import ABC, abstractmethod
import math

class Figura(ABC):
    def __init__(self, c: str):
        self.clor = c
    @abstractmethod
    def area(self):
        pass
    @abstractmethod
    def perimetro(self):
        pass
class Circulo(Figura):
    def __init__(self, c,  r):
        super().__intt__(c)
        self.radio = r
    def area(self):
        return math.pi * self.radio **2
    def perimetro(self):
        return 2 * math.pi * self.radio