package java_middle.strings;

public class StringManipulator {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            result.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        return result.toString();
    }
}