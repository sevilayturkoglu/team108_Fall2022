package day13_MethodOverloading_WhileLoop.BeninSoruCozum;

public class Soru1_presentation {
    /*
    Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
yazdirin
     */

    public static void main(String[] args) {
        int sayi=10;
        while (sayi<100){
            if(sayi%7==0)
                System.out.print(sayi+" ");
            sayi++;
        }
    }
}
