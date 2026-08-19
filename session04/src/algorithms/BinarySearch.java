package algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int search = 8;

        int low = 0;
        int high = numbers.length - 1;

        int findIndex = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (numbers[mid] == search) {
                findIndex = mid;
                break;
            }

            if (numbers[mid] < search) {
                low = mid + 1;
            }

            if (numbers[mid] > search) {
                high = mid - 1;
            }
        }

        if (findIndex != -1) {
            System.out.println("Đã tìm thấy tại vị trí " + findIndex);
        } else {
            System.err.println("Không tìm thấy phần tử");
        }

    }
}
