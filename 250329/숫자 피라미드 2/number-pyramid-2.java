import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        int N = sc.nextInt();

        for (int i = 1 ; i <= N ; i++) {
            for(int j = 1 ; j <=i ; j++) {
                System.out.print(cnt+" ");
                cnt++;
            }
            System.out.println();
        }
    }
}