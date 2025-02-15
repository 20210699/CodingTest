import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MAX = 2000000; // 상한을 1,000,000보다 크게 설정

        boolean[] isPrime = new boolean[MAX];

        for (int i = 2; i < MAX; i++) {
            isPrime[i] = true;  // 기본적으로 모든 수를 소수로 가정
        }
        
        for (int i = 2; i * i < MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < MAX; j += i) {
                    isPrime[j] = false; // i의 배수는 소수가 아님
                }
            }
        }

        for (int i = N; i < MAX; i++) {
            if (isPrime[i] && isPalindrome(i)) { // 소수이면서 팰린드롬 체크
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
