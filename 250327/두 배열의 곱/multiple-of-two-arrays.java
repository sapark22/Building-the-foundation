import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int [][] array1 = new int[3][3];
        int [][] array2 = new int[3][3];
        int [][] result = new int[3][3];
        String trash = "";

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                array1[i][j] = sc.nextInt();
            }
        }


        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                array2[i][j] = sc.nextInt();
            }
        }

         for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print((array1[i][j] * array2[i][j])+" ");
            }
            System.out.println("");
        }

    }
}