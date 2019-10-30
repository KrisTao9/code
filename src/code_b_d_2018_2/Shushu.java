package code_b_d_2018_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shushu {
    public static void main(String[] args) throws IOException {
        int count =0;
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int target=Integer.parseInt(bufferedReader.readLine());

        for (int i=1;i<(target/2)+1;i++){
            if(is_Shushu(i)){
                if(is_Shushu(target-i)) {
                    System.out.println("" + i + "    " + (target - i));
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean is_Shushu(int number){
        int flag=0;
            for (int j = 2; j <number ; j++) {
                if(number%j==0){
                   flag++;
                }else {
                }
            }

        return flag==0;
    }
}
