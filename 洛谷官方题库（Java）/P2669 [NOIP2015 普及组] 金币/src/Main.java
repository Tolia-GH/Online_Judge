import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        int date = 0;
        int sumCoin = 0;
        loop:for(int coin = 1; ;coin++) {
            for(int i = 1; i<=coin; i++) {
                date++;
                sumCoin+=coin;
                if(date==days) break loop;
            }
        }

        System.out.println(sumCoin);
    }
}
