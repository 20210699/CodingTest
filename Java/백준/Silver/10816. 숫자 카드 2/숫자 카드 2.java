import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 입력: 상근이가 가지고 있는 숫자 카드의 개수 N
        int n = sc.nextInt();
        
        // 숫자 카드의 빈도를 저장할 HashMap
        HashMap<Integer, Integer> cardCount = new HashMap<>();
        
        // 두 번째 입력: 숫자 카드에 적혀 있는 정수들
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            cardCount.put(num, cardCount.getOrDefault(num, 0) + 1);
        }

        // 세 번째 입력: 몇 개 가지고 있는지 구해야 할 숫자의 개수 M
        int m = sc.nextInt();
        
        // 네 번째 입력: 구해야 할 M개의 정수들
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int query = sc.nextInt();
            sb.append(cardCount.getOrDefault(query, 0)).append(' ');
        }

        // 결과 출력
        System.out.println(sb.toString().trim());
        
        sc.close();
    }
}
