public class Person {

    private String name;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void judgeEnough(Transportation method) {
        if (method.getPrice() <= money) {
            System.out.println(name + "可以选择" + method.getName());
        }
    }
}
