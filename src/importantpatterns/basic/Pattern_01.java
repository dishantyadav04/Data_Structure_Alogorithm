package importantpatterns.basic;

import java.util.Scanner;

public class Pattern_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Square
        for (int i =0; i < n; i++) {
            for (int j =0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //Rectangle
        for (int i=1; i<=n; i++) {
            for (int j=0; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
