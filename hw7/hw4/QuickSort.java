import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] massiv = {2, 4, 5, 7, 3, 1, 8};
        int left = 0;
        int right = massiv.length - 1;
        System.out.println(Arrays.toString(quickSort(massiv, left, right)));
    }


    public static int[] quickSort(int[] massiv, int left, int right) {

        int middle = left + (right - left) / 2;
        int support = massiv[middle];
        int i = left;
        int j = right;

        while (i <= j) {
            while (massiv[i] < support) {
                i++;
            }
            while (massiv[j] > support) {
                j--;
            }
            if (i <= j) {
                int temp = massiv[i];
                massiv[i] = massiv[j];
                massiv[j] = temp;
                i++;
                j--;
            }
        }
        if (left < i)
            quickSort(massiv, left, j);
        if (right > i)
            quickSort(massiv, i, right);

        return massiv;
    }
}
