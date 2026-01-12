package bookshop;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class BookList {
ArrayList<BookDTO> list;

// 생성자
	public BookList() {
		list = new ArrayList<>();
	}

// 매서드
	public void addList(BookDTO dto) {
		list.add(dto);
	}

	public void printlist() {
	    System.out.println("=====================================================");
	    System.out.printf("%-6s%-6s%-12s%-15s%s\n", "도서명", "저자", "출판사", "출판일", "가격");
	    System.out.println("=====================================================");
		for(BookDTO dto : list) {
			System.out.printf("%-7s%-6s%-10s",dto.Booktitle, dto.Author, dto.publisher);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)"); // 요일 추가 출력
			System.out.printf("%-10s", sdf.format(dto.Date));
			
			NumberFormat nf = NumberFormat.getInstance();
			System.out.printf("%10s원%n", nf.format(dto.Price));
		}
		System.out.println("=====================================================");
	}
	
	public void totalPrice() {
		System.out.print("합계 : ");
		int sum = 0;
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();
		for(BookDTO dto : list) sum += dto.Price;
		System.out.println(nf2.format(sum)+"원");
	}
}
