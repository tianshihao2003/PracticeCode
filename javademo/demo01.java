import java.util.Scanner;

public class demo01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入世豪同志的芝麻信用分：");
        int cre = scanner.nextInt();

        if(cre == 100){
            System.out.println("信用极好！");
        }else if (cre > 80 && cre <= 99){
            System.out.println("信用优秀！");
        }else if (cre >= 60 && cre <= 80){
            System.out.println("信用一般！");
        }

        scanner.close();
    }
}
