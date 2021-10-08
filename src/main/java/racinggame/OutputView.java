package racinggame;

import java.util.List;

public class OutputView {
    public static void printResult(List<Car> cars) {
        for(Car car : cars){
            System.out.println(car.getName()+":"+car.getCount());
        }
        System.out.println("");
    }
}
