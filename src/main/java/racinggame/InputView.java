package racinggame;

public class InputView {

    public static final String MESSAGE_INPUT_CAR_NAME_LIST = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String MESSAGE_INPUT_ROUND = "시도할 회수는 몇회인가요?";

    public static String inputCarsName() {
        System.out.println(MESSAGE_INPUT_CAR_NAME_LIST);
        return nextstep.utils.Console.readLine();
    }

    public static String inputRound() {
        System.out.println(MESSAGE_INPUT_ROUND);
        return nextstep.utils.Console.readLine();
    }
}
