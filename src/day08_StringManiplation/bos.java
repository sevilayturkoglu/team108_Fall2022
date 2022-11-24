package day08_StringManiplation;

public class bos {
    public static void main(String[] args) {
        String cinsiyet = "KaDin";
        int yas = 55;
        if(cinsiyet.equals("Erkek")){
            if(yas<18) {
                System.out.println("a");

            }  else {
                System.out.println("b");
            }
        } else if (cinsiyet.equalsIgnoreCase("kadin")) {
            if(yas<18) {
                System.out.println("c");
            } else {
                System.out.println("d");
            }
        }else System.out.println("e");




        if(cinsiyet.equals("Erkek")){
            if(yas<18) System.out.println("a");
            else System.out.println("b");

        } else if (cinsiyet.equalsIgnoreCase("kadin")) {
            if(yas<18) System.out.println("c");
            else System.out.println("d");

        }else System.out.println("e");

    }


    }

