import java.util.Scanner;

public class FirstExercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberStar = scan.nextInt(); int spacingNumber = numberStar; int spacingNumber1 = numberStar;
        String text = " "; String dot = "*";

        for (int i = 0; i <= numberStar; i++){              // Top side of pyramid
            for (int j = spacingNumber; j > 0; j--){          // For Spacing
                System.out.print(text);
            }
            spacingNumber -= 1; int counter = 0;
            while (counter<i){                                       // For Star
                System.out.print(dot);
                System.out.print(text);
                counter += 1;
            }System.out.println("");
        }

        for (int i = 0; i <= numberStar; i++){                  // Under side of pyramid
            int counter2 = 0;
            while (counter2<i){                                   // For Spacing
                System.out.print(text);
                counter2 += 1;
            }System.out.print(" ");
            for (int j = spacingNumber1-1; j > 0; j--){             // For Star
                System.out.print(dot);
                System.out.print(text);
            }
            spacingNumber1 -= 1;
            System.out.println("");
        }
    }
}

