package racingcar.view;

public class PrintMessage {
    private static String START_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static String TRY_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";

    public static void printStart() {
        System.out.println(START_MESSAGE);
    }

    public static void printTryCount() {
        System.out.println(TRY_COUNT_MESSAGE);
    }
}
