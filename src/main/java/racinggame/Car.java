package racinggame;

public class Car {
    public static final int MAX_LENGTH = 5;
    public static final int STANDARD_NUMBER = 4;
    private String name;
    private int count;

    public Car(String name) {
        if(isInvalidName(name))
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하만 가능합니다.");
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getCount() {
        return this.count;
    }

    private boolean isInvalidName(String name) {
        if ("".equals(name.trim())) return true;
        if (name.length() >= MAX_LENGTH) return true;
        return false;
    }

    public void goOrStop(int number) {
        if(isOverStandard(number)) this.count++;
    }

    private boolean isOverStandard(int number){
        if(number >= STANDARD_NUMBER) return true;
        return false;
    }

}