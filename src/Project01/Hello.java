package Project01;

import java.util.Arrays;
//单行注释
public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world");
        int[] arr1=new int[]{1,2,3,4};
        String s=Arrays.toString(arr1);
        System.out.println(s);
        System.out.println("arr1 = " + arr1 );
        for (int i = 0; i < arr1.length; i++) {
            int i1 = arr1[i];
        }
    }
}
