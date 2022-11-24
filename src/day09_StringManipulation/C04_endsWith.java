package day09_StringManipulation;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        String str= "Java ogrenen issiz kalmaz";
        System.out.println(str.endsWith("kalmaz")); // true
        System.out.println(str.endsWith("Java ogrenen issiz kalmaz")); // true
        System.out.println(str.endsWith("")); // true

        // SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mailinizi giriniz");
        String str1=scan.nextLine();

if(!str1.contains("@")){
    System.out.println("gecersiz mail");
} else if (!str1.endsWith("@gmail.com")) {
    System.out.println("mailde yazim hatasi var");
} else if (!str1.contains("@gmail")) {
    System.out.println("mail gmail olmali");
}


        System.out.println("***********************");





        if (!str1.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!str1.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!str1.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }
    }
}
