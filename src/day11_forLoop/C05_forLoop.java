package day11_forLoop;

public class C05_forLoop {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar dahil olarak aralarindaki
       // tum sayilarin toplamini yazdirin. Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        int bas=15;
        int bitis=30;
        int top=0;
        if(bas>bitis){
            System.out.println("Baslangic degeriniz kucuk");
        }else{
            for (int i = bas; i <=bitis ; i++) {
                top+=i;
            }System.out.println("top = " + top);
        }

    }
}
