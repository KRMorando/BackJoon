package stage6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Chess {

	public static void main(String[] args) throws IOException {
		// �� 16�� ŷ 1��, �� 1��, �� 2��, ��� 2��, ����Ʈ 2��, �� 8��
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int[] chess = {1, 1, 2, 2, 2, 8};
        int result;
        
        for(int i = 0; i < 6; i++) {
            result = chess[i] - Integer.parseInt(st.nextToken());
            bw.write(result + " ");
        }
        bw.flush();
        bw.close();
	}

}
