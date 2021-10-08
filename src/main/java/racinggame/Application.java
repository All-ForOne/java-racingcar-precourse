package racinggame;

public class Application {
    public static void main(String[] args) {
        // TODO 자동차 경주 게임 구현
        try{
            gameStart();
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            gameStart();
        }
    }

    public static void gameStart(){
        String carName = InputView.inputCarsName();
        Cars cars = new Cars(carName);
        cars.play(InputView.inputRound());
    }
}
