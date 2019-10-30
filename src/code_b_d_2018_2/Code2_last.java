package code_b_d_2018_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Code2_last {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n=0;
        int[] a=null;
        String[] numStrs=null;
        while(true) {
            try {
                if (!((str = br.readLine()) != null)) break;
                 n = Integer.parseInt(str);
                a = new int[n];
                numStrs = br.readLine().split(" ");
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(numStrs[i]);
            }

            long res = 0;
            for (int i = 0; i <= 100; i++) {
                int realMin = Integer.MAX_VALUE; //真正的区间最小值
                long sum = 0;
                for (int j = 0; j < n; j++) {
                    if (a[j] >= i) {
                        sum += a[j];
                        realMin = Math.min(realMin, a[j]);
                    }else {
                        res = Math.max(res, realMin * sum);
                        sum = 0;
                        realMin = Integer.MAX_VALUE;
                    }
                }
                res = Math.max(res, realMin * sum);
            }
            System.out.println(res);
        }
    }
}
