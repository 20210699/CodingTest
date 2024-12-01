import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        mData[] A = new mData[N];
        
        // 배열 A 저장
        for(int i = 0; i < N; i++){
            A[i] = new mData(Integer.parseInt(br.readLine()), i);
        }
        
        // 배열 A 정렬 O(nlogn)
        Arrays.sort(A);
        int Max = 0;
        
        for(int i = 0; i < N; i++){
            if(Max < A[i].index - i) Max = A[i].index - i;
        }
        
        System.out.println(Max + 1); // swap하지 않은 반복 횟수(+1)
    }
    
    static class mData implements Comparable<mData>{
        int value;
        int index;
        
        public mData(int value, int index){
            super();
            this.value = value;
            this.index = index;
        }
        
        //value를 기준으로 오름차순 정렬
        @Override
        public int compareTo(mData o){
            return this.value - o.value;
        }
    }
}