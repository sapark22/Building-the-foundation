import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        for (int i = 0;i<M; i++){
            int cnt = 0;
            int N = sc.nextInt();
            while(true){
                if (N == 1) {
                    System.out.println(cnt);
                    break;
                }

                if(N%2 == 0) {
                    N /=2;
                    cnt++;
                }
                else{
                    N =N*3+1;
                    cnt++;
                }
            }
        }
    }
}