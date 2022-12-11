package day16_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C11_Odev {
    // Kullanici yeni deger verdigi muddetce C10'daki hazir method'u kullanarak eklemeye devam edin
// Kullanici Q'ya bastiginda, array'in son halini döndürün
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen eklenmek uzere kelime giriniz bitirmek icin q a basin");

        String[] isimler={"Ali, Veli, Cem"};
        String eklenecekIsim="";

        while (!eklenecekIsim.equalsIgnoreCase("q")) {
            eklenecekIsim = sc.next();
            if (!eklenecekIsim.equals("q")) {
                isimler = C10_ArrayeBirElemanEkleme.arrayeElementEkleme(isimler, eklenecekIsim);
            }
        }
        System.out.println(Arrays.toString(isimler));


    }

}
