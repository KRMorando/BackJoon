package stage4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CountingForSmall {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int count = 0;
        
        int[] num = new int[N];
        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i< N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            if(num[i] < X)
                bw.write(num[i] + " ");
        }
        bw.close();
    }

}
