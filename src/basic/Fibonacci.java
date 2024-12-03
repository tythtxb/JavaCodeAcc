package basic;

import java.util.Arrays;

/**
 * 斐波那契数列
 * @author tanghuan
 * @date 2024年11月29日
 */
public class Fibonacci {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long fibonacci = getFibonacci(100);
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start)/1000+"结果："+fibonacci);
    }

    public static long getFibonacci(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        long[] arr = new long[n];
        arr[0] = arr[1] = 1;		//第一个和第二个数据特殊处理
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i -2] + arr[i - 1];
        }

        //可以得到整个的数列数据 仅n>2
        System.out.println("数组内容：" + Arrays.toString(arr));

        return arr[n - 1];
    }

}
