/*
Program to Perform Arithmetic Operations

Take a input from user, input1, input2 as int and ask the user what you want to do, enter char +,*,/ ,%, - ,
you will share the result by using the switch.

 */

package ex_25042024_Hw;

import java.util.Scanner;

public class Pr01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value of A");
        int a = sc.nextInt();

        System.out.println("Enter Value of B");
        int b =sc.nextInt();

        System.out.println("Enter Any arithmetic symbol to perform operation");
        int Ope =sc.next().charAt(0);

        int Result;

        switch(Ope) {
            case '+':
                Result = a + b;
                System.out.println("Addition of Two Value is " + Result);
                break;

            case '-':
                Result = a - b;
                System.out.println("Subtraction of Two Value is " + Result);
                break;

            case '*':
                Result = a * b;
                System.out.println("Multiplication of Two Value is " + Result);
                break;

            case '/':
                Result = a / b;
                System.out.println("Division of Two Value is " + Result);
                break;

            case '%':
                Result = a % b;
                System.out.println("Mod of two number is " + Result);
                break;

            default:
                System.out.println("Enter Valid Input ");
                break;

        }
        sc.close();

    }
}
