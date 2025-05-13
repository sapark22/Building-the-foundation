import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int input;
        int cnt = 0;
        int sum = 0;
        double ave;
        for (int i = 0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<10;i++){
            if (arr[i] == 0) break;
            sum += arr[i];
            cnt++;
        }
        ave = sum/(double)cnt;
        System.out.printf("%1$d %2$.1f",sum,ave);
    }
}