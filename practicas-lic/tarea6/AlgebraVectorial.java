public class AlgebraVectorial {
    private double[] vectorA;
    private double[] vectorB;

    public AlgebraVectorial(double[] a, double[] b) {
        this.vectorA = a;
        this.vectorB = b;
    }
    public AlgebraVectorial(double[] a) {
        this.vectorA = a;
        this.vectorB = new double[]{0, 0}; // Valor predeterminado para vectorB
    }
    public double calcularMagnitud(double[] vector) {
        double sumaCuadrados = 0;
        for (double componente : vector) {
            sumaCuadrados += componente * componente;
        }
        return Math.sqrt(sumaCuadrados);
    }
    public boolean esPerpendicular(double[] a, double[] b) {
        double[] suma = new double[a.length];
        double[] resta = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            suma[i] = a[i] + b[i];
            resta[i] = a[i] - b[i];
        }
        return calcularMagnitud(suma) == calcularMagnitud(resta);
    }
    public boolean esPerpendicular2(double[] a, double[] b) {
        double[] restaAB = new double[a.length];
        double[] restaBA = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            restaAB[i] = a[i] - b[i];
            restaBA[i] = b[i] - a[i];
        }
        return calcularMagnitud(restaAB) == calcularMagnitud(restaBA);
    }

    public boolean esPerpendicular3(double[] a, double[] b) {
        double productoPunto = 0;
        for (int i = 0; i < a.length; i++) {
            productoPunto += a[i] * b[i];
        }
        return productoPunto == 0;
    }

    public boolean esPerpendicular4(double[] a, double[] b) {
        double[] suma = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            suma[i] = a[i] + b[i];
        }
        return Math.pow(calcularMagnitud(suma), 2) == Math.pow(calcularMagnitud(a), 2) + Math.pow(calcularMagnitud(b), 2);
    }
    public boolean esParalelo(double[] a, double[] b) {
        if (b.length == 0) return false;
        double r = a[0] / b[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] / b[i] != r) return false;
        }
        return true;
    }
    public boolean esParalelo2(double[] a, double[] b) {
        double[] productoCruz = new double[3]; 
        productoCruz[0] = a[1] * b[2] - a[2] * b[1];
        productoCruz[1] = a[2] * b[0] - a[0] * b[2];
        productoCruz[2] = a[0] * b[1] - a[1] * b[0];
        return productoCruz[0] == 0 && productoCruz[1] == 0 && productoCruz[2] == 0;
    }
    public double[] proyeccion(double[] a, double[] b) {
        double productoPunto = 0;
        for (int i = 0; i < a.length; i++) {
            productoPunto += a[i] * b[i];
        }
        double magnitudBAlCuadrado = Math.pow(calcularMagnitud(b), 2);
        double factor = productoPunto / magnitudBAlCuadrado;
        double[] proyeccion = new double[b.length];
        for (int i = 0; i < b.length; i++) {
            proyeccion[i] = factor * b[i];
        }
        return proyeccion;
    }
    public double componente(double[] a, double[] b) {
        double productoPunto = 0;
        for (int i = 0; i < a.length; i++) {
            productoPunto += a[i] * b[i];
        }
        return productoPunto / calcularMagnitud(b);
    }
}