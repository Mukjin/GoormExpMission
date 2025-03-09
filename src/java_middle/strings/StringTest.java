package java_middle.strings;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String input = scanner.nextLine();

        System.out.println("뒤집은 문자열: " + StringManipulator.reverse(input));
        System.out.println("대소문자 변환: " + StringManipulator.toggleCase(input));

        scanner.close();
    }
}