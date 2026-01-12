package bookshop;

import java.util.Date;

public class BookDTO {
	String Booktitle; // 도서명
	String Author; // 저자
	String publisher; // 출판사
	Date Date; //  출판일 -> 2025-01-01 만 입력받는다.
	int Price; // 가격
	
	
	// 생성자
		public BookDTO() {};
		public BookDTO(String Booktitle, String Author, String publisher, Date Date, int Price) {
			this.Booktitle = Booktitle;
			this.Author = Author;
			this.publisher = publisher;
			this.Date = Date;
			this.Price = Price;
		};
}

// DTO : 책 정보를 담아서 전달하는 용도
// 순수 데이터 전송용 객체입니다.
// 멤버변수
