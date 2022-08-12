
public class ExceptionDemo4 {
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
		try {
			t = null; // 주소 끊기
			t.display();
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage()); //메세지 확인법 (유저용)
			System.out.println(ex); //ex.toString //타입확인법 (개발자용)
			ex.printStackTrace(); //어디 라인에서 발생했어 (개발자용)
		}
	}
}
class Test {
	public void display() {
		System.out.println("Hello, World");
	}
}
