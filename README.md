# java-baseball-precourse

## 기능 목록
### Model
#### GameResultModel
1. 사용자가 입력한 숫자에 대한 결과의 관리
2. 결과 출력을 위한 객체의 stringify
3. 승리 여부 판별
### View
#### InputView
1. Scanner를 통해 사용자로부터 입력을 받아들이기
2. 적절한 숫자인지 Validation
3. 적절한 명령인지 Validation
#### OutputView
1. 사용자가 입력한 숫자에 대한 결과 출력
2. 사용자가 정답 입력 시 게임 지속에 대한 질문 출력
### Controller
1 숫자 입력 / 지속 여부 입력 상태 관리
2. 입력받은 숫자를 Judgement를 통해 결과 확인 및 출력
3. 정답 입력 시 게임 지속 질문 출력
4. 입력받은 답에 대해 프로그램 종료 혹은 2로 돌아감 
### Service
#### AnswerNumberGenerator
1. 게임의 정답으로 사용할 숫자의 생성
#### Judgement
1. 입력된 숫자와 정답을 통해 GameResultModel 생성