package java_middle.lambda;
import java.util.Scanner;

public class LambdaCalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 1 입력: ");
        double num1 = scanner.nextDouble();
        System.out.print("숫자 2 입력: ");
        double num2 = scanner.nextDouble();
        System.out.print("연산자 입력 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        Calculator calc;
        switch (operator) {
            case '+':
                calc = (a, b) -> a + b;
                break;
            case '-':
                calc = (a, b) -> a - b;
                break;
            case '*':
                calc = (a, b) -> a * b;
                break;
            case '/':
                calc = (a, b) -> a / b;
                break;
            default:
                throw new IllegalArgumentException("올바른 연산자가 아닙니다.");
        }

        System.out.println("결과: " + calc.operate(num1, num2));

        scanner.close();
    }
}