import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
 * Java에서 날짜/시간을 처리하는 6가지 방법
 * 1. java.util Date Class
 * 2. java.util Calendar Class
 * 3. java.text DateFormat class
 * 4. java.text SimpleDateFormat class
 * 
 */
public class UtilityClassDemo {
	public static void main(String[] args) {
		
		//Date
		 //Date now = new Date();
		 //System.out.println(now);
		// System.out.println(now.getTime()); 1660199972434
//		File file = new File("C:/Temp/Sungjuk_utf8.dat");
//		long last = file.lastModified(); // 마지막 수정시간
//		System.out.println(last);
//		Date createTime = new Date(last); //Date클래스가 살아있는 이유(시간계산을 잘한다~)
//		System.out.println(createTime);
//		Date before = new Date(1660199972434L);
//		System.out.println(before);
		
		//Calendar
//		Calendar today = Calendar.getInstance();
//		int year = today.get(Calendar.YEAR);
//		int month = today.get(Calendar.MONTH)+1;
//		//int day = today.get(Calendar.DATE);
//		int day = today.get(Calendar.DAY_OF_MONTH);
//		System.out.println(year + "년 " + month + " 월" + day + "일입니다.");
		
		//DateFormat
//		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.KOREA);
//		System.out.println(df.format(new Date()));
		
		//SimpleDateFormat
//		String pattern = "오늘은 yyyy년 MM월 dd일입니다.";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		System.out.println(sdf.format(new Date()));
		
		// ?
		System.out.printf("오늘은 %1$tY년  %1$tm월  %1$td일 입니다.\n",new Date()); // ,뒤에 %의 값 3가지가 들어가야하는데 1$로 순서를 정해줌
		
		
		
		

	}

}
