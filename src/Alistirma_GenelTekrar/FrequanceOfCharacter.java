package Alistirma_GenelTekrar;

public class FrequanceOfCharacter {
     /*
        Frequency Of Characters

        Given a String that has multiple of the same characters determine the frequency of each character. Output a concatenated String that shows the character and the frequency of it

        input:
            aaaabcccdd
        output:
            a4b1c3d2
     */

    public static void main(String[] args) {
        String str = "AAaaBBeecczzaaaaaaff";
        String result = "";
        System.out.println(str.replace("a", ""));
        while(!str.isEmpty()){
            int origLength = str.length(); // 10
            String currentChar = str.substring(0,1);
            str = str.replace(currentChar, "");//tum a lar gidiyor ve lengthi kac kisaliyorsa o kadar a vardir
            result += currentChar + (origLength - str.length());
        }

        System.out.println(result);

    }
}

