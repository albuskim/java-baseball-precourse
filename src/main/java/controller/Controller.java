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
        boolean isWin = false;
        while (!isWin) {
            try {
                int[] inputNumber = inputView.readNumberInput();
                GameResultModel gameResult = judgement.judge(answerNumber, inputNumber);
                outputView.printResult(gameResult);
                isWin = gameResult.isWin();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
        while (true) {
            try {
                int inputCommand = inputView.readCommandInput();
                return inputCommand == 1;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
    }
}
