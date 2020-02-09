public class Bus implements Transportation {

    @Override
    public String getName() {
        return "大巴";
    }

    @Override
    public int getPrice() {
        return 300;
    }
}
