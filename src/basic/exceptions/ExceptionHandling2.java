package basic.exceptions;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        // 컴파일 예외 - 실행 전에 미리 알 수 있는 예외
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("File cannot found");
        }
    }
}
