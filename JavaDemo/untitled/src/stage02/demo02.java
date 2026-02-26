package stage02;
/*
* 2.编写类，定义方法find，
* 实现查找某字符串数组中的元素查找，并返回索引l，如果找不到，返回-1.
* */
public class demo02 {

    public static int find(String[] arr, String target) {
        if (arr == null || target == null) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] arr = {"hello", "world", "java", "hello"};
        int index = find(arr, "hello");
        System.out.println(index);
    }

}
