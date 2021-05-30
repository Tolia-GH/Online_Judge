import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Child Jingjing = new Child();

         Jingjing.getSchedule();
         System.out.println(Jingjing.isHappy());
    }
}

class Child {
    int[][] schedule = new int[7][2];
    Scanner sc = new Scanner(System.in);

    public void getSchedule() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                schedule[i][j] = sc.nextInt();
            }
        }
    }
    public int isHappy() {
        int[] unHappyLevel = new int[7];
        int maxUnhappy_Level = 0;
        int maxUnhappy_Day = 0;
        for (int i = 0; i < 7; i++) {
            unHappyLevel[i] = schedule[i][0] + schedule[i][1] - 8;
            if (unHappyLevel[i] > maxUnhappy_Level) {
                maxUnhappy_Level = unHappyLevel[i];
                maxUnhappy_Day = i+1;
            }
        }
        return maxUnhappy_Day;
    }
}
