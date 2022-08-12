
public class WrapperClassDemo {
	public static void main(String[] args) {
		
		//Java JDK 1.4까지 사용방식
//		int age = 26; //stack 지역변수는 항상 stack으로 간드아~
//		Integer in = new Integer(age); //Wrapping, Boxing stack --> heap
//		int su = in.intValue(); //Unwrapping, Unboxing  heap --> stack
//		System.out.println("su = " +su);
		
		
		//Since JDK 1.5
		Integer in = 26 + 5; // == Integer in = new Integer(26+5); autoboxing
		//좌측이 참조변수처럼 보이지만 아니다.
		int su = in + 100; // == in.intValue() + 100
		//주소변수를 연산하는게 아니다 헷갈리지 말자
		
		System.out.println("su = " + su);
	}

}
