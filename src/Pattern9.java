import java.util.Scanner;

public class Pattern9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Pattern9 obj = new Pattern9();

        obj.pattern8(n); // upper pyramid
        obj.pattern7(n); // lower pyramid
    }

    // Inverted Pyramid
    public void pattern7(int n) {

        for(int i = 0; i < n; i++) {

            // spaces
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Normal Pyramid
    public void pattern8(int n) {

        for(int i = 0; i < n; i++) {

            // spaces
            for(int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}