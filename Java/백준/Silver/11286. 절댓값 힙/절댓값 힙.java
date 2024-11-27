import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pque = new PriorityQueue<>((a,b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            
            if(absA == absB) return a > b ? 1 : -1;
            else return absA - absB;
        });
        
        for (int i = 0; i < N; i++){
            int req = Integer.parseInt(br.readLine());
            if(req == 0){
                if(pque.isEmpty()) System.out.println("0");
                else System.out.println(pque.poll());
            } else pque.add(req);
        }
    }
}