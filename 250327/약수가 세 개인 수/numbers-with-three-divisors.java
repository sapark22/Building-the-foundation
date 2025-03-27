import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int start,end;
        int sum = 0;

        start = sc.nextInt();
        end = sc.nextInt();

        for (int i = start; i<=end; i++) {
            int num = 0;
            for(int j = 1; j<=end;j++) {
                if(i%j == 0) {
                    num +=1;
                }
            }
            if (num == 3) {
                sum += 1;
            }
        }

        System.out.println(sum);
    }
}