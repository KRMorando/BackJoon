package stage6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class GroupCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        int result = 0;
        
        for(int i = 0; i < count; i++) {
            String[] str = br.readLine().split("");
            boolean isGroup = true;
            
            for(int j = 0; j < str.length; j++) {
                int index = j;
                for(int k = (j + 1); k < str.length; k++) {
                    if(str[j].equals(str[k])) {
                        if(k == (index + 1)) {
                            index = k;
                        } else {
                            isGroup = false;
                            break;
                        }
                    }
                }
            }
            if(isGroup)
                result++;
        }
        
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}