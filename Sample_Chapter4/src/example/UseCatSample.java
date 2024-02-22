package example;

public class UseCatSample {
    public static void main(String[] args) {
        // Cat tama = new Cat();
        // tama.name = "タマ";
        // tama.eat();
        // tama.playToy("ひも");
        // boolean h = tama.isHungry();

        // if (h == true) {
        // System.out.println("お腹がすいてるにゃ～");
        // } else {
        // System.out.println("お腹がすいていないにゃ～");
        // }

        Cat tama = new Cat();
        Cat mike = new Cat();

        tama.setName("タマ");
        tama.setAge(3);
        mike.setName("ミケ");
        mike.setAge(2);
        tama.introduceMyself();
        mike.introduceMyself();
    }
}
