import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N,M;
        N = sc.nextInt();
        M = sc.nextInt();
        int [][] array1 = new int[N][M];
        int [][] array2 = new int[N][M];

        
        for (int i=0; i<N; i++) {
            for (int j = 0; j<M; j++) {
                array1[i][j] = sc.nextInt();
            }
    }

        for (int i=0; i<N; i++) {
            for (int j = 0; j<M; j++) {
                array2[i][j] = sc.nextInt();
            }
        }
    

        for (int i=0; i<N; i++) {
            for (int j = 0; j<M; j++) {
                if (array1[i][j] == array2[i][j]) {
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
            }
            System.out.println("");
        }
    }
}