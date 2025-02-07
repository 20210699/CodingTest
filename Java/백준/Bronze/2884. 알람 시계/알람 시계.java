import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        // 45분 일찍 설정
        M -= 45;

        // 분이 음수가 되면
        if (M < 0) {
            M += 60; // 60분을 더해 정상 범위로 변환
            H -= 1;  // 한 시간 감소
        }

        // 시간이 음수가 되면 23시로 변경 (하루 전으로)
        if (H < 0) {
            H = 23;
        }

        // 결과 출력
        System.out.println(H + " " + M);
    }
}
