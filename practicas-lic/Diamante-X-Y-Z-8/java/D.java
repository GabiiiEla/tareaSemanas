class D {
    A a_part;
    B b_part;
    int z; // D tiene su propia 'z' o usa las de A y B a través de la composición

    public D(int x, int y, int z_d) {
        this.a_part = new A(x, z_d); // Podríamos decidir cómo manejar 'z'
        this.b_part = new B(y, z_d); // Aquí usamos el 'z' de D para inicializar A y B
        this.z = z_d; // Mantenemos un 'z' propio en D
        System.out.println("Constructor de D: x=" + this.a_part.x + ", y=" + this.b_part.y + ", z=" + this.z);
    }

    public void incrementaXYZ() {
        this.a_part.incrementaX();
        this.b_part.incrementaY();
        // ¿Cuál incrementaZ llamar? Aquí podríamos decidir cuál o ambos.
        this.a_part.incrementaZ();
        // this.b_part.incrementaZ();
        this.z++; // También incrementamos el 'z' propio de D
        System.out.println("D - incrementaXYZ: z_propio=" + this.z);
    }

    // Métodos para acceder a las partes de A y B si es necesario
    public void incrementaX_de_A() {
        this.a_part.incrementaX();
    }

    public void incrementaY_de_B() {
        this.b_part.incrementaY();
    }

    public void incrementaZ_de_A() {
        this.a_part.incrementaZ();
    }

    public void incrementaZ_de_B() {
        this.b_part.incrementaZ();
    }
}
