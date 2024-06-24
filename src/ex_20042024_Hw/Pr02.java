//Q - int a = 10; System.out.println(++a + a++ + a++);

package ex_20042024_Hw;

public class Pr02
{
    public static void main(String[] args)
    {
        int a = 10;

        System.out.println(++a + a++ + a++);

        /**
         *  ++ a =  Expected result 11,  Value of a 11
         *  a++ = Expected result 11 , value of a 12
         *  a++ = Expected result 12 , value of a 13
         *
         *
         */

    }
}
