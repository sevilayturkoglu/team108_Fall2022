package day19_arrayList_forEachLoop.BenimSoruCozum;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=sc.nextLine();
        System.out.println("Lutfen sayisini merak ettiginiz harfi giriniz");
        String harf=sc.next().toLowerCase().substring(0,1);
        int count=0;
        String []split=cumle.split("");
        for (String each: split
             ) {
            if(each.equalsIgnoreCase(harf)){
                count++;
            }
        }
        System.out.println("verdiginiz " + harf + " harfi " + count + "  kere tekrar etmiz");
    }
}
