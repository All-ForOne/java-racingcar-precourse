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
            OutputView.printResult(cars);
        }
    }

    private void playRound(){
        for(Car car : cars){
            car.goOrStop(createRandomNumber());
        }
    }

    private int createRandomNumber(){
        return Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE);
    }

    /*
    public String getWinner() {
        List<Car> winner = new ArrayList<Car>();
        int maxCount = getMaxCount();
        for(int i = 0; i < cars.size(); i++){
            winner = cars.get(i).getCount() == maxCount ? cars.get(i) : null;
        }

        return winner;
    }

    private int getMaxCount(){
        int maxCount = 0;

        for(int i = 0; i < cars.size(); i++){
            maxCount = cars.get(i).getCount() > maxCount ? cars.get(i).getCount() : maxCount;
        }
        return maxCount;
    }

     */

}
