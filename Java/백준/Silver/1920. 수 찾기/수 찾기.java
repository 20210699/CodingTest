import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 입력: N개의 정수
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        // 두 번째 입력: M개의 쿼리
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            if (set.contains(sc.nextInt())) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }

        // 결과 출력
        System.out.print(sb.toString());
    }
}
