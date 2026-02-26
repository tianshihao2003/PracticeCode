package stage01;

import java.util.Arrays;
import java.util.Scanner;

public class demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 获取用户输入的数组大小
        System.out.println("请输入数组大小：");
        int n = sc.nextInt();

        // 创建数组并输入元素
        int[] arr = new int[n];
        System.out.println("请输入 " + n + " 个整数：");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("原始数组：" + Arrays.toString(arr));

        // 执行冒泡排序
        bubbleSort(arr);

        System.out.println("排序后数组：" + Arrays.toString(arr));
    }

    // 冒泡排序方法
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        System.out.println("\n=== 冒泡排序过程 ===");

        // 外层循环控制排序轮数
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // 优化标志，检测是否发生交换

            // 内层循环进行相邻元素比较和交换
            for (int j = 0; j < n - 1 - i; j++) {
                // 如果前面的元素大于后面的元素，则交换
                if (arr[j] > arr[j + 1]) {
                    // 交换元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // 显示每一轮排序后的结果
            System.out.println("第 " + (i + 1) + " 轮排序后：" + Arrays.toString(arr));

            // 优化：如果这一轮没有发生任何交换，说明已经有序
            if (!swapped) {
                System.out.println("数组已有序，提前结束排序");
                break;
            }
        }
    }
}
