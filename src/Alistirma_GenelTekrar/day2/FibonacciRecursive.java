package Alistirma_GenelTekrar.day2;

public class FibonacciRecursive {
    public static void main(String[] args) {
        int a = fibonacci(9);
        System.out.println(a);
    }

    private static int fibonacci(int n) {
        if(n<2)return n;
        return fibonacci(n-2)+fibonacci(n-1);

    }
}

