package java_middle.exception;

import java.util.Scanner;

public class Calculator {
    public static double calculate(double num1, double num2, char operator) throws ArithmeticException {
        switch (operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/':
                if (num2 == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
                return num1 / num2;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("첫 번째 숫자 입력: ");
            double num1 = scanner.nextDouble();
            System.out.print("연산자 입력 (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            System.out.print("두 번째 숫자 입력: ");
            double num2 = scanner.nextDouble();

            double result = calculate(num1, num2, operator);
            System.out.println("결과: " + result);
        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
