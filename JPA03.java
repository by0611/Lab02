import java.util.Scanner;
public class JPA03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);//宣告scn為輸入清單
        for(int i = 0; i <= 1;i++){//重複兩次
        System.out.println("Input an integer:");//輸出
        int num = scn.nextInt();//輸入變數
        if (num%2==0){//判斷奇偶用%  %=>為取餘數
            System.out.println("The number is even.");//如果為0輸出
        }
        else{
            System.out.println("The number is odd.");//如果為1輸出 *注意else是二分法，這裡因為是除以二不是1就是0，若改題目不一定有效
        }
    }scn.close();//關閉清單
    }
}
