import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i =0; i<N; i++) {
            int sum = 1;
            int a = sc.nextInt();
            int b  = sc.nextInt();
            for(int j = a ; j<=b ; j++) {
                sum *=j;
            }
            System.out.println(sum);
        }
    }
}