import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Code_360_2018_3 {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            int times=Integer.parseInt(bufferedReader.readLine());

            for (int i = 0; i < times; i++) {
                String[] s = bufferedReader.readLine().split(" ");
                count(s);
            }
        break;

        }

    }


    public static void count(String [] strings){
        int[] rgb=new int[3];
        int sum=0;
        int max=0;
        int min=0;
        for (int i = 0; i < strings.length; i++) {
            rgb[i]=Integer.parseInt(strings[i]);
        }
        Arrays.sort(rgb);
            if(rgb[0]>(rgb[1]+rgb[2])*2){
                System.out.println(rgb[1]+rgb[2]);
            }else {
                System.out.println((rgb[0]+rgb[1]+rgb[2])/3);
            }
    }
}
