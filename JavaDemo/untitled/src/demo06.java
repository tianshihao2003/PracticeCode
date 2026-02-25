import java.util.Scanner;

// 3.判断一个年份是否为闰年
public class demo06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){

            System.out.println("闰年");
        }else{
            System.out.println("平年");
        }
    }

}
