
public class AnonymousClassDemo2 {
	public static void main(String[] args) {
		AnonymousClassDemo2 acd = new AnonymousClassDemo2();
		
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) { return a + b;}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {return a - b; }
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {return a * b; }
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {return a / b; }
		});
	}
	void exec(MyInterface mi) { // 멤버 메소드
		int result = mi.calculate(5, 9);
		System.out.println("Result = " + result);
	}
@FunctionalInterface //람다로 사용하려면 해당하는 인터페스에는 하나의 메소드만 있어야한다.
interface MyInterface{
	int calculate(int front, int back);
  }
}