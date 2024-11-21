import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer sf = new StringBuffer();
        int num = 1;
        boolean result = true;
        for(int i = 0; i < A.length; i++){
            if(A[i] >= num){
                while(A[i] >= num){
                    stack.push(num++);
                    sf.append("+\n");
                }
                stack.pop();
                sf.append("-\n");
            } else{
                int n = stack.pop();
                if(n > A[i]){ // 스택에 가장 마지막에 있는 수가 수열보다 크다면 수열을 만들 수 없음.
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sf.append("-\n");
                }
            }
        }
        if(result) System.out.println(sf.toString());
    }
}