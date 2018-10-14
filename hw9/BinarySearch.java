public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 8, 9, 10, 15};
        int count = 5;
        int start = 0;
        int end = array.length - 1;
        boolean toggle = true;
        while (toggle) {
            int mid = (start + end) / 2;
            if (array[mid] == count) {
                System.out.println(mid);
                toggle = false;
            } else {
                if (array[mid] < count) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
    }
}