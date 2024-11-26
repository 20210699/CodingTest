import java.util.*;
import java.io.*;

public class Main{
    static int num = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Queue<Integer> que = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            que.add(i);
        }
        while(que.size() > 1){
            que.poll();
            num = que.poll();
            que.add(num);
        }
        System.out.print(que.peek());
    }
}