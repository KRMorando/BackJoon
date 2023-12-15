package stage6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class WordStudy {
	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<String> sameStr = new ArrayList<>();
		String[] str = (bf.readLine().toUpperCase()).split("");
		
		String highStr = new String();
		int highCount = 0;
		boolean isSame = false;
		
		for(int i = 0; i < str.length; i++) {
			String nowStr = new String();
			int nowCount = 0;
			for(int j = (i + 1); j < str.length; j++) {
				if(str[i].equals(str[j])) {
					nowCount++;
					nowStr = str[i];
				}
			}
			if(nowCount > highCount) {
				highCount = nowCount;
				highStr = nowStr;
			} else if(nowCount == highCount && nowCount != 0) {
				isSame = true;
				break;
			}
		}
		
		if(isSame || highStr.equals(""))
			bw.write("?");
		else
			bw.write(highStr);
		
		bw.flush();
		bw.close();
    }
}
