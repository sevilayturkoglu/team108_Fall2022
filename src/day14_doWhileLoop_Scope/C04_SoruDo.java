package day14_doWhileLoop_Scope;

public class C04_SoruDo {
    public static void main(String[] args) {
         /*
       //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        //  Ornek :  input : 16, output: 4

         */
        int sayi1 = 35;
        int basla1 = 1;
        boolean sonuc1 = false;
        while (basla1!=sayi1){
           if( basla1*basla1==sayi1){
               sonuc1=true;
              // System.out.println("sati tam kaer " +sonuc1);
               break;
           }basla1++;
        } System.out.println("sonuc1 tam kare mi "+sonuc1);

//doWhile ile yapilisi


        int sayi = 20;
        int basla = 1;
        boolean sonuc = false;
       do{
           if(basla*basla==sayi){
               sonuc=true;
               break;
           }basla++;

       }while (basla!=sayi);
        System.out.println("sonuc tam kare mi "+sonuc);
    }
}
