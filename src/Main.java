public class Main {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {10, 9, 4, 5, 2, 7, 4, 8, 3};
        int[] array3 = {2, 1};
        int[] array4 = {1};
        int[] array5 = {};

        quickSort(array1, 0, array1.length - 1);
        quickSort(array2, 0, array2.length - 1);
        quickSort(array3, 0, array3.length - 1);
        quickSort(array4, 0, array4.length - 1);
        quickSort(array5, 0, array5.length - 1);
    }

    public static int[] quickSort(int[] sourceArray, int low, int high) {

        if (sourceArray.length == 1) {
            return sourceArray;
        }
        if (low >= high) {
            return sourceArray;
        }

        int midElement = (low + high) / 2;
        int supportElement = sourceArray[midElement];
        int i = low, j = high;

        while (i <= j) {
            while (sourceArray[i] < supportElement) {
                i++;
            }
            while (sourceArray[j] > supportElement) {
                j--;
            }

            if (i <= j) {
                int temp = sourceArray[i];
                sourceArray[i] = sourceArray[j];
                sourceArray[j] = temp;
                i++;
                j--;
            }
            if (low < j) {
                quickSort(sourceArray, low, j);
            }
            if (high > i) {
                quickSort(sourceArray, i, high);
            }

        }
        return sourceArray;
    }
}
