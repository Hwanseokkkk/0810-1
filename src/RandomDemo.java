import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		// 1~6까지 랜덤번호
		int rand = (int) (Math.random() * 6 + 1); // Math클래스를 이용
		
		Random r = new Random();
		int rand1 = r.nextInt(6)+1;
		System.out.println(rand + "," + rand1);
	}

}
