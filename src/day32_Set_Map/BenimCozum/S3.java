package day32_Set_Map.BenimCozum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S3 {
    public static void main(String[] args) {
        /*
        Soru : Verilen bir array’deki tekrar eden elementleri silerek, her element’den
sadece bir tane olacak sekilde yeni bir array olusturun.

         */
        int[] arr = {1, 2, 4, 2, 3, 5, 6, 2, 4, 5, 1, 2, 4, 5, 3, 2, 5, 6, 1, 2, 5, 4, 3};

        Set<Integer> arrSet = new HashSet<>();
        for (int each:arr
             ) {
            arrSet.add(each);
        }
        System.out.println(arrSet);
        arr=new int[arrSet.size()];

        int index=0;
        for (int each:arrSet
             ) {
            arr[index]=each;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
