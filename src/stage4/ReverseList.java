package stage4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ReverseList {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        ArrayList<Integer> temp;
        int i , j, tempCount;
        
        st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] num = new int[N];
        
        for(int count = 0; count < N; count++)
            num[count] = count + 1;
        
        for(int count = 0; count < M; count++) {
            temp = new ArrayList<Integer>();
            tempCount = 0;
            
            st = new StringTokenizer(bf.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            
            for(int k = (j - 1); k >= (i - 1); k--)
                temp.add(num[k]);
            for(int k = (i - 1); k <= (j - 1); k++) {
                num[k] = temp.get(tempCount);
                tempCount++;
            }
        }
        for(int count = 0; count < N; count++)
            bw.write(num[count] + " ");
        bw.close();
    }

}
