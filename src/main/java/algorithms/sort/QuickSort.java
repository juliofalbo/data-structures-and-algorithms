package algorithms.sort;

public class QuickSort {

    public int[] sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        // left + (right-left)/2 -> (avoid StackOverflowError for large arrays i.e. 2GB)
        int pivot = array[(left + right)/2];

        int index = partition(array, left, right, pivot);

        quickSort(array, left, index - 1);
        quickSort(array, index, right);
    }

    private int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {

            while(array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(array, left++, right--);
            }
        }

        return left;
    }

    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public void printArray(int[] array) {
        for (int object : array) {
            System.out.println(object);
        }
    }
}