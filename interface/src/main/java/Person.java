public class Person {

    String name;
    int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void judgeEnough(Transportation method) {
        if (method.getPrice() == money) {
            System.out.println(name + "可以选择" + method.getName());
        }
    }
}
