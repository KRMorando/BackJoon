package stage4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class InputBall {

	public static void main(String[] args) throws IOException {
        // 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] bucket = new int[N];
        int i, j, k;
        
        for(int count = 0; count < M; count++) {
            st = new StringTokenizer(bf.readLine());
            i = (Integer.parseInt(st.nextToken()) - 1);
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            for(int start = i; start < j; start++)
                bucket[start] = k;
        }
        for(int a = 0; a < N; a++)
            bw.write(bucket[a] + " ");
        bw.close();
    }

}
