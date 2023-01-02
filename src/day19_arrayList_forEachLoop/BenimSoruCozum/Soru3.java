package day19_arrayList_forEachLoop.BenimSoruCozum;

import java.util.ArrayList;
import java.util.List;

public class Soru3 {
    /*
    Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
- Kelimenin uzunlugu cift sayi ise ilk yarisini
- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
yeni bir listeye ekleyip yazdirin.
     */
    public static void main(String[] args) {
        String[]arr={"Enes","Nazli","Seval"," Abdullah","Naciye"};
        List<String>eklenilecek=new ArrayList<>();
        for (String each:arr) {
            if(each.length()%2==0){
               eklenilecek.add(each.substring(0,each.length()/2));
            }else{
                eklenilecek.add(each.substring(each.length()/2));
            }
        }
        System.out.println(eklenilecek);
    }
}
