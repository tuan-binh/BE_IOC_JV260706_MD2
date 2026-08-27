package btth;

import java.util.Scanner;

public class Product {
    // thuộc tính
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private String title;
    private String description;
    private boolean status;

    // hàm khởi tạo - constructors

    public Product() {
    }

    public Product(String productId, String productName, float importPrice, float exportPrice, float profit, String title, String description, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.profit = profit;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    // phương thức
    // getter / setter

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // method - nhập
    public void inputData(Scanner sc) {
        // id - không được để trống và không được trùng

        System.out.println("Nhập mã sản phẩm: ");
        do {
            String id = sc.nextLine();
            if (id.isBlank()) {
                System.err.println("Không được để trống");
            } else {
                // kiểm tra sự tồn tại
                boolean isExist = false; // Biến cờ kiểm tra sự tồn tại
                for (int i = 0; i < Main.current; i++) {
                    if (Main.products[i].getProductId().equals(id)) {
                        isExist = true;
                        break;
                    }
                }

                if (isExist) {
                    System.err.println("Mã sản phẩm đã tồn tại");
                } else {
                    this.productId = id;
                    break;
                }
            }
        } while (true);

        // tên - không được để trống - không được trùng lặp
        System.out.println("Nhập vào tên sản phẩm: ");
        do {
            String name = sc.nextLine();
            if (name.isBlank()) {
                System.err.println("Không được để trống");
            } else {
                // kiểm tra sự tồn tại
                boolean isExist = false; // Biến cờ kiểm tra sự tồn tại
                for (int i = 0; i < Main.current; i++) {
                    if (Main.products[i].getProductName().equals(name)) {
                        isExist = true;
                        break;
                    }
                }

                if (isExist) {
                    System.err.println("Tên sản phẩm đã tồn tại");
                } else {
                    this.productName = name;
                    break;
                }
            }

        } while (true);

        // giá nhập - ko được nhỏ hơn 0
        System.out.println("Nhập giá nhập sản phẩm: ");
        do {
            float price = Float.parseFloat(sc.nextLine());

            if (price > 0) {
                this.importPrice = price;
                break;
            } else {
                System.err.println("Vui lòng nhập giá nhập phải lớn hơn 0");
            }
        } while (true);

        // giá xuất - phải lớn hơn giá nhập ít nhất 20%
        System.out.println("Nhập giá xuất sản phẩm: ");
        do {
            float price = Float.parseFloat(sc.nextLine());
            // Giá tối thiểu
            double minExportPrice = importPrice + (importPrice * 0.2);
            if (price >= minExportPrice) {
                this.exportPrice = price;
                break;
            } else {
                System.err.println("Nhập giá xuất phải lớn hơn giá nhập ít nhất 20%");
            }
        } while (true);

        // lợi nhuận
        this.profit = exportPrice - importPrice;

        // tiêu đề
        System.out.println("Nhập vào tiêu đề sản phẩm: ");
        do {
            String title = sc.nextLine();
            if(title.isBlank()) {
                System.err.println("Không được bỏ trống");
            } else {
                this.title = title;
                break;
            }
        } while (true);

        // mô tả
        System.out.println("Nhập vào mô tả sản phẩm: ");
        this.description = sc.nextLine();

        // trạng thái
        System.out.println("Nhập vào trạng thái của sản phẩm (true / false): ");
        do {
            String status = sc.nextLine();
            if(status.equalsIgnoreCase("true") || status.equalsIgnoreCase("false")) {
                this.status = Boolean.parseBoolean(status);
                break;
            } else {
                System.err.println("Nhập sai định dạng phải là true hoặc là false");
            }
        } while (true);

    }

    // method - tính lợi nhuận
    public void calProfit() {
        this.profit = this.exportPrice - this.importPrice;
    }

    // method - xuất
    public void displayData() {
        System.out.printf("""
                ------------------------------------------------------------------------
                Mã sản phẩm		: %s
                Tên sản phẩm	: %s
                Giá nhập		: %.2f
                Giá xuất		: %.2f
                Lợi nhuận		: %.2f
                Tiêu đề		    : %s
                Mô tả			: %s
                Trạng thái		: %s
                ------------------------------------------------------------------------
                """,
                this.productId,
                this.productName,
                this.importPrice,
                this.exportPrice,
                this.profit,
                this.title,
                this.description,
                this.status ? "Đang bán" : "Không bán"
                );
    }
}
