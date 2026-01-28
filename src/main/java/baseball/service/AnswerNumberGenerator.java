package baseball.service;

import java.util.Arrays;
import java.util.Collections;

public class AnswerNumberGenerator {
    public static final int ANSWER_NUMBER_LENGTH = 3;
    public int[] generateAnswerNumber() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Collections.shuffle(Arrays.asList(numbers));
        int[] answerNumber = Arrays.copyOfRange(
            numbers, 0, ANSWER_NUMBER_LENGTH
        );
        return answerNumber;
    }
}
