import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;

        while(true) {
            input = sc.nextInt();
            if (input < 25) {
                System.out.println("Higher");
            }
            else if (input ==25) {
                System.out.println("Good");
                break;
            }
            else {
                System.out.println("Lower");
            }
        }
    }
}