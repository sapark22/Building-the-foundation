import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] grade = new double[8];
        double sum = 0;
        for(int i = 0;i<8;i++){
            grade[i] = sc.nextDouble();
            sum += grade[i];
        }
        sum /= 8;
        System.out.printf("%.1f",sum);
        // Please write your code here.
    }
}