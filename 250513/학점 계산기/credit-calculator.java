import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] grade = new double[N];
        double sum = 0;
        double ave ;

        for (int i = 0;i<N;i++){
            grade[i] = sc.nextDouble();
            sum += grade[i];
        }
        
        ave = sum / N;

        System.out.printf("%.1f\n",ave);
        if (ave>=4.0){
            System.out.println("Perfect");
        }
        else if(ave>=3.0){
            System.out.println("Good");
        }
        else{
            System.out.println("Poor");
        }
    }
}