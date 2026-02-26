package stage01;

import java.util.Scanner;

public class demo02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入年龄：");
        int age = scanner.nextInt();

        System.out.println("请输入月份：");
        int month = scanner.nextInt();

        boolean is = month >= 4 && month <= 10;

        double price = 0.0;

        if(is){
            if(age < 18){
               price = 30;
            }else if(age>=18&&age<=60){
                price = 60;
            }else if(age>60){
                price = 20;
            }
        }else{
            if(age>=18&&age<=60){
                price = 60;
            }else{
                price = 20;
            }
        }
        System.out.println(price);
    }
}
