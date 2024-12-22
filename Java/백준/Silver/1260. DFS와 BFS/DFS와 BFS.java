import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int Start = Integer.parseInt(st.nextToken());

        // Generic Array Creation 해결
        A = (ArrayList<Integer>[]) new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E); // 인수 추가
            A[E].add(S);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]); // 오타 수정
        }

        isVisited = new boolean[N + 1];
        DFS(Start);
        System.out.println();

        isVisited = new boolean[N + 1];
        BFS(Start);
        System.out.println();
    }

    static void DFS(int Node) {
        System.out.print(Node + " ");
        isVisited[Node] = true;
        for (int i : A[Node]) {
            if (!isVisited[i]) {
                DFS(i);
            }
        }
    }

    static void BFS(int Node) {
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(Node);
        isVisited[Node] = true;

        while (!que.isEmpty()) {
            int now_Node = que.poll();
            System.out.print(now_Node + " ");
            for (int i : A[now_Node]) {
                if (!isVisited[i]) {
                    isVisited[i] = true;
                    que.add(i);
                }
            }
        }
    }
}
