package stage5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FindChar {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int testCase = Integer.parseInt(bf.readLine());
        
        for(int i = 0; i < testCase; i++) {
            st = new StringTokenizer(bf.readLine());
            int R = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            
            for(int j = 0; j < str.length(); j++) {
                for(int k = 0; k < R; k++) {
                    bw.write(str.split("")[j] + "");
                }
            }
            bw.write("\n");
        }
        bw.close();
    }

}
