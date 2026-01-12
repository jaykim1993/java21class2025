package bookMax;

import java.util.ArrayList;
import java.text.NumberFormat;

public class BookList {
	ArrayList<BookDTO> booklist;
	
	// 생성자
	public BookList() {
		booklist = new ArrayList<>();
	}

	public void addList(BookDTO dto) {
	    booklist.add(dto);
	}
	
	// 책 출력하기 + 가격 형식 선언
	public void printList() {
		System.out.println("----------------------------------------");
		System.out.printf("%-10s\t%s\t\t%s%n", "도서명", "저자", "가격");
		System.out.println("----------------------------------------");
		
		
		for(BookDTO dto : booklist) {
			System.out.printf("%-14s%-14s", dto.getName(), dto.getAuthor());
			NumberFormat nf = NumberFormat.getInstance();
			System.out.printf("%s원%n", nf.format(dto.getPrice()));
			
		}
		System.out.println("----------------------------------------");
	}

	// 비싼 책 뽑기
	public void expensive () {
		System.out.println("가장 비싼 책");
		String exName = "";
		int exPrice = 0;
//		for(BookDTO dto : booklist) {
//			if(dto.getPrice()> exPrice) {
//				exName = dto.getName();
//				exPrice = dto.getPrice();
//			}
//		}
		for(int i = 0 ; i<booklist.size() ; i++) {
			if(booklist.get(i).getPrice()> exPrice) {
				exName = booklist.get(i).getName();
				exPrice = booklist.get(i).getPrice();
			}
		}
		System.out.println("제목: " + exName);
		System.out.println("가격 : " + exPrice + "원");
	}

	
}
