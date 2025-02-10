import java.util.Arrays;

class CountingSort {
    void countingSort(int arr[], int maxVal) {
        int count[] = new int[maxVal + 1];
        for (int num : arr) count[num]++;
        int index = 0;
        for (int i = 0; i <= maxVal; i++)
            while (count[i]-- > 0) arr[index++] = i;
    }

    public static void main(String args[]) {
        int arr[] = {4, 2, 2, 8, 3, 3, 1};
        CountingSort cs = new CountingSort();
        cs.countingSort(arr, 8);
        System.out.println("Sorted array:");
        for (int num : arr) System.out.print(num + " ");
    }
}
