package racinggame;

public class Car {
    public static final int STANDARD_NUMBER = 4;
    public static final int INITIAL_STEP_NUMBER = 0;
    private final CarName name;
    private final Step step;

    public Car(String name) {
        this.name = new CarName(name);
        this.step = new Step(INITIAL_STEP_NUMBER);
    }

    public String getName(){
        return this.name.getCarName();
    }

    public Step getStep() {
        return this.step;
    }

    public void goOrStop(int number) {
        if(isOverStandard(number)) this.step.plusStep();
    }

    private boolean isOverStandard(int number){
        return (number >= STANDARD_NUMBER) ;
    }

}