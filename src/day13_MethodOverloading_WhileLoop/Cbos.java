package day13_MethodOverloading_WhileLoop;
import java.util.Random;
import java.util.Scanner;

public class Cbos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif tam sayi giriniz, Bitirmek isterseniz 0 giriniz");
        int sayi1 = 1;
        int toplam=0;
        int adet=0;
        while (sayi1!=0){
            sayi1 = scan.nextInt();
            toplam=toplam+sayi1;
            adet++;
            if (sayi1<0 )System.out.println("negatif sayi kulllanamazsiniz ");
        }System.out.println("toplam "+adet+" adet sayi girdiniz ve bunlarin toplami :"+toplam);
    }
}
