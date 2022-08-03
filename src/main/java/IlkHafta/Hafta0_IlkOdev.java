package IlkHafta;

import java.util.Scanner;

public class Hafta0_IlkOdev {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int piramitSayi = scan.nextInt();
        int spaceNumber = piramitSayi;
        int spaceNumber1 = piramitSayi;
        String text = " ";
        String dot = "*";
        for (int i = 0; i <= piramitSayi; i++){
            for (int j = spaceNumber; j > 0; j--){
                System.out.print(text);
            }
            spaceNumber -= 1;
            int counter = 0;
            while (counter<i){
                System.out.print(dot);
                System.out.print(text);
                counter += 1;
            }System.out.println("");
        }
        for (int i = 0; i <= piramitSayi; i++){
            int counter2 = 0;
            while (counter2<i){
                System.out.print(text);
                counter2 += 1;
            }System.out.print(" ");

            for (int j = spaceNumber1-1; j > 0; j--){
                System.out.print(dot);
                System.out.print(text);
            }
            spaceNumber1 -= 1;
            System.out.println("");
        }
    }
}

