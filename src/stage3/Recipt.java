package stage3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Recipt {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int totalAmount = Integer.parseInt(bf.readLine());
        int count = Integer.parseInt(bf.readLine());
        int a, b;
        int sum = 0;
        
        for(int i = 0; i < count; i++) {
            st = new StringTokenizer(bf.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            sum += (a * b);
        }
        
        if(totalAmount == sum)
            bw.write("Yes");
        else
            bw.write("No");
        
        bw.close();
    }

}
