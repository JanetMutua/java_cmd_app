package Janetjava;

import java.util.Locale;
import java.util.Scanner;

public class Loops {
    public static void main (String[] args){

        //===============================for loop========================================================
        // used when we know the number of repetitions

        for (int j = 0; j <6; j++)
            System.out.println("You are on level " + j);

        //==========================================while loop============================================
        //used when we do not know the repetition/ count in a loop

        int i = 0;
        while (i <4){
            System.out.println("Level " + i);
            i++;
        }

        //========================no count while loop===============================================

        Scanner userInput = new Scanner(System.in);
        String input = "";

        while (true){
            System.out.print("Enter a value: ");
            input = userInput.nextLine().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

        //=========================================Do....while loop==================================

        // rarely used

        Scanner usrInput = new Scanner(System.in);
        String myInput = "";
        do {
            System.out.print("Enter a value: ");
            myInput = usrInput.nextLine().toLowerCase();
            System.out.println(myInput);

        }while (!myInput.equals("quit"));

        //=============================================For....each======================================
        // looping over arrays
        
        String[] food = {"Fries", "Fish", "Chicken", "Pork"};
        for (int k = 0; k < food.length; k++)
            System.out.println(food[k]);

        //for each loop
        //limitation: no access to the indexes, cannot iterate backwards.

        String[] plants = {"monstera", "spider plant", "bunny-ear cactus", "bamboo palm", "rubber plant"};

        for (String plant:plants)
            System.out.println(plant);

    }
}
