import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        int N = sc.nextInt();
        for (int i = 0 ; i<N ; i++) {
            for (int k = 0 ; k<i ; k++) {
                System.out.print("  ");
            }
            for (int j = N-i; j>0 ; j--) {
                System.out.print(cnt +" ");
                cnt++;
                if (cnt == 10) {
                    cnt = 1;
                }
            }
            System.out.println();
        }
    }
}