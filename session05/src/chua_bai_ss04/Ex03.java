package chua_bai_ss04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] tempMatrix = new double[7][3];

        // Duyệt hàng (từng ngày)
        for (int i = 0; i < tempMatrix.length; i++) {
            // Duyệt từng khung giờ
            for (int j = 0; j < tempMatrix[i].length; j++) {
                System.out.printf("Nhập vào nhiệt độ của ngày %s với khung giờ %s :\n",
                        (i == 6 ? "Chủ Nhật" : "Thứ " + (i + 2)),
                        (j == 0 ? "6h" : j == 1 ? "12h" : "18h")
                );
                tempMatrix[i][j] = Double.parseDouble(sc.nextLine());
            }
        }

        // Yêu cầu:
        /*
            - 1 trung bình của 1 ngày
            - 2 trung bình của 1 khung giờ
            - 3 trung bình của cả tuần
        */

        // Tính trung bình của 1 ngày

        for (int i = 0; i < tempMatrix.length; i++) {

            double sum = 0;

            for (int j = 0; j < tempMatrix[i].length; j++) {
                sum += tempMatrix[i][j];
                System.out.printf("");
            }



            double avgDay = sum / tempMatrix[i].length;

            System.out.printf(
                    "Trung bình của ngày %s với giá trị là %.2f\n",
                    (i == 6 ? "Chủ Nhật" : "Thứ " + (i + 2)),
                    avgDay
            );

        }

        double sumWeek = 0;

        // 2. Trung bình của 1 khung giờ
        for (int i = 0; i < 3; i++) {

            double sum = 0;

            for (int j = 0; j < 7; j++) {

                sum += tempMatrix[j][i];

            }

            double avgTime = sum / 7;

            sumWeek += avgTime;

            System.out.printf(
                    "Khung giờ %s có giá trị trung bình là %.2f\n",
                    (i == 0 ? "6h" : i == 1 ? "12h" : "18h"),
                    avgTime
            );

        }

        System.out.printf("Trung bình của cả tuần là %.2f\n",(sumWeek / 3));


    }
}