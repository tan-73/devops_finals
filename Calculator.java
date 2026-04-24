import java.util.*;

public class Calculator {
    public int add (int a, int b) {
        return a+b;
    }
    
    public int sub (int a, int b) {
        return a-b;
    }

    public int mul (int a, int b) {
        return a*b;
    }

    public int div (int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b;
    }

    public static void main (String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add (69, 87));
        System.out.println(calc.sub(78, 54));
        System.out.println(calc.mul(4, 20));
        System.out.println(calc.div(20, 0));
    }
}