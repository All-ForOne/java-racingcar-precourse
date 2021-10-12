package racinggame;

public class GameController{
    private Cars cars;
    private Round round;

    public void start() {
        createCars();
        createRound();
        cars.play(round.getRound());
    }

    private void createCars(){
        try {
            this.cars = new Cars(InputView.inputCarsName());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            createCars();
        }
    }

    private void createRound(){
        try {
            this.round = new Round(InputView.inputRound());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            createRound();
        }
    }
}
