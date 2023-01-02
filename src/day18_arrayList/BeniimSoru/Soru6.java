package day18_arrayList.BeniimSoru;

import java.util.ArrayList;
import java.util.List;

public class Soru6 {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
tamsayilari bir liste olarak bize donduren bir method olusturun
         */
int sayi=34;
if(sayi>1) {
    System.out.println(pozitifBolen(sayi));
}
    }public static List<Integer> pozitifBolen(int sayi){

        List<Integer>bolenler=new ArrayList<>();
        for (int s = 1; s <=sayi ; s++) {
            if(sayi%s==0){
              bolenler.add(s)  ;
            }

        }return bolenler;
    }
}
