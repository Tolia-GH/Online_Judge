import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int startHour = sc.nextInt(), startMin = sc.nextInt();
        int endHour = sc.nextInt(), endMin = sc.nextInt();

        int startTime = startHour * 60 + startMin;
        int endTime = endHour * 60 + endMin;

        int lastTime = endTime - startTime;
        int lastHour = lastTime / 60;
        int lastMin = lastTime % 60;

        System.out.println(lastHour + " " + lastMin);
    }
}
