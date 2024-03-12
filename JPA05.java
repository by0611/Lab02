package Lab02;
import java.util.Scanner;
public class JPA05 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    for(int i = 0;i <= 3 ;i++){//迴圈跑四次
        int num = scn.nextInt();
        if (num % 6 == 0){//判斷1
            System.out.println(num+"是2、3、6的倍數");}
        else if (num % 2 == 0){//判斷2
            System.out.println(num+"是2的倍數");}
        else if (num % 3 == 0){//判斷3
            System.out.println(num+"是3的倍數");}
        else if (num % 3 != 0 && num % 2 != 0){//判斷4
            System.out.println(num+"不是2、3、6的倍數");}}
    scn.close();
    }
}
