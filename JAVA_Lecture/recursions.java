

public class recursions {

    // print numbers from 5 to 1
    // public static void printNumbers(int n) {
    // if(n == 0) { //base case
    // return;
    // }
    // System.out.println(n);//function work
    // printNumbers(n-1);//reccursion
    // }

    // print numbers from 1 to 5
    // public static void printNumbers(int n) {
    // if (n == 6) {// base case
    // return;
    // }
    // System.out.println(n);
    // printNumbers(n + 1);// recursion
    // }

    // print the sum of first n natural numbers
    // public static void printSum(int n, int sum) {
    // if (n == 0) {
    // System.out.println(sum);
    // return;
    // }
    // sum += n;
    // printSum(n - 1, sum);
    // }

    // factorial of a number
    // public static void printFactorial(int n, int fact) {
    // if(n == 0) {
    // System.out.println(fact);
    // return;
    // }
    // fact *= n;
    // printFactorial(n-1, fact);
    // }

    // fibonacci sequence
    // public static void printFibonacci(int a, int b, int n) {
    // if(n == 0) {
    // return;
    // }
    // System.out.println(a);
    // printFibonacci(b, a+b, n-1);
    // }

    // Print x^n (with stack height = n)
    // public static int printPower(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // if (x == 0) {
    // return 0;
    // }
    // int x_ = printPower(x, n - 1);
    // int xn = x * x_;
    // return xn;
    // }

    // Print x^n (with stack height = logn)
    // public static int printPower(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // if (n % 2 == 0) {
    // return printPower(x, n / 2) * printPower(x, n / 2);
    // } else {
    // return x * printPower(x, n / 2) * printPower(x, n / 2);
    // }
    // }

    

    public static void main(String[] args) {
        // print number from 5 to 1
        // int n = 5;
        // printNumbers(n);

        // print numbers from 1 to 5
        // int n = 1;
        // printNumbers(n);

        // print the sum of first n natural numbers
        // printSum(5, 0);

        // factorial of a number
        // printFactorial(5, 1);

        // fibonacci sequence
        // printFibonacci(0, 1, 5);

        // Print x^n (with stack height = n)
        // int x = 2, n = 5;
        // int output = printPower(x, n);
        // System.out.println(output);

        // Print x^n (with stack height = logn)
        // int x = 2, n = 5;
        // int output = printPower(x, n);
        // System.out.println(output);

        

    }
}
