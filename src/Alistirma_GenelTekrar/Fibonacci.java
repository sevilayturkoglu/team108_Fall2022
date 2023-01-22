package Alistirma_GenelTekrar;

public class Fibonacci {
    /*
        Fibonacci

        Create a program that will give you the Nth Fibonacci number where N is an int
        Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
    Note: Fibonacci numbers are read like index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

        Ex:
            input:
                8
            output:
                21

            -> ex of the sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21

        Test data:
            n -> result
            0 -> 0
            1 -> 1
            2 -> 1
            3 -> 2
            6 -> 8
            8 -> 21
    */
    public static void main(String[] args) {
        int n=3;
        int first=0;
        int second=1;
        int next=0;
        System.out.print(first+" "+second+" ");
        for (int i = 2; i <=n; i++) {
            next=first+second;
            first=second;
            second=next;
            System.out.print(next+" ");
        }

        System.out.println("\n"+n+". fibonacci digit is= "+next);
    }
}
