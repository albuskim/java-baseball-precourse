package baseball.service;

import baseball.model.GameResultModel;

public class Judgement {
    public GameResultModel judge(int[] answerNumber, int[] inputNumber) {
        int strike = countStrike(answerNumber, inputNumber);
        int ball = countBall(answerNumber, inputNumber);
        return new GameResultModel(strike, ball);
    }

    private int countStrike(int[] answerNumber, int[] inputNumber) {
        int strike = 0;
        for (int i = 0; i < answerNumber.length; i++) {
            if (answerNumber[i] == inputNumber[i]) {
                strike++;
            }
        }
        return strike;
    }

    private int countBall(int[] answerNumber, int[] inputNumber) {
        int ball = 0;
        for (int i = 0; i < answerNumber.length; i++) {
            ball += countBallForPosition(answerNumber, inputNumber, i);
        }
        return ball;
    }

    private int countBallForPosition(int[] answerNumber, int[] inputNumber, int position) {
        int ball = 0;
        for (int j = 0; j < inputNumber.length; j++) {
            if (answerNumber[position] == inputNumber[j] && position != j) {
                ball++;
            }
        }
        return ball;
    }
}
