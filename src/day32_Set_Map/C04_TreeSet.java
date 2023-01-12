package day32_Set_Map;

import java.util.Set;
import java.util.TreeSet;

public class C04_TreeSet {
    public static void main(String[] args) {
        Set<Integer> sirali= new TreeSet<>();//string ise alfabeye gore,sayi ise kucukten buyuge dizerek ekler
        sirali.add(13);
        sirali.add(34);
        sirali.add(1);
        sirali.add(3);
        sirali.add(25);
        System.out.println(sirali); // [1, 3, 13, 25, 34]

    }
}
