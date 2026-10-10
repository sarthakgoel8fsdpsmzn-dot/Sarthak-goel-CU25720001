
class Matrix {
    int a, b, c, d;
    static String matrixType = "2x2 Matrix";

    Matrix(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void addAndSubtract(Matrix m) {
        int sumA = a + m.a;
        int sumB = b + m.b;
        int sumC = c + m.c;
        int sumD = d + m.d;

        int subA = a - m.a;
        int subB = b - m.b;
        int subC = c - m.c;
        int subD = d - m.d;

        System.out.println("Matrix Type: " + matrixType);
        System.out.println("Addition:");
        System.out.println(sumA + " " + sumB);
        System.out.println(sumC + " " + sumD);

        System.out.println("Subtraction:");
        System.out.println(subA + " " + subB);
        System.out.println(subC + " " + subD);
    }
}

public class question26 {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(1, 2, 3, 4);
        Matrix m2 = new Matrix(5, 6, 7, 8);

        m1.addAndSubtract(m2);
    }
}
