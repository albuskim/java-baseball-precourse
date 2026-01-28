package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AnswerNumberModelTest {
    @Test
    @DisplayName("AnswerNumberModel 생성 테스트")
    public void testConstructor() {
        int[] answerNumber = {1, 2, 3};
        AnswerNumberModel answerNumberModel = new AnswerNumberModel(answerNumber);
        assertThat(answerNumberModel.getAnswerNumber()).containsExactly(1, 2, 3);
    }

    @Test
    @DisplayName("AnswerNumberModel 길이 검증 테스트")
    public void testLengthValidation() {
        int[] answerNumber = {1, 2};
        assertThatThrownBy(() -> new AnswerNumberModel(answerNumber))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("[Error] Invalid answer number");
    }

    @Test
    @DisplayName("AnswerNumberModel 중복 숫자 검증 테스트")
    public void testDistinctValidation() {
        int[] answerNumber = {1, 1, 2};
        assertThatThrownBy(() -> new AnswerNumberModel(answerNumber))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("[Error] Invalid answer number");
    }
}
