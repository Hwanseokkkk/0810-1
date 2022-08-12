
public class AnonymousClassDemo1 {
	public static void main(String[] args) {
		AnonymousClassDemo1 acd = new AnonymousClassDemo1();
		//acd.exec(acd.new MyPlus());
		acd.exec(acd.new MyMutiple());
		
	}
	void exec(MyInterface mi) {  //멤버 메소드
		//인터페이스의 파라미터를 받는다는것은 인터페이스의 자식을 보내라는 뜻이다.
		int result = mi.calculate(5, 9);
		System.out.println("Result = " + result);
	}
	class MyMutiple implements MyInterface{
		@Override
		public int calculate(int front, int back) {
			return front * back;
		}
	}
	
	class MyPlus implements MyInterface{ //멤버 클래스
		@Override
		public int calculate(int front, int back) {
			return front + back;
		}
	}
}

@FunctionalInterface //람다로 사용하려면 해당하는 인터페스에는 하나의 메소드만 있어야한다.
interface MyInterface{
	int calculate(int front, int back);
}