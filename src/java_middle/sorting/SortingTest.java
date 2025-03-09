package java_middle.sorting;


import java.util.Scanner;

public class SortingTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열 크기 입력: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println(size + "개의 정수를 입력하세요:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("정렬 전 배열: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        // 버블 정렬 실행
        Sorting.bubbleSort(arr);
        System.out.println("버블 정렬 후 배열: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        // 새로운 배열 입력 후 선택 정렬 실행
        System.out.println("새로운 배열 입력:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("정렬 전 배열: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        Sorting.selectionSort(arr);
        System.out.println("선택 정렬 후 배열: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        scanner.close();
    }
}
