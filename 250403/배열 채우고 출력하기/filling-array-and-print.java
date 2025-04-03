import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String [] a = new String[10];

        for(int i = 0; i<10; i++){
            a[i] = sc.next();
        }
        for(int j = 9; j>=0; j--){
            System.out.print(a[j]);
        }
    }
}