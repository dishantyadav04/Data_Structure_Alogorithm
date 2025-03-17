package importantpatterns.numbersystem;

public class PositiveNegativeNumber {
    public static void check(int n) {
        if (n >> 31 == 0) {
            System.out.println(n + " is positive.");
        } else if (n >> 31 == -1) {
            System.out.println(n + " is negative.");
        }

    }
    public static void main(String[] args) {
        int n = 5;
        check(n);
        n = -6;
        check(n);
    }
}
//    public static void check(int n) {
//        if (n > 0) {
//            System.out.println("Is Positive number");
//        }
//        else {
//            System.out.println("Is Negative number");
//        }
//    }
//    public static void main(String[] args) {
//
//        int n = 1;
//        check(n);
//        n = -6;
//        check(n);
//    }
