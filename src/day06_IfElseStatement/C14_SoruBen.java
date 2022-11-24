package day06_IfElseStatement;

import java.util.Scanner;

public class C14_SoruBen {
    public static void main(String[] args) {
       /* - Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
“istediginiz birim sisteme kayitli degil” yazdirin*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen converte etmek istediginiz birimi yaziniz ");
        String converte=scan.next().toLowerCase();
        System.out.println("Lutfen kac km yol gittiginizi yaziniz ");
        double km=scan.nextDouble();
        if((converte.equals("metre")||converte.equals("cm"))&&km>0){
            System.out.println("Gittiginiz mesafe "+km * 1000 + " metre  " + km * 100000 + "  cm dir");
        }else{
            System.out.println("Istenilen birim sistemimizde kayitli degil");
        }
    }
}
