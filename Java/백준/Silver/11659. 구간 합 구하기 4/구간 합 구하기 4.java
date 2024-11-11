import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        // 입력 처리
        BufferedReader bufferedReader = 
            new BufferedReader(new InputStreamReader(System.in)); //IOException 예외 처리 꼭 하기
        StringTokenizer stringTokenizer = 
            new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        
        long[] S = new long[suNo + 1]; // 합 배열
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 1; i <= suNo; i++){
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        
        for(int q = 0; q < quizNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
        
    }
}