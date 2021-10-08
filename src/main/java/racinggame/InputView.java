package racinggame;

public class InputView {
    public static String inputCarsName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return nextstep.utils.Console.readLine();
    }

    public static int inputRound() {
        int round = 0;
        try {
            System.out.println("시도할 회수는 몇회인가요?");
            round = Integer.parseInt(nextstep.utils.Console.readLine());
        }catch(NumberFormatException e){
            System.out.println("[ERROR] 숫자를 입력해주세요.");
            inputRound();
        }
        return round;
    }
}
