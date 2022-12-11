package day17_Arrays_Multi;

import java.util.Arrays;

public class C07_Soru {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
 input :     int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
 output:                      [10, 3, 12, 10, 9]
         */
//benim yaptigim
        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        int []yeniArray=new int[arr.length];

       /* for (int i = 0; i < arr.length; i++) {
            int top=0;
            for (int j = 0; j < arr[i].length; j++) {
               top+=arr[i][j];
               yeniArray[i]=top;
            }
        }
        System.out.println(Arrays.toString(yeniArray));*/
     //hocanin yaptigi
     int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];
                yeniArray[i]=toplam;

            } toplam=0;
        }
        System.out.println(Arrays.toString(yeniArray));
    }
}
