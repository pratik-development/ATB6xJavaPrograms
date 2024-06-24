//Q. - int b = 10; System.out.println(--b + b++ + ++b);

package ex_20042024_Hw;

public class Pr03
{
    public static void main(String[] args)
    {
        int b = 10;

        System.out.println(--b + b++ + ++b);

        /**
         *   --b value of b 9, EP Result 9
         *   +
         *   b++ value of b 10, Ep Result 9
         *   +
         *   ++b Value of b 11, Ep Result 11
         */


      //  System.out.println(--b + b++ + ++b + b++ + ++b);


        /**
         *  ep 9 , val 9
         *  10    9
         *  11  11
         *  12  11
         *  13  13
         *
         */

    }
}
