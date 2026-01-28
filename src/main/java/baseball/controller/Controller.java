package baseball.controller;

import baseball.model.GameResultModel;
import baseball.service.AnswerNumberGenerator;
import baseball.service.Judgement;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Controller {
    private InputView inputView;
    private OutputView outputView;
    private AnswerNumberGenerator answerNumberGenerator;
    private Judgement judgement;

    public Controller() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.answerNumberGenerator = new AnswerNumberGenerator();
        this.judgement = new Judgement();
    }

    public void run() {
        while (true) {
            int[] answerNumber = generateAnswerNumber();
            if (playGame(answerNumber)) {
                break;
            }
        }
    }

    private int[] generateAnswerNumber() {
        return answerNumberGenerator.generateAnswerNumber();
    }

    private int[] getValidInputNumber() {
        while (true) {
            try {
                return inputView.readNumberInput();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private int getValidCommandInput() {
        while (true) {
            try {
                return inputView.readCommandInput();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private boolean playGame(int[] answerNumber) {
        boolean isWin = false;
        while (!isWin) {
            int[] inputNumber = getValidInputNumber();
            GameResultModel gameResult = judgement.judge(answerNumber, inputNumber);
            outputView.printResult(gameResult);
            isWin = gameResult.isWin();
        }
        outputView.printWinMessage();
        outputView.printContinueQuestion();
        int inputCommand = getValidCommandInput();
        return inputCommand == 2;
    }
}
