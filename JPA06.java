import java.util.Scanner;
public class JPA06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for(int i = 0;i <= 3;i++){
        System.out.println("Input Chinese score:");//輸出
        int score1 = scn.nextInt();//輸入中文變數
        System.err.println("Input English score:");//輸出
        int score2 = scn.nextInt();//輸入英文變數
        System.err.println("Input Math score:");//輸出
        int score3 = scn.nextInt();//輸入數學變數

        if (score1 < 60){//判斷中文
            System.out.println("Chinese failed");
        }//小於60輸出
        if (score2 < 60){//判斷英文
            System.out.println("English failed");
        }//小於60輸出
        if (score3 < 60){//判斷數學
            System.out.println("Math failed");
        }//小於60輸出
        if (score1 >= 60 && score2 >= 60 && score3 >= 60){
            System.out.println("All pass");
        }}//若三者都大於60輸出
        scn.close();
    }
}

