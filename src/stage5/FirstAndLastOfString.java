package stage5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FirstAndLastOfString {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testCase = Integer.parseInt(bf.readLine());
        for(int i = 0; i < testCase; i++) {
            String str = bf.readLine();
            bw.write(str.split("")[0] + "" + str.split("")[str.length() - 1] + "\n");
        }
        bw.close();
    }

}
