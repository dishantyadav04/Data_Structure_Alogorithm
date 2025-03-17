package recursion;

public class Main {

    static int count =1;
    static void f() {
        if (count == 10) {
            return;
        }
        System.out.println(count);
        count++;
        f();
    }

    public static void main(String[] args) {
        f();
    }
}
