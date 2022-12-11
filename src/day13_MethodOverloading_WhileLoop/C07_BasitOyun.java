package day13_MethodOverloading_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {
    public static void main(String[] args) {
        /*
    random olarak 1 ile 100 arasinda bir sayi olusturun
    kullanicidan bu sayiyi bilmesini isteyin
    kullanici her deger girdiginde
    tuttugumuz sayi ile karsilastirip tahminini buyult/kucult diyelim
    kullanici tuttugumuz sayiyi bildiginde
    tahmin sayisini ve

    - 3 veya daha az tahminde bildiyse "Vaowww"
    - 4-8 tahminde bildiyse "Aferin"
    - daha fazla tahminde bildiyse "basarisiz"
    yazdirin
 */
//Benim cozum:
      /*  Random rn=new Random();
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
        }*/

        //Hocanin cozumu: tutulan sayi 0 ise ve  ilk seferde 0  bulursak consolda birsey yazmaz

        Random rnd= new Random();
        int tutulanSayi= rnd.nextInt(10);
        System.out.println(tutulanSayi);
        int sayac=1;
        int tahmin1=0;
        Scanner scan = new Scanner(System.in);
        while(tutulanSayi != tahmin1){
            System.out.println("Lutfen bir tahmin giriniz");
            tahmin1= scan.nextInt();
            if (tutulanSayi==tahmin1){ // sayiyi bulduysa
                System.out.println(sayac +" tahmin ile tuttugum sayiyi buldun");
                if (sayac<=3){
                    System.out.println("Vaowww");
                } else if (sayac<=8) {
                    System.out.println("Aferin");
                }else {
                    System.out.println("Basarisiz");
                }
                break;
            } else if (tahmin1<tutulanSayi) {
                System.out.println("Sayiyi buyut");
                sayac++;
            }else {
                System.out.println("Sayiyi kucult");
                sayac++;
            }
        }
    }
}
