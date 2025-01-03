import java.util.*;
import java.io.*;

public class Main{
    static boolean isVisited[];
    static int[] distance;
    static ArrayList<Edge>[] A;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        A = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++){
            A[i] = new ArrayList<Edge>();
        }
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            while(true){
                int E = Integer.parseInt(st.nextToken());
                if (E == -1) break;
                int V = Integer.parseInt(st.nextToken());
                A[S].add(new Edge(E,V));
            }
        }
        distance = new int[N + 1];
        isVisited = new boolean[N + 1];
        BFS(1);
        int Max = 1;
        for(int i = 2; i <= N; i++){
            if (distance[Max] < distance[i]) Max = i;
        }
        distance = new int[N + 1];
        isVisited = new boolean[N + 1];
        BFS(Max);
        Arrays.sort(distance);
        System.out.println(distance[N]);
    }
    private static void BFS(int index){
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(index);
        isVisited[index] = true;
        while(!que.isEmpty()){
            int now_node = que.poll();
            for(Edge i : A[now_node]){
                int e = i.e;
                int v = i.value;
                if(!isVisited[e]){
                    isVisited[e] = true;
                    que.add(e);
                    distance[e] = distance[now_node] + v;
                }
            }
        }
    }
    static class Edge{
        int e;
        int value;
        public Edge(int e, int value){
            this.e = e;
            this.value = value;
        }
    }
}