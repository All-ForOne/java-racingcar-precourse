package racinggame;

public class Car {
    public static final int STANDARD_NUMBER = 4;
    private CarName name;
    private Step step;

    public Car(String name) {
        this.name = new CarName(name);
        this.step = new Step(0);
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
        if(number >= STANDARD_NUMBER) return true;
        return false;
    }

}