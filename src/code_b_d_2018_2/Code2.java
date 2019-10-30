package code_b_d_2018_2;

import java.util.Scanner;

public class Code2 {

    public static void main(String[] args) {
        System.out.println("Pealse input array length.");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] aim_array = new int[len];
        System.out.println("Pealse input array number.");
        for (int i= 0;i<aim_array.length;i++){
            aim_array[i]=sc.nextInt();
        }
        System.out.println(Integer.MAX_VALUE);
        //动态规划
        int max=0;
        //各位数的最大值
        max=aim_array[0]*aim_array[0];
        for(int i = 0;i<aim_array.length-1;i++){//次数
            for (int j= i;j<aim_array.length-1;j++) {//遍历数组
                for (int k = 0; k <= j; k++) {
                    max = aim_array[i]*aim_array[j];
                    max = (max > aim_array[i] * aim_array[j]) ? max : aim_array[i] * aim_array[j];
                }
                max = (max > aim_array[i] * aim_array[i + 1]) ? max : aim_array[i] * aim_array[i + 1];
            }
        }
        System.out.println("max" +max);
    }
}
