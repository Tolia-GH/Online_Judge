import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double p = (a+b+c)/2;
        if(a+b>c&&b+c>a&&a+c>b){
            double S =Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.printf("%.1f",S);
        }
    }
}