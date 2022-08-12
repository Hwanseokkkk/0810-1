import java.util.Stack;
/*
 * Stack : LIFO(Last Input First Out)
 */
public class ListDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		String[] array = { "박지민", "홍지민", "박지민", "한지민", "이지민", "한지민", "최지민", "우지민", "최지민", "김지민" };
		for(String str : array) {
			stack.push(str); //Set에서는 add, List에서는 Push
		} 
		System.out.println(stack.search("최지민")); //위에서부터 찾는다.
		System.out.println(stack.search("김태희")); //못찾으면 -1 출력
		
		//peek은 항상 맨위
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		 //pop은 맨위에서부터 다음다음다음
		System.out.println(stack.pop()); //맨위에 누구세염?
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop()); //더이상 뽑을것이 없어 에러발생;
		System.out.println(stack.size());
		System.out.println(stack);
	}

}
