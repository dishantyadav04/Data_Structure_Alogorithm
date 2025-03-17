package recursion;

public class Parameterised_Functional {

    //Parameterised Recursion
    static  void fun(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        fun(i-1, sum + i);
    }

    //Functional Recursion
    static int function(int n) {
        if (n == 0) {
            return 0;
        }
        return n + function(n-1);
    }

    public static void main(String[] args) {
        int n =3;
        //Calling parameterised function
        fun(n,0);

        //Calling Functional function
        System.out.println(function(n));
    }
}
