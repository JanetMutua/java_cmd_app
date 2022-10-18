package Janetjava;

import java.util.Scanner;

public class FizzBuzz {
    public static void main (String[] args){
        Scanner gameInput = new Scanner(System.in);

        System.out.print("Number: ");
        int playFizzBuzz = gameInput.nextInt();

        //most specific conditions at the top followed by more general ones
        if (playFizzBuzz % 5 == 0 && playFizzBuzz % 3 == 0)
            System.out.println("FizzBuzz");
        else if (playFizzBuzz % 3 == 0)
            System.out.println("Buzz");

        else if (playFizzBuzz % 5 == 0)
            System.out.println("Fizz");

        else
            System.out.println(playFizzBuzz);





    }
}
