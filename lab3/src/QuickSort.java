public class QuickSort {

    public static void sort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = arr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < opora) {
                i++;
            }

            while (arr[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sort(arr, low, j);

        if (high > i)
            sort(arr, i, high);
    }
}