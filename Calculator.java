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
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a/b;
    }

    public static void main (String[] args) {
        Calculator calc = new Calculator();
        calc.add (69, 87);
        calc.sub(78, 54);
        calc.mul(4, 20);
        calc.div(20, 4);
    }
}