package day30_Interfaces_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N01_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);

        System.out.println(sayilar); // [5, 23, 2, 9, 11]

        // index yapisi kullanmadan tum elementleri 3 artirin
        for (Integer each:sayilar
             ) {
            System.out.print(each + 3 + " ");//8 26 5 12 14
        }
        System.out.println(" ");
        System.out.println(sayilar+"!!");//[5, 23, 2, 9, 11]!!

        // index yapisini kullanmadan tum elementleri yazdirin

        Iterator itr= sayilar.iterator();

        System.out.println(itr.next()); // 5

        System.out.println(itr.next()); // 23

        System.out.println(itr.next()); // 2

        System.out.println(itr.next());//9

        System.out.println(itr.next()); // 11
        // tek tek yapmayip bir loop ile yapalim
        System.out.println(itr.hasNext()); // false
        // iterator'da geri donus yok
        // iterator nereye gittiyse orada kalir, geri donemez
        // tum listeyi loop ile yeniden yazdirmak icin yeniden bir itr olusturmali veya
        // iterator'a yeni deger atamaliyiz
 //asagidaki iki loop da ayni seyi yapti

        itr= sayilar.iterator();
        System.out.println(itr.hasNext()); // true

        while (itr.hasNext()){

            System.out.print(itr.next() + " *");//5 *23 *2 *9 *11 *

        }
        System.out.println();
        System.out.println(sayilar+"!!");//[5, 23, 2, 9, 11]!!
// iterator kullanarak listedeki 5'den buyuk sayilari silin
        itr= sayilar.iterator();
        while (itr.hasNext()){
            Integer sayi=(Integer) itr.next();
            if(sayi>5){
                System.out.println(sayi);//23 9 11
                itr.remove();
            }
        }
        System.out.println("");
        System.out.println(sayilar); // [5, 2]


    }
}