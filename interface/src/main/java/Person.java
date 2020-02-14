public class Person {

    private String name;
    private int budget;

    public Person() {

    }

    public Person(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void checkBudget(Transportation method) {
        if (method.getPrice() <= budget) {
            System.out.println(name + "可以选择" + method.getName());
        }
    }
}
