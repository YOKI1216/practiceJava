package pintA;

import java.util.Scanner;

/*对于给定的正整数N，需要你计算 S=1!+2!+3!+...+N!。

输入格式：
输入在一行中给出一个不超过10的正整数N。

输出格式：
在一行中输出S的值。*/
public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = 0;
        for (int i = 1; i <= num; i++) {
            int temp = 1;
            for (int j = 1; j <= i; j++) {
                temp*=j;
            }
            result+=temp;
        }
        System.out.println(result);
    }
}
