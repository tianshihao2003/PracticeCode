package stage02;
/*
1.编写类，定义方法max，实现求某个double数组的最大值，并返回
* */
public class demo01 {

    public static double max(double[] arr){
        if (arr == null || arr.length == 0) {
            return 0;
        }

        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5};
        double max = max(arr);
        System.out.println(max);
    }



}
