package basic.exceptions;

/*
    try{
        오류가 발생할 수 있는 코드
    } catch (NullPointerException e) {
        e.printStackTrace(); 
    }
 */

public class ExceptionHandling1 {
    // 문자열의 길이를 세는 함수
    public static void printLength(String data) {
        int len = data.length(); // 문자열의 크기를 세는 메서드 호출
       System.out.println("length: "+ len);

    }
    public static void main(String[] args) {
        // 실행 예외(Runtime Exception): 실행했을 때 오류 발생
        System.out.println("[프로그램 시작]\n");

        try{
        printLength("Hello"); // 문자열의 길이를 세는 함수
        printLength(null); // NullPointerException
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Insert String");
        }

        System.out.println("[프로그램 종료]\n");
    }
}
