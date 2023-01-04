# java-lotto-kakao

## 1단계

### 기능 요구사항

- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

### 기능 구현 목록

[x] 금액에 따라 구매가능한 로또의 개수 계산
[x] 금액이 1000 단위가 아닌 경우 가능한 만큼 구매한다
[x] 금액이 음수이거나 문자가 섞인 경우 다시 입력받는다
[x] 자동으로 1에서 45 사이 임의의 다른 수 6개를 생성
[x] 1에서 45 사이의 숫자를 갖는 자료구조 LottoNumber
[x] 중복되지 않는 6개의 숫자를 갖는 자료구조 LottoTicket
[x] 생성된 로또 번호를 오름차순 정렬한다
[x] 정렬된 로또 번호를 출력한다
[x] 지난주 당첨 번호 입력을 ‘, ’를 기준으로 분리
[x] 지난주 당첨 번호 분리된 값 parseInt()
[x] 당첨 번호와 비교해서 일치하는 개수 확인
[x] 수익률 계산


## 리팩토링

### 리팩토링 필요 목록
[x] 각종 메소드, 클래스, 변수 명
[x] 테스트 명
[x] Model, View 간 데이터 전달시 Dto 사용
[x] DeepCopy 고려하기 - 모두 불변 객체로 DeepCopy 필요 없어보임 
[x] 잘못된 입력에 대한 예외발생과 예외처리 (입력받은 데이터가 6개의 숫자인지 검증 등)
[x] Money 구입한 금액 담기위한 변수 만들기 - Money 를 위한 class 를 별개로 만듦
[x] 변수명에 자료구조 들어간 부분 수정하기 - 맥락, 의미를 담아
[x] , 로 구분된 데이터 파싱하는 부분에서 trim 을 사용하도록 수정
[x] sixCount 변수명 수정
[x] LottoNumber 캐싱하기
[x] 추가로 테스트 할 부분이 있는지 확인하기
[x] 입력 검증에 대한 테스트 작성
[x] 상속과 조합 고려해서 수정하기 - 도메인 중 isA 관계에 있는 것이 없어서, 조합으로 구현하는게 낫다고 판단됨
[x] 메서드 5라인 넘지 않게 하도록 노력해보기
[x] 객체지향 생활체조원칙 대조해서 리팩토링

[?] Main 메소드 라인 줄이기 - service 로 분리해야할까?
[?] 단일책임원칙 고려하기 (model 이 view 를 고려하지 않도록 수정하기) - stream 을 return 해주는게 좋은걸까?
[?] InputView 분리하기 (InputView 를 abstract 로 만들고 각각 상속해서 만들기) - 분리하는게 좋은 방법일까? 


## 2단계

### 2단계 기능 요구사항
- 사용자가 수동으로 추첨 번호를 입력할 수 있도록 해야 한다.
- 입력한 금액, 자동 생성 숫자, 수동 생성 번호를 입력하도록 해야 한다.
- 예외가 발생하는 부분에서 Exception 을 적용해 예외처리, 입력에 대한 예외처리 철저

### 2단계 기능 구현 목록
[x] 수동으로 구매할 로또 수를 입력받는다
[x] 수동으로 구매한 만큼 금액을 차감한다
[x] 수동으로 로또 번호를 입력받는다
[x] 입력받은 번호를 검증한다
[x] 검증된 로또 번호로 티켓을 생성한다
[x] 나머지를 자동으로 생성하고 수동으로 생성한 티켓들과 합친다