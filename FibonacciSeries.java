public class FibonacciSeries {
    public static void main (String args[]) {
        int n = 10; // Change n to generate Fibonacci series up to nth term
        System.out.println("Fibonacci series up to " + n + " terms:");
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
