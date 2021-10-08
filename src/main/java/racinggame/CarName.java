package racinggame;

public class CarName {
    public static final int MAX_LENGTH = 5;
    private String carName;

    public CarName(String name) {
        if(isInvalidName(name))
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하만 가능합니다.");
        this.carName = name;
    }

    public String getCarName(){
        return this.carName;
    }

    private boolean isInvalidName(String name) {
        if ("".equals(name.trim())) return true;
        if (name.length() > MAX_LENGTH) return true;
        return false;
    }
}
