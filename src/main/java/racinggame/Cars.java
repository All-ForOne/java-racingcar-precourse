package racinggame;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    public static final int START_INCLUSIVE = 0;
    public static final int END_INCLUSIVE = 9;
    private List<Car> cars;

    public Cars(String s) {
        cars = new ArrayList<>();
        String[] carsArray = s.split(",");
        for(String carName : carsArray){
            cars.add(new Car(carName.trim()));
        }
    }

    public List<Car> getCars(){
        return this.cars;
    }

    public void play(int totalRound) {
        System.out.println("\n실행 결과");
        for(int i = 0; i < totalRound; i++){
            playRound();
        }
        OutputView.printRacingResult(getWinner());
    }

    private void playRound(){
        for(Car car : cars){
            car.goOrStop(createRandomNumber());
        }
        OutputView.printRoundResult(cars);
    }

    private int createRandomNumber(){
        return Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE);
    }

    public List<Car> getWinner() {
        List<Car> winner = new ArrayList<>();
        int maxCount = getMaxCount();
        for(Car car : cars) {
            if(car.getStep().getCount() == maxCount){
                winner.add(car);
            }
        }
        return winner;
    }

    private int getMaxCount() {
        int maxCount = 0;

        for(Car car : cars){
            maxCount = Math.max(maxCount, car.getStep().getCount());
        }
        return maxCount;
    }

}
