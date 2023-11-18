package stage4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MaxAndMin {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int min = 0, max = 0;
        int N = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int num;
        
        for(int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());
            if(i == 0) {
                min = num;
                max = num;
            }
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        bw.write(min + " " + max + "\n");
        bw.flush();
        bw.close();
    }

}
