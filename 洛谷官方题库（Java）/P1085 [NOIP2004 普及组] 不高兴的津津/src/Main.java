import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Child Jinjin = new Child();//实例化津津这个对象

         Jinjin.getSchedule();//读入津津的日程表
         System.out.println(Jinjin.isHappy(8));//计算津津开不开心
    }
}

class Child {
    int[][] schedule = new int[7][2];
    Scanner sc = new Scanner(System.in);

    public void getSchedule() {//读入小孩的日程表
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                schedule[i][j] = sc.nextInt();
            }
        }
    }
    public int isHappy(int limitHours) {//计算小孩是否开心
        int[] unHappyLevel = new int[7];
        int maxUnhappy_Level = 0;
        int maxUnhappy_Day = 0;
        for (int i = 0; i < 7; i++) {
            unHappyLevel[i] = schedule[i][0] + schedule[i][1] - limitHours;
            if (unHappyLevel[i] > maxUnhappy_Level) {
                maxUnhappy_Level = unHappyLevel[i];
                maxUnhappy_Day = i + 1;
            }
        }
        return maxUnhappy_Day;
    }
}
