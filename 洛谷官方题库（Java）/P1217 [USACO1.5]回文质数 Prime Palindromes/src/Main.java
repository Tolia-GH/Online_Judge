import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Num number = new Num();
        int left = sc.nextInt();
        int right = sc.nextInt();

        for (int i = left; i <= Math.min(9999999,right); i++) {
            if(number.isDigitEven(i)) continue;
            if(!number.isPalindromic(i)) continue;
            if(!number.isPrime(i)) continue;
            System.out.println(i);
        }
    }
}

class Num {
    public boolean isDigitEven(int num) {
        if(num == 11) return false;
        if(num >= 10 && num <= 99) return true;
        if(num >= 1000 && num <= 9999) return true;
        if(num >= 100000 && num <= 999999) return true;
        return false;
    }

    public boolean isPrime(int num) {
        if(num == 2) return true;
        for(int i = 2; i<= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public boolean isPalindromic(int num) {
        int tmp = num;int reverseNum = 0;
        while(tmp != 0) {
            reverseNum = reverseNum * 10 + tmp % 10;
            tmp /= 10;
        }
        return reverseNum == num;
    }
}
