package example;

public class IfSample {
    public static void main(String[] args) {
        String name = "太郎";
        int age = 24;
        // double height = 173;
        double height = 165;

        if (height >= 168) {
            System.out.println(name + "の身長は" + height + "cmです。");
        }
        System.out.println(name + "は" + age + "歳です。");
    }
}
