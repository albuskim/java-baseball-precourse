package baseball.view;

import baseball.model.GameResultModel;

public class OutputView {
    public void printResult(GameResultModel gameResult) {
        System.out.println(gameResult.toString());
    }

    public void printContinueQuestion() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
