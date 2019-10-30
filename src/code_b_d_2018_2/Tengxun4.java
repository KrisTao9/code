package code_b_d_2018_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Tengxun4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] s;
        int m_long;
        HashMap map= new HashMap<Integer,Integer>();
        while (true){
            m_long=Integer.parseInt(br.readLine());
            s = br.readLine().split(" ");
            break;
        }
        for (int i = 0; i <s.length ; i=i+2) {
            map.put(Integer.parseInt(s[i]),Integer.parseInt(s[i+1]));
        }
        //开始取数
        for(Object enn : map.keySet()){//遍历key
        System.out.println("key"+"==="+enn);
    }



    }
}
