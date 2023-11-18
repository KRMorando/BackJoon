package stage4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Report {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= 30; i++)
            list.add(i);
        
        int input, max = 0;
        
        for(int i = 0; i < 28; i++) {
            input = Integer.parseInt(bf.readLine());
            list.remove(list.indexOf(input));
        }
        
        if(list.get(0) > list.get(1)) {
            bw.write(list.get(1) + "\n" + list.get(0));
        } else
            bw.write(list.get(0) + "\n" + list.get(1));
        bw.close();
    }

}
