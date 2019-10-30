package code_b_d_2018_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        if (br!=null) {
//           System.out.println(br.readLine());
//       }


    }
    public void smart(String str){
        char[] chars = str.toCharArray();
        StringBuffer sb=new StringBuffer() ;
        //三个的情况
        for (int i = 0; i < chars.length-2; i++) {
            if (!(chars[i]==chars[i+1])&&(chars[i]==chars[i+2])){
                sb.append(chars[i]);
            }else {

            }

        }
    }
}
