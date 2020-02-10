import java.util.ArrayList;

public class ChooseTransportation {

    public static void main(String[] args) {
        Transportation self = new SelfDriving();
        Transportation bus = new Bus();
        Transportation train = new Train();
        Transportation flight = new Flight();

        Person person = new Person("小明", 300);

        ArrayList<Transportation> methodList = new ArrayList<>();
        methodList.add(self);
        methodList.add(bus);
        methodList.add(train);
        methodList.add(flight);

        for (Transportation i: methodList) {
            person.judgeEnough(i);
        }

    }
}
