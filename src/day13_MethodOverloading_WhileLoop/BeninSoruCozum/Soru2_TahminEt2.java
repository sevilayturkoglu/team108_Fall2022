package day13_MethodOverloading_WhileLoop.BeninSoruCozum;

import java.util.Random;
import java.util.Scanner;

public class Soru2_TahminEt2 {
    public static void main(String[] args) {
        Random rn=new Random();
        int randomSayi= rn.nextInt(20);
        System.out.println(randomSayi);
        Scanner sc=new Scanner(System.in);
        int tahmin=0;
        int count=0;
        if(randomSayi!=0) {
            while (randomSayi != tahmin) {
                System.out.println("Lutfen tahmin etmek uzere 0 ile 20 arasi bir sayi giriniz");
                tahmin = sc.nextInt();
                if(tahmin>randomSayi){
                    System.out.println("Sayi tahminini azalt");
                    count++;
                } else if (tahmin<randomSayi) {
                    System.out.println("Sayi tahminini arttir");
                    count++;
                } else if (randomSayi == tahmin) {
                    count++;
                    break;
                }
            }
            if (count <= 3) {
                System.out.println("sayiyi " + count + " seferde buldun Vaoooowww");
            } else if (count > 3 && count < 8) {
                System.out.println("Aferin");
            } else {
                System.out.println("basarisiz");
            }
        }else{
            System.out.println("tuttugunuz sayi 0 dan buyuk 20 den kucuk olmali");
        }
    }
}
