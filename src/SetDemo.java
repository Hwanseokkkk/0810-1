import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		String[] array = { "박지민", "홍지민", "박지민", "한지민", "이지민", "한지민", "최지민", "우지민", "최지민", "김지민" };
		for (String str : array) {
			hashSet.add(str);
			treeSet.add(str);
			
		}
System.out.println(hashSet.size());
System.out.println(hashSet); //Set은 중복을 허용하지 않는다.
System.out.println(treeSet); //Set은 중복을 허용하지 않는다 + Sorting해서 저장한다.
	}

}
