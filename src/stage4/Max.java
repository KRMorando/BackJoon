package stage4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Max {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int max = 0;
        int index = 1;
        int[] num = new int[9];
        
        for(int i = 0; i < 9; i++) {
            num[i] = Integer.parseInt(bf.readLine());
            if(i == 0)
                max = num[i];
            if(num[i] > max) {
                max = num[i];
                index = (i + 1);
            }
        }
        bw.write(max + "\n" + index);
        bw.close();
    }

}
