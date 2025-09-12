package basic.object;

public class Book {
    int bookNumber; // 책 번호
    String bookTitle; // 책 제목

    Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    // 문자열 정보 출력
    @Override
    public final String toString() {
        return bookNumber + ", " + bookTitle;
    }
    // 위 식이랑 같지만 위 식이 표준
    // public String showInfo() {
    //     return bookNumber + ", " + bookTitle;
    // }
    // System.out.println(book.showInfo()); 로 출력


}
