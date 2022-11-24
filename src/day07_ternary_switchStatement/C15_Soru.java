package day07_ternary_switchStatement;

public class C15_Soru {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin
        int sayi=35;
        int birlerBasamagi= sayi%10;
        switch (sayi/10){
            case 1:
                System.out.print("on");
                break;
            case 2:
                System.out.print("yirmi");
                break;
            case 3:
                System.out.print("otuz");
                break;
            case 4:
                System.out.print("kirk");
                break;
            case 5:
                System.out.print("elli");
                break;
            case 6:
                System.out.print("atmis");
                break;
            case 7:
                System.out.print("yetmis");
                break;
            case 8:
                System.out.print("seksen");
                break;
            case 9:
                System.out.print("doksan");
                break;
        }
        switch (sayi%10){

            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
        }



    }
        }





