package stage02;
/*
* 4.编写类，实现数组的复制功能copyArr，
* 输入I旧数组，返回一个新数组，元素和i旧数组一样
* */
public class demo03 {

    public static int[] copArr(int[] oldArr) {
        if (oldArr == null) {
            return null;
        }

        int[] newArr = new int[oldArr.length];

        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        return newArr;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] newArr = copArr(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
