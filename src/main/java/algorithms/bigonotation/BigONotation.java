package algorithms.bigonotation;

public class BigONotation {

    /**
     * Example for O(1)
     * @param i
     */
    public void method(int i) {
        i = i + 2;
    }

    /**
     * Example for O(n)
     * @param array
     */
    public void method2(int[] array) {
        for (int i = 0; i < array.length; i++) {

        }
    }


    /**
     * Example for O(2n)
     * @param array
     */
    public void method3(int[] array) {
        for (int i = 0; i < array.length; i++) {

        }
        for (int i = 0; i < array.length; i++) {

        }
    }

    /**
     * Example for O(n*m)
     * @param array1, array2
     */
    public void method4(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

            }
        }
    }

    /**
     * Example for O(n^2)
     * @param array
     */
    public void method5(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] < array[j]){

                }
            }
        }
    }

    /**
     * Example for O(2n)
     * @param array
     */
    public void method6(int[] array) {
        for (int i = 0; i < array.length; i++) {

        }
        for (int i = 0; i < array.length; i++) {

        }
    }

}
