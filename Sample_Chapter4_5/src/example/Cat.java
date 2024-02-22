package example;

public class Cat {
    String name;
    int age;
    boolean hungry;

    public void eat() {
        System.out.println(name + "> ご飯を食べるよ！おいしいにゃ～");
        System.out.println(name + "> お腹が一杯になったにゃ～");
        hungry = false;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void playToy(String toy) {
        System.out.println(name + "> " + toy + "で遊ぶよ。楽しいにゃ～");
        System.out.println(name + "> 遊んでお腹が減ったにゃ～");
        hungry = true;
    }

    public void someMethod() {
        name = "タマ";
        System.out.println(name);
    }

    public void setName(String catName) {
        name = catName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int catAge) {
        age = catAge;
    }

    public int getAge() {
        return age;
    }

    public void introduceMyself() {
        String n = getName();
        int a = getAge();
        System.out.println("名前は" + n + "です。" + a + "歳です。");
    }
}
