import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle tAng = new Triangle();

        if(tAng.getABC()) {
            System.out.printf("%.1f",tAng.getTriangleArea(tAng.a, tAng.b, tAng.c));
        }
        else {
            System.out.print("Error!");
        }
    }
}
class Triangle {
    double a, b, c;
    Scanner sc = new Scanner(System.in);

    public boolean getABC() {
        a = sc.nextDouble(); b = sc.nextDouble(); c = sc.nextDouble();
        if(a > 0 && b > 0 && c > 0) {
            return a + b > c && a + c > b && b + c > a;
        }
        return false;
    }

    public double getTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
