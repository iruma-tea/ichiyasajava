package example;

public class ForLoopSample2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int num = 1; num < 10; ++num) {
            sum = sum + num;
        }
        System.out.println("1から10までの数の和は" + sum + "です。");
    }
}
