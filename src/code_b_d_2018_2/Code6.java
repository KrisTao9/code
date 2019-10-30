package code_b_d_2018_2;
import java.util.Scanner;
public class Code6 {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int i = 0; i<n; i++){
                StringBuffer str = new StringBuffer(in.next());//存入数组
                for(int j = 0; j<str.length()-2; j++){
                    if(str.charAt(j) == str.charAt(j+1) && str.charAt(j+1) == str.charAt(j+2)){
                        str.deleteCharAt(j+2);
                        j--;
                    }
                }
                for(int j = 0; j<str.length()-3; j++){
                    if(str.charAt(j) == str.charAt(j+1) && str.charAt(j+2) == str.charAt(j+3)){
                        str.deleteCharAt(j+3);
                    }
                }
                System.out.println(str);
            }
        }
    }

