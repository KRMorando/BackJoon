package stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MoreMoreBeautiful {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String a, b;
        
        int T = Integer.parseInt(bf.readLine());
        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(bf.readLine());
            a = st.nextToken();
            b = st.nextToken();
            
            bw.write("Case #" + i + ": " + a + " + " + b + " = " + (Integer.parseInt(a) + Integer.parseInt(b)) + "\n");
        }
        bw.close();
    }

}
