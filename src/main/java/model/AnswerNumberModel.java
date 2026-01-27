package model;

import java.util.Arrays;

public class AnswerNumberModel {
    public static final int ANSWER_NUMBER_LENGTH = 3;
    private int[] answerNumber;

    public AnswerNumberModel(int[] answerNumber) {
        if (!validate(answerNumber)) {
            throw new IllegalArgumentException("Invalid answer number");
        }
        this.answerNumber = answerNumber;
    }

    public Boolean validate(int[] answerNumber) {
        return isLengthValid(answerNumber) && isAllDistinct(answerNumber);
    }

    private Boolean isLengthValid(int[] answerNumber) {
        return answerNumber.length == ANSWER_NUMBER_LENGTH;
    }

    private Boolean isAllDistinct(int[] answerNumber) {
        return Arrays.stream(answerNumber).distinct().count() == ANSWER_NUMBER_LENGTH;
    }

    public int[] getAnswerNumber() {
        return answerNumber;
    }
}
