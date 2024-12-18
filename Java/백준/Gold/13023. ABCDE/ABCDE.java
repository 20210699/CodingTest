import java.util.*;
import java.io.*;

public class Main{
    static boolean[] isVisited;
    static ArrayList<Integer>[] A;
    static boolean isArrived;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        isArrived = false;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N];
        isVisited = new boolean[N];
        
        for(int i = 0; i < N; i++){
            A[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
            A[E].add(S);
        }
        for(int i = 0; i < N; i++){
            DFS(i, 1);
            if(isArrived) break;
        }
        if(isArrived) System.out.println("1");
        else System.out.println("0");
    }
    public static void DFS(int now, int depth){
        if(depth == 5 || isArrived){
            isArrived = true;
            return;
        }
        isVisited[now] = true;
        for(int i : A[now]){
            if(!isVisited[i]){
                DFS(i, depth + 1);
            }
        }
        isVisited[now] = false;
    }
}