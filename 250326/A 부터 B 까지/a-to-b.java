import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B;
        A = sc.nextInt();
        B = sc.nextInt();

        while(true) {
            if (A>B) {
                break;
            }
            System.out.print(A+" ");
            if (A%2==0) {
                A += 3;
            }
            else{
                A *= 2;
            }
        }
    }
}