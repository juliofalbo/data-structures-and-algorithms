package algorithms.sort;

/**
 * Runtime Characteristic: O(n log(n))
 */
public class MergeSort {

    public void sort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            sort(array, left, middle);
            sort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    public void merge(int[] array, int left, int middle, int right) {
        int sizeLeftArray = middle - left + 1;
        int sizeRightArray = right - middle;

        int[] leftArray = new int[sizeLeftArray];
        int[] rightArray = new int[sizeRightArray];

        for (int i = 0; i < sizeLeftArray; ++i) {
            leftArray[i] = array[left + i];

        }
        for (int j = 0; j < sizeRightArray; ++j) {
            rightArray[j] = array[middle + 1 + j];
        }

        int i = 0;
        int j = 0;

        int k = left;
        while (i < sizeLeftArray && j < sizeRightArray) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < sizeLeftArray) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < sizeRightArray) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void printArray(int array[]) {
        for (final int object : array) {
            System.out.print(object + " ");
        }
    }

}