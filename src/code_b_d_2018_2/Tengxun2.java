package code_b_d_2018_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Tengxun2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sh=0;
        int bu=0;
        int[] cards;
        String[] str;
        while (true){
            int length=Integer.parseInt(br.readLine());
            str = br.readLine().split(" ");
            cards = new int[length];
            break;
        }
        for (int i = 0; i <str.length ; i++) {
            cards[i]=Integer.parseInt(str[i]);
        }
        //数组排序
        int tmp=0;
        for (int i = 0; i <cards.length ; i++) {
            for (int j=i+1;j<cards.length ; j++){
                if(cards[i]<cards[j]){
                    tmp=cards[j];
                    cards[j]=cards[i];
                    cards[i]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(cards));
        for (int i = 0; i <cards.length ; i++) {
            if(i%2==0){
                bu+=cards[i];
            }else {
                sh+=cards[i];
            }
        }
        System.out.println(bu-sh);
    }

}
