package day19_arrayList_forEachLoop.BenimSoruCozum;

import java.util.ArrayList;
import java.util.List;

public class Soru5 {
    /*
    Soru 5- Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
ayri bir liste olarak veren bir program yazin.

     */
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 3, 10, 7};
        int[] arr2 = {2, 8, 5, 3, 9, 7,14};

        List<Integer>ortakElement=new ArrayList<>();
        for (int each:arr1
             ) {
            for (int each2:arr2
                 ) {
                if(each==each2){
                  if( ! ortakElement.contains(each)){
                      ortakElement.add(each);
                  }
                }
            }

        }
        System.out.println(ortakElement);
    }
}
