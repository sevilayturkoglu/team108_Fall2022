package day30_Interfaces_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class soru3 {
    public static void main(String[] args) {
        /*
        Soru 3) (iterator ile index kullanimina ornek) Bir listedeki ilk n elemani iterator
kullanarak 5 artirin.
Orn : list : [2,13,56,23,45,14,40]
artirilmasi istenen eleman sayisi : 3
output: [7,18,61,23,45,14,40]
         */
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(56);
        sayilar.add(23);
        sayilar.add(45);
        sayilar.add(14);
        sayilar.add(40);

      int n=3;
      int arrtir=5;

        ListIterator ite= sayilar.listIterator();

        for (int i = 0; i <n; i++) {
        int sayi=(int)ite.next();
        ite.set(sayi+arrtir);
        }
        System.out.print(sayilar+" ");

    }
}
