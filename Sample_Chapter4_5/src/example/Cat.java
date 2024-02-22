package example;

public class Cat {
    private String name;
    private int age;
    private boolean hungry;

    private void printMessage(String message) {
        System.out.println(name + "> " + message);
    }

    public void eat() {
        printMessage("ご飯を食べるよ！おいしいにゃ～");
        printMessage("お腹が一杯になったにゃ～");
        hungry = false;
    }

    public void eat(String food) {
        printMessage(food + "ご飯を食べるよ！おいしいにゃ～");
        printMessage("お腹が一杯になったにゃ～");
        hungry = false;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void playToy() {
        printMessage("おもちゃで遊ぶよ。楽しいにゃ～");
        printMessage("遊んでお腹が減ったにゃ～");
        hungry = true;
    }

    public void playToy(String toy) {
        printMessage(toy + "で遊ぶよ。楽しいにゃ～");
        printMessage("遊んでお腹が減ったにゃ～");
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
        System.out.println("名前は" + getName() + "です。" + getAge() + "歳です。");
    }
}
