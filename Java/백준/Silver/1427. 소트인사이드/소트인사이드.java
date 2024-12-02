import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] digits = str.toCharArray();

        Arrays.sort(digits);

        StringBuilder sb = new StringBuilder(new String(digits));
        String result = sb.reverse().toString();

        System.out.println(result);
    }
}
