package stage4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Rest {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int num;
        for(int i = 0; i < 10; i++) {
            num = (Integer.parseInt(bf.readLine()) % 42);
            if(!list.contains(num))
                list.add(num);
        }
        
        bw.write(list.size() + "\n");
        bw.close();
    }

}
