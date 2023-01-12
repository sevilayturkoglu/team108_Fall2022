package day30_Interfaces_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N02ListIterator {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        // tum elementleri index kullanmadan 3 artirin
       ListIterator lit= sayilar.listIterator();
        for (Integer each:sayilar
             ) {
          int sayi= (int)lit.next();
         lit.set((sayi+3));

        }
        System.out.println(sayilar);//[8, 26, 5, 12, 14]

        lit= sayilar.listIterator();

        while (lit.hasNext()){
            //int sayi= (int)lit.next();alttakiyle ayni
            Integer sayi= (Integer)lit.next();

            lit.set(sayi+3);
        }

        System.out.println(sayilar);//[11, 29, 8, 15, 17]set ettik
        //zaten cursor su anda sonda. listedeki tum elementleri iterator kullanarak sondan basa dogru yazdirin

   while (lit.hasPrevious()){
       System.out.print(lit.previous()+" ");//17 15 8 29 11

   }
    }
}
