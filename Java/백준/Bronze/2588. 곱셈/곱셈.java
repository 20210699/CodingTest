import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 숫자 입력 받기
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        // 곱셈 과정 계산
        int line1 = num1 * (num2 % 10);        // 일의 자리 곱셈
        int line2 = num1 * ((num2 / 10) % 10); // 십의 자리 곱셈
        int line3 = num1 * (num2 / 100);       // 백의 자리 곱셈
        int result = num1 * num2;              // 전체 곱셈 결과

        // 결과 출력
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(result);
    }
}
