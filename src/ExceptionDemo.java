import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int first = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int second = sc.nextInt();
		try {//Multiple Catch Block :여러개의 Exception Type을 열거하는 방법.
			 //주의할 점 : 위아래 순서가 있다. 위쪽은 자식 Exception, 아래쪽은 부모 Exception
			 //-->부모가 윗줄에 있고 Exception을 잡아버리면 밑에 자식줄은 필요(의미)가 없기때문에 에러발생
			System.out.printf("%d / %d = %d\n", first, second, (first / second));
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException");
		} catch (ArrayStoreException ex) {
			System.out.println("ArrayStoreException");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (RuntimeException ex) { 
			System.out.println("ArithmeticException의 부모입니다.");
		}
	}

}
