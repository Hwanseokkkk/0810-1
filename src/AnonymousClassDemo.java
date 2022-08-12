
public class AnonymousClassDemo {
	public static void main(String[] args) {
		Demo d = new Demo() {
			
			@Override
			public void display() {
				System.out.println("나는 재정의된 메소드");
			}
			public void print() {
				System.out.println("나는 새로운 메소드");
			}
		}; // ; 매우 주의!! ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
		d.display();
		//d.print(); //재정의하려는 클래스에 멤버가 아니기 때문에 (정의되어 있지 않아서)
		//새로운것은 넣을 수 없다.
	}
}
class Demo {
	public void display() {
		System.out.println("나는 원형 메소드");
	}
}
