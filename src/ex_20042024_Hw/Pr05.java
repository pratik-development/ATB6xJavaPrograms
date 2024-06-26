package ex_20042024_Hw;

public class Pr05
{
    public static void main(String[] args) {
        int a = 10 ;

        System.out.println(++a + a++ + ++a + a++ + a++);
    }
}
/**
 R		A
 11		11
 11		12
 13		13
 13		14
 14		15

 **/