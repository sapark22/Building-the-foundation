import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int cnt = 0;
        double ave;

        int arr[] = new int[10];
        for (int i = 0;i<10;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<10;i++){
            if (arr[i]>=250) break;
            total += arr[i];
            cnt++;
        }
        ave = total / (double) cnt;
        System.out.printf("%1$d %2$s",total,ave);
    }
}