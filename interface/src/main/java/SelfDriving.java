public class SelfDriving implements Transportation {

    @Override
    public String getName() {
        return "自驾";
    }

    @Override
    public int getPrice() {
        return 500;
    }
}
