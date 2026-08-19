package array;

public class Main {
    public static void main(String[] args) {
        // Datatype[] arrayName = new Datatype[ quantity ]

//        String[] soccerPlayers = new String[11];

        // Quy tắc của giá trị default
        // những kiểu nguyên thủy số -> 0
        // những kiểu đối tượng mặc định là -> null

        // [null, null]

//        System.out.println(soccerPlayers);

        // Thêm phần tử hardcode - viết code cứng

//        soccerPlayers[0] = "Bellingham";
//        soccerPlayers[1] = "Mbappe";
//        soccerPlayers[2] = "Vinicius";
//        soccerPlayers[3] = "Rudiger";

//        Khái báo và khởi tạo giá trị trong mảng

        String[] soccerPlayers = {"Bellingham","Mbappe","Vinicius","Rudiger"};

        // Làm sao để hiển thị được đây?
        for (int i = 0; i < soccerPlayers.length; i++) {
            // Để có thể truy cập được vào phần tử trong mảng
            // Sử dụng cú pháp: arrayName[ vị trí ] -> giá trị tại vị trí đó
            System.out.println(soccerPlayers[i]);
        }


    }
}