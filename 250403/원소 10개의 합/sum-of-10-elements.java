import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a;
        int sum = 0;
        for (int i = 0; i<10 ; i++){
            a = sc.nextInt();
            sum += a;
        }

        System.out.print(sum);
    }
}