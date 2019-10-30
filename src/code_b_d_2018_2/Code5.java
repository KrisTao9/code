package code_b_d_2018_2;

import java.util.Scanner;

public class Code5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int spend = sc.nextInt();
//        int coin_64=64;
//        int coin_16=16;
//        int coin_4=4;
//        int coin_1=1;
        int now =0;
        int number=0;
        if(1024-spend==0){
            System.out.println(0);
        }
        else {
            now = 1024-spend;
            number+=now/64;
            now=now%64;
            number+=now/16;
            now=now%16;
            number+=now/4;
            now=now%4;
            number+=now;
            System.out.println(number);
        }

    }
}
