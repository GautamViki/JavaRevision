import java.util.Arrays;

abstract class SortingAlgorithm {
    abstract void sort(int[] arr, int n);
}

class SelectionSort extends SortingAlgorithm {

    @Override
    void sort(int[] arr, int n) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println("Selection Sort ");
        System.out.println(Arrays.toString(arr));
    }
}

class InsertionSort extends SortingAlgorithm {

    @Override
    void sort(int[] array, int n) {
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
        System.out.println("Insertion Sort ");
        System.out.println(Arrays.toString(array));
    }
}

class BubbleSort extends SortingAlgorithm {

    @Override
    void sort(int[] arr, int n) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Bubble Sort");
        System.out.println(Arrays.toString(arr));
    }
}

class Main {
    public static void main(String[] args) {
        int[] arr = {8, 7, 10, 52, 14, 20, 17, 5, 9, 13};
        SortingAlgorithm selectionSort = new SelectionSort();
        selectionSort.sort(arr, arr.length);

        SortingAlgorithm insertionSort = new InsertionSort();
        insertionSort.sort(arr, arr.length);

        SortingAlgorithm bubble = new BubbleSort();
        bubble.sort(arr, arr.length);
    }
}
