package algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        double[] scores = {1, 5, 2, 7, 9, 3, 4, 10, 8};

        double search = 9;

        boolean found = false;

        // Thuật toán tìm kiếm tuần tử linear search
        for (int i = 0; i < scores.length; i++) {
            // Kiểm tra
            if (scores[i] == search) {
                found = true;
                System.out.println("Vị trí tìm thấy là " + i);
                break;
            }
        }

        if(!found) {
            System.err.println("Không tìm thấy");
        }

    }
}
