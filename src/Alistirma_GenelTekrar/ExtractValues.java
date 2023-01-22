package Alistirma_GenelTekrar;

import java.text.DecimalFormat;

public class ExtractValues {
    /*
        Extract Values

        Given a String displaying the price and discount of an item on our app determine if the correct information is being displayed

        str = 40% off Deal $59.99 List Price: $99.99

        the format of the input String is fixed as seen above

     */
    public static void main(String[] args) {

        String str = "40% off Deal $59.99 List Price: $99.99";


        int percentage = Integer.valueOf(str.substring(0, str.indexOf("%")));
        double deal=Double.parseDouble(str.substring(str.indexOf("$")+1,str.indexOf(" List")));
       double price=Double.parseDouble(str.substring(str.lastIndexOf("$")+1));
       double check=price-(price*0.4);

        DecimalFormat deci=new DecimalFormat("00.00");//****************** cok iyi

        check=Double.parseDouble(deci.format(check));
        System.out.println(check);

        System.out.println(check == deal ? "pass" : "fail");


/*
        System.out.println(str.substring((str.indexOf("$", str.indexOf("$") + 1) + 1)));//ilk $ dan sonrak $ in indexini aldik
        int a=str.indexOf("$");
        int d=str.indexOf("$")+1;
        System.out.println(a);
        System.out.println(d);
        System.out.println(str.indexOf("$", str.indexOf("$") + 1));
        System.out.println(str.substring(str.indexOf("$", d)+1));*/



    }
}