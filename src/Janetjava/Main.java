package Janetjava;

import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        //write code here
       //========================================================
       //Primitive types(8 in number)
       byte age = 23; //127
       short range = 32_000; //32k
       int views = 123_000; //2billion
       long readership = 67_523_345_456L;
       double weight = 23.00;
       float height = 54.00F;
       char name = 'J';
       boolean isPaid = true;
       weight = 45.00;
       int myView = views;
       System.out.println(weight + myView);
       //==========================================================
       //Reference Types:

       Date now = new Date();
       System.out.println(now);
       String username = "    Janet" + " Mumbua"; //this is a class/reference type
       System.out.println(username.replace("Mumbua", "Mutua"));
       System.out.println(username.trim()); //removes white space at the front and back
       System.out.println(username); //original string did not change; it is immutable.

       //===========================================================
       // Primitive vs Reference types

       byte hours = 5;
       byte minutes = hours;
       hours = 16;
       System.out.println(minutes); //minutes does not get reassigned when we change the value of hours

       Point valueOne = new Point(1,4);
       Point valueTwo = valueOne;
       valueOne.y = 34;
       System.out.println(valueTwo); // valueTwo gets reassigned

    }
}

