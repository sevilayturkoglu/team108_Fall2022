package day31_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekiTekrardanKurtulma {
    public static void main(String[] args) {
        // verilen bir arraydeki tekrar eden elementleri
        // sadece 1 kere yazarak array'i kisaltan kod yazin
        //set tekrarli elemani kabul etmez o nedenle set kullaniriz

        int[] arr = {1, 2, 4, 2, 3, 5, 6, 2, 4, 5, 1, 2, 4, 5, 3, 2, 5, 6, 1, 2, 5, 4, 3};

        Set<Integer> arrSet = new HashSet<>();//hizli olsun diye hashSat yaptik

        // array'deki tum elementleri, Set'e ekleyelim
        for (int each:arr
        ) {
            arrSet.add(each);
        }

        System.out.println(arrSet); // [1, 2, 3, 4, 5, 6]

        // Set'deki element sayisina esit bir array olusturup
        // Set'deki elementleri oraya tasiyalim

       arr=new int [arrSet.size()];
int arri=0;
        for (Integer each:arrSet
             ) {
            arr[arri]=each;
            arri++;
        }

        System.out.println("Array'in son hali : " + Arrays.toString(arr));

    }

    }
