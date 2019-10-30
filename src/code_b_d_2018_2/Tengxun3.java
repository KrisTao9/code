package code_b_d_2018_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tengxun3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str= new String[2];
        while (true){
            str = br.readLine().split(" ");
            break;
        }
        int days=Integer.parseInt(str[0]);
        int sum=Integer.parseInt(str[1]);

        //two
        if(sum%2==0){
            for (int i = days-1; i >0 ; i--) {
                sum=sum/2+1;
            }
        }else {
            for (int i = days-1; i >0 ; i--) {
                sum=(sum+1)/2+1;
            }
        }
        System.out.println(sum);
    }
}
