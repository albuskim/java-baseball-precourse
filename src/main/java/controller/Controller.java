package controller;

import view.*;
import service.*;
import model.*;

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
            int[] answerNumber = answerNumberGenerator.generateAnswerNumber();
            if (playGame(answerNumber)) {
                break;
            }
        }
    }

    private boolean playGame(int[] answerNumber) {
        while (true) {
            int[] inputNumber = inputView.readNumberInput();
            GameResultModel gameResult = judgement.judge(answerNumber, inputNumber);
            outputView.printResult(gameResult);
            if (gameResult.isWin()) {
                break;
            }
        }
        int inputCommand = inputView.readCommandInput();
        if (inputCommand == 1) {
            return true;
        }
        return false;
    }
}
