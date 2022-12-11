package day13_MethodOverloading_WhileLoop;

import day12_MethodCreation.C03_AsalSayiMethod;
import day12_MethodCreation.C04_FacktorielMethod;
import day12_MethodCreation.C07_TersCevirmeMethodu;
import day12_MethodCreation.C09_FibonacciSayisi;

public class C01_MethodCall {
    public static void main(String[] args) {

        // ilk 15 fibonacci sayisini yazdirin
        C09_FibonacciSayisi.fibonaccidenSayiYazdir(15);
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
        // asagida verilen cumlenin tersini yazdirin
        String str= "Bir kere yaparim, yan gelir yatarim";
        System.out.println(C07_TersCevirmeMethodu.metniTerseCevir(str));
        // verilen cumleyi tersine cevirin
        String tersStr=C07_TersCevirmeMethodu.metniTerseCevir(str);
        System.out.println(tersStr); // miratay rileg nay ,mirapay erek riB
        // asagida verilen cumlenin palindrome olup olmadigini yazdirin
        str= "Java Candir";
        tersStr= C07_TersCevirmeMethodu.metniTerseCevir(str); // ridnaC avaJ
        if (str.equals(tersStr)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Palindrome degil");
        }
        // asagida verilen sayinin asal sayi olup olmadigini yazdirin
        int sayi= 230;
        System.out.println(C03_AsalSayiMethod.asalSayiMi(sayi)); // true
        // kullanici true / false dan bir sey anlamaz , acik sekilde yazalim dersek
        boolean sonuc= C03_AsalSayiMethod.asalSayiMi(sayi); // true
        if (sonuc) {
            System.out.println("Girilen " + sayi + " asal.");
        }else {
            System.out.println("Girilen " + sayi + " asal sayi degil.");
        }



    }
}
