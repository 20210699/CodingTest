import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 위한 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력 처리
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 결과 출력 준비를 위한 BufferedWriter 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 각 연산 결과를 출력
        bw.write((a + b) + "\n");  // A + B
        bw.write((a - b) + "\n");  // A - B
        bw.write((a * b) + "\n");  // A * B
        bw.write((a / b) + "\n");  // A / B (몫)
        bw.write((a % b) + "\n");  // A % B (나머지)

        // 출력 스트림 플러시 및 닫기
        bw.flush();
        bw.close();
        br.close();
    }
}
