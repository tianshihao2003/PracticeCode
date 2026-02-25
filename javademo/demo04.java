/*
* 1.编程实现如下功能 某人有100,000元,每经过一次路口，需要交费，规则如下：
*  1)当现金>50000时,每次交5%
*  2)当现金<=50000时,每次交1000 编程计算该人可以经过多少次路口,
*    要求: 使用 while break方式完成
* */

public class demo04{
    public static void main(String[] args){
        double money = 100000;
        int count = 0;

        while(true){
            if(money > 50000){
                money *= 0.95;
            }else if(money <= 50000){
                if(money>=1000){
                    money -= 1000;
                } else if (money<1000) {
                    break;
                }
            }
            count++;
            if(money <= 1000){
                break;
            }

        }
        System.out.println("经过路口的次数为：" + count);

    }

}