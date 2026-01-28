package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class GameResultModelTest {
    @Test
    @DisplayName("GameResultModel 생성 테스트")
    public void testConstructor() {
        GameResultModel gameResultModel = new GameResultModel(1, 2);
        assertThat(gameResultModel.getStrike()).isEqualTo(1);
        assertThat(gameResultModel.getBall()).isEqualTo(2);
    }

    @Test
    @DisplayName("GameResultModel 승리 여부 검증 테스트")
    public void testIsWin() {
        GameResultModel gameResultModel = new GameResultModel(3, 0);
        assertThat(gameResultModel.isWin()).isTrue();
    }

    @Test
    @DisplayName("GameResultModel 낫싱 출력 검증 테스트")
    public void testToStringWhenNothing() {
        GameResultModel gameResultModel = new GameResultModel(0, 0);
        assertThat(gameResultModel.toString()).isEqualTo("낫싱");
    }

    @Test
    @DisplayName("GameResultModel 볼 출력 검증 테스트")
    public void testToStringWhenBall() {
        GameResultModel gameResultModel = new GameResultModel(0, 1);
        assertThat(gameResultModel.toString()).isEqualTo("1볼");
    }

    @Test
    @DisplayName("GameResultModel 스트라이크 출력 검증 테스트")
    public void testToStringWhenStrike() {
        GameResultModel gameResultModel = new GameResultModel(1, 0);
        assertThat(gameResultModel.toString()).isEqualTo("1스트라이크");
    }

    @Test
    @DisplayName("GameResultModel 볼과 스트라이크 출력 검증 테스트")
    public void testToStringWhenBallAndStrike() {
        GameResultModel gameResultModel = new GameResultModel(1, 1);
        assertThat(gameResultModel.toString()).isEqualTo("1스트라이크 1볼");
    }
}
