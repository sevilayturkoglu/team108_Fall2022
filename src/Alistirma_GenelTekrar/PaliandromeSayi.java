package Alistirma_GenelTekrar;

public class PaliandromeSayi {
    public static void main(String[] args) {
        /*
        Palindrome Number

        Create a program that will check if the given number is palindrome.
        A number is palindrome if the digits are the same read forwards and backwards.
        Do not use a String

        Ex:
            Given n = 1234321 -> palindrome
            Given n = 15651 -> palindrome
            Given n = 18374 -> not palindrome
            Given n = 1264628 -> not palindrome
     */

        int n=1561;
        int origin=n;//a islem boyunca hep bolunup degisecek ,sonunda 0 olacak,bu nedenle kiyslama yapmak icin original a yi korumaya aldik
        int reverseA=0;
        while(n>0){
            int lastDigit=n%10;
            reverseA=reverseA*10+lastDigit;
            n/=10;

        }
        System.out.println(origin+" = "+(origin == reverseA ? "Digit is paliandrome" : "Digit is not paliandrome"));

        }
}
