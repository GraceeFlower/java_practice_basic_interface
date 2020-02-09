public class ChooseTransportation {

    public static void main(String[] args) {
        SelfDriving self = new SelfDriving();
        Bus bus = new Bus();
        Train train = new Train();
        Flight flight = new Flight();

        Person person = new Person("小明", 300);
        person.judgeEnough(self);
        person.judgeEnough(bus);
        person.judgeEnough(train);
        person.judgeEnough(flight);
    }
}
