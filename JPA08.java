package Lab02;
import java.util.Scanner;
public class JPA08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);//宣告輸入清單
        System.out.println("Input:");//輸出
        int score;//宣告整數變數score
        for(int i = 0;i <= 4;i++){//重複五次
        score = scn.nextInt();//輸入
        if (score>=90){//判斷1
            System.out.println("Your grade is A");//成立輸出
        }
        else if (80 <= score && score < 89){//*注意這裡不可直接使用 80 < score < 89 ，需用and符號&&連接
            System.out.println("Your grade is B");//成立輸出
        }
        else if (70 <= score && score < 80){//判斷三
            System.out.println("Your grade is C");//成立輸出
        }        
        else if (60 <= score && score < 70){//判斷四
            System.out.println("Your grade is D");//成立輸出
        }
        if (score < 60){//判斷五
            System.out.println("Your grade is F");//成立輸出
        }
        }
        scn.close();}
}

