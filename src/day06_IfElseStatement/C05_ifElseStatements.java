package day06_IfElseStatement;

import java.util.Scanner;

public class C05_ifElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu  giriniz");
        int not = scan.nextInt();

        if (not >= 0 && not <= 100) {
            if (not >= 85) {
                System.out.println("AA");
            } else if (not >= 65) {
                System.out.println("BB");
            } else if (not >= 50) {
                System.out.println("CC");
            } else {
                System.out.println("kaldiniz");
            }
        } else {
            System.out.println("Girilen not gecersiz");
        }
    }
}