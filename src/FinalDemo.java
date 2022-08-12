/**
 * <h1>Final 용법 3가지</h1>
 * <ul>
 * <li><b>Final Variable</b> : 자바의 상수</li>
 * <li><b>Final Method</b> : Override의 금지</li>
 * <li><b>Final Class</b> : 상속의 금지</li>
 * </ul>
 * 
 * @author Ayaan
 * @version 1.1
 * @since 2022-08-11
 */
//public class FinalDemo extends Parent {
//	private final double PI = Math.PI; // 멤버상수
//	private static final boolean FLAG = true; // 스태틱상수
//
//	public static void main(String[] args) {
//		final String NAME = "한지민"; // 지역상수
//	}
//	
//	
//	
//	public final void display() {
//		System.out.println("나는 자식의 메소드");
//	}
//}
//final class Parent{
//	public void display() {System.out.println("나는 자식의 메소드");}
//	public final void display() {
//		System.out.println("나는 자식의 메소드");
//	}
//
//	@Override
//	public void print() {
//		System.out.println("나는 자식의 메소드");
//	}
//}
//
//abstract class Super { // 한개이상의 abstract이 있으면 그 클래스는 반드시 abstract이여야한다.
//	public final void display(){
//		System.out.println("나는 부모의 메소드");
//		public abstract void print();
//	}
//}
