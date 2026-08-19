package btth;

/*
Thực hiện menu:
Quản lý danh sách điểm số (cố định 30 điểm trong danh sách - số lượng điểm)
Điểm thì phải nằm trong từ 0  đến 10
============== MENU ==============
Thêm mới điểm vào danh sách
Chỉnh sửa điểm
Xóa điểm
Tính điểm trung bình của lớp
Tìm kiếm điểm mười đầu tiên
Sắp xếp điểm tăng dần
Thoát

Menu phải thực hiện liên tục không dừng cho đến khi bấm thoát
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] scores = new double[30];
        int current = 0;

        do {
            System.out.println("""
                    ============== MENU ==============
                    1. Thêm mới điểm vào danh sách
                    2. Chỉnh sửa điểm
                    3. Xóa điểm
                    4. Tính điểm trung bình của lớp
                    5. Tìm kiếm điểm mười đầu tiên
                    6. Sắp xếp điểm tăng dần
                    7. Thoát
                    Lựa chọn của bạn:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    System.out.println("Bạn muốn thêm bao nhiêu điểm: ");
                    int n = Integer.parseInt(sc.nextLine());

                    if (current + n > 30) {
                        System.err.println("Đã quá giới hạn rồi");
                        break;
                    }

                    // duyệt
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập điểm sinh viên: ");
                        double score;
                        do {
                            score = Double.parseDouble(sc.nextLine());
                            if (score < 0 || score > 10) {
                                System.err.println("Vui lòng nhập điểm từ 0 đến 10");
                            } else {
                                break;
                            }
                        } while (true);


                        scores[current] = score;
                        current++;
                    }

                    // Hiển thị thông tin sau khi thực hiện chức năng
                    for (int i = 0; i < current; i++) {
                        System.out.println(scores[i]);
                    }

                    break;
                }
                case 2: {
                    System.out.println("Nhập vào vị trí muốn sửa: ");
                    int indexUpdate = Integer.parseInt(sc.nextLine());

                    // kiểm tra
                    if (indexUpdate < 0 || indexUpdate >= current) {
                        System.err.println("Vui lòng làm lại vì đã vướt ngoài phạm vi");
                        break;
                    }

                    System.out.println("Nhập vào giá trị mới: ");
                    double newScore;
                    do {
                        newScore = Double.parseDouble(sc.nextLine());
                        if (newScore < 0 || newScore > 10) {
                            System.err.println("Vui lòng nhập điểm từ 0 đến 10");
                        } else {
                            break;
                        }
                    } while (true);

                    scores[indexUpdate] = newScore;

                    // Hiển thị thông tin sau khi thực hiện chức năng
                    for (int i = 0; i < current; i++) {
                        System.out.println(scores[i]);
                    }
                    break;
                }
                case 3: {

                    System.out.println("Nhập vào vị trí muốn xóa: ");
                    int indexDelete = Integer.parseInt(sc.nextLine());

                    // kiểm tra
                    if (indexDelete < 0 || indexDelete >= current) {
                        System.err.println("Vui lòng làm lại vì đã vướt ngoài phạm vi");
                        break;
                    }

                    // thực hiện xóa

                    for (int i = indexDelete; i < current - 1; i++) {
                        scores[i] = scores[i + 1];
                    }

                    scores[current - 1] = 0.0;
                    current--;

                    // Hiển thị thông tin sau khi thực hiện chức năng
                    for (int i = 0; i < current; i++) {
                        System.out.println(scores[i]);
                    }
                    break;
                }
                case 4: {
                    double sum = 0;
                    for (int i = 0; i < current; i++) {
                        sum += scores[i];
                    }

                    double avg = sum / current;
                    System.out.println("Trung bình điểm là: " + avg);

                    break;
                }
                case 5: {
                    int findScore = 10;

                    boolean found = false;

                    for (int i = 0; i < current; i++) {
                        if (scores[i] == findScore) {
                            found = true;
                            System.out.println("Vị trí điểm 10 đầu tiền là " + i);
                            break;
                        }
                    }

                    if (!found) {
                        System.err.println("Không tìm thấy");
                    }

                    break;
                }
                case 6: {

                    for (int i = 0; i < current - 1; i++) {
                        for (int j = i + 1; j < current; j++) {
                            if (scores[i] > scores[j]) {
                                double temp = scores[i];
                                scores[i] = scores[j];
                                scores[j] = temp;
                            }
                        }
                    }

                    // Hiển thị thông tin sau khi thực hiện chức năng
                    for (int i = 0; i < current; i++) {
                        System.out.println(scores[i]);
                    }

                    break;
                }
                case 7:
                    System.out.println("Cảm ơn các bạn đã sử dụng chương trình");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng nhập lại từ 1 đến 7");
            }
        } while (true);

    }
}
