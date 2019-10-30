package code_b_d_2018_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class B_d_2019_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cum_count=0;
        int[] score;
        while (true){
            int i = Integer.parseInt(br.readLine());
            score=new int[i];
            String str = br.readLine();
            String[] s = str.split(" ");
            for (int j = 0; j <s.length ; j++) {
                score[j]=Integer.parseInt(s[j]);
            }
            int times=Integer.parseInt(br.readLine());
            for (int j = 0; j <times ; j++) {
                System.err.println(sim(score,br.readLine()));
            }
            break;
        }

    }



    public  static int sim(int[] score,String find){
        //解析Sting(s,e,score)
        int sum=0;
        String[] s = find.split(" ");
        int start=Integer.parseInt(s[0]);
        int end=Integer.parseInt(s[1]);
        int aim_score=Integer.parseInt(s[2]);
        //开始查找
        for (int i = start-1; i <end-1 ; i++) {
                if(score[i]==aim_score){
                    sum++;
                }
        }
        return sum;
    }
}
