package baseball.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnswerNumberGenerator {
    public static final int ANSWER_NUMBER_LENGTH = 3;
    public int[] generateAnswerNumber() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> numberList = Arrays.asList(numbers);
        Collections.shuffle(numberList);
        int[] answerNumber = new int[ANSWER_NUMBER_LENGTH];
        for (int i = 0; i < ANSWER_NUMBER_LENGTH; i++) {
            answerNumber[i] = numberList.get(i);
        }
        return answerNumber;
    }
}
