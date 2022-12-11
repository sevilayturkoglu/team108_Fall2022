package day16_arrays.BenimSoruCozumlerim;

import java.util.Arrays;
import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {

/*
Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
olusturun
 */
        String[]arr={"Ahmet","Enes","Husamettin","Hira","Oya"};
LowestHigest(arr);
    }public static void LowestHigest(String[]argos){
        String lowest=argos[0];
        String higest=argos[0];

        for (int i = 0; i < argos.length ; i++) {
                if(argos[i].length()<lowest.length()){
                    lowest=argos[i];
                }if(argos[i].length()>higest.length()){
                    higest=argos[i];
                }
            }
            System.out.println("En kisa kelime= "+lowest+"\nen uzun kelime= "+higest);





    }
}
