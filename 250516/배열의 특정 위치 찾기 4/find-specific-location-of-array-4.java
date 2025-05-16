import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;
        int[] arr = new int[10];
        for(int i = 0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<10;i++){
            if (arr[i] == 0) break;
            if (arr[i]%2 == 0){
                cnt++;
                sum += arr[i];
            }
        }
        System.out.printf("%1$d %2$d", cnt,sum);
        // Please write your code here.
    }
}