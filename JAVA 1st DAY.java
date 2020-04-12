/*
 * public class Main {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * //control + A = 전체 선택 //control + shift + f = 정렬 }
 * 
 * }
 */

//문제 #1 : `안녕하세요.`를 10번 출력해주세요.

/*
 * class Main { public static void main(String[] args) {
 * System.out.println("안녕하세요.1"); System.out.println("안녕하세요.2");
 * System.out.println("안녕하세요.3"); System.out.println("안녕하세요.4");
 * System.out.println("안녕하세요.5"); System.out.println("안녕하세요.6");
 * System.out.println("안녕하세요.7"); System.out.println("안녕하세요.8");
 * System.out.println("안녕하세요.9"); System.out.println("안녕하세요.10"); } }
 */

/*
 * 문제 #2 : `안녕하세요.`를 10번 출력해주세요. // 조건 : System.out.println은 딱 한번만 사용 가능
 * 
 * class Main { public static void main(String[] args) {
 * System.out.println("안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.안녕하세요.");
 * } }
 */

/*
 * 문제 #3 : `안녕하세요.`를 10번 출력해주세요. // 조건 : System.out.println은 딱 한번만 사용 가능 // 조건 :
 * \를 활용해서 줄바꿈 해주세요. // 힌트 : \n 은 줄바꿈을 의미합니다.
 * 
 * class Main { public static void main(String[] args) { // `\` <= 백스페이스 좌측 키
 * System.out.println(
 * "안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n안녕하세요.\n");
 * } }
 */

/*
 * 문제 #4 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요. \ class Main { public static void
 * main(String[] args) { // `int a` => a라는 이름의 변수(즉 공간)을 만든다. // `int` => a라는
 * 공간에는 정수만 담을 수 있다. // `;` => 문장이 끝남을 알린다. int a; a = 10;
 * 
 * System.out.println(a); System.out.println(a + 10);
 * 
 * int b = 5;
 * 
 * // `+` => 문장과 문자을 합친다. System.out.println("a : " + a);
 * System.out.println("b : " + b);
 * 
 * // 여기서 부터 // 여기까지 수정 가능
 * 
 * System.out.println("a : " + a); // 출력 : a : 10 System.out.println("b : " +
 * b); // 출력 : b : 5 } }
 */

/*
 * class Main { public static void main(String[] args) { int x; x = 5;
 * System.out.println(x + 3); x = 10; System.out.println(x + 3); x = 15;
 * System.out.println(x + 3); } }
 */

/*
 * class Main { public static void main(String[] args) { int x = 20; int b = x;
 * 
 * x = 40;
 * 
 * System.out.println(x + b); } }
 */
// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요. // 조건 : 숫자와 사칙연산 사용 금지

/*class Main {
  public static void main(String[] args) {
    // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
    // `int` => a라는 공간에는 정수만 담을 수 있다.
    // `;` => 문장이 끝남을 알린다.
    int a;
    a = 5;
    
    System.out.println(a);
    System.out.println(a + 10);
    
    int b = 10;
    
    // `+` => 문장과 문자을 합친다.
    System.out.println("a : " + a);
    System.out.println("b : " + b);
    
    // 여기서 부터
    int c = a; //a = 5 
    a = b; // a = 10
    b = c; // b = 5
    // 여기까지 수정 가능
    
    System.out.println("a : " + a);
    // 출력 : a : 10
    System.out.println("b : " + b);
    // 출력 :  b : 5
  }
}*/

class Main {
	public static void main(String[] args) {
		int age = 55;
		
		if ( age > 19 ) {
			System.out.println("성년입니다.");	
		}
		else {
			System.out.println("미성년입니다.");
		}
	}
}
