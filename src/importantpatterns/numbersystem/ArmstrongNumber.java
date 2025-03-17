package importantpatterns.numbersystem;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
//        int k = String.valueOf(num).length();
//        System.out.println(k);
        int sum = 0;
        int n = num;
        while(n > 0){
            int ld = n % 10;
//            sum += Math.pow(ld, k);
            sum = sum + (ld* ld*ld);
            n = n / 10;
        }
        return sum == num ? true : false;
    }

    public static void main(String[] args) {
        int number = 1634;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}