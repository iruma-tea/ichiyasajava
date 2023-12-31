package example;

public class FoorLoopSample2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int num = 1; num <= 10; num++) {
            sum = sum + num;
        }
        System.out.println("1～10までの数の和は" + sum + "です。");
    }
}
