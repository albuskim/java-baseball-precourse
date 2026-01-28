package model;

import service.AnswerNumberGenerator;

public class GameResultModel {
    private int strike;
    private int ball;

    public GameResultModel(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }
    
    public int getBall() {
        return ball;
    }

    public Boolean isWin() {
        return strike == AnswerNumberGenerator.ANSWER_NUMBER_LENGTH;
    }

    public String toString() {
        if (strike == 0 && ball == 0) {
            return "낫싱";
        }
        if (strike == 0) {
            return ball + "볼";
        }
        if (ball == 0) {
            return strike + "스트라이크";
        }
        return strike + "스트라이크 " + ball + "볼";
    }
}
