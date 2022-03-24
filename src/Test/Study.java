package Test;

import com.sun.org.apache.bcel.internal.generic.GOTO;

import java.time.temporal.ValueRange;
import java.util.Date;
import java.util.Scanner;

public class Study {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入2019年的month");
        int month = scanner.nextInt();
        System.out.println("请输入2019年的day");
        int day = scanner.nextInt();
        int SumMonth = 0;

        switch (month) {
            case 4:
                SumMonth += 31;
            case 3:
                SumMonth += 28;
            case 2:
                SumMonth += 31;
            case 1:
                SumMonth += day;
        }
        System.out.println("2019年"+month+"月"+day+"是当年的"+SumMonth+"天");
    }
}
