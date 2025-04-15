class A:
    def __init__(self, x, z):
        self.x = x
        self.z = z
        print(f"Constructor de A: x={self.x}, z={self.z}")
    def incrementaX(self):
        self.x = self.x + 1
        print(f"A - incrementaX: x={self.x}")
    def incrementaZ(self):
        self.z = self.z + 1
        print(f"A - incrementaZ: z={self.z}")

class B:
    def __init__(self, y, z):
        self.y = y
        self.z = z
        print(f"Constructor de B: y={self.y}, z={self.z}")
    def incrementaY(self):
        self.y = self.y + 1
        print(f"B - incrementaY: y={self.y}")
    def incrementaZ(self):
        self.z = self.z + 1
        print(f"B - incrementaZ: z={self.z}")

class D(A, B):  
    def __init__(self, x, y, z):
        A.__init__(self, x, z) 
        B.__init__(self, y, z)  
        print(f"Constructor de D: x={self.x}, y={self.y}, z={self.z}")
    def incrementaXYZ(self):
        self.incrementaX()
        self.incrementaY()
        self.incrementaZ() 
d_obj = D(1, 2, 3)
d_obj.incrementaX()
d_obj.incrementaY()
d_obj.incrementaZ() 
d_obj.incrementaXYZ()

print(f"Valores finales en D: x={d_obj.x}, y={d_obj.y}, z={d_obj.z}")

print(D.mro()) 