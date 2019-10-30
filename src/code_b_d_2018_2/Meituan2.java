package code_b_d_2018_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Meituan2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int length;
        int chance;
        int now=0;
        int max_length=0;
        String[] s1;
        while (true){
           String[] s = br.readLine().split(" ");
           length=Integer.parseInt(s[0]);
           chance=Integer.parseInt(s[1]);
            s1 = br.readLine().split(" ");
            break;
        }
        int [] nums=new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            nums[i]=Integer.parseInt(s1[i]);
        }
        //动态规划
        for (int i = 0; i <nums.length ; i++) {
//            for (int j=i;j<nums.length;j++){
//                if(chance>=0) {
//                    if (nums[j] == 1) {
//                        max_length++;
//                    }
//                    else {
//                        chance--;
//                        max_length++;
//                    }
//                }else {
//                    continue;
//                }
//            }
            int index=i;
            while (nums[index]==1&&chance>=0){
                if (nums[index] == 1) {
                       max_length++;
                   }
                    else {
                        chance--;
                       max_length++;
                 }

            }
             max_length=(max_length>now)? max_length:now;
        }
        System.out.println(max_length);
    }
}
