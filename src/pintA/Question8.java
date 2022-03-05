package pintA;

import java.util.Scanner;

public class Question8 {
    /*给定两个整数A和B，输出从A到B的所有整数以及这些数的和。

输入格式：
输入在一行中给出2个整数A和B，其中−100≤A≤B≤100，其间以空格分隔。

输出格式：
首先顺序输出从A到B的所有整数，每5个数字占一行，每个数字占5个字符宽度，向右对齐。最后在一行中按Sum = X的格式输出全部数字的和X。*/
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        int sum = 0;
        for (int j=0, i = a;  i<=b ; i++,j++) {
            if(j%5==0&&j!=0){
                System.out.println();
            }
            System.out.printf("%5d",i);
            sum+=i;
        }
        System.out.println();
        System.out.print("Sum = "+sum);
    }
}
