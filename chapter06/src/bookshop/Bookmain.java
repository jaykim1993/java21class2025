package bookshop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Bookmain {

    public static void main(String[] args) throws ParseException {
    	// 입력을 날짜형식
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // BookList 객체화
        BookList booklist = new BookList();
        // 리스트 추가
        booklist.addList(new BookDTO("Java", "홍길동", "코리아출판사", sdf.parse("2026-01-12"), 35000));
        booklist.addList(new BookDTO("React", "김길동", "코리아출판사", sdf.parse("2024-02-11"), 45000));
        booklist.addList(new BookDTO("Spring", "최길동", "코리아출판사", sdf.parse("2025-03-12"), 15000));
        booklist.addList(new BookDTO("HTML", "박길동", "코리아출판사", sdf.parse("2022-01-28"), 75000));
        booklist.addList(new BookDTO("MySQL", "오길동", "코리아출판사", sdf.parse("2021-04-12"), 25000));
        // 리스트 출력
        booklist.printlist();
        // 총 금액 출력
        booklist.totalPrice();
    }
}
