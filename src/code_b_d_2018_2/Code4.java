package code_b_d_2018_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int count;
        int distance;
        int[] s1 ;
        int num=0;
        while (true){
            String[]s = br.readLine().split(" ");
            count = Integer.parseInt(s[0]);
            distance = Integer.parseInt(s[1]);
             String[] pos = br.readLine().split(" ");
             s1=new int[pos.length];
             for (int i =0;i<pos.length;i++){
                 s1[i]=Integer.parseInt(pos[i]);
             }
                break;
        }
        System.out.println(distance);
        System.out.println(count);
        System.out.println(num);
        System.out.println(s1.length);

        //计算距离
        for (int i =0 ;i<s1.length-2;i++){
            for (int j=i+1;j<s1.length-1;j++) {
                for (int k = j+1; k < s1.length; k++) {
                    if (s1[k] <= s1[i] + distance) {
                        num++;
                        System.out.println("(" + s1[i] + "," + s1[j] + "," + s1[k] + ")");
                    }
                }
            }


        }
        System.out.println(num);

    }
}
