package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a=6.7;
        double b= 3.35;

      Add add=new Add();
                        System.out.println("addition is " +add.add((int)a,(int)b));
                        Subtract subtract=new Subtract();
                System.out.println("substraction is " +subtract.subtract((int)a,(int)b));

            Multiply multiply=new Multiply();
                System.out.println("multiplication is " +multiply.multiply((int) a,(int)b));

            Divide divide=new Divide();
                      System.out.println("division is " + divide.divide(a,b));


        }
    }
