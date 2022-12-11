package day17_Arrays_Multi.SoruBen;

public class GuzelSoru {
    public static void main(String[] args) {

        /*
        --  Task 3: Count each name in sentence.
    input : String names = "Adam Adam Barry Aysun Aysun";
    output: Adam-2 Barry-1 Aysun-2
         */
        String names = "Adam Adam Barry Aysun Aysun";
        String[] newArray = names.split(" ");
        int countAdam = 0;
        int countBarry = 0;
        int countAysun = 0;

        for (int i = 0; i < newArray.length; i++) {

            if (newArray[i].equals("Adam")) {
                    countAdam++;
                }
                if (newArray[i].equals("Barry")) {
                    countBarry++;
                }
                if (newArray[i].equals("Aysun")) {
                    countAysun++;
                }

            }
        System.out.println("Adam -" + countAdam + " Barry -" + countBarry + " Aysun -" + countAysun);

    }
    }

