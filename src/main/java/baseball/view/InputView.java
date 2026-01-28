package baseball.view;

import java.util.Scanner;

public class InputView {
    private Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public int[] readNumberInput() {
        System.out.print("숫자를 입력해주세요. : ");
        String input = scanner.nextLine();
        if (!validateNumberInput(input)) {
            throw new IllegalArgumentException("[Error] Invalid number input");
        }
        return parseNumberInput(input);
    }

    private boolean validateNumberInput(String input) {
        return input.matches("^[1-9]{3}$");
    }

    private int[] parseNumberInput(String input) {
        int[] numbers = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            numbers[i] = Character.getNumericValue(input.charAt(i));
        }
        return numbers;
    }

    public int readCommandInput() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = scanner.nextLine();
        if (!validateCommandInput(input)) {
            throw new IllegalArgumentException("[Error] Invalid command input");
        }
        return parseCommandInput(input);
    }

    public boolean validateCommandInput(String input) {
        return input.matches("^[1-2]$");
    }

    public int parseCommandInput(String input) {
        return Integer.parseInt(input);
    }
}
