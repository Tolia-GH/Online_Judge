import java.util.Scanner;

public class Main {
    public static void main(String[] args) {//注释
        Scanner sc = new Scanner(System.in);
        int leftNum, rightNum;
        int[] digit = {0,0,0,0,0,0,0,0,0,0};

        leftNum = sc.nextInt();
        rightNum = sc.nextInt();

        for(int i = leftNum; i<=rightNum; i++) {
            int temp = i;
            while(temp!=0) {
                digit[temp%10]++;
                temp/=10;
            }
        }

        for(int i:digit) {
            System.out.print(i+" ");
        }
    }
}