package chua_bai_ss06_ex06;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số lượng chi nhánh: ");
        int n = Integer.parseInt(sc.nextLine());

        // 1 mảng lưu tên chi nhánh và là mảng 1 chiều
        String[] branchNames = new String[n]; // Khởi tạo theo số lượng chi nhánh

        // 1 mảng lưu doanh thu theo quý là mảng 2 chiều Nx4 (4 đại diện cho 4 quý)
        double[][] revenues = new double[n][4];

        // Nhập
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tên chi nhánh: ");
            branchNames[i] = sc.nextLine();
            for (int j = 0; j < 4; j++) {
                System.out.println("Nhập vào doanh thu quý " + (j + 1) + " : ");
                revenues[i][j] = Double.parseDouble(sc.nextLine());
            }
        }

        // Yêu cầu:
        // 1. chuẩn hóa lại tên các chi nhánh
        /*
            hànội -> Hà Nội
            1. xử lý chuỗi có khoảng trắng đầu và cuối trim()
            2. xử lý chuỗi có khoảng trắng ở giữa replaceAll(\\s+, ' ')
            3. split(' ') để về mảng -> duyệt và cho từng phần tử in hoa chữ cái đầu bằng cách charAt(0).toUpperCase()
        */

        for (int i = 0; i < n; i++) {
            // xử lý cho từng phần tử
            // 1. xử lý chuỗi có khoảng trắng đầu và cuối trim()
            branchNames[i] = branchNames[i].trim();
            // 2. xử lý chuỗi có khoảng trắng ở giữa replaceAll(\\s+, ' ')
            branchNames[i] = branchNames[i].replaceAll("\\s+", " ");
            // 3. split(' ') để về mảng -> duyệt và cho từng phần tử in hoa chữ cái đầu bằng cách charAt(0).toUpperCase()
            String[] name = branchNames[i].split(" ");
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < name.length; j++) {
                name[j] = String.valueOf(name[j].charAt(0)).toUpperCase() + name[j].substring(1).toLowerCase();
                str.append(name[j]).append(j == name.length - 1 ? "" : " ");
            }
            // Cần gắn lại sau khi được chuẩn hóa tên
            branchNames[i] = str.toString();
        }

        // Hiển thị mảng ra (Không khuyến nghĩ sử dụng cách này để hiển thị mà dùng for)
        System.out.println(Arrays.toString(branchNames));

        // 2. Tính doanh thu cả năm của từng chi nhánh
        double[] totalYearRevenues = new double[n];
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += revenues[i][j];
            }
            totalYearRevenues[i] = sum;
            System.out.println("Chi nhánh " + (i + 1) + " có doanh thu là " + sum);
        }

        // 3. Sắp xếp mảng 2 chiều với tổng doanh thu giảm dần

        for (int i = 0; i < totalYearRevenues.length - 1; i++) {
            for (int j = i + 1; j < totalYearRevenues.length; j++) {
                if(totalYearRevenues[i] < totalYearRevenues[j]) {
                    // đảo vị trí mảng tổng tiền
                    double temp = totalYearRevenues[i];
                    totalYearRevenues[i] = totalYearRevenues[j];
                    totalYearRevenues[j] = temp;

                    // đảo vị trí mảng thống kế revenues
                    for (int k = 0; k < 4; k++) {
                        double tempRevenues = revenues[i][k];
                        revenues[i][k] = revenues[j][k];
                        revenues[j][k] = tempRevenues;
                    }

                    // dảo vị trí mảng tên
                    String tempName = branchNames[i];
                    branchNames[i] = branchNames[j];
                    branchNames[j] = tempName;
                }
            }
        }

        System.out.println(Arrays.toString(branchNames));
        System.out.println(Arrays.toString(totalYearRevenues));

        for (int i = 0; i < revenues.length; i++) {
            for (int j = 0; j < revenues[i].length; j++) {
                System.out.print(revenues[i][j] + " ");
            }
            System.out.println();
        }

    }
}