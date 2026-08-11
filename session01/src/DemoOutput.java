public class DemoOutput {
    public static void main(String[] args) {
        // print - sẽ nằm trên cùng 1 dòng
        System.out.print("Nguyễn Văn A");
        System.out.print("Trần Thị B");

        System.out.println();
        // println - mỗi lần in là 1 dòng
        System.out.println("A");
        System.out.println("B");

        // printf
        String name = "Trương Văn Thuận";
        int age = 18;
        double score = 9.5;

        System.out.printf("Tên: %-30s | Tuổi: %d | Điểm: %-10.2f\n",name,age,score);

        // text block
        System.out.printf("""
                =====================================
                Tên: %s
                Tuổi: %d
                Điểm: %.2f
                =====================================
                %n""", name,age,score);

    }
}
