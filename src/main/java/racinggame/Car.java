package racinggame;

public class Car {
    public static final int MAX_LENGTH = 5;
    private String name;

    public String getName(){
        return this.name;
    }
    public Car(String name) {
        if(isInvalidName(name))
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하만 가능합니다.");
        this.name = name;
    }

    private boolean isInvalidName(String name) {
        if ("".equals(name.trim())) return true;
        if (name.length() >= MAX_LENGTH) return true;
        return false;
    }
}