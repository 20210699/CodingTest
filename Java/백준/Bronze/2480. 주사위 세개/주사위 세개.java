import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        scanner.close();
        
        int prize = 0;
        
        if (a == b && b == c) { // 같은 눈이 3개 나오는 경우
            prize = 10000 + a * 1000;
        } else if (a == b || a == c) { // 같은 눈이 2개만 나오는 경우
            prize = 1000 + a * 100;
        } else if (b == c) {
            prize = 1000 + b * 100;
        } else { // 모두 다른 눈이 나오는 경우
            int max = Math.max(a, Math.max(b, c));
            prize = max * 100;
        }
        
        // 결과 출력
        System.out.println(prize);
    }
}
