package racinggame;

public class Round {
    private static final String MESSAGE_ERROR_NEGATIVE_NUM = "[ERROR] 0보다 큰 숫자를 입력해주세요.";
    private static final String MESSAGE_ERROR_INPUT_NUM = "[ERROR] 숫자를 입력해주세요.";
    private int round;

    public Round(String round){
        try {
            this.round = Integer.parseInt(round);
        }catch(NumberFormatException e){
            throw new IllegalArgumentException(MESSAGE_ERROR_INPUT_NUM);
        }

        if(isNegativeNumber(this.round)){
            throw new IllegalArgumentException(MESSAGE_ERROR_NEGATIVE_NUM);
        }
    }

    public int getRound(){
        return this.round;
    }

    private boolean isNegativeNumber(int round) {
        if(round < 1) return true;
        return false;
    }
}
