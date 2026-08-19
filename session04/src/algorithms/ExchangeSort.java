package algorithms;

public class ExchangeSort {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 7, 9, 2, 8, 6, 3};

        System.out.println("Trước khi sắp xếp");
        // for each
        for (int n : numbers) {
            System.out.println(n);
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Sau khi sắp xếp");
        // for each
        for (int n : numbers) {
            System.out.println(n);
        }

    }
}
