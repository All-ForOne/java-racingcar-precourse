package racinggame;

public class Application {
    public static void main(String[] args) {
        // TODO 자동차 경주 게임 구현
        Cars cars = new Cars(InputView.inputCarsName());

        cars.play(InputView.inputRound());
    }
}
