import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int count = 0;
        for(int k = 0; k < N; k++){
            long find = A[k];
            int i = 0;
            int j = N - 1;
            while(i < j){
                if(A[i] + A[j] == find){
                    if(i != k && j != k){
                        count++;
                        break;
                    } else if(i == k){
                        i++;
                    } else if(j == k){
                        j--;
                    }
                } else if(A[i] + A[j] > find){
                    j--;
                } else {
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}