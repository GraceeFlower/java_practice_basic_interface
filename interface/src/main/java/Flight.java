public class Flight implements Transportation {

    @Override
    public String getName() {
        return "飞机";
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
