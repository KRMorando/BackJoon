package stage5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sangsoo {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        ArrayList<String> firstArr = new ArrayList<String>();
        ArrayList<String> secondArr = new ArrayList<String>();
        
        st = new StringTokenizer(bf.readLine());
        
        String first = st.nextToken();
        String second = st.nextToken();
        String nfirst = "", nsecond = "";
        
        for(int i = (first.length() - 1); i >= 0; i--)
            firstArr.add(first.split("")[i]);
        
        for(int i = (second.length() - 1); i >= 0; i--)
            secondArr.add(second.split("")[i]);
        
        for(int i = 0; i < firstArr.size(); i++)
            nfirst += firstArr.get(i);
        
        for(int i = 0; i < secondArr.size(); i++)
            nsecond += secondArr.get(i);
        
        int intFirst = Integer.parseInt(nfirst);
        int intSecond = Integer.parseInt(nsecond);
        
        if(intFirst > intSecond)
            bw.write(intFirst + "");
        else
            bw.write(intSecond + "");
        bw.close();
    }

}
