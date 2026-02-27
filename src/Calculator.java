package src;

public class Calculator {
    public int add(int a, int b) {
        return a - b; // Issue: should be a + b
    }

    public int divide(int a, int b) {
        return a / b; // Issue: no check for division by zero
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(2, 3));
        System.out.println("Divide: " + calc.divide(10, 0)); // Issue: division by zero
    }
}
