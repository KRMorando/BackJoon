package stage4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ChangeBall {
	public static void main(String[] args) throws IOException {
        //  i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] bucket = new int[N];
        int i, j, change;
        
        for(int n = 0; n < N; n++)
            bucket[n] = (n + 1);
        
        for(int n = 0; n < M; n++) {
            st = new StringTokenizer(bf.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            change = bucket[i-1];
            bucket[i-1] = bucket[j-1];
            bucket[j-1] = change;
        }
        
        for(int a = 0; a < N; a++)
            bw.write(bucket[a] + " ");
        bw.close();
    }
}
