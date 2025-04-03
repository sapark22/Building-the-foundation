import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1;i<=N;i++) {
            if (i == 2) {
                System.out.print(i+" ");
                continue;
            }
            for(int j = 2 ; j<=i-1 ; j++){
                if(i%j == 0) break;
                if(j==i-1){
                    System.out.print(i+" ");
                    break;
                }
            }
        }
    }
}