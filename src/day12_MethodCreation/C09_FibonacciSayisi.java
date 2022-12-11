package day12_MethodCreation;

public class C09_FibonacciSayisi {
    public static void main(String[] args) {
        // verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .........

        fibonaccidenSayiYazdir(9);
    }
    public static void fibonaccidenSayiYazdir(int adet) {
     int birinciSayi=0;
     int ikinciSayi=1;
     int ucuncuS=1;
     if(adet<=0 ||adet<=1){
         System.out.println("hatali giris");
     }else{
         System.out.print(0+" "+1);
         for (int i = 2; i <=adet ; i++) {

            ucuncuS=birinciSayi+ikinciSayi;
             System.out.print(" "+ucuncuS);

             birinciSayi=ikinciSayi;
            ikinciSayi=ucuncuS;

         }
         System.out.println();

     }

    }
}

