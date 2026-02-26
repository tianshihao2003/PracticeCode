import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
/*
* 5.随机生成10个整数（1_100的范围）保存到数组，
* 并倒序打印以及求平均值、求最大值和最大值的下标、并查找里面是否有8
* */
public class demo09 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        Random random = new Random();

        System.out.println("随机数组为：");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) +1 ;
        }
        System.out.println(Arrays.toString( arr));

        System.out.println("倒序打印：");
        System.out.print("[");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("]");

        int sun = 0;
        for(int num : arr){
            sun += num;
        }
        System.out.println("数组元素和为：" + sun);
        System.out.println("数组元素平均值为：" + (double)sun/arr.length);


        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("数组最大值为：" + max + "，最大值索引为：" + maxIndex);

        boolean found = false;
        System.out.println("找是否有8");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 8) {
                found = true;
                break;
            }
        }
        if(! found){
            System.out.println("没有找到8");
        }
    }

}

















