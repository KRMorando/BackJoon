package stage6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Star {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int input = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < 2; i++) {
            if(i == 0) {
                for(int j = 1; j <= input; j++) {
                    for(int k = input; k > j; k--)
                        bw.write(" ");
                    for(int k = 0; k < (j * 2 - 1); k++)
                        bw.write("*");
                    bw.write("\n");
                }
            } else {
                for(int j = (input - 1); j > 0; j--) {
                    for(int k = input; k > j; k--)
                        bw.write(" ");
                    for(int k = (j * 2 - 1); k > 0; k--)
                        bw.write("*");
                    bw.write("\n");
                }
            }
        }
        
        bw.flush();
        bw.close();
    }

}
