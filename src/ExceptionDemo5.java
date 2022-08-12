import java.util.Scanner;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		try {
			Student chulsu = new Student(kor, mat);
			System.out.println(chulsu);
		} catch (KoreanException e) {
			System.out.println(e.getMessage());
		} catch (MathException e) {
			System.out.println(e.getMessage());
	}
}
}
class Student {
	private int kor, mat;

	public Student(int kor, int mat) throws KoreanException, MathException {
		if (kor >= 0 && kor <= 100)
			this.kor = kor;
		else
			throw new KoreanException("국어점수는 0부터 100점까지 입니다.");
		if (mat >= 0 && mat <= 100)
			this.mat = mat;
		else
			throw new MathException("수학점수는 0점부터 100점까지 입니다.");
		this.kor = kor;
		this.mat = mat;
	}
	@Override
	public String toString() {
		return String.format("Student [kor=%s, mat=%s]", kor, mat);
	}

}
