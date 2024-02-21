package example;

public class WhileLoopSample {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;

        while (sum < 100) {
            num = num + 1;
            sum = sum + num;
        }
        System.out.println("1から" + num + "までの数の和は" + sum + "です。");
    }
}
