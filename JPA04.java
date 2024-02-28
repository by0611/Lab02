package Lab02;
import java.util.Scanner;
public class JPA04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);//宣告scn為輸入清單
        System.out.println("Input:");//輸出
        int num = scn.nextInt();//宣告整數變數num
        if (num % 5 == 0 && num % 9 == 0){//這邊需要用到&&(and)來連接兩個不同條件，||是or
            System.out.println("Yes");//條件成立輸出
        }
        else{
            System.out.println("No");//條件不成立
        }
        scn.close();
    }
}
