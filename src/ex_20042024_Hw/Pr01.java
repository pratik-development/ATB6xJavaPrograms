//Max between 3 Numbers with ? operators.

package ex_20042024_Hw;

public class Pr01
{
    public static void main(String[] args) {
        int a = 10;
        int b = 40;
        int c = 30;

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("Maximum numbers is: " + max);

    }
}
