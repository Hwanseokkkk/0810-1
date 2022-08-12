import java.util.Vector;

public class ListDemo1 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(5,3); //5 = 초기사이즈 3 = 증가량 5개마다 3개씩 방증가!
		System.out.print(vector.capacity()+ ",");
		System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity()+ ",");
		System.out.println(vector.size());
	}
}
