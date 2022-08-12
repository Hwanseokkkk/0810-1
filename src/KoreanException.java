/*
 * 사용자 정의용 Exception
 * 1. 누구의 자식인가? :  RuntimeException의 자식인가 아닌가?
 * 2. 생성자를 잘 만들자
 */
public class KoreanException extends RuntimeException { // (Unchecked)try catch안써도 되네~~
	public KoreanException(String msg) {
		super(msg); // 메세지 부모에게 보내~
	}

}
