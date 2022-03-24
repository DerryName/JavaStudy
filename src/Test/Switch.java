package Test;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入year");
        int year = scanner.nextInt();
        System.out.println("请输入month");
        int month = scanner.nextInt();
        System.out.println("请输入day");
        int day = scanner.nextInt();

        int SumMonth = 0;

        switch (month) {
            case 4:
                SumMonth += 31;
            case 3:
                //判断year是否为闰年
                if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0) {
                    SumMonth += 29;
                } else {
                    SumMonth += 28;
                }
            case 2:
                SumMonth += 31;
            case 1:
                SumMonth += day;
        }
        System.out.println(year+"年"+month+"月"+day+"是当年的"+SumMonth+"天");
    }
}
