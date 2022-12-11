package day14_doWhileLoop_Scope;

public class C03_DoWhileSoru {
    public static void main(String[] args) {
 /*
        // verilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri yazdirin
        char baslangic='f';
        char bitis='m';

*/
        char baslangic='f';
        char bitis='m';

       while (baslangic<=bitis){
           System.out.print(baslangic+" ");

          baslangic++;
       }

        System.out.println();

        char baslangic1='f';
        char bitis1='m';
        do {
            System.out.print(baslangic1 + " ");
            baslangic1= (char)(baslangic1+1);

        }while(baslangic1<=bitis1);
    }
}
