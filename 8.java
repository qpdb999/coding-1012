/*
 * 
 * 1. switch
 * 
 * switch는 변수의 값에 따라 서로 다른 코드를 실행할 때 사용하는 조건문이다.
 *
 * 기본 형식
 * 
 * switch (변수) {
 * case 값1:
 * 실행할 코드;
 * break;
 * case 값2:
 * 실행할 코드;
 * break;
 * default:
 * 실행할 코드;
 * }
 * 
 * 
 * - case: 해당 값과 일치할 때 실행할 코드
 * - break: 현재 `switch`문을 빠져나감
 * - default: 일치하는 값이 없을 때 실행
 * 
 * //break
 * 
 * break는 현재 실행 중인 switch문이나 반복문을 즉시 종료할 때 사용한다.
 * 
 * switch에서 break를 생략하면 다음 case의 코드까지 실행될 수 있으므로 주의해야 한다.
 * 
 * //switch와 break 활용하기
 * 
 * java
 * import java.util.Scanner;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("1. 더하기");
 * System.out.println("2. 빼기");
 * System.out.println("3. 곱하기");
 * System.out.println("4. 나누기");
 * System.out.print("메뉴를 선택하세요: ");
 * 
 * int choice = sc.nextInt();
 * 
 * System.out.print("첫 번째 숫자: ");
 * double num1 = sc.nextDouble();
 * 
 * System.out.print("두 번째 숫자: ");
 * double num2 = sc.nextDouble();
 * 
 * switch (choice) {
 * case 1:
 * System.out.println("결과: " + (num1 + num2));
 * break;
 * 
 * case 2:
 * System.out.println("결과: " + (num1 - num2));
 * break;
 * 
 * case 3:
 * System.out.println("결과: " + (num1 * num2));
 * break;
 * 
 * case 4:
 * if (num2 == 0) {
 * System.out.println("0으로 나눌 수 없습니다.");
 * } else {
 * System.out.println("결과: " + (num1 / num2));
 * }
 * break;
 * 
 * default:
 * System.out.println("잘못된 메뉴입니다.");
 * }
 * 
 * sc.close();
 * }
 * }
 * 
 * 
 * 복습하면서 알게 된 점
 * 
 * - switch는 입력한 메뉴에 따라 실행할 코드를 구분할 수 있다
 * - case는 각 선택지에 해당하는 코드를 작성하는 곳이다
 * - break를 사용하면 현재 switch문을 빠져나가 다른 case가 실행되는 것을 막을 수 있다
 * - default는 어떤 case에도 해당하지 않을 때 실행된다
 * - 나누기에서는 두 번째 숫자가 0인지 확인해야 오류를 방지할 수 있다
 * 
 * 
 * 
 * ## 📌 AI 활용 복습 문제
 * 
 * 1. switch의 역할은 무엇인가?
 * 
 * 1. 반복 실행한다.
 * 2. 변수의 값에 따라 실행할 코드를 선택한다.
 * 3. 변수를 선언한다.
 * 4. 프로그램을 무조건 종료한다.
 * 
 * 2. case의 역할은 무엇인가?
 * 
 * 1. 특정 값에 해당하는 코드를 작성한다.
 * 2. 반복 횟수를 지정한다.
 * 3. 문자열을 합친다.
 * 4. 숫자를 입력받는다.
 * 
 * 3. break의 역할은 무엇인가?
 * 
 * 1. 다음 코드를 무조건 반복한다.
 * 2. 변수를 초기화한다.
 * 3. 현재 `switch`문이나 반복문을 종료한다.
 * 4. 값을 반환한다.
 * 
 * 4. default는 언제 실행되는가?
 * 
 * 1. 항상 가장 먼저 실행된다.
 * 2. 어떤 `case`에도 일치하지 않을 때 실행된다.
 * 3. `break`가 있을 때만 실행된다.
 * 4. 숫자를 입력할 때마다 실행된다.
 * 
 * 5. break를 switch에서 생략하면 어떤 일이 발생할 수 있는가?
 * 
 * 1. 프로그램이 반드시 종료된다.
 * 2. 다음 `case`의 코드까지 실행될 수 있다.
 * 3. 입력값이 자동으로 바뀐다.
 * 4. 오류가 무조건 발생한다.
 * 
 * 6. 다음 코드의 결과는 무엇인가?
 * 
 * int num = 2;
 * 
 * switch (num) {
 * case 1:
 * System.out.println("1");
 * break;
 * case 2:
 * System.out.println("2");
 * break;
 * default:
 * System.out.println("기타");
 * }
 * 
 * 1. 1
 * 2. 2
 * 3. 기타
 * 4. 아무것도 출력되지 않는다.
 * 
 * 7. 메뉴에 없는 숫자를 입력했을 때 안내 문구를 출력하려면 무엇을 사용하는가?
 * 
 * 1. case
 * 2. break
 * 3. default
 * 4. Scanner
 * 
 * 8. 다음 중 올바른 설명은 무엇인가?
 * 
 * 1. break는 반드시 모든 case에 있어야 컴파일된다.
 * 2. default는 여러 개 작성해야 한다.
 * 3. switch는 여러 선택지 중 하나를 실행할 때 활용할 수 있다.
 * 4. break는 변수의 값을 변경한다.
 * 
 * 정답
 * 
 * 1. 2
 * 2. 1
 * 3. 3
 * 4. 2
 * 5. 2
 * 6. 2
 * 7. 3
 * 8. 3
 */