import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 현재 시각 입력
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // 요리하는 데 필요한 시간 입력
        int C = scanner.nextInt();
        
        // 총 분 단위로 변환
        int totalMinutes = A * 60 + B + C;
        
        // 새로운 시각 계산
        int newHour = (totalMinutes / 60) % 24;
        int newMinute = totalMinutes % 60;
        
        // 결과 출력
        System.out.println(newHour + " " + newMinute);
        
        scanner.close();
    }
}
