package racinggame;

import java.util.Objects;

public class CarName {
    public static final int MAX_LENGTH = 5;
    public static final String MESSAGE_ERROR_CAR_NAME_MAX_LENGTH = "[ERROR] 자동차 이름은 5자 이하만 가능합니다.";
    private final String carName;

    public CarName(String name) {
        if(isInvalidName(name)) throw new IllegalArgumentException(MESSAGE_ERROR_CAR_NAME_MAX_LENGTH);
        this.carName = name;
    }

    public String getCarName(){
        return this.carName;
    }

    private boolean isInvalidName(String name) {
        if (Objects.isNull(name) || name.trim().isEmpty() || name.length() > MAX_LENGTH) {
            return true;
        }
        return false;
    }
}
