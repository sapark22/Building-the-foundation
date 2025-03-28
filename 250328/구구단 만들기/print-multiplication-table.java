import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A,B;
        A = sc.nextInt();
        B = sc.nextInt();

        for (int i = 1; i<10; i++) {
            for (int j = B; j>=A; j-=2) {
                if (j == A) {
                    System.out.print(j + " * " + i + " = " + (i*j));
                }
                else {
                    System.out.print(j + " * " + i + " = " + (i*j) + " / ");
                }
            }
            System.out.println("");
        }

    }
}