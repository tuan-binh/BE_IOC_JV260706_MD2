package abstract_class;


public class Main {
    public static void main(String[] args) {
        Actor leesin = new ActorNN("Leesin", 400, 300);
        Actor ryze = new ActorMP("Ryze", 400, 400);

        System.out.println(leesin);
        System.out.println(ryze);

        /*
            Xây dựng 1 abstract class Employee (sẽ có những thông tin chung)
            - name
            - department
            - phải có phương thức trừu tượng là calSalary();
            Có 2 lớp triển khai là:
            - EmployeePartTime
            - thuộc tính: hour, rate
            - lương parttime sẽ tính là số giờ làm việc nhận với rate
            - FullTimeEmployee
            - thuộc tính: rate
            - lương fulltime tính là rate * 8 tiếng làm việc
            Main:
            - triển khai mỗi lớp đều phải có 1 đối tượng thể hiện
            - hiển thị lương nhân viên

                    Employee
                    /      \
               FullTime   PartTime
        */
    }
}