import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int j = 1; j<=n; j++){
            for (int i = 1; i<= n; i++){
                if (i%2 != 0) {
                    System.out.print(j);
                }
                else{
                    System.out.print(n-j+1);
                }
            }
            System.out.println("");
        }
    }
}