package Lab02;
import java.util.Scanner;
public class JPA1 {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }
    public static void test() {
        System.out.println("Input: ");
        int score = scn.nextInt();
        if(score>=60){
            System.out.println("You pass!");}
        System.out.println("End");
    }
}

        
        

    }
}
