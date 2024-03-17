import java.util.Scanner;
public class JPA02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);//宣告scn為輸入清單
        for(int i = 0;i<=1;i++){//重複兩次
        System.out.println("Input:");//輸出
        int num1 = scn.nextInt();//輸入變數1
        int num2 = scn.nextInt();//輸入變數2
        if (num1 > num2){//這裡沒有考慮兩數相等，故用二分法即可
            System.out.println(num1+" is large than "+num2);
        }
        else{
            System.out.println(num2 +" is large than "+num1);
        }}
        scn.close();
    }
}
