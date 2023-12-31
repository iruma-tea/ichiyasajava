package example;

public class IfElseIfSample {
    public static void main(String[] args) {
        int maxTemperature = 28;

        if (maxTemperature >= 35) {
            System.out.println("今日は猛暑日です。");
        } else if (maxTemperature >= 30) {
            System.out.println("今日は真夏日です。");
        } else if (maxTemperature >= 25) {
            System.out.println("今日は夏日です。");
        } else {
            System.out.println("今日は猛暑日ではありません。");
        }
    }
}
