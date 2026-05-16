package PATTERNS;

import java.util.Scanner;

public class Pattern8 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < n; i++) {

            // left spaces
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 0; j < 2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
