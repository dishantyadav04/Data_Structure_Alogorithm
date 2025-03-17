package importantpatterns.numbersystem;

public class EvenOrOdd{
        public static int solve(int n) {
            return ((n&1) == 0) ? 0:1;
//            if ((n&i) == 0){
//                return 0;
//            }
//            else {
//                return 1;
//            }
        }
        public static void main(String[] args) {

            int n = 6;
            if (solve(n) == 0) {
                System.out.println(n + " is even.");
            } else {
                System.out.println(n + " is odd.");
            }
        }


//        public static int remainder(int n) {
//            return (n % 2);
//        }
//        public static void main(String[] args) {
//            int n = 5;
//            if (remainder(n) == 0) {
//                System.out.println(n + " is Prime Number");
//            }
//            else {
//                System.out.println(n + " is Odd Number");
//            }
//        }

}
