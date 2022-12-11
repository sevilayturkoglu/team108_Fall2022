package day16_arrays.BenimSoruCozumlerim;

import java.util.Arrays;

public class Soru7 {
    public static void main(String[] args) {
        /*
        Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
eski array’e yeni degeri atayin
         */
        String[] eklemeYapilacakArray={"Can","Naz","Ahsen","Kaya"};
        String eklenecekEleman="Reyhan";
        System.out.println(Arrays.toString(tamamlanmisArray(eklemeYapilacakArray, eklenecekEleman)));

    }public static String[] tamamlanmisArray(String[] eklemeYapilacakArray,String eklenecekEleman){

        String[]yeniArray=new String[eklemeYapilacakArray.length+1];
        for (int i = 0; i < yeniArray.length-1 ; i++) {
            yeniArray[i]=eklemeYapilacakArray[i];
        }yeniArray[yeniArray.length-1]=eklenecekEleman;
        return yeniArray;
    }
}
