import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fish fish = new Fish();
        System.out.println(fish.disCount(sc.nextInt(), sc.nextInt()));
    }
}

class Fish {
    public boolean isRestDay(int day) {//判断是否为周末
        return day == 6 || day == 7;
    }

    public int disCount(int x, int n) {//计算游泳距离
        int distance = 0;
        int day = x;
        for(int cnt = 0; cnt < n;  cnt++) {
            if(!isRestDay(day)) distance += 250;
            day++;
            if(day > 7) day %= 7;
        }
        return distance;
    }
}
