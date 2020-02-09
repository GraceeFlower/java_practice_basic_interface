public class Train implements Transportation {

    @Override
    public String getName() {
        return "火车";
    }

    @Override
    public int getPrice() {
        return 400;
    }
}
