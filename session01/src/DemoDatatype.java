public class DemoDatatype {
    public static void main(String[] args) {
        /**
         * byte
         * short
         * int
         * long
         *
         * float
         * double
         *
         * char
         *
         * boolean
         * */
        long money = 15000000;

        float score = 9.5f;

        double mathPoint = 8.5;

        // Implixit ép ngầm định -> ép từ nhỏ cho đến to

        double newScore = score;

        // Explixit - ép kiểu tường minh -> ép từ cái to về cái nhỏ

        int newMoney = (int) money;
    }
}
