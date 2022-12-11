package day13_MethodOverloading_WhileLoop;

public class C03_MethodOverLoading {
    public static void main(String[] args) {
        toplama(5.4,6.3); //  2 double sayi toplami :11.7
        toplama('a','b'); // int ve double toplami :195.0
        // ilk olarak %100 uyumlu parametreleri arar
        // %100 uyumlu yoksa calisabilecek method var mi diye kontrol eder
        // calisacak method birden fazla olursa, min. casting yaparak kullanabilecegini tercih eder
        toplama(8.4, 6); // 2 double sayi toplami :14.4
        toplama(4,5);
    }
    public static void toplama(int sayi2, double sayi1){
        System.out.println("int ve double toplami :" + (sayi1+sayi2));
    }
    public static void toplama(double sayi2, double sayi1){
        System.out.println("2 double sayi toplami :" + (sayi1+sayi2));
    }
}
