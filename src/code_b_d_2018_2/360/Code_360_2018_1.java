import java.util.Scanner;

public class Code_360_2018_1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int sum=0;
            for (int j = 0; j < t; j++) {
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
                sum+=(x2-x1+1)*(y2-y1+1);
            }
            System.out.println(sum);
        }




    }
}
