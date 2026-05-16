//package PATTERNS;
//
//public class Pattern10 {
//    static void main(String[] args) {
//        Pattern10 p = new Pattern10();
//        p.pattern(5);
//         p.pattern2(5);
//    }
//    static void pattern(int n){
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern2(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <n-i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
package PATTERNS;

public class Pattern10 {

    public static void main(String[] args) {

        pattern(5);
        pattern2(5);
    }

    // Increasing triangle
    static void pattern(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Decreasing triangle
    static void pattern2(int n) {

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


