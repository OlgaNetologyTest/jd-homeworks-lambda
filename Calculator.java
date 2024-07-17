package Calculator;

import java.util.function.Supplier;
import java.util.function.BinaryOperator;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    private Calculator() {

    }

    public static void main(String[] args) {

        Calculator calculator = instance.get();

        BinaryOperator<Integer> plus = (x, y) -> x + y;
        BinaryOperator<Integer> minus = (x, y) -> x - y;
        BinaryOperator<Integer> devide = (x, y) -> x / y;

        int a = 10;
        int b = 5;

        System.out.println("Сложение: " + plus.apply(a, b));
        System.out.println("Вычитание: " + minus.apply(a, b));
        System.out.println("Деление: " + devide.apply(a, b));
    }
}
