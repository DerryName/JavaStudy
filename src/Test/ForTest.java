package Test;

import java.time.temporal.IsoFields;
import java.util.Scanner;

/*

 */
public class ForTest {
    public static void main(String[] args) {


//        int i = 1;
//        while (i <= 100) {
//            if (i % 2 == 0 ) {
//                System.out.println(i);
//            }
//            i++;
//        }
//
//
// ******


//        for (int j=1; j<=4; j++) {
//            for (int i=1 ; i<=6; i++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        for (int i=1; i<=5; i++) {
//            for (int j=1;j<=i;j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//
//        for (int i=4;i >= 0;i--) {
//            for (int j=4;j<=i;j--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        for (int i=1; i<=4; i++) {
//            for (int j=4; j>=i;j--) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        for (int i=1; i<=9; i++) {
//            for (int j=1; j<=i;j++) {
//                System.out.print(i+"*"+j+"="+i*j+"\t");
//            }
//            System.out.println();
//        }

//        long start = System.currentTimeMillis();//记录开始时间
//        int count = 0; //统计个数
//        boolean ifFlag = true;  //标识i是否被除尽,
//
//        for (int i=2;i <=100000;i++) {
//            for (int j=2; j<Math.sqrt(i);j++) {
//                if ( i % j == 0) {
//                    ifFlag = false;
//                    break;
//                }
//            }
//            //质数
//            if (ifFlag == true) {
////                System.out.println(i);
//                count++;
//            }
//            //重置ifFlag
//            ifFlag = true;
//        }
//        long end = System.currentTimeMillis();//记录结束时间
//        System.out.println("质数的个数"+count);
//        System.out.println("一共花费的时间:"+(end - start));//13259  1236

//        for (int i=1; i <=4; i++) {
//            for (int j=1; j<=10; j++) {
//                if (j % 4 == 0) {
////                    break label;
//                    continue;
//                }
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        int factor = 0;
//        for (int i=1; i<=1000;i++) {
//            for (int j=1; j<= i/2;j++) {
//                if (i % j == 0) {
//                    factor += j;
//                }
//            }
//            if (i == factor) {
//                System.out.println(i);
//            }
//            //重置factor
//            factor = 0;
//        }

        for (int i=1; i<=6;i++) {
            for (int j=6;j>=i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
