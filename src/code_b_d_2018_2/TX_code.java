package code_b_d_2018_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TX_code {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        char first='a';
        char last='z';
        int sum_length=1+25*25+25*25*25;

        char[] target=br.readLine().toCharArray();
        //判断长度
        switch (target.length){
            case 1:
                System.out.println((target[0]-first)*25*25*25+1);
                break;
            case 2:
                System.out.println(((target[0]-first)*25+1)+(target[1]-first));
                break;
            case 3:
                System.out.println(((last-target[0])*25*25*25+1)+(target[1]-first)*25+(target[2]-first));
                break;

                default:
                    System.out.println(((last-target[0])*25*25*25+1)+(target[1]-first)*25*25+(target[2]-first)*25*+(target[3]-first));
        }

    }
}
