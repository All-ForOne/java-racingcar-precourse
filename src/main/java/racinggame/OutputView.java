package racinggame;

import java.util.List;

public class OutputView {
    public static void printRoundResult(List<Car> cars) {
        for(Car car : cars){
            System.out.println(car.getName()+" : "+car.getStep().printStep());
        }
        System.out.println("");
    }

    public static void printRacingResult(List<Car> cars) {
        String winnerName = "";
        int i = 0;
        for(Car car : cars){
            winnerName = (i == 0) ? car.getName() : winnerName + "," + car.getName();
            i++;
        }
        System.out.printf("최종 우승자는 %s 입니다.", winnerName);
    }
}
