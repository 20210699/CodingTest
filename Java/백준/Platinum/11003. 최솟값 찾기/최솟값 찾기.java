import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        Deque<Node> mydeq = new LinkedList<>();
        for (int i = 0; i < N; i++){
            int now = Integer.parseInt(st.nextToken());
            
            while(!mydeq.isEmpty() && mydeq.getLast().value > now){
                mydeq.removeLast(); // mydeq의 마지막 노드의 값이 현재 들어온 값보다 크면 마지막 노드를 삭제
            }
            mydeq.addLast(new Node(now, i)); // 새로운 노드를 mydeq의 마지막에 추가
            
            if(mydeq.getFirst().index <= i - L){
                mydeq.removeFirst();
            }
            bw.write(mydeq.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
    }
    
    static class Node{
        public int value;
        public int index;
        
        Node(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
}