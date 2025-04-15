package java;
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

