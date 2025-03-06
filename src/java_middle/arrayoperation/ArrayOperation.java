package java_middle.arrayoperation;
public class ArrayOperation {
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void updateArray(int[] arr, int index, int newValue) {
        if (index >= 0 && index < arr.length) {
            arr[index] = newValue;
        } else {
            System.out.println("잘못된 인덱스입니다.");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("평균: " + calculateAverage(numbers));

        updateArray(numbers, 2, 100);
        System.out.println("변경 후 배열: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
