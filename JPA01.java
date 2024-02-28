package Lab02;
import java.util.Scanner;
public class JPA01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);//宣告scn為輸入清單
        int score;//建立變數整數score
        while(true){//建立不定數(無限)迴圈
            System.out.println("Please enter score:");//輸出
            score = scn.nextInt();//輸入
            if (score >= 60){//整數判斷如果score>=60
                System.out.println("You pass");//輸出
            }
            else{//否則
                String Sco = Integer.toString(score);//轉換型態進行第二次判斷
                if (Sco == "End"){//因為<60不須輸出，所以可以轉後判斷，如果字串為End
                    scn.close();//關閉清單
                    break;//程式強制中止
                }
                else{//否則
                    continue;//繼續執行
                }    
            }
        }
        
        

    }
}
