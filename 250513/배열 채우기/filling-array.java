import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int input;
        int cnt = 0;
        for (int i = 0; i<10; i++){
            input = sc.nextInt();
            if (input == 0) break;
            arr[i] = input;
            cnt++;
        }
        cnt -= 1;
        for(int i = cnt; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        // Please write your code here.
    }
}