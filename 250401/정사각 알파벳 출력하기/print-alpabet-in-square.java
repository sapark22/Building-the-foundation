import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alpa = 65;
        for (int i = 0; i<n; i++){
            for(int j = 0;j<n; j++) {
                System.out.print((char)alpa);
                alpa++;
            }
            System.out.println();
        }
    }
}