package importantpatterns.numbersystem;

public class PrimeNumberBetweenRange {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void PrimeNumberBwRange(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 17;
        PrimeNumberBwRange(10 , 17);
    }
}