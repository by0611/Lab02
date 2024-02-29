package Lab02;
import java.util.Scanner;
public class JPA07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);//宣告scn為輸入清單
        System.out.println("請輸入三個整數:");//輸出
        int a = scn.nextInt();//輸入第一個邊
        int b = scn.nextInt();//輸入第二個邊
        int c = scn.nextInt();//輸入第三個邊
        while (true){//為了用break使用無線迴圈
            if (a==0||b==0||c==0){//第一判斷三邊不為零
                System.out.println("不可以構成三角形");//其中一個為零則輸出
                scn.close();
                break;}//終止程式
            if (a+b<c||b+c<a||a+c<b){//第二判斷兩邊一定大於第三邊
                System.out.println("不可構成三角形");//其中未成立輸出
                scn.close();
                break;//終止程式
            }
            
            if (a+b>c||b+c>a||a+c>b){//若成立三角形
                if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)//第一個判斷直角三角形
                ||Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2)
                ||Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2)){
                    System.out.println("直角三角形");//成立輸出
                    scn.close();
                    break;//終止程式
                }
                if (Math.pow(a,2)+Math.pow(b,2)<Math.pow(c,2)//第二個判斷鈍角
                ||Math.pow(a,2)+Math.pow(c,2)<Math.pow(b,2)
                ||Math.pow(b,2)+Math.pow(c,2)<Math.pow(a,2)){
                    System.out.println("鈍角三角形");//成立輸出
                    scn.close();
                    break;//終止程式
                }
                if (Math.pow(a,2)+Math.pow(b,2)>Math.pow(c,2)//第三個判斷銳角
                ||Math.pow(a,2)+Math.pow(c,2)>Math.pow(b,2)
                ||Math.pow(b,2)+Math.pow(c,2)>Math.pow(a,2)){
                    System.out.println("銳角三角形");//成立輸出
                    scn.close();
                    break;//終止程式
                }
            
                
        
        }
        }
    }
}
