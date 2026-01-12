package bookMax;

public class BookMain {

    public static void main(String[] args) {
        BookList bl = new BookList();
        bl.addList(new BookDTO("자바의 정석", "낭궁민", 30000));   // 리스트에 추가
        bl.addList(new BookDTO("MySQL 입문", "호준씨", 28000));   // 리스트에 추가
        bl.addList(new BookDTO("정신수양", "김길동", 45000));   // 리스트에 추가
        bl.addList(new BookDTO("아무개책", "김길동", 15000));   // 리스트에 추가

        bl.printList();   // 출력
        bl.expensive();
    }
}