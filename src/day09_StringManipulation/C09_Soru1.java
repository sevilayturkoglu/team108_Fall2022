package day09_StringManipulation;

import java.util.Scanner;

public class C09_Soru1 {
    public static void main(String[] args) {
        //Soru 1 : Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin



        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String girilenCumle= scan.nextLine().toLowerCase();



        if(girilenCumle.contains("is")&&girilenCumle.contains("ev"))
            System.out.println("Hem ev lazim hem is");
        else if(girilenCumle.contains("ev"))
          System.out.println("home home sweet home");
       else if (girilenCumle.contains("is"))
            System.out.println("calismak guzeldir");

         else if(!(girilenCumle.contains("is")&&girilenCumle.contains("ev")))
            System.out.println("cok calisman lazim");


    }
}
