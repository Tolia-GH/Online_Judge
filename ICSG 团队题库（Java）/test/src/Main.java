import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=1;i<=b;i++) {
            if(a!=6 && a!=7) {
                c=c+250;
            }
            if(a==8) {
                a=1;
            }
            a++;
        }
        System.out.println(c);
    }
}