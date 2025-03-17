package recursion;

public class Backtracking {

    //Without backtracking
    static void fun(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        fun(i+1, n);
    }

    //Backtracking
    static void function(int i, int n) {
        if (i < 1) {
            return;
        }
        function(i-1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n =3;
        //Without backtracking
        fun(1, n);
        //With backtracking
        function(n,n);
    }
}
