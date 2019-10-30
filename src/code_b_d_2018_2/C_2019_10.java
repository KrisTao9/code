package code_b_d_2018_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class C_2019_10 {
    public static void main(String[] args) throws IOException {
        //字典排序=>list
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s;
        String[] s1;
        int length;
        int target;
        while (true){
            s = br.readLine().split(" ");
            length=Integer.parseInt(s[0]);
            target=Integer.parseInt(s[1]);
            break;
        }


        ArrayList list=new ArrayList(length);
        HashSet hs=new HashSet();
        for (int i=1;i<=length;i++){
            list.add(i);
        }
        for (int i=1;i<=length;i++){
            hs.add(i);
        }
        System.out.println(list.get(target-1));
    }
}
