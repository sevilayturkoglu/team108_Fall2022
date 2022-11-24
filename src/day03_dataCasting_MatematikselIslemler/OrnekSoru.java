package day03_dataCasting_MatematikselIslemler;

public class OrnekSoru {
    public static void main(String[] args) {
        //       Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
//       yazin

        int sayi1=10;
        int sayi2=15;
        int sayi3=25;

        System.out.println(((double) sayi1 + sayi2 + sayi3) / 3);

        System.out.println("verilen 3 degerin ortalamasi:"+(double)(sayi1+sayi2+sayi3)/3);

    }
}
