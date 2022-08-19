import java.util.Scanner;

public class functions {
    // public static void add(int a, int b){
    // int add = a + b;
    // System.out.println(add);
    // }

    // public static void main(String[] args){
    // int a;
    // int b;
    // add(a, b);
    // }

    // multiply
    // public static int multiply(int a, int b){
    // return a*b;
    // }

    // factorial
    // public static void factorial(int n){
    // if(n < 0){
    // System.out.println("Invalid Number");
    // }
    // int factorial = 1;
    // for(int i = n; i>=1; i--){
    // factorial = factorial * i;
    // }
    // System.out.println(factorial);
    // }

    // even or not
    //

    // tableprint
    public static void tableprint(int n) {
        int r = 0;
        for (int i = 1; i <= 10; i++) {
            r = n * i;
            System.out.println(r);
        }
    }

    public static void prime(int n) {
        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    // main function input and output ka kam karega
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // prime
        int n = s.nextInt();
        prime(n);

        // tableprint
        // int n = s.nextInt();
        // tableprint(n);

        // evenodd
        // int n = s.nextInt();
        // evenodd(n);

        // factorial
        // int n = s.nextInt();
        // factorial(n);

        // multiply
        // int a = s.nextInt();
        // int b = s.nextInt();
        // int result = multiply(a, b);
        // System.out.println(result);

        s.close();
    }

}
