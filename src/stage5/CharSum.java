package stage5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharSum {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        
        int N = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        
        for(int i = 0; i < N; i++)
            sum += Integer.parseInt(str.split("")[i]);
        
        bw.write(sum + "");
        bw.close();
    }

}
