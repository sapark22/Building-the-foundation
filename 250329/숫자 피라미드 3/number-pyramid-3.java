import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 1;

        int height = sc.nextInt();

        for (int i = 1; i<=height ; i++) {
            for ( int j = 1 ; j<=i ; j++) {
                System.out.print((j*i) + " ");
            }
            System.out.println();
        }
    }
}