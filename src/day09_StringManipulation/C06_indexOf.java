package day09_StringManipulation;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {
        //Kullanicidan aldigimiz cumle "cok" ile baslayan ilk kelimeyi yazdirin
        //cumlede cok kelimesi gecmiyorsa "cumlede cok ile baslayan kelime yok" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String girilenCumle= scan.nextLine();
        // Sinavlarimizda cokdani secmeli sorular kullaniyoruz
        // javayi cok seviyoruz
        // bu kadar coklu secenek olur mu ?

        if(!girilenCumle.contains("cok")){
            System.out.println("cumlede cok ile baslayan kelime yok");
        }else{
            int cok = girilenCumle.indexOf("cok");
            int ilkBos = girilenCumle.indexOf(" ", cok);
            System.out.println(girilenCumle.substring(cok, ilkBos));
        }
    }
}
