import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int alpa = 65;
        for (int i = 1;i<=N;i++){
            for(int j = 0;j<i;j++){
                System.out.print((char)alpa);
                alpa++;
                if (alpa>90) alpa=65;
            }
            System.out.println();
        }
    }
}