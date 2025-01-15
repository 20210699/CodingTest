import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        Set<String> wordSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 길이가 같으면 사전 순으로 정렬
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 길이가 다르면 길이 순으로 정렬
                return Integer.compare(s1.length(), s2.length());
            }
        });
        
        // 단어들을 입력받아 Set에 추가
        for (int i = 0; i < N; i++) {
            wordSet.add(br.readLine());
        }
        
        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (String word : wordSet) {
            sb.append(word).append("\n");
        }
        System.out.print(sb.toString());
    }
}
