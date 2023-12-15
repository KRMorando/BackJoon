package stage6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String newStr = "";
        
        String str = br.readLine();
        for(int i = (str.length() - 1); i >= 0; i--)
            newStr += str.split("")[i];
        
        if(str.equals(newStr))
            bw.write("1");
        else
            bw.write("0");
        
        bw.flush();
        bw.close();
	}

}
