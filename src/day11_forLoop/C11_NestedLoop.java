package day11_forLoop;

public class C11_NestedLoop {
    public static void main(String[] args) {
         /*
        input degerine kadar her satirda * sayisini bir artirip
        sonra azaltarak asagidaki sekli yazdirin
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz
         */
        int input = 4;
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= input; i++) {
            for (int j = input-1; j >=i; j--) {
                System.out.print("* ");
            }System.out.println();
        }
    }
}
