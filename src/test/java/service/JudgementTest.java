package service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import model.GameResultModel;

public class JudgementTest {
    @Test
    @DisplayName("Judgement 생성 테스트")
    public void testConstructor() {
        Judgement judgement = new Judgement();
        assertThat(judgement).isNotNull();
    }

    @Test 
    @DisplayName("Judgement 스트라이크, 볼 카운트 검증 테스트")
    public void testCountStrikeAndBall() {
        Judgement judgement = new Judgement();
        int[] answerNumber;
        int[] inputNumber;
        GameResultModel gameResult;

        answerNumber = new int[] {1, 2, 3};
        inputNumber = new int[] {1, 2, 4};
        gameResult = judgement.judge(answerNumber, inputNumber);
        assertThat(gameResult.getStrike()).isEqualTo(2);
        assertThat(gameResult.getBall()).isEqualTo(0);

        answerNumber = new int[] {1, 2, 3};
        inputNumber = new int[] {3, 1, 4};
        gameResult = judgement.judge(answerNumber, inputNumber);
        assertThat(gameResult.getStrike()).isEqualTo(0);
        assertThat(gameResult.getBall()).isEqualTo(2);

        answerNumber = new int[] {1, 2, 3};
        inputNumber = new int[] {4, 5, 6};
        gameResult = judgement.judge(answerNumber, inputNumber);
        assertThat(gameResult.getStrike()).isEqualTo(0);
        assertThat(gameResult.getBall()).isEqualTo(0);

        answerNumber = new int[] {1, 2, 3};
        inputNumber = new int[] {1, 2, 3};
        gameResult = judgement.judge(answerNumber, inputNumber);
        assertThat(gameResult.getStrike()).isEqualTo(3);
        assertThat(gameResult.getBall()).isEqualTo(0);

        answerNumber = new int[] {1, 2, 3};
        inputNumber = new int[] {2, 3, 1};
        gameResult = judgement.judge(answerNumber, inputNumber);
        assertThat(gameResult.getStrike()).isEqualTo(0);
        assertThat(gameResult.getBall()).isEqualTo(3);
    }
}
