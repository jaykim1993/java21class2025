package formatExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// 요즘 실무에서 많이 쓰는 패키지는 time
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

public class SimpleDateEx {

	public static void main(String[] args) throws ParseException {
		// SimpleDateFormat 클래스는 날짜를 특정 형식의 문자열로 출력할때
		// 출력할때 : SimpleDateFormat.format();
			//		yyyy	연도	2026
			//		MM	월(01~12)	01
			//		dd	일(01~31)	12
			//		HH	시(00~23)	15
			//		mm	분	08
			//		ss	초	45
			//		E	요일	Mon
			//		a	오전/오후	AM
			//		HH:mm:ss	시간	15:08:45
		// 변경할때 : SimpleDateFormat.parse();
		
		Scanner scan = new Scanner(System.in);
		// 현재 날짜/시간 객체
		Date now = new Date();
		// 날짜 포맷 객체들
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdf5 = new SimpleDateFormat("HH:mm:ss a");
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf7 = new SimpleDateFormat("E");
		SimpleDateFormat sdf8 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		SimpleDateFormat dateForm= new SimpleDateFormat("yyyy- MM-dd  (E)");
		System.out.println("현재 날짜/시간 출력");
		// 기본 날짜 형식
		System.out.println(sdf1.format(now));
		// / 구분자 사용
		System.out.println(sdf2.format(now));
		// 한글 날짜 출력
		System.out.println(sdf3.format(now));
		// 24시간제 시간 출력
		System.out.println(sdf4.format(now));
		// 12시간제 + 오전/오후
		System.out.println(sdf5.format(now));
		// 날짜 + 시간 출력
		System.out.println(sdf6.format(now));
		// 요일 출력
		System.out.println(sdf7.format(now));
		// 전체 형식 출력
		System.out.println(sdf8.format(now));
		System.out.println(dateForm.format(now));
		// parse 입력한 데이터 값 변경 후 Date 객체로 변환
		Date date = (Date) sdf1.parseObject("2025-11-25");
		System.out.println(sdf1.format(date));
		scan.close();
		


//		LocalDateTime now1 = LocalDateTime.now();
//		LocalDate today = LocalDate.now();
//		LocalTime time = LocalTime.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
//		String result = now1.format(formatter);
//		System.out.println(result);

	}

}
