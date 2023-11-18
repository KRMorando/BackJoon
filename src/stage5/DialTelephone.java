package stage5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DialTelephone {

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int time = 0;
        String str = bf.readLine();
        
        for(int i = 0; i < str.length(); i++)
            switch(str.split("")[i]) {
                case "W", "X", "Y", "Z":
                    time += 10;
                    break;
                case "T", "U", "V":
                    time += 9;
                    break;
                case "P", "Q", "R", "S":
                    time += 8;
                    break;
                case "M", "N", "O":
                    time += 7;
                    break;
                case "J", "K", "L":
                    time += 6;
                    break;
                case "G", "H", "I":
                    time += 5;
                    break;
                case "D", "E", "F":
                    time += 4;
                    break;
                case "A", "B", "C":
                    time += 3;
                    break;
            }
        
        bw.write(time + "");
        bw.close();
    }

}
