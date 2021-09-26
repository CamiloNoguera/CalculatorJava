public class Operaciones {
    private int a;
    private int b;

    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int rdbsuma() {
        return a + b;
    }

    public int rdbresta() {
        return a - b;
    }

    public int rdbmult() {
        return a * b;
    }

    public double rdbdiv() {
        return (double) a / b;
    }
}