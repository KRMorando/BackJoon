package stage4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Average {

	public static void main(String[] args) throws IOException {
        // Á¡¼ö / high * 100
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        double high = 0, sum = 0;
        
        int N = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        
        double[] n = new double[N];
        for(int i = 0; i< N; i++) {
            n[i] = Double.parseDouble(st.nextToken());
            if(i == 0)
                high = n[i];
            if(high < n[i])
                high = n[i];
        }
        
        for(int i = 0; i < N; i++) {
            n[i] = n[i] / high * 100;
            sum += n[i];
        }
        
        bw.write((sum / n.length) + "\n");
        bw.close();
    }

}
