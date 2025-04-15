public class A {
    public int x;
    public int z;

    public A(int x, int z) {
        this.x = x;
        this.z = z;
        System.out.println("Constructor de A: x=" + this.x + ", z=" + this.z);
    }

    public void incrementaX() {
        this.x++;
        System.out.println("A - incrementaX: x=" + this.x);
    }

    public void incrementaZ() {
        this.z++;
        System.out.println("A - incrementaZ: z=" + this.z);
    }
}

public class B {
    public int y;
    public int z; // Podríamos incluso eliminar z de B si siempre se sincroniza con A

    public B(int y, int z) {
        this.y = y;
        this.z = z;
        System.out.println("Constructor de B: y=" + this.y + ", z=" + this.z);
    }

    public void incrementaY() {
        this.y++;
        System.out.println("B - incrementaY: y=" + this.y);
    }

    public void incrementaZ() {
        this.z++;
        System.out.println("B - incrementaZ: z=" + this.z);
    }
}

public class D {
    public A a_part;
    public B b_part;
    // public int z; // Eliminamos z de D

    public D(int x, int y, int z) {
        this.a_part = new A(x, z);
        this.b_part = new B(y, z);
        // this.z = z; // Ya no inicializamos z en D
        System.out.println("Constructor de D: x=" + this.a_part.x + ", y=" + this.b_part.y + ", z=" + this.a_part.z); // Accedemos a z a través de a_part
    }

    public void incrementaXYZ() {
        this.a_part.incrementaX();
        this.b_part.incrementaY();
        this.a_part.incrementaZ(); // Incrementamos z a través de a_part
        System.out.println("D - incrementaXYZ: z=" + this.a_part.z);
    }

    public void incrementaX() {
        this.a_part.incrementaX();
    }

    public void incrementaY() {
        this.b_part.incrementaY();
    }

    public void incrementaZ() {
        this.a_part.incrementaZ(); // Incrementamos z a través de a_part
    }
}

public class Main {
    public static void main(String[] args) {
        D d_obj = new D(1, 2, 3);
        d_obj.incrementaX();
        d_obj.incrementaY();
        d_obj.incrementaZ();
        d_obj.incrementaXYZ();

        System.out.println("Valores finales en D (a través de composición): x="
                + d_obj.a_part.x + ", y=" + d_obj.b_part.y + ", z=" + d_obj.a_part.z); // Accedemos a z a través de a_part
    }
}