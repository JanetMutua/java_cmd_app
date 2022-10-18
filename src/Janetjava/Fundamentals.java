package Janetjava;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Fundamentals {
    public static void main (String[] args){
        //Arrays
        //==========================================================
        // older syntax
        int[] ages = new int[7];
        ages[0] = 23;
        System.out.println(Arrays.toString(ages));

        //newer syntax of initializing an array

        int[] grades = {67, 78, 90, 56, 94};
        Arrays.sort(grades);
        System.out.println(grades.length);
        System.out.println(Arrays.toString(grades));

        int[] marks = {444, 78, 56, 90, 123};
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));

        //================================================================================
        //multidimensional arrays
        //========================Old syntax==============================================

        int[][] twoD = new int[2][3];
        System.out.println(Arrays.deepToString(twoD));

        int [][][] threeD = new int[2][2][3];
        System.out.println(Arrays.deepToString(threeD));

        //======================New Syntax================================================

        int[][] newArr = {{4, 7, 1}, {7, 9, 12}};
        System.out.println(Arrays.deepToString(newArr));

        //====================================================================================
        //constants

        final float PI = 3.14F;

        //Arithmetic expressions

        double myNum = (double)10/ (double)4;
        System.out.println(myNum);

        int num2 = 23;
        ++num2; //can work both as a prefix and a suffix
        System.out.println(num2);

        //============================Incrementation================================
        int x = 3;
        int y = x++;
        int z = ++x; //note the difference
        System.out.println(y);

        //============================double incrementation==========================
        //Augmented/ Compound assignment operators
        // +=, -=, /=, *=

        int thisNum = 1;
        thisNum += 2;
        System.out.println(thisNum);

        //==================================Casting================================

        //Implicit or automatic casting/ conversion (no chance of data loss)
        // byte > short > int >long > float > double
        short h = 2;
        int t = h + 7;
        System.out.println(t);

        double m = 4.5;
        double u = m + 4;
        System.out.println(u);

        // explicit casting

        double j = 56.77;
        int k = (int)j + 2;
        System.out.println(k);

        String ourNum = "4";
        int d = Integer.parseInt(ourNum) + 45;
        System.out.println(d);

        //======================================Math class========================

        int calc = (int)Math.floor(2.5F);
        System.out.println(calc);

        int l = Math.min(4, 5);
        System.out.println(l);

        int numCalc = (int)(Math.random() * 100);
        System.out.println(numCalc);

        //=====================================Formatting numbers=============================

        String currency = NumberFormat.getPercentInstance().format(0.05);
        System.out.println(currency);

        //======================================Reading Input==================================

        Scanner quiz = new Scanner(System.in);
        System.out.print("Name: ");
        String usr = quiz.nextLine().trim();
        System.out.println("You are " + usr);














    }
}
