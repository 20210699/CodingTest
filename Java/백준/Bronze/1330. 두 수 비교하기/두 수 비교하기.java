import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 정수 A와 B 입력받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // A와 B를 비교하여 결과 출력
        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
        
        scanner.close();
    }
}
