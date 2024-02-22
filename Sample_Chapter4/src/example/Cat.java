package example;

public class Cat {
    String name;
    boolean hungry;

    void eat() {
        System.out.println(name + "> ご飯を食べるよ！おいしいにゃ～");
        System.out.println(name + "> お腹が一杯になったにゃ～");
        hungry = false;
    }

    boolean isHungry() {
        return hungry;
    }

    void playToy(String toy) {
        System.out.println(name + "> " + toy + "で遊ぶよ。楽しいにゃ～");
        System.out.println(name + "> 遊んでお腹が減ったにゃ～");
        hungry = true;
    }

    void someMethod() {
        name = "タマ";
        System.out.println(name);
    }
}
