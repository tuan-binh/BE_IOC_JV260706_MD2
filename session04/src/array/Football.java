package array;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] myDreamTeam = new String[11];
        int current = 0;

        System.out.println("Bạn muốn thêm bao nhiêu cầu thủ: ");
        int number = Integer.parseInt(sc.nextLine());

        // Duyệt và thêm từng cầu thủ
        for (int i = 0; i < number; i++) {
            // Nhập tên cầu thủ
            System.out.println("Nhập tên cầu thủ: ");
            String name = sc.nextLine();

            // Thêm vào vị trí hiện tại của mảng (vị trí cuối cùng của mảng)
            myDreamTeam[current] = name;

            // Tăng vị trí cuối cùng lên 1
            current++;

        }

        // Hiển thị danh sách cầu thủ hiện có
        for (int i = 0; i < current; i++) {
            System.out.println(myDreamTeam[i]);
        }

        // Cần xóa thông tin về cầu thủ (bán cầu thủ)

        System.out.println("Nhập vị trí muốn xóa: ");
        int indexDelete = Integer.parseInt(sc.nextLine());

        if (indexDelete < 0 || indexDelete > current) {
            System.err.println("Ngoài phạm vị của danh sách cầu thủ");
        } else {
            for (int i = indexDelete; i < current - 1; i++) {
                myDreamTeam[i] = myDreamTeam[i + 1];
            }
            myDreamTeam[current - 1] = null;
            current = current - 1;

            for (int i = 0; i < current; i++) {
                System.out.println(myDreamTeam[i]);
            }
        }

        // Yêu cầu tìm hiểu thêm:
        // 1. Chèn tại 1 vị trí bất kỳ
        // 2. Xóa phần tử tại 1 vị trí bất kỳ (đã demo ròi)






    }
}
