package baseball.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AnswerNumberGeneratorTest {
    @Test
    @DisplayName("AnswerNumberGenerator 생성 테스트")
    public void testGenerateAnswerNumber() {
        AnswerNumberGenerator answerNumberGenerator = new AnswerNumberGenerator();
        int[] answerNumber = answerNumberGenerator.generateAnswerNumber();
        assertThat(answerNumber).hasSize(3);
        assertThat(answerNumber).doesNotHaveDuplicates();
    }
}
