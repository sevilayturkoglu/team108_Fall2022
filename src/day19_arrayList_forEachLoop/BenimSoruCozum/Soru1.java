package day19_arrayList_forEachLoop.BenimSoruCozum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru1 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

         */
        int[] mukerrer={1,2,3,3,4,5,3,6,6,7,5};

        List<Integer> mukerrersiz=new ArrayList<>();
        for (int each:mukerrer) {
            if(!mukerrersiz.contains(mukerrer[each])){
                mukerrersiz.add(each);
            }

        }
        mukerrer=new int[mukerrersiz.size()];
        for (int i = 0; i < mukerrersiz.size(); i++) {
            mukerrer[i]=mukerrersiz.get(i);
        }

        System.out.println(Arrays.toString(mukerrer));
    }
}
