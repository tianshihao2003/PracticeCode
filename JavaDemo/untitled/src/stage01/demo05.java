package stage01;//2.实现判断一个整数，属于哪个范围：大于0；小于0；等于0
import java.util.Scanner;

public class demo05 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("输入的整数 " + a + " 大于0");
        } else if (a < 0) {
            System.out.println("输入的整数 " + a + " 小于0");
        } else {
            System.out.println("输入的整数等于0");
        }
    }
}
