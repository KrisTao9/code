//package code_b_d_2018_2;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Code {
//    static  StringBuffer sb=new StringBuffer(6);
//    static int max=90;
//    static int min=-90;
//    static  String right="1";
//    static  String left="0";
//    public static void main(String[] args) throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int target=Integer.parseInt(br.readLine());
//
//        System.out.println(code(target));
//
//
//    }
//
//    public static String code(int number){
//        int mid=0;
//        for (int i=0;i<6;i++) {
//            if (number >= mid) {
//                sb.append(right);
//                max=max/2;
//                min=mid;
//                mid=max;
//            } else {
//                sb.append(left);
//                min=min/2;
//                max=mid;
//                mid=min;
//            }
//
//        }
//        return sb.toString();
//    }
//
//}
