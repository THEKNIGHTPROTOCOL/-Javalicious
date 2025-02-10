class SelectionSort {
    void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]) {
        int arr[] = {64, 25, 12, 22, 11};
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) System.out.print(num + " ");
    }
}
