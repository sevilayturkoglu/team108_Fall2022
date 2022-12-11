package day15_scope_arrays;

import java.util.Scanner;

public class sil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String girdi = "";
        String isim = "";
        while (!(girdi.equalsIgnoreCase("tamam"))) {
            System.out.println("Lutfen isim giriniz");
            girdi = scan.nextLine();
            if (!(girdi.equalsIgnoreCase("tamam"))) {
                if (isim.length() == 0) {
                    isim += girdi;
                } else {
                    isim += "*" + girdi;
                }
            }
        }
        System.out.print(isim);
    }

}