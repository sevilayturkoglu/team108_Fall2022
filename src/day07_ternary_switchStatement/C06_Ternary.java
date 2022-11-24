package day07_ternary_switchStatement;

public class C06_Ternary {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir harf isteyin,
         girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
         yoksa girilen harfi yazdirin*/
        char karakter='.';

        System.out.println(karakter >= 'a' && karakter <= 'z' ? Character.toUpperCase(karakter) : karakter);
        System.out.println(karakter>='a' && karakter<='z' ? (char)(karakter-32): karakter);



        /*Soru 4- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        kucukse “Maalesef kaldin” yazdirin.*/

        int input= 44;
        System.out.println(input>=50 ? "Sinifi Gectin" : "Maalesef kaldin");

        /*Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

         */
        input= -125;
//   |5| => 5   |-4| => (-1)*(-4) =>4 bir negatif sayiyi -1 ile carparak mutlak degerini aliriz.mutlak deger de negatif olmaz
        System.out.println(input > 0 ? input : input * (-1));

    }
}
