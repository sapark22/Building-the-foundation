import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a,b,cnt;
        int N = sc.nextInt();

        for(int i = 0; i<N ; i++){
            cnt = 0;
            a = sc.nextInt();
            b = sc.nextInt();

            for (int j = a; j<=b ; j++) {
                if(j%2 ==0 ) {
                    cnt += j;
                }
            }

            System.out.println(cnt);
        }

    }
}