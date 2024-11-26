import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Queue<Integer> que = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            que.add(i);
        }
        while(que.size() > 1){
            que.poll();
            que.add(que.poll());
        }
        System.out.print(que.peek());
    }
}