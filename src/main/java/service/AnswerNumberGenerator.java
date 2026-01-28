package service;

import java.util.Arrays;
import java.util.Collections;

import model.AnswerNumberModel;

public class AnswerNumberGenerator {
    public int[] generateAnswerNumber() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Collections.shuffle(Arrays.asList(numbers));
        int[] answerNumber = Arrays.copyOfRange(
            numbers, 0, AnswerNumberModel.ANSWER_NUMBER_LENGTH
        );
        return answerNumber;
    }
}
