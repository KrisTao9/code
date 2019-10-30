import java.util.Scanner;

public class Code_360_2018_2 {

    public static void main(String[] args) {

        int sum=0;
        Scanner scanner=new Scanner(System.in);
        int times=scanner.nextInt();
        for (int i = 0; i < times; i++) {
            String[] s = scanner.next().split(" ");
            for (int j = 0; j < s.length; j++) {
                sum+=Integer.parseInt(s[j]);
            }
            if (sum%5==0){
                System.out.println(sum/5);
            }else {
                System.out.println(-1);
            }
        }


    }


}
