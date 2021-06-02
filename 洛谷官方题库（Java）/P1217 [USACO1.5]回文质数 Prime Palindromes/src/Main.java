import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Num number = new Num();

        int left = sc.nextInt();//区间左边界
        int right = sc.nextInt();//区间右边界

        for (int i = left; i <= Math.min(9999999,right); i++) {
            if(number.isDigitEven(i)) continue;//如果位数是偶数且不为11，则一定不是回文质数，跳过这次循环
            if(!number.isPalindromic(i)) continue;//如果不是回文数，跳过这次循环
            if(!number.isPrime(i)) continue;//如果不是质数，跳过这次循环
            System.out.println(i);//否则输出这个数
        }
    }
}

class Num {
    public boolean isDigitEven(int num) {//判断位数
        if(num == 11) return false;
        if(num >= 10 && num <= 99) return true;
        if(num >= 1000 && num <= 9999) return true;
        return num >= 100000 && num <= 999999;
    }

    public boolean isPrime(int num) {//判断是否为质数
        if(num == 2) return true;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public boolean isPalindromic(int num) {//判断是否回文
        int tmp = num; int reverseNum = 0;
        while(tmp != 0) {
            reverseNum = reverseNum * 10 + tmp % 10;
            tmp /= 10;
        }
        return reverseNum == num;
    }
}
