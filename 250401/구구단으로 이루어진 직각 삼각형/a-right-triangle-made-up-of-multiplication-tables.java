import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i =1 ; i<=N ; i++) {
            for(int j= 1 ; j<=N-i+1;j++){
                if(j == N-i+1) {
                    System.out.print(i+" * "+j+" = "+(i*j));
                }
                else{
                    System.out.print(i+" * "+j+" = "+(i*j)+" / ");
                }
            }
            System.out.println();
        }
    }
}