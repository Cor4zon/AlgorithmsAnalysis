import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        singleTest();
    }

    protected static void singleTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of numbers: ");
        int numberCount = scanner.nextInt();
        int[] numbers = new int[numberCount];

        System.out.println("Input numbers:");
        for (int i = 0; i < numberCount; i++)
            numbers[i] = scanner.nextInt();

//        BubbleSort.sort(numbers);
//        InsertionSort.sort(numbers);
        QuickSort.sort(numbers, 0, numberCount-1);
        System.out.println(Arrays.toString(numbers));
    };
}