import java.util.*;
import java.io.*;

public class Main{
    static ArrayList<Integer>[] A;
    static boolean[] isVisited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        A = new ArrayList[n + 1];
        isVisited = new boolean[n + 1];
        for(int i = 1; i < n + 1; i++){
            A[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        int count = 0;
        for(int i = 1; i < n + 1; i++){
            if (!isVisited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }
    static void DFS(int v){
        if(isVisited[v]){
            return;
        }
        isVisited[v] = true;
        for(int i : A[v]){
            if (!isVisited[i]){
                DFS(i);
            }
        }
    }
}