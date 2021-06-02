import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Competitor competitor = new Competitor();
        competitor.getPoint();
        System.out.printf("%.2f",competitor.calculatePoint(competitor.point));
    }
}
class Competitor {
    Scanner sc = new Scanner(System.in);
    int numJudge;
    double[] point = new double[1000];

    public void getPoint() {
        numJudge = sc.nextInt();
        for (int i = 0; i < numJudge; i++) {
            point[i] = sc.nextDouble();
        }
    }

    public double calculatePoint(double[] point) {
        double max = 0;
        double min = 10;
        double allPoint = 0;
        for(int i = 0;i < numJudge; i++) {
            allPoint += point[i];
            max = Math.max(max, point[i]);
            min = Math.min(min, point[i]);
        }
        return (allPoint-max-min)/(numJudge-2);
    }
}