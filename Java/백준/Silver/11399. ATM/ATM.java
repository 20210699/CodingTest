import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(A);
        
        int[] S = new int[N];
        S[0] = A[0];
        for(int i = 1; i < N; i++){
            S[i] = S[i - 1] + A[i];
        }
        
        int sum = 0;
        for(int num : S){
            sum += num;
        }
        
        System.out.println(sum);
    }
}