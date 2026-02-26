package stage01;

import java.util.Arrays;
import java.util.Scanner;
/*
* 4.已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如：
[10，12，45，90],添加23后，数组为[10，12，23，45，90]
* */
public class demo08 {
    public static void main(String[] args) {
        // 原始升序数组
        int[] arr = {10, 12, 45, 90};
        Scanner sc = new Scanner(System.in);

        System.out.println("原始数组：" + Arrays.toString(arr));
        System.out.println("请输入要插入的元素：");
        int insertNum = sc.nextInt();

        // 创建新数组，长度比原数组多1
        int[] newArr = new int[arr.length + 1];

        // 找到插入位置
        int insertIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (insertNum > arr[i]) {
                insertIndex = i + 1;
            } else {
                break;
            }
        }

        // 复制插入位置之前的元素
        for (int i = 0; i < insertIndex; i++) {
            newArr[i] = arr[i];
        }

        // 插入新元素
        newArr[insertIndex] = insertNum;

        // 复制插入位置之后的元素
        for (int i = insertIndex; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // 输出结果
        System.out.println("插入元素后的数组：" + Arrays.toString(newArr));

        // 验证数组是否仍为升序
        boolean isAscending = true;
        for (int i = 0; i < newArr.length - 1; i++) {
            if (newArr[i] > newArr[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println("数组保持升序 ✓");
        } else {
            System.out.println("数组不是升序 ✗");
        }
    }
}
