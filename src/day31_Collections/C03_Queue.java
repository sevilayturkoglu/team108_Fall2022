package day31_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {
        //Queue sona ekleme yapar ,bastan siler fifo

        Queue<String>harfler=new LinkedList<>();
        harfler.add("H");
        harfler.add("K");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler);//[H, K, B, K]
        //1. indexe F ekle
       // harfler.add("F");
        System.out.println(harfler);//[H, K, B, K, F] Queue da basa veya araya eleman eklenmez sona eklenir

        System.out.println(harfler.remove());//H
        System.out.println(harfler);//[K, B, K, F] bastakini siler

        harfler.remove("K");//K yi sil dedik bastan buldugu ilk K yi siler
        System.out.println(harfler);//[B, K, F]

        System.out.println(harfler.element());//B en bastaki elemani verir,liste bos ise exception verir
        System.out.println(harfler.peek());//B en bastaki elemani verir,liste bos ise exception vermez null yazar
        System.out.println(harfler);//[B, K]

        Queue<String>karakterler=new LinkedList<>();
       // karakterler.element(); ici bos oldugu icin exception verir.nosuchelementexception
        System.out.println(karakterler.peek());//null

        System.out.println(harfler.poll());//B
        System.out.println(harfler);//Bastaki harfi siler,liste bos ise null doner
      //  System.out.println(karakterler.remove());//exception verir cunki liste bos
        System.out.println(karakterler.poll());//liste bos oldugu icin null doner


        harfler.offer("C");//harfler listesine C ekledi,add ile farki offer listin kapasitesine gore ekler,add ise kapasiteye bakmadan surekli ekler
    }
}
