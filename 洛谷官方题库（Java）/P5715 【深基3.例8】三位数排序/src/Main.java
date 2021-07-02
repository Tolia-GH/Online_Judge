import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] buckets = new int[101];
        Arrays.fill(buckets,0);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        buckets[a]++;
        buckets[b]++;
        buckets[c]++;

        for(int i = 0; i<buckets.length; i++) {
            while(buckets[i]>0) {
                System.out.print(i+" ");
                buckets[i]--;
            }
        }
    }
}
