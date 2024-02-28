package Lab02;
import java.util.Scanner;
public class JPA05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input an integer:");//輸出
        int num = scn.nextInt();
        while (true){//因為沒找到elif，需使用break中止程式，故套用while true形成迴圈
        if (num % 6 == 0){//判斷1
            System.err.println(num+"是2、3、6的倍數");
            scn.close();
            break;
        }
        if (num % 2 == 0){//判斷2
            System.out.println(num+"是2的倍數");
            scn.close();
            break;
        }
        if (num % 3 == 0){//判斷3
            System.out.println(num+"是3的倍數");
            scn.close();
            break;
        }
        if (num % 3 != 0 && num % 2 != 0){//判斷4
            System.out.println(num+"不是2、3、6的倍數");
            scn.close();
            break;
        }
        }
    }
}
