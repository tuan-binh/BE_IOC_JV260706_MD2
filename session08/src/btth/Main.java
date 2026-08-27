package btth;

import java.util.Scanner;

public class Main {
    public static Product[] products = new Product[100];
    public static int current = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("""
                    ==================== PRODUCT MANAGEMENT ====================
                    1. Nhập sản phẩm
                    2. Hiển thị thông tin sản phẩm
                    3. Tính lợi nhuận các sản phẩm
                    4. Cập nhật sản phẩm
                    5. Xóa sản phẩm
                    6. Sắp xếp sản phẩm theo giá xuất giảm dần
                    7. Tìm kiếm sản phẩm theo tên
                    8. Tìm kiếm sản phẩm theo khoảng giá
                    9. Thống kê sản phẩm có tỷ suất lợi nhuận từ 30% - 40%
                    10. Thoát
                    ============================================================
                    Lựa chọn của bạn:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    // bạn muốn thêm bao nhiều sản phẩm
                    System.out.println("Bạn muốn thêm bao nhiều sản phẩm: ");
                    int n = Integer.parseInt(sc.nextLine());

                    // dùng vòng lặp để duyệt
                    for (int i = 0; i < n; i++) {
                        Product product = new Product();
                        product.inputData(sc);
                        // thêm vào mảng
                        products[current] = product;
                        current++;
                    }
                    break;
                case 2:
                    if (current == 0) {
                        System.err.println("Danh sách sản phẩm đang rỗng");
                    } else {
                        for (int i = 0; i < current; i++) {
                            products[i].displayData();
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    // nhập vào id sản phẩm muốn sửa
                    System.out.println("Nhập mã sản phẩm: ");
                    String idUpdate = sc.nextLine();

                    // tìm sản phẩm có tồn tại hay không
                    int indexUpdate = -1;
                    for (int i = 0; i < current; i++) {
                        if (Main.products[i].getProductId().equals(idUpdate)) {
                            indexUpdate = i;
                            break;
                        }
                    }
                    // tồn tại hiển thị ra menu cho người dùng lựa chọn cập nhật trường nào
                    if (indexUpdate == -1) {
                        System.err.println("Không tồn tại mã sản phẩm " + idUpdate);
                    } else {
                        // dùng menu để cập nhật
                        do {
                            // Có thể hiển thị thông tin cũ ra
                            System.out.println("Thông tin cũ: ");
                            products[indexUpdate].displayData();
                            System.out.println("""
                                    1. Cập nhật tên
                                    2. Cập nhật giá nhập
                                    3. Cập nhật giá xuất
                                    4. Cập nhật tiêu đề
                                    5. Cập nhật mô tả
                                    6. Cập nhật trạng thái
                                    7. Lưu và thoát
                                    """);
                            int choiceUpdate = Integer.parseInt(sc.nextLine());
                            switch (choiceUpdate) {
                                case 1:
                                    System.out.println("Nhập tên: ");
                                    products[indexUpdate].setProductName(sc.nextLine());
                                    break;
                                case 2:
                                    System.out.println("Nhập giá nhập: ");
                                    products[indexUpdate].setImportPrice(Float.parseFloat(sc.nextLine()));
                                    break;
                                case 3:
                                    System.out.println("Nhập giá xuất: ");
                                    products[indexUpdate].setExportPrice(Float.parseFloat(sc.nextLine()));
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    break;
                                case 7:
                                    break;
                                default:
                                    System.err.println("Vui lòng nhập lại từ 1 -> 7");
                            }

                        } while (true);
                        // lưu vào danh sách
                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
            }
        } while (true);
    }
}
