import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A,B;
        A = sc.nextInt();
        B = sc.nextInt();

        for (int i = 2; i<9; i += 2) {
            for (int j = B ; j>=A ; j--) {
                if (j == A) {
                    System.out.print(j+" * "+i+" = "+(j*i));
                }
                else {
                    System.out.print(j+" * "+i+" = "+(j*i)+" / ");
                }
            }
            System.out.println("");
        }
    }
}