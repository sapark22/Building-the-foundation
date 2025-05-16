import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] score = new int[n][4];
        int[] sum = new int[n];
        int ave[] = new int[n];
        int pass = 0;


        for(int i = 0;i<n;i++){
            for(int j = 0;j<4;j++){
                sum[i] += sc.nextInt();
            }
            ave[i] = sum[i]/4;
        }

        for(int i = 0; i<n; i++){
            if(ave[i]>=60){
                System.out.println("pass");
                pass++;
            }
            else{
                System.out.println("fail");
            }
        }
        System.out.println(pass);
        // Please write your code here.
    }
}