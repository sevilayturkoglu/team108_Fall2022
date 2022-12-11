package day17_Arrays_Multi.SoruBen;

public class Soru4 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
method olusturun
         */int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10}};

        System.out.println(carpGetir(arr));
    }
    public static int carpGetir(int[][] arr){
        int carpim=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                carpim*=arr[i][j];
            }
        }
        return carpim;
    }
}
