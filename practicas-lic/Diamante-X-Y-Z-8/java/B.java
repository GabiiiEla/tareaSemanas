class B {
    int y;
    int z;

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
