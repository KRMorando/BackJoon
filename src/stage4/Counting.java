package stage4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Counting {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int[] num;
        int count = 0;
        
        int N = Integer.parseInt(bf.readLine());
        num = new int[N];
        
        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++)
            num[i] = Integer.parseInt(st.nextToken());
        
        int v = Integer.parseInt(bf.readLine());
        
        for(int i = 0; i < N; i++)
            if(num[i] == v)
                count++;
        
        bw.write(count + "\n");
        bw.close();
    }

}
